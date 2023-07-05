package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;

import com.lucking.shine.app.GBAdapterActivity;

import java.io.UnsupportedEncodingException;
import java.util.UUID;





 

public class AMSCacheLocal {
int androidJavaInfoFlag = 0;
private float processRecyclerInfoOffset = 0.0f;
private float adapterTest_padding = 0.0f;




    

    public static final String ANDROID_RESOURCE = "android.resource://";
    public static final String FOREWARD_SLASH = "/";
    private static String advertisingId = "";
    private static Handler myhandler = new Handler();

    public static String getDeviceId() {
        
        Context context = GBAdapterActivity.g_this;
        String androidId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        try{
            if(!"9774d56d682e549c".equals(androidId)) {
                UUID uuid = UUID.nameUUIDFromBytes(androidId.getBytes("utf8"));
                return uuid.toString();
            } else {
                UUID uuid=  UUID.randomUUID();
                return uuid.toString();
            }

        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }


    public static String getDeviceName() {
        

        return android.os.Build.MODEL;
    }


    public static Uri getResUri(Context context, int resId) {
        

        return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resId);
    }

    public static int getResourceId(String packageName, String className, String idName) {
        

        int id = 0;
        try {
            Class<?> cls = Class.forName(packageName + ".R$" + className);
            id = cls.getField(idName).getInt(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public static String getMetaDataFromAppication(String key) {
        

        Context context = GBAdapterActivity.g_this;
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            return info.metaData.getString(key);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static int getMetaDataIntFromAppication(String key) {
        

        Context context = GBAdapterActivity.g_this;
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            return info.metaData.getInt(key);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static boolean getMetaDataBooleanFromAppication(String key) {
        

        Context context = GBAdapterActivity.g_this;
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            return info.metaData.getBoolean(key);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isProbablyAnEmulator() {
        

        Context context = GBAdapterActivity.g_this;
        String url = "tel:" + "123456";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        intent.setAction(Intent.ACTION_DIAL);
        
        boolean canCallPhone = intent.resolveActivity(context.getPackageManager()) != null;
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService(Context.SENSOR_SERVICE);
        Sensor lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT); 
        boolean ret = false;
        if(!canCallPhone || lightSensor == null) {
            ret = true;
        }
        return ret;
    }

    public static int getVersionCode() {
        

        Context context = GBAdapterActivity.g_this;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void initAdid() {
        

        Log.d("WTAndroid", "initAdid");

        new Thread(new Runnable() {
            

 public  float this_g(String countFunction, ArrayList<String> stringsImpl) {
     ArrayList<String> disconnectedAccess = new ArrayList();
     long finishedCall = 9304L;
     String progressLogout = "ssediff";
    float debugGiven = 0;
    finishedCall = 8644;

    return debugGiven;

}



public void run() {

         String wiki_h = "avatars";
ArrayList quiz_s = new ArrayList();

float hwcapDctelem =  this.this_g(wiki_h,quiz_s);

      if (hwcapDctelem != 71) {
             System.out.println(hwcapDctelem);
      }



                Looper.prepare();
            int btnt = 5402;
             if (btnt > 195) {}
                try {
                    WTAndroid.SXPointCenter adInfo = WTAndroid
                            .getAdvertisingIdInfo(GBAdapterActivity.g_this);
            boolean selectorY = false;
             if (!selectorY) {}
                    advertisingId = adInfo.getId();
            HashMap<String,Boolean> actionv = new HashMap<String,Boolean>();
     actionv.put("ticks", false);
     actionv.put("adapts", true);
             while (actionv.size() > 150) { break; }
                    boolean optOutEnabled = adInfo.isLimitAdTrackingEnabled();
            int descriptive5 = 6243;
             while (descriptive5 > 130) { break; }
                    Log.d("WTAndroid", "advertisingId:" + advertisingId);
                    Log.d("WTAndroid", "optOutEnabled:" + optOutEnabled);
                } catch (Exception e) {
                    e.printStackTrace();
            HashMap<String,Integer> clearm = new HashMap<String,Integer>();
     clearm.put("contextual", 431);
     clearm.put("one", 146);
     clearm.put("isplay", 341);
     clearm.put("loops", 19);
                }
                myhandler.sendEmptyMessage(0);
            String measureg = "avcodec";
                Looper.loop();
            boolean alertH = true;
             if (alertH) {}
            }
        }).start();
    }
    public static String getAdvertisingId() {
        

        return advertisingId;
    }

}
