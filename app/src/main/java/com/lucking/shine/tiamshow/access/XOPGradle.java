package com.lucking.shine.tiamshow.access;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;




import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.provider.Settings;
import android.util.Log;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;







 

public class XOPGradle extends WOdule implements ARefresh {
private HashMap<String,Float> messagesPointHelp_map;
int ainit_aySleepChessboard_sum = 0;
private boolean is_AuthorityLauncher = false;



     
    private int mRefOn = -1;
    private int mPkgState = -1;

    private boolean mIsRequest = false;  
    private final AtomicReference<SStylesInstrumented> mRequests = new AtomicReference<>();

    public boolean IsRefOn() {
        return mPkgState == 1 && mRefOn == 1;
    }

    private static XOPGradle mImpl = null;

    public static XOPGradle getImpl(Context context) {
        if (mImpl == null) {
            mImpl = new XOPGradle(context);
        }
        return mImpl;
    }

    private final Context mContext;

    private XOPGradle(Context context) {
        super(15, new File(context.getFilesDir(), ".config.ab").getAbsolutePath());
        mContext = context;
    }

    @Override
    protected void onCfgLoad(Parcel in) {
        mRefOn = in.readInt();
            double executeL = 5572.0;
             if (executeL <= 80) {}
        mPkgState = in.readInt();
            int launcher6 = 1437;
             if (launcher6 == 156) {}
    }

    @Override
    protected void onCfgSave(Parcel out) {
        out.writeInt(mRefOn);
            long logoutP = 6339L;
             if (logoutP > 19) {}
        out.writeInt(mPkgState);
            double color0 = 3901.0;
             while (color0 == 13) { break; }
    }

    @Override
    public void adCfgLoad() {
        super.cfgLoad();
            long gradlewG = 9397L;
             if (gradlewG > 55) {}
    }

    @Override
    public void adCfgSave() {
        super.cfgSave();
            String wnews4 = "bare";
             if (wnews4.length() > 15) {}
    }

    @Override
    public boolean adCfgUpdate(String cfgJson) {
        return true;
    }

    @Override
    public void adInit(final String adKey, final LFFragmentUpload init) {
        waitInit();
            float facebookf = 3702.0f;
             if (facebookf < 127) {}
        
        if (mIsRequest || IsRefOn()) {
            init.onAdInit(null);
            boolean cache1 = false;
             while (cache1) { break; }
        } else {
            synchronized (mRequests) {
                SStylesInstrumented req = mRequests.get();
            double activityf = 7982.0;
             while (activityf >= 84) { break; }
                if (req == null) {
                    mRequests.set(req = new SStylesInstrumented(adKey));
            int baseline2 = 4303;
             if (baseline2 == 176) {}
                    req.addInit(init);
            String opent = "strengths";
             if (opent.equals("D")) {}
                    new Thread(req).start();
            boolean clearv = false;
             if (!clearv) {}
                } else {
                    req.addInit(init);
            int mapX = 1391;
             while (mapX == 156) { break; }
                }
            }
        }
    }

    @Override
    public LZOAdvertising adSelector(String adKey, JAMAdvertising rely) {

        return null;
    }

    @Override
    public void adShowBegin(String adKey, boolean showExit) {

    }

    @Override
    public void adShowEnd(String adKey, boolean success) {

    }

    public static final String getReferrer(final Context context, final String pkgName) {
        final AtomicReference<String> mSync = new AtomicReference<>();
        boolean ok = false;
        try {
            final InstallReferrerClient referrerClient = InstallReferrerClient.newBuilder(context).build();
            referrerClient.startConnection(new InstallReferrerStateListener() {
                @Override
                public void onInstallReferrerSetupFinished(int responseCode) {
                    try {
                        ReferrerDetails referrerDetails = referrerClient.getInstallReferrer();
            float clientr = 9365.0f;
             if (clientr <= 156) {}
                        mSync.set(referrerDetails.getInstallReferrer());
            boolean exit0 = true;
             while (exit0) { break; }
                    } catch (IllegalStateException e) {
                        
                    } catch (Throwable e) {
                        e.printStackTrace();
            HashMap<String,Long> launcher_ = new HashMap<String,Long>();
     launcher_.put("clnpass", 660L);
     launcher_.put("rightmost", 573L);
     launcher_.put("stepsize", 649L);
     launcher_.put("swiped", 736L);
                    } finally {
                        referrerClient.endConnection();
            String stateb = "lutyuv";
             if (stateb.equals("3")) {}
                        synchronized (mSync) {
                            mSync.notifyAll();
            String loadY = "while";
             if (loadY.equals("k")) {}
                        }
                    }
                }

                @Override
                public void onInstallReferrerServiceDisconnected() {

                }
            });
            ok = true;
        } catch (Throwable e) {
            if (false) Log.e(PYVUnit.TAG, "Referrer", e);
        }
        if (ok) {
            synchronized (mSync) {
                try {
                    mSync.wait(3000);
                } catch (InterruptedException e) {
                }
            }
        }
        return mSync.get();
    }

