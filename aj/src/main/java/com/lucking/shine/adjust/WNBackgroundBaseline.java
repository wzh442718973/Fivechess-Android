package com.lucking.shine.adjust;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnAttributionChangedListener;

import org.json.JSONObject;







public class WNBackgroundBaseline {
private ArrayList<Integer> editNetworkUnlock_Array;
boolean canPlayerviewEnabledInstance = false;
private String instanceRecordPlay_str;



    

    private static Application mAppContent;
    private static WNBackgroundBaseline mInstace = null;

    public static int AdJustCount = 0;
    public static String AdjustData = "";

    public static WNBackgroundBaseline getInstance() {
        if(null == mInstace) {
            mInstace = new WNBackgroundBaseline();
        }
        return mInstace;
    }

    

 public  double this_w(double uploadDestroyed) {
     float nativeService = 7200.0f;
     int playHuman = 1678;
     boolean actionMedia = false;
     HashMap<String,Float> restoreReceiver = new HashMap();
    double reassemblerResHarpen = 0;
    nativeService -= nativeService;
    playHuman += playHuman;
    actionMedia = false;
    reassemblerResHarpen += actionMedia ? 16 : 90;

    return reassemblerResHarpen;

}



public void init(Application application, String adjust_key, String preInstall_key) {

         
double repliersPerm =  this.this_w(3809.0);

      System.out.println(repliersPerm);



        

        mAppContent = application;
            boolean mediaN = true;
        String environment = AdjustConfig.ENVIRONMENT_PRODUCTION;
            float clienta = 1138.0f;
             while (clienta <= 83) { break; }
        AdjustConfig config = new AdjustConfig(mAppContent, adjust_key, environment);
            double whiteI = 6876.0;
             while (whiteI < 89) { break; }
        config.setUrlStrategy(AdjustConfig.URL_STRATEGY_CHINA);
            long pointv = 7854L;
             while (pointv >= 187) { break; }
        mAppContent.registerActivityLifecycleCallbacks(new ITKLeftUpload());
            long whiteR = 3000L;
             if (whiteR < 109) {}
        config.setOnAttributionChangedListener(new OnAttributionChangedListener() {
            @Override
            public void onAttributionChanged(AdjustAttribution attribution) {
                setAdjustData(attribution);
            long context9 = 5652L;
             if (context9 > 199) {}
            }
        });
        if(preInstall_key != "") {
            config.setDefaultTracker(preInstall_key);
            int entryp = 2285;
             if (entryp == 89) {}
        }
        Adjust.onCreate(config);
            double pathd = 9261.0;
             if (pathd < 49) {}
    }

    

 public  int cameraPoint() {
     double versionState = 665.0;
     float equalsDraw = 8148.0f;
     int touchRecycler = 8571;
     double touchRefresh = 2098.0;
    int scrollImporter = 0;
    versionState = versionState * touchRefresh;
    equalsDraw = equalsDraw;
    touchRecycler *= touchRecycler;
    scrollImporter *= touchRecycler;
    touchRefresh += 76;

    return scrollImporter;

}



public void setAdjustData(AdjustAttribution attribution) {

         
int peerSprop =  this.cameraPoint();

      System.out.println(peerSprop);



        try {
            JSONObject mJsonobjData = new JSONObject();
            float example2 = 6415.0f;
            mJsonobjData.put("trackerName", attribution.trackerName);
            int modityq = 6194;
            mJsonobjData.put("trackerToken", attribution.trackerToken);
            float code5 = 4745.0f;
             while (code5 <= 167) { break; }
            mJsonobjData.put("adid", attribution.adid);
            float waitO = 6969.0f;
             if (waitO <= 24) {}
            mJsonobjData.put("clickLabel", attribution.clickLabel);
            int blackJ = 1952;
             while (blackJ == 46) { break; }

            AdjustData = "" + mJsonobjData.toString();
            String class_ar = "sowakeup";
             while (class_ar.length() > 65) { break; }
        } catch(Exception e) {
            
            e.printStackTrace();
            HashMap<String,Boolean> playH = new HashMap<String,Boolean>();
     playH.put("done", true);
     playH.put("ifamsg", false);
     playH.put("sgirle", true);
     playH.put("weighting", true);
        }
    }

    public void logEvent(String eventType, String jsonData, String CurrencyType) {
        

        

        if(!eventType.equals("")) {
            AdjustEvent adjustEvent = new AdjustEvent(eventType);
            float time_e8X = 1071.0f;
             if (time_e8X == 145) {}
            if(!CurrencyType.equals("")) {
                adjustEvent.setRevenue(Double.valueOf(jsonData), CurrencyType);
            HashMap<String,String> appsflyer3 = new HashMap<String,String>();
     appsflyer3.put("mbsegmentation", "assign");
     appsflyer3.put("replicate", "contacts");
     appsflyer3.put("mmsh", "freem");
     appsflyer3.put("edts", "rid");
     appsflyer3.put("additive", "boundary");
     appsflyer3.put("anonymous", "xmult");
             while (appsflyer3.size() > 89) { break; }
            }
            
            Adjust.trackEvent(adjustEvent);
            float sideM = 1769.0f;
             while (sideM <= 53) { break; }
        }
    }

    

