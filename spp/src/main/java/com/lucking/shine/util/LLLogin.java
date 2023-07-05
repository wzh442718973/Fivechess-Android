package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.lucking.shine.games.BuildConfig;
import com.lucking.shine.app.PProviderStone;
import com.lucking.shine.app.TJIGradle;
import com.lucking.shine.app.GBAdapterActivity;
import com.lucking.shine.supppe.BGradlewPath;
import com.lucking.shine.sdk.DYPathJava;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.List;







public class LLLogin {
ArrayList<Long> startNotification_arr;
ArrayList<Double> clickSetupZalo_arr;
private boolean enbale_GameDefeat = false;




    

    public static String APP_ID = "";
    private static String strRoomID = "";
    private static String Tag = "LLLogin";

    public static String getBatteryLevel() {
        

        return "100";
    }

    public static String getBatteryStatusCharging() {
        

        return "false";
    }

    private static String buildTransaction(final String type) {
        

        return (type == null) ? String.valueOf(System.currentTimeMillis()) : type + System.currentTimeMillis();
    }

    public static void share_app(String packageName, String className, int type, String title, String content) {
        

    }

    public static void WXShare(String strJson) {
        
        try {
            Log.e(Tag, "WXShare");
            JSONObject json = new JSONObject(strJson);
            String title = json.getString("title");
            String content = json.getString("content");
            String imgPath = json.getString("imgPath");
            String url = json.getString("url");
            boolean isSceneSession = json.getBoolean("isSceneSession");
            boolean isHaibao = json.getBoolean("isHaibao");
            ZProvider.shareText("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI", content, title, url);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void shareWXSuccess() {
        

        LLLogin.callJs("shareWXSuccess", "");
    }

    public static void setRoomID(String strJson) {
        
        try {
            JSONObject json = new JSONObject(strJson);
            String strID = json.getString("strRoomID");
            LLLogin.strRoomID = strID;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String getRoomID() {
        

        return LLLogin.strRoomID;
    }

    public static String getPackageName() {
        
        return GBAdapterActivity.g_this.getPackageName();
    }

    public static String getVersionCode() {
        try {
            PackageManager localPackageManager = GBAdapterActivity.g_this.getPackageManager();
            PackageInfo packageInfo = localPackageManager.getPackageInfo(getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionCode + "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "-1";
    }

    public static String getDeviceId() {
        

        return AMSCacheLocal.getDeviceId();
    }

    public static void copyToClipBoard(String strJson) {
        
        try {
            JSONObject json = new JSONObject(strJson);
            final String content = json.getString("content");
            GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
                

private float messageUnloadWall() {
     String changedNetwork = "hram";
     int statusAlert = 8097;
     String inewsApp = "nelly";
     HashMap<String,Long> channelFragment = new HashMap();
    float multidescriptorDrawing = 0;
    statusAlert *= 62;

    return multidescriptorDrawing;

}



@Override
                public void run() {

         
float rounddsRewrite =  this.messageUnloadWall();

      if (rounddsRewrite >= 99) {
             System.out.println(rounddsRewrite);
      }



                    ClipboardManager myClipboard = (ClipboardManager) GBAdapterActivity.g_this.getSystemService(Context.CLIPBOARD_SERVICE);
            HashMap<String,Double> download4 = new HashMap<String,Double>();
     download4.put("object", 299.0);
     download4.put("response", 783.0);
     download4.put("primes", 400.0);
     download4.put("simpletimeout", 827.0);
             while (download4.size() > 45) { break; }
                    myClipboard.setText(content);
            double cacher = 6820.0;
             if (cacher <= 140) {}
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public static void openWX() {
        

        GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
            float homeX = 1485.0f;
             while (homeX < 62) { break; }
                    ComponentName cmp = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
            double splashw = 2630.0;
             while (splashw >= 59) { break; }
                    intent.addCategory(Intent.CATEGORY_LAUNCHER);
            int z_centers = 1332;
             if (z_centers <= 196) {}
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            float left1 = 1054.0f;
             if (left1 < 107) {}
                    intent.setComponent(cmp);
            double chevronW = 5282.0;
             while (chevronW == 43) { break; }
                    GBAdapterActivity.g_this.startActivity(intent);
            String register_6e = "diagnostic";
             while (register_6e.length() > 199) { break; }

                } catch (ActivityNotFoundException e) {
                    
                    Toast.makeText(GBAdapterActivity.g_this, "检查到您手机没有安装微信，请安装后使用该功能", Toast.LENGTH_LONG);
            boolean iinit_ka = true;
             while (iinit_ka) { break; }
                }

            }
        });

    }

    public static void openQQ(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            final String schemeUrl = json.getString("url");

            
            if (isQQClientAvailable(GBAdapterActivity.g_this)) {
                
                String url = schemeUrl;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                
                if (isValidIntent(GBAdapterActivity.g_this, intent)) {
                    GBAdapterActivity.g_this.startActivity(intent);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

     
    public static boolean isQQClientAvailable(Context context) {
        

        final PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equalsIgnoreCase("com.tencent.qqlite") || pn.equalsIgnoreCase("com.tencent.mobileqq")) {
                    return true;
                }
            }
        }
        return false;
    }

     
    public static boolean isValidIntent(Context context, Intent intent) {
        

        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        return !activities.isEmpty();
    }

    public static String getHostAddress(String strJson) {

        

        try {
            JSONObject json = new JSONObject(strJson);
            String strHost = json.getString("strHost");
            
            String dottedQuadIpAddress = InetAddress.getByName(strHost).getHostAddress();
            return dottedQuadIpAddress;
        } catch (Exception e) {
            
            
            return "";
        }
    }

    public static String saveFileToGalley(String strJson) {
        
        JSONObject json = null;
        try {
            json = new JSONObject(strJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
        String picName = json.optString("strHost");
        String imageLocalPath = json.optString("imageLocalPath");

        boolean IsSave = true;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (GBAdapterActivity.g_this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                
                GBAdapterActivity.g_this.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                IsSave = false;
            } else {
                
                IsSave = true;
            }
        } else {
            
            IsSave = true;
        }

        if (IsSave) {
            Context context = GBAdapterActivity.g_this;
            File file = new File(imageLocalPath);
            try {
                String uriString = MediaStore.Images.Media.insertImage(context.getContentResolver(), file.getAbsolutePath(), picName, null);

                File file1 = new File(getRealPathFromURI(Uri.parse(uriString), context));
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                intent.setData(Uri.fromFile(file1));
                context.sendBroadcast(intent);
                return file1.getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        }

        return "";
    }

    private static void saveQR(String jsonStr) {
        boolean IsSave;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (GBAdapterActivity.g_this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                
                GBAdapterActivity.g_this.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                IsSave = false;
            } else {
                
                IsSave = true;
            }
        } else {
            
            IsSave = true;
        }
        if (!IsSave) {
            return;
        }

        String data;
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            data = jsonObject.getString("str");
            if (data.startsWith("data:")) {
                data = data.substring(data.indexOf(",") + 1);
            }

            byte[] bytes = Base64.decode(data, Base64.DEFAULT);
            save2Gallery(bytes);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void save2Gallery(byte[] bytes) {
        ContentValues values = new ContentValues();
        ContentResolver cr = PProviderStone.getInstance().getContentResolver();

        long date = System.currentTimeMillis() / 1000;
        values.put(MediaStore.Images.Media.DATE_ADDED, date);
        values.put(MediaStore.Images.Media.DATE_MODIFIED, date);
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");


        File galleryPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File file = new File(galleryPath, System.currentTimeMillis() + ".png");
        Uri uri;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            values.put(MediaStore.Images.Media.DISPLAY_NAME, System.currentTimeMillis() + ".png");
            values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES);
            values.put(MediaStore.Images.Media.IS_PENDING, 1);
            uri = cr.insert(MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY), values);
        } else {
            values.put(MediaStore.Images.Media.DATA, file.getAbsolutePath());
            uri = cr.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
        }

        try {
            OutputStream imageOut = cr.openOutputStream(uri);
            try {
                LCSplash.out4byte(bytes, imageOut);
            } finally {
                imageOut.close();
            }
        } catch (Exception e) {
            if (uri != null) {
                cr.delete(uri, null, null);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            values.put(MediaStore.Images.Media.IS_PENDING, 0);
            cr.update(uri, values, null, null);
        } else {
            Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file));
            PProviderStone.getInstance().sendBroadcast(intent);
        }
    }

    private static String getRealPathFromURI(Uri contentUri, Context context) {
        

        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = context.getContentResolver().query(contentUri, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        String fileStr = cursor.getString(column_index);
        cursor.close();
        return fileStr;
    }


    public static String isNetworkAvailable() {
        

        boolean ret = false;
        Context context = GBAdapterActivity.g_this;
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {

        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        ret = true;
                        break;
                    }
                }
            }
        }
        return String.valueOf(ret);
    }


    public static String getChannel() {
        

        String str = JCorrespondentConfig.getChannel(GBAdapterActivity.g_this);
        return str;
    }

    public static void downloadApp(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String url = json.getString("url");
            CHandler updateApp = new CHandler(GBAdapterActivity.g_this, url, new TJIGradle(GBAdapterActivity.g_this));
            updateApp.execute();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void ShowBackIndexBtn() {
        

        GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
            

private HashMap messageOverride_k(HashMap<String,Boolean> recordsBoard) {
     float googleCompute = 8230.0f;
     int mainFacebook = 2681;
     float workaroundBroadcast = 242.0f;
    HashMap<String,Integer> ticketUnresolvedAck = new HashMap();
    googleCompute = 6659;
    ticketUnresolvedAck.put("callocSymbol", (int)(googleCompute));
    mainFacebook *= 17;
    ticketUnresolvedAck.put("ocalCalculateCodes", mainFacebook);
workaroundBroadcast = googleCompute + workaroundBroadcast;
    ticketUnresolvedAck.put("whiteblacklistsStatsLowpass", (int)(workaroundBroadcast));

    return ticketUnresolvedAck;

}



@Override
            public void run() {

         
HashMap inuseNotation =  this.messageOverride_k(new HashMap());

      for(Object obj_d : inuseNotation.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)obj_d;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }
      int inuseNotation_len = inuseNotation.size();



                JTVBase.getInstance().showHomeButton();
            float providerL = 2820.0f;
            }
        });


    }

    public static void HideBackIndexBtn() {
        

        JTVBase.getInstance().hideHomeButton();

    }

    public static void ShowFacebookBtn() {
        

    }

    public static void HideFacebookBtn() {
        

    }

    public static void PhoneVibrator(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String Time = json.getString("time");
            Vibrator vibrator = (Vibrator) GBAdapterActivity.g_this.getSystemService(GBAdapterActivity.g_this.VIBRATOR_SERVICE);
            vibrator.vibrate(Long.parseLong(Time));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public static void backHome() {
        

        System.out.println("backHome1");
        LLLogin.callJs("backHall", "");
    }

    public static void loginFaceBook() {
        

        DYPathJava.getInstance().login(GBAdapterActivity.g_this);
    }

    public static void FaceBookLogEvent(String strJson) {

        try {
            JSONObject json = new JSONObject(strJson);
            String EventStr = json.getString("typetoken");
            String NumberData = json.getString("tObjData");
            String CurrencyType = json.getString("tCurrencyType");
            double Num = Double.valueOf(NumberData);

            DYPathJava.getInstance().FbLogEvent(EventStr, Num, CurrencyType);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public static void FacebookShareUrl(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String url = json.optString("url");
            String Des = json.optString("des", "");
            DYPathJava.getInstance().shareUrl(url, Des);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void WhatsAppShareUrl(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String url = json.getString("url");
            JTVBase.getInstance().WhatsAppShareUrl(url);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String getContentFromClipBoard() {
        ClipboardManager myClipboard = (ClipboardManager) GBAdapterActivity.g_this.getSystemService(Context.CLIPBOARD_SERVICE);
        if (!myClipboard.hasPrimaryClip()) {
            return "";
        }
        ClipData data = myClipboard.getPrimaryClip();
        ClipData.Item item = data.getItemAt(0);
        final String content;
        if (item.getText() != null) {
            content = item.getText().toString();
        } else {
            content = "";
        }
        return content;
    }

    public static void WhatsAppOpenNumMessages(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String url = json.getString("tel");
            JTVBase.getInstance().WhatsAppOpenNumMessages(url);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void setOrientation(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            String dir = json.getString("dir");
            Log.e(Tag, "setOrientation: " + dir);

            JTVBase.getInstance().setOrientation(dir);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void trackEvent(String strJson) {
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public static String getMediaSource() {
        

        
        return null;
    }

    public static void goPay(String strJson) {
        
        try {
            JSONObject json = new JSONObject(strJson);
            String txnId = json.getString("txnId");
            String key = json.getString("key");
            String MerchantId = json.getString("MerchantId");
            String hash = json.getString("hash");
            String amount = json.getString("amount");
            String orderNote = json.getString("orderNote");
            String customerName = json.getString("customerName");
            String customerPhone = json.getString("customerPhone");
            String customerEmail = json.getString("customerEmail");
            String notifyUrl = json.getString("notifyUrl");
            String surl = json.getString("surl");
            String furl = json.getString("furl");
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void razorPay(String strJson) {
        

        try {
            JSONObject json = new JSONObject(strJson);
            int id = json.getInt("id");
            String method = json.getString("method");
            String appId = json.getString("appId");
            String orderId = json.getString("orderId");
            String orderAmount = json.getString("orderAmount");
            String orderNote = json.getString("orderNote");
            String customerName = json.getString("customerName");
            String customerPhone = json.getString("customerPhone");
            String customerEmail = json.getString("customerEmail");
            String notifyUrl = json.getString("notifyUrl");
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void logEvent(String strJson) {
        

    }

    public static void googlePay(String strJson) {
        
        
        
        
        
        
        
        
        
        
    }

    public static void PaytmPay(String strJson) {
        
        try {
            JSONObject json = new JSONObject(strJson);
            String orderid = json.getString("orderid");
            String mid = json.getString("mid");
            String txnToken = json.getString("txnToken");
            String amount = json.getString("amount");
            String callbackurl = json.getString("callbackurl");
            String orderNote = json.getString("orderNote");
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public static void googlePayCallBack(final String jsCode) {
        
        callJs(jsCode, jsCode);
    }

    public static void googlePayConsume(String strJson) {
        

        
        
        
        
        
        
        
    }

    public static void googlePayAddOrder() {
        

        
    }

    public static String isProbablyAnEmulator() {
        

        return String.valueOf(AMSCacheLocal.isProbablyAnEmulator());
    }

    public static String getAdvertisingId() {
        return AMSCacheLocal.getAdvertisingId();
    }

    public static void getInstall(String strJson) {
        

    }

    public static void registerWakeup() {

        

    }

    public static void onBackKey() {
        LLLogin.callJs("onBackKey", "");
    }


    public static void LineAppShareUrl(String jsons) {
        try {
            JSONObject json = new JSONObject(jsons);
            String url = json.optString("url");
            String Des = json.optString("des", "");

            String scheme = "line://msg/text/" + url;
            Uri uri = Uri.parse(scheme);
            GBAdapterActivity.g_this.startActivity(new Intent(Intent.ACTION_VIEW, uri));
        } catch (ActivityNotFoundException e) {
            GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
                

private ArrayList stateChessboardWait(long enabledAgent) {
     boolean baseProgress = true;
     String javaDestroyed = "compiler";
     String whiteLogin = "prf";
     long stylesAction = 8680L;
    ArrayList armcapTwilight = new ArrayList();
    baseProgress = false;
      int z_height_len1 = armcapTwilight.size();
    int process_m = Math.min(new Random().nextInt(11), 1) % Math.max(1, armcapTwilight.size());
    armcapTwilight.add(process_m, baseProgress);
      if (javaDestroyed.equals("register_c_")) {
              System.out.println(javaDestroyed);
      }
      if (javaDestroyed != null) {
      for(int i = 0; i < Math.min(1, javaDestroyed.length()); i++) {
          System.out.println(javaDestroyed.charAt(i));
      }
      }
      System.out.println("strings: " + whiteLogin);
      for(int i = 0; i < Math.min(1, whiteLogin.length()); i++) {
    if (i < armcapTwilight.size()){
        armcapTwilight.add(i,whiteLogin.charAt(i) + "");
        break;
    }
          System.out.println(whiteLogin.charAt(i));
      }
    stylesAction = 9194;
      int instance_len1 = armcapTwilight.size();
    int path_s = Math.min(new Random().nextInt(27), 1) % Math.max(1, armcapTwilight.size());
    armcapTwilight.add(path_s, stylesAction > 0L ? true : false);

    return armcapTwilight;

}



@Override
                public void run() {

         
ArrayList torchAver =  this.stateChessboardWait(2231L);

      int torchAver_len = torchAver.size();
      for(Object obj6 : torchAver) {
          System.out.println(obj6);
      }



                    Toast.makeText(GBAdapterActivity.g_this, "LineApp have not been installed.", Toast.LENGTH_SHORT).show();
            String login7 = "navigated";
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String callJava(String method, String strJson) {
        switch (method) {
            case "getBatteryLevel":
                return LLLogin.getBatteryLevel();
            case "getContentFromClipBoard":
                return LLLogin.getContentFromClipBoard();
            case "LineAppShareUrl":
                LLLogin.LineAppShareUrl(strJson);
                break;
            case "getBatteryStatusCharging":
                return LLLogin.getBatteryStatusCharging();
            case "loginFaceBook":
                LLLogin.loginFaceBook();
                break;
            case "WXShare":
                LLLogin.WXShare(strJson);
                break;
            case "FacebookShareUrl":
                LLLogin.FacebookShareUrl(strJson);
                break;
            case "WhatsAppShareUrl":
                LLLogin.WhatsAppShareUrl(strJson);
                break;
            case "WhatsAppOpenNumMessages":
                LLLogin.WhatsAppOpenNumMessages(strJson);
                break;
            case "getRoomID":
                return LLLogin.getRoomID();
            case "setRoomID":
                LLLogin.setRoomID(strJson);
                break;
            case "getPackageName":
                return LLLogin.getPackageName();
            case "getApkVersion":
                return getVersionCode();
            case "getPlatformVersion":
                return BuildConfig.platformVersion + "";
            case "exitApp":
                System.exit(0);
                return "";
            case "getDeviceId":
                return LLLogin.getDeviceId();
            case "copyToClipBoard":
                LLLogin.copyToClipBoard(strJson);
                break;
            case "openWX":
                LLLogin.openWX();
                break;
            case "openQQ":
                LLLogin.openQQ(strJson);
                break;
            case "getHostAddress":
                return LLLogin.getHostAddress(strJson);
            case "saveFileToGalley":
                return LLLogin.saveFileToGalley(strJson);
            case "saveQR":
                LLLogin.saveQR(strJson);
                break;
            case "isNetworkAvailable":
                return LLLogin.isNetworkAvailable();
            case "getChannel":
                return LLLogin.getChannel();
            case "downloadApp":
                LLLogin.downloadApp(strJson);
                break;
            case "ShowBackIndexBtn":
            case "showHomeButton":
                LLLogin.ShowBackIndexBtn();
                break;
            case "HideBackIndexBtn":
            case "hideHomeButton":
                LLLogin.HideBackIndexBtn();
                break;
            case "ShowFacebookBtn":
                LLLogin.ShowFacebookBtn();
                break;
            case "HideFacebookBtn":
                LLLogin.HideFacebookBtn();
                break;
            case "setOrientation":
                LLLogin.setOrientation(strJson);
                break;
            case "getInstall":
                LLLogin.getInstall(strJson);
                break;
            case "PhoneVibrator":
                LLLogin.PhoneVibrator(strJson);
                break;
            case "razorPay":
                LLLogin.razorPay(strJson);
                break;
            case "goPay":
                LLLogin.goPay(strJson);
                break;
            case "getMediaSource":
                return LLLogin.getMediaSource();
            case "getAdvertisingId":
                return LLLogin.getAdvertisingId();
            case "isProbablyAnEmulator":
                return LLLogin.isProbablyAnEmulator();
            case "trackEvent":
                LLLogin.trackEvent(strJson);
                break;
            case "logEvent":
                LLLogin.logEvent(strJson);
                break;
            case "FaceBookLogEvent":
                LLLogin.FaceBookLogEvent(strJson);
                break;
            case "googlePay":
                LLLogin.googlePay(strJson);
                break;
            case "googlePayConsume":
                LLLogin.googlePayConsume(strJson);
                break;
            case "googlePayAddOrder":
                LLLogin.googlePayAddOrder();
                break;
            case "PaytmPay":
                break;
            case "GetGalleyPermission":
                LLLogin.GetGalleyPermission();
                break;
            case "openInternalWindow":
                LLLogin.openInternalWindow(strJson);
                break;
            default:
                Log.e(Tag, "callJava error, methon: " + method);
                break;
        }
        return "";
    }

    public static void openInternalWindow(String strJson) {
        try {
            JSONObject json = new JSONObject(strJson);
            GBAdapterActivity.g_this.isInternalWindow = json.optBoolean("value", false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void GetGalleyPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (GBAdapterActivity.g_this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                
                GBAdapterActivity.g_this.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            } else {
                
            }
        } else {
            
        }
    }

    public static void callJs(String method, String strJson) {
        BGradlewPath.getInstance().callJS(method, strJson);
    }

    public static void notifyEvent(String action, int value) {
        BGradlewPath.getInstance().callJS("notifyEvent", "{\"action\":\"" + action + "\",\"value\":" + value + "}");
    }

}