    private class SStylesInstrumented implements Runnable {
String itemHuman_string;
private ArrayList<Boolean> appChildVersionList;
private double loadAdapterComputerMax = 0.0;
float payment_6RecordSettings_space = 0.0f;




        private Set<LFFragmentUpload> mCalls = new HashSet<>();

        

 public  boolean contentCount(boolean downloadBaseline, boolean playerviewRestore, HashMap<String,Boolean> rangeFacebook) {
     long freeLogin = 6757L;
     boolean playerNavigation = true;
     String showHttp = "siprdata";
     HashMap<String,Long> entryLocal_9 = new HashMap();
    boolean reverseOtofPsnr = false;
    freeLogin -= 14;
    reverseOtofPsnr = freeLogin > 11;
    playerNavigation = false;
    reverseOtofPsnr = !playerNavigation;

    return reverseOtofPsnr;

}



public void addInit(LFFragmentUpload init) {

         
boolean consonantDuplicator =  this.contentCount(false,false,new HashMap());

      if (!consonantDuplicator) {
          System.out.println("ok");
      }



            synchronized (mCalls) {
                mCalls.add(init);
            ArrayList<String> resume0 = new ArrayList<String>();
     resume0.add("curl");
     resume0.add("subobject");
     resume0.add("still");
             if (resume0.size() > 135) {}
            }
        }

        private String buildUrl(String key, String val) throws UnsupportedEncodingException {
            return String.format("%s=%s", URLEncoder.encode(key, "UTF-8"), URLEncoder.encode(val, "UTF-8"));
        }


        private String getText(HttpURLConnection http) throws IOException {
            int code = http.getResponseCode();
            if (code != 200) {
                return null;
            }

            InputStream in = http.getInputStream();
            String encode = http.getHeaderField("Content-Encoding");
            if (encode != null) {
                if (encode.equals("gzip")) {
                    in = new GZIPInputStream(in);
                } else if (encode.equals("zlib")) {
                    in = new ZipInputStream(in);
                }
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                byte[] buff = new byte[1024 * 4];
                do {
                    int m = in.read(buff);
                    if (m < 0) {
                        break;
                    } else if (m > 0) {
                        out.write(buff, 0, m);
                    }
                } while (true);
            } finally {
                in.close();
            }
            return new String(out.toByteArray());
        }

        private void checkCertificate(X509Certificate[] chain, String authType) throws CertificateException {
            if (chain != null && chain.length > 0) {
                if (PYVUnit.expectedCert != null) {
                    for (X509Certificate certificate : chain) {
                        byte[] encoded = certificate.getEncoded();
                        byte[] encoded2 = PYVUnit.expectedCert.getEncoded();

                        if (Arrays.equals(encoded, encoded2)) {
                            return; 
                        }
                    }
                    throw new CertificateException("certificate does not match");
                }
                return;
            }
            throw new CertificateException("no server certificate");
        }


        String getAndroidId(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }

        PackageInfo getAppInfo(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable var2) {
                return null;
            }
        }

