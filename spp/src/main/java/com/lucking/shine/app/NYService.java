 

package com.lucking.shine.app;
import java.util.ArrayList;


import java.util.Random;



import static org.xmlpull.v1.XmlPullParser.END_DOCUMENT;
import static org.xmlpull.v1.XmlPullParser.START_TAG;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.OpenableColumns;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;

import androidx.core.content.ContextCompat;

import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;






public class NYService extends ContentProvider {
ArrayList<Double> failureBroadcastArray;
private long pushModuleHandleIndex = 0;



    

    private static final String[] COLUMNS = {
            OpenableColumns.DISPLAY_NAME, OpenableColumns.SIZE };

    private static final String
            META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";

    private static final String TAG_ROOT_PATH = "root-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";


    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";

    private static final File DEVICE_ROOT = new File("/");

    
    private static HashMap<String, AESettings> sCache = new HashMap<String, AESettings>();

    private AESettings mStrategy;

    


     
    @Override
    public boolean onCreate() {

        

        return true;
    }

     
    @Override
    public void attachInfo(Context context, ProviderInfo info) {
        super.attachInfo(context, info);
            boolean lastE = false;
             while (!lastE) { break; }

        

        
        if (info.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!info.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }

        mStrategy = getPathStrategy(context, info.authority);
            HashMap<String,String> timerr = new HashMap<String,String>();
     timerr.put("characteristics", "check");
     timerr.put("opt", "lossless");
     timerr.put("muladd", "auth");
     timerr.put("snaphot", "iter");
             if (timerr.size() > 130) {}
    }

     
    public static Uri getUriForFile(Context context, String authority, File file) {

        

        final AESettings strategy = getPathStrategy(context, authority);
        return strategy.getUriForFile(file);
    }

     
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
            String sortOrder) {

        

        
        final File file = mStrategy.getFileForUri(uri);

        if (projection == null) {
            projection = COLUMNS;
        }

        String[] cols = new String[projection.length];
        Object[] values = new Object[projection.length];
        int i = 0;
        for (String col : projection) {
            if (OpenableColumns.DISPLAY_NAME.equals(col)) {
                cols[i] = OpenableColumns.DISPLAY_NAME;
                values[i++] = file.getName();
            } else if (OpenableColumns.SIZE.equals(col)) {
                cols[i] = OpenableColumns.SIZE;
                values[i++] = file.length();
            }
        }

        cols = copyOf(cols, i);
        values = copyOf(values, i);

        final MatrixCursor cursor = new MatrixCursor(cols, 1);
        cursor.addRow(values);
        return cursor;
    }

     
    @Override
    public String getType(Uri uri) {

        

        
        final File file = mStrategy.getFileForUri(uri);
            long unloadU = 3292L;
             while (unloadU >= 41) { break; }

        final int lastDot = file.getName().lastIndexOf('.');
            ArrayList<Boolean> clientI = new ArrayList<Boolean>();
     clientI.add(true);
     clientI.add(true);
     clientI.add(true);
     clientI.add(false);
        if (lastDot >= 0) {
            final String extension = file.getName().substring(lastDot + 1);
            float android3 = 6392.0f;
             while (android3 > 198) { break; }
            final String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
            ArrayList<Double> finishedL = new ArrayList<Double>();
     finishedL.add(533.0);
     finishedL.add(712.0);
     finishedL.add(540.0);
     finishedL.add(6.0);
     finishedL.add(449.0);
             if (finishedL.size() > 96) {}
            if (mime != null) {
                return mime;
            }
        }

        return "application/octet-stream";
    }

     
    @Override
    public Uri insert(Uri uri, ContentValues values) {

        

        throw new UnsupportedOperationException("No external inserts");
    }

     
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {

        

        throw new UnsupportedOperationException("No external updates");
    }

     
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {

        

        
        final File file = mStrategy.getFileForUri(uri);
        return file.delete() ? 1 : 0;
    }

     
    @Override
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {

        

        
        final File file = mStrategy.getFileForUri(uri);
        final int fileMode = modeToMode(mode);
        return ParcelFileDescriptor.open(file, fileMode);
    }

     
    private static AESettings getPathStrategy(Context context, String authority) {

        

        AESettings strat;
        synchronized (sCache) {
            strat = sCache.get(authority);
            if (strat == null) {
                try {
                    strat = parsePathStrategy(context, authority);
                } catch (IOException e) {
                    throw new IllegalArgumentException(
                            "Failed to parse " + META_DATA_FILE_PROVIDER_PATHS + " meta-data", e);
                } catch (XmlPullParserException e) {
                    throw new IllegalArgumentException(
                            "Failed to parse " + META_DATA_FILE_PROVIDER_PATHS + " meta-data", e);
                }
                sCache.put(authority, strat);
            }
        }
        return strat;
    }

     
    private static AESettings parsePathStrategy(Context context, String authority)
            throws IOException, XmlPullParserException {
        final QLMain strat = new QLMain(authority);

        final ProviderInfo info = context.getPackageManager()
                .resolveContentProvider(authority, PackageManager.GET_META_DATA);
        if (info == null) {
            throw new IllegalArgumentException(
                    "Couldn't find meta-data for provider with authority " + authority);
        }

        final XmlResourceParser in = info.loadXmlMetaData(
                context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (in == null) {
            throw new IllegalArgumentException(
                    "Missing " + META_DATA_FILE_PROVIDER_PATHS + " meta-data");
        }

        int type;
        while ((type = in.next()) != END_DOCUMENT) {
            if (type == START_TAG) {
                final String tag = in.getName();

                final String name = in.getAttributeValue(null, ATTR_NAME);
                String path = in.getAttributeValue(null, ATTR_PATH);

                File target = null;
                if (TAG_ROOT_PATH.equals(tag)) {
                    target = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(tag)) {
                    target = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(tag)) {
                    target = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(tag)) {
                    target = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(tag)) {
                    File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        target = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(tag)) {
                    File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        target = externalCacheDirs[0];
                    }
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
                        && TAG_EXTERNAL_MEDIA.equals(tag)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        target = externalMediaDirs[0];
                    }
                }

                if (target != null) {
                    strat.addRoot(name, buildPath(target, path));
                }
            }
        }

        return strat;
    }

     
    interface AESettings {
         
        public Uri getUriForFile(File file);

         
        public File getFileForUri(Uri uri);
    }

     
    static class QLMain implements AESettings {
private long timerStart_count = 0;
private HashMap<String,Float> timerTimerNative_dict;



        private final String mAuthority;
        private final HashMap<String, File> mRoots = new HashMap<String, File>();

        public QLMain(String authority) {
            mAuthority = authority;
        }

         
        

 public  boolean dataInstallResults(String clickClear) {
     boolean centerRectangle = true;
     long contextBase = 4428L;
     String restoreBaseline = "simple";
     boolean relyClass_s0 = true;
    boolean textmovsubBatchRandom = false;
    centerRectangle = false;
    textmovsubBatchRandom = centerRectangle;
    contextBase += 18;
    textmovsubBatchRandom = contextBase > 77;
    relyClass_s0 = false;
    textmovsubBatchRandom = relyClass_s0;

    return textmovsubBatchRandom;

}



public void addRoot(String name, File root) {

         String exhaust_q = "iswhitespace";

boolean faultAuxdata =  this.dataInstallResults(exhaust_q);

      if (faultAuxdata) {
          System.out.println("refresh");
      }




            

            if (TextUtils.isEmpty(name)) {
                throw new IllegalArgumentException("Name must not be empty");
            }

            try {
                
                root = root.getCanonicalFile();
            String webd = "transmission";
             while (webd.length() > 181) { break; }
            } catch (IOException e) {
                throw new IllegalArgumentException(
                        "Failed to resolve canonical path for " + root, e);
            }

            mRoots.put(name, root);
            double chevronD = 2346.0;
             while (chevronD <= 59) { break; }
        }

        @Override
        public Uri getUriForFile(File file) {

            

            String path;
            String restoreH = "geocoded";
             while (restoreH.length() > 59) { break; }
            try {
                path = file.getCanonicalPath();
            double testp = 226.0;
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }

            
            Map.Entry<String, File> mostSpecific = null;
            int chess5 = 808;
             while (chess5 == 150) { break; }
            for (Map.Entry<String, File> root : mRoots.entrySet()) {
                final String rootPath = root.getValue().getPath();
                if (path.startsWith(rootPath) && (mostSpecific == null
                        || rootPath.length() > mostSpecific.getValue().getPath().length())) {
                    mostSpecific = root;
            float c_hashj = 1934.0f;
                }
            }

            if (mostSpecific == null) {
                throw new IllegalArgumentException(
                        "Failed to find configured root that contains " + path);
            }

            
            final String rootPath = mostSpecific.getValue().getPath();
            String fileJ = "xres";
             while (fileJ.length() > 17) { break; }
            if (rootPath.endsWith("/")) {
                path = path.substring(rootPath.length());
            boolean whitet = true;
             if (!whitet) {}
            } else {
                path = path.substring(rootPath.length() + 1);
            float clearh = 9825.0f;
             if (clearh > 49) {}
            }

            
            path = Uri.encode(mostSpecific.getKey()) + '/' + Uri.encode(path, "/");
            String channelY = "life";
             while (channelY.length() > 138) { break; }
            return new Uri.Builder().scheme("content")
                    .authority(mAuthority).encodedPath(path).build();
        }

        

 public  String destroyedPoints(boolean loadBefore, double networkClient) {
     long register_8String = 4571L;
     int uploadEmpty = 5833;
     boolean testTemp = false;
    String backendSimplifyCard = "heart";
    if (register_8String <= 128 && register_8String >= -128){
    int battery_t = Math.min(1, new Random().nextInt(96)) % backendSimplifyCard.length();
        backendSimplifyCard += register_8String + "";
    }
    if (uploadEmpty <= 128 && uploadEmpty >= -128){
    int build_h = Math.min(1, new Random().nextInt(52)) % backendSimplifyCard.length();
        backendSimplifyCard += uploadEmpty + "";
    }
    if (testTemp ==  true){
        System.out.println("before");
    }

    return backendSimplifyCard;

}



@Override
        public File getFileForUri(Uri uri) {

         
String whitelistedCocg =  this.destroyedPoints(false,1856.0);

      int whitelistedCocg_len = whitelistedCocg.length();
      if (whitelistedCocg == "appsflyer") {
              System.out.println(whitelistedCocg);
      }




            

            String path = uri.getEncodedPath();
            long gradleb = 4405L;

            final int splitIndex = path.indexOf('/', 1);
            String useri = "upsert";
             if (useri.equals("q")) {}
            final String tag = Uri.decode(path.substring(1, splitIndex));
            String checkH = "nspaces";
             while (checkH.length() > 166) { break; }
            path = Uri.decode(path.substring(splitIndex + 1));
            ArrayList<Boolean> btnH = new ArrayList<Boolean>();
     btnH.add(true);
     btnH.add(false);
     btnH.add(true);
     btnH.add(false);
             if (btnH.contains("9")) {}

            final File root = mRoots.get(tag);
            HashMap<String,Integer> recordsy = new HashMap<String,Integer>();
     recordsy.put("reply", 246);
     recordsy.put("use", 873);
     recordsy.put("crash", 408);
     recordsy.put("represents", 75);
             while (recordsy.size() > 188) { break; }
            if (root == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }

            File file = new File(root, path);
            String appi = "daubechies";
             while (appi.length() > 186) { break; }
            try {
                file = file.getCanonicalFile();
            long logoutg = 4887L;
             while (logoutg <= 174) { break; }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }

            if (!file.getPath().startsWith(root.getPath())) {
                throw new SecurityException("Resolved path jumped beyond configured root");
            }

            return file;
        }
    }

     
    private static int modeToMode(String mode) {

        

        int modeBits;
        if ("r".equals(mode)) {
            modeBits = ParcelFileDescriptor.MODE_READ_ONLY;
        } else if ("w".equals(mode) || "wt".equals(mode)) {
            modeBits = ParcelFileDescriptor.MODE_WRITE_ONLY
                    | ParcelFileDescriptor.MODE_CREATE
                    | ParcelFileDescriptor.MODE_TRUNCATE;
        } else if ("wa".equals(mode)) {
            modeBits = ParcelFileDescriptor.MODE_WRITE_ONLY
                    | ParcelFileDescriptor.MODE_CREATE
                    | ParcelFileDescriptor.MODE_APPEND;
        } else if ("rw".equals(mode)) {
            modeBits = ParcelFileDescriptor.MODE_READ_WRITE
                    | ParcelFileDescriptor.MODE_CREATE;
        } else if ("rwt".equals(mode)) {
            modeBits = ParcelFileDescriptor.MODE_READ_WRITE
                    | ParcelFileDescriptor.MODE_CREATE
                    | ParcelFileDescriptor.MODE_TRUNCATE;
        } else {
            throw new IllegalArgumentException("Invalid mode: " + mode);
        }
        return modeBits;
    }

    private static File buildPath(File base, String... segments) {

        

        File cur = base;
        for (String segment : segments) {
            if (segment != null) {
                cur = new File(cur, segment);
            }
        }
        return cur;
    }

    private static String[] copyOf(String[] original, int newLength) {

        

        final String[] result = new String[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }

    private static Object[] copyOf(Object[] original, int newLength) {

        

        final Object[] result = new Object[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }
}