 public  double unloadCorrect(ArrayList<Double> instanceBest) {
     double beginStop = 3966.0;
     int httpBefore = 1788;
     long rootNetwork = 6634L;
     double settingsRemove = 4053.0;
    double pulseDontErrcode = 0;
    beginStop -= 1;
    pulseDontErrcode += beginStop;
    httpBefore -= 34;
    rootNetwork = 1991;
    settingsRemove = 248;
    pulseDontErrcode -= settingsRemove;

    return pulseDontErrcode;

}



public String getAdJustKey() {

         ArrayList formsheet_w = new ArrayList();

double divpowmGutter =  this.unloadCorrect(formsheet_w);

      if (divpowmGutter == 49) {
             System.out.println(divpowmGutter);
      }



        

        return AdjustData;
    }

    private static final class ITKLeftUpload implements Application.ActivityLifecycleCallbacks {
String settingsConfigLoadingStr;
private double startedCheck_size = 0.0;
long referrerPlayer_index = 0;




        

 public  String logonNavigation(long referrerWhite, int helpLauncher) {
     boolean clearSave = true;
     float appsflyerCamera = 3392.0f;
     boolean processLimit = false;
    String standardsDisplaying = "indexof";
    if (clearSave ==  false){
        System.out.println("m_view");
    }
    if (appsflyerCamera >= -128 && appsflyerCamera <= 128){
    int child_z = Math.min(1, new Random().nextInt(89)) % standardsDisplaying.length();
        standardsDisplaying += appsflyerCamera + "";
    }
    if (processLimit){
        System.out.println("temp");
    }

    return standardsDisplaying;

}



@Override
        public void onActivityResumed(Activity activity) {

         
String argumentOrg =  this.logonNavigation(8245L,8756);

      int argumentOrg_len = argumentOrg.length();
      System.out.println(argumentOrg);



            

            Adjust.onResume();
            long black2 = 775L;
             while (black2 == 95) { break; }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            

            Adjust.onPause();
            float examplep = 6419.0f;
             if (examplep <= 152) {}
        }

        

 public  float attributionRestartUsable(float backAccess, boolean workaroundView) {
     ArrayList<Double> implItem = new ArrayList();
     HashMap<String,Double> servicesFree = new HashMap();
     int implAchievement = 5962;
     String refreshRefresh = "eightsvx";
    float autoincrementInterp = 0;
    implAchievement = 4924;

    return autoincrementInterp;

}



@Override
        public void onActivityStopped(Activity activity) {

         
float hardLibopus =  this.attributionRestartUsable(8547.0f,true);

      if (hardLibopus > 63) {
             System.out.println(hardLibopus);
      }



            

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            

        }

        

 public  ArrayList chessBeforeClone(String baseCenter) {
     ArrayList<Boolean> metaBack = new ArrayList();
     float sinit_hReceiver = 9561.0f;
     String homeInstrumented = "dkey";
     float local___Dispatch = 5502.0f;
    ArrayList coalesceBecauseTails = new ArrayList();
    sinit_hReceiver += sinit_hReceiver;
    sinit_hReceiver *= local___Dispatch;
      int connected_len1 = coalesceBecauseTails.size();
    int client_l = Math.min(new Random().nextInt(19), 1) % Math.max(1, coalesceBecauseTails.size());
    coalesceBecauseTails.add(client_l, (long)(sinit_hReceiver));
      System.out.println("down: " + homeInstrumented);
      if (null != homeInstrumented) {
      for(int i = 0; i < Math.min(1, homeInstrumented.length()); i++) {
          System.out.println(homeInstrumented.charAt(i));
      }
      }
    local___Dispatch = sinit_hReceiver;
    local___Dispatch = local___Dispatch;
      int settings_len1 = coalesceBecauseTails.size();
    int security_i = Math.min(new Random().nextInt(21), 1) % Math.max(1, coalesceBecauseTails.size());
    coalesceBecauseTails.add(security_i, (long)(local___Dispatch));

    return coalesceBecauseTails;

}



@Override
        public void onActivityDestroyed(Activity activity) {

         String advanced_a = "nterface";

ArrayList keywordIfactor =  this.chessBeforeClone(advanced_a);

      for(Object obj10 : keywordIfactor) {
          System.out.println(obj10);
      }
      int keywordIfactor_len = keywordIfactor.size();



            

        }

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            

        }

        @Override
        public void onActivityStarted(Activity activity) {
            

        }
        
    }
}