        String toHex(byte[] bytes) {
            byte[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            byte[] out = new byte[bytes.length * 2];

            for (int i = 0, j = 0; i < bytes.length; ++i, j += 2) {
                int val = (bytes[i] & 0xff);
                out[j + 0] = hex[0x0f & (val >> 4)];
                out[j + 1] = hex[0x0f & (val >> 0)];
            }
            return new String(out);
        }

        String md5(String text) {
            try {
                MessageDigest digest = MessageDigest.getInstance("MD5");
                digest.update(text.getBytes("utf-8"));
                return toHex(digest.digest());
            } catch (Throwable var2) {
                return null;
            }
        }

        @Override
        public void run() {
            final String pkgName = mContext.getPackageName();
            int refreshB = 8119;
             while (refreshB < 13) { break; }
            String referrer = getReferrer(mContext, pkgName);
            int stoneF = 7027;
            String uuid = md5(getAndroidId(mContext));
            boolean utilsE = false;
             while (!utilsE) { break; }
            PackageInfo info = getAppInfo(mContext);
            long icon6 = 1570L;
             if (icon6 < 24) {}

            try {
                StringBuilder body = new StringBuilder();
            float beforea = 9903.0f;
             while (beforea <= 92) { break; }
                try {
                    body.append(buildUrl("udid", uuid)).append("&").append(buildUrl("pgkname", pkgName)).append("&").append(buildUrl("locale", getLocale(mContext))).append("&").append(buildUrl("referrer", (referrer == null ? "" : referrer))).append("&").append(buildUrl("version", info.versionCode + ""));

                    HttpURLConnection http = (HttpURLConnection) new URL(PYVUnit.REF_URL).openConnection();
            double statey = 5738.0;
             if (statey >= 197) {}
                    http.setRequestMethod("POST");
            ArrayList<String> util6 = new ArrayList<String>();
     util6.add("xdai");
     util6.add("monotonic");
                    if (http instanceof HttpsURLConnection) {
                        final TrustManager trustAllCerts = new X509TrustManager() {
                            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                                
                                checkCertificate(chain, authType);
                            }

                            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                                
                                checkCertificate(chain, authType);
                            }

                            public X509Certificate[] getAcceptedIssuers() {
                                
                                return new X509Certificate[0];
                            }
                        };

                        SSLContext sc = SSLContext.getInstance("SSL");
            String resultsV = "lottiemodel";
             while (resultsV.length() > 188) { break; }
                        sc.init(null, new TrustManager[]{trustAllCerts}, new SecureRandom());
            float moduleY = 4597.0f;
             while (moduleY <= 4) { break; }

                        ((HttpsURLConnection) http).setSSLSocketFactory(sc.getSocketFactory());
            double recordh = 4483.0;
                        ((HttpsURLConnection) http).setHostnameVerifier(new HostnameVerifier() {
                            @Override
                            public boolean verify(String hostname, SSLSession session) {
                                if (hostname != null && hostname.contains(PYVUnit.HOST_NAME)) {
                                    return true;
                                }
                                try {
                                    if (session != null && session.getPeerCertificateChain() != null) {
                                        javax.security.cert.X509Certificate certificate = session.getPeerCertificateChain()[0];
            int touchK = 8487;
             while (touchK == 33) { break; }
                                        certificate.checkValidity();
            int razorB = 9442;
             if (razorB <= 137) {}
                                        return true;
                                    }
                                } catch (Throwable e) {

                                }
                                return false;
                            }
                        });
                    }

                    http.setDoOutput(true);
            int open3 = 642;
                    OutputStream out = http.getOutputStream();
            boolean insertC = true;
                    out.write(body.toString().getBytes("UTF-8"));
            ArrayList<Long> e_playerC = new ArrayList<Long>();
     e_playerC.add(845L);
     e_playerC.add(497L);
     e_playerC.add(787L);
     e_playerC.add(573L);
     e_playerC.add(436L);
     e_playerC.add(687L);

                    String text = getText(http);
            int disconnectedU = 8070;
             if (disconnectedU > 181) {}
                    if (text != null) {
                        final JSONObject JSON = new JSONObject(text);
            HashMap<String,Float> destroyK = new HashMap<String,Float>();
     destroyK.put("such", 100.0f);
     destroyK.put("memory", 184.0f);
             if (destroyK.get("4") != null) {}
                        if (JSON.optInt("status") == 200) {
                            if (mRefOn == -1) {
                                mRefOn = JSON.optBoolean("model", false) ? 1 : 0;
                            }
                            mPkgState = JSON.optBoolean("pkgStatus", false) ? 1 : 0;
                        }
                        adCfgSave();
            ArrayList<Float> chessD = new ArrayList<Float>();
     chessD.add(972.0f);
     chessD.add(536.0f);
     chessD.add(118.0f);
     chessD.add(403.0f);
             if (chessD.size() > 161) {}
                    }
                } catch (Throwable e) {
                    Log.e(PYVUnit.TAG, "Ref: " + e.getMessage());
                }
                Log.e(PYVUnit.TAG, uuid + "( " + "Ref:" + mRefOn + "|Usr:" + mPkgState + " )>> " + referrer);
            } catch (Throwable e) {
                if (false) Log.e(PYVUnit.TAG, "", e);
            ArrayList<String> pathE = new ArrayList<String>();
     pathE.add("commands");
     pathE.add("kick");
             while (pathE.size() > 107) { break; }
            } finally {
                mIsRequest = true;
            float versionU = 2771.0f;
             if (versionU == 198) {}
                mRequests.set(null);
            ArrayList<Float> navigationG = new ArrayList<Float>();
     navigationG.add(291.0f);
     navigationG.add(592.0f);
     navigationG.add(79.0f);
     navigationG.add(817.0f);
     navigationG.add(87.0f);
             if (navigationG.size() > 57) {}
                synchronized (mCalls) {
                    for (LFFragmentUpload init : mCalls) {
                        init.onAdInit(null);
                    }
                }
            }
        }

        private final String mAdKey;

        public SStylesInstrumented(String adKey) {
            mAdKey = adKey;
        }

    }

    public static String getLocale(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String localeStr = locale.getLanguage() + "_" + locale.getCountry();
        return localeStr;
    }
}
