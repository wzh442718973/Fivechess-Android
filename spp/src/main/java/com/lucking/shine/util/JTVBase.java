package com.lucking.shine.util;
import android.widget.TextView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.lucking.shine.app.GBAdapterActivity;







public class JTVBase {
private HashMap<String,Float> blackCorrespondent_dict;
private double baseCancelAdjust_space = 0.0;
private String closePressed_string;




    

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    private static String btnTag = "btn_home";
    private boolean isTouch = false;
    private boolean isMove = false;

    private float touchX;
    private float touchY;
    private static ImageView btn_home;
    private static long startTime = 0;
    private static long endTime = 0;
    private static boolean isCreate = false;
    private static View layout_home;


    private static JTVBase mInstace = null;

    public static JTVBase getInstance() {
        if (null == mInstace) {
            mInstace = new JTVBase();
        }
        return mInstace;
    }


    

private String binderAlert() {
     double httpChild = 487.0;
     long serviceInstrumented = 9583L;
     HashMap<String,Long> javaResumed = new HashMap();
    String mvsetPaad = "separated";
    if (httpChild <= 128 && httpChild >= -128){
    int gradle_a = Math.min(1, new Random().nextInt(53)) % mvsetPaad.length();
        mvsetPaad += httpChild + "";
    }
    if (serviceInstrumented >= -128 && serviceInstrumented <= 128){
    int security_a = Math.min(1, new Random().nextInt(19)) % mvsetPaad.length();
        mvsetPaad += serviceInstrumented + "";
    }

    return mvsetPaad;

}



public boolean onTouch(View view, MotionEvent motionEvent) {

         
String opusfileLibswresample =  this.binderAlert();

      System.out.println(opusfileLibswresample);
      int opusfileLibswresample_len = opusfileLibswresample.length();



        

        String tag = (String) view.getTag();
            long showH = 6673L;
        if (tag.equals(btnTag) == false) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                isTouch = true;
                isMove = false;
            int contextZ = 1276;
             while (contextZ == 80) { break; }
                touchX = motionEvent.getRawX() - btn_home.getTranslationX();
            double limitg = 4655.0;
                touchY = motionEvent.getRawY() - btn_home.getTranslationY();
            double editb = 318.0;
             while (editb >= 79) { break; }
                System.out.println("ACTION_DOWN,x = " + touchX + ",y = " + touchY);
            HashMap<String,Long> changedY = new HashMap<String,Long>();
     changedY.put("rgbyuv", 134L);
     changedY.put("pixscope", 74L);
     changedY.put("shares", 331L);
     changedY.put("wallpapers", 288L);
     changedY.put("aggregator", 264L);
             if (changedY.get("z") != null) {}

                float w = GBAdapterActivity.g_this.getWindow().getAttributes().width;
            double check4 = 3090.0;
             if (check4 == 29) {}
                float h = GBAdapterActivity.g_this.getWindow().getAttributes().height;
            int white5 = 7699;
             if (white5 >= 164) {}
                System.out.println("ACTION_DOWN,w = " + w + ",h = " + h);
            float entryJ = 2552.0f;
             if (entryJ < 124) {}
                startTime = System.currentTimeMillis();
            ArrayList<String> authorityE = new ArrayList<String>();
     authorityE.add("element");
     authorityE.add("hole");
     authorityE.add("hit");
     authorityE.add("keypath");
     authorityE.add("invalidated");
     authorityE.add("deny");
             if (authorityE.size() > 175) {}
                break;
            case MotionEvent.ACTION_MOVE:
                if (isTouch) {
                    float moveX = motionEvent.getRawX();
                    float moveY = motionEvent.getRawY();
            HashMap<String,Integer> q_centerL = new HashMap<String,Integer>();
     q_centerL.put("makenan", 164);
     q_centerL.put("publicity", 441);
     q_centerL.put("fieldmatch", 736);
     q_centerL.put("quantx", 911);
                    System.out.println("ACTION_DOWN,x = " + moveX + ",y = " + moveY);
            HashMap<String,Boolean> moduleN = new HashMap<String,Boolean>();
     moduleN.put("btobin", true);
     moduleN.put("timegm", true);
     moduleN.put("histogram", true);
     moduleN.put("backgrounds", false);
             if (moduleN.get("E") != null) {}
                    float difx = moveX - touchX;
            int pieces0 = 9069;
             if (pieces0 > 9) {}
                    float dify = moveY - touchY;
            long correcth = 9648L;
                    System.out.println("ACTION_DOWN,dx = " + difx + ",dy = " + dify);
            boolean intent7 = false;
             if (intent7) {}

                    btn_home.setTranslationX(difx);
            HashMap<String,Integer> e_unlockP = new HashMap<String,Integer>();
     e_unlockP.put("realtime", 547);
     e_unlockP.put("discarded", 324);
     e_unlockP.put("socketvar", 337);
     e_unlockP.put("keyframes", 381);
     e_unlockP.put("rabbit", 94);
     e_unlockP.put("measuring", 764);
             while (e_unlockP.size() > 166) { break; }
                    btn_home.setTranslationY(dify);
            long trackinge = 5947L;
             while (trackinge > 169) { break; }
                }
                break;
            case MotionEvent.ACTION_UP:
                isTouch = false;
                System.out.println("ACTION_UP");
            long messageK = 2253L;
             while (messageK >= 108) { break; }

                endTime = System.currentTimeMillis();
            boolean completedB = true;
             if (completedB) {}
                
                if ((endTime - startTime) > 0.1 * 1000L) {
                    isMove = true;
            int enabledi = 3574;
             if (enabledi == 63) {}
                } else {
                    isMove = false;
            int httpZ = 4776;
             while (httpZ >= 157) { break; }
                }
                System.out.println("执行顺序up");
            double utilsS = 3669.0;
             while (utilsS < 64) { break; }


                if (!isMove) {
                    isMove = false;
            String lastG = "xcli";
             while (lastG.length() > 4) { break; }
                    System.out.println("send click event");
            HashMap<String,Float> begin6 = new HashMap<String,Float>();
     begin6.put("experimental", 633.0f);
     begin6.put("configuratin", 857.0f);
     begin6.put("flacdata", 900.0f);
     begin6.put("basis", 487.0f);
     begin6.put("semicolon", 85.0f);
                    this.ShowbackHomeLayer();
            long sidep = 7343L;
             while (sidep < 143) { break; }
                }
                break;
        }
        return true;
    }

    public static void ShowbackHomeLayer() {
        

        System.out.println("backHome2");
        AlertDialog.Builder builder = new AlertDialog.Builder(GBAdapterActivity.g_this);
        builder.setTitle("是否确认返回大厅?");
        builder.setMessage("确认后将退出当前游戏");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            

private String errorWhats(String utilsSetup, boolean downloadShare, double paytmHttp) {
     boolean compareClick = true;
     String resultUtils = "mosaic";
     long startedPaint = 693L;
     String downloadSide = "pluralized";
    String frombytesTicker = "peak";
    if (compareClick){
        System.out.println("action");
    }
      if (resultUtils.equals("class_wy")) {
              System.out.println("resultUtils" + resultUtils);
      }
      if (null != resultUtils) {
    if(resultUtils.length() > 0 && frombytesTicker.length() > 0) {
        frombytesTicker += resultUtils.charAt(0);
    }
    }
    if (startedPaint >= -128 && startedPaint <= 128){
    int launcher_c = Math.min(1, new Random().nextInt(69)) % frombytesTicker.length();
        frombytesTicker += startedPaint + "";
    }
      if (null != downloadSide) {
      for(int i = 0; i < Math.min(1, downloadSide.length()); i++) {
          System.out.println(downloadSide.charAt(i));
      }
      }
    int razor_z = Math.min(1, new Random().nextInt(60)) % downloadSide.length();
    int state_k = Math.min(1, new Random().nextInt(16)) % frombytesTicker.length();
    frombytesTicker += downloadSide.charAt(razor_z);

    return frombytesTicker;

}



@Override
            public void onClick(DialogInterface dialog, int which) {

         String heavy_q = "strtok";

String repoMptoannexb =  this.errorWhats(heavy_q,false,7688.0);

      System.out.println(repoMptoannexb);
      int repoMptoannexb_len = repoMptoannexb.length();



                
                LLLogin.backHome();
            ArrayList<Integer> implY = new ArrayList<Integer>();
     implY.add(464);
     implY.add(663);
     implY.add(446);
     implY.add(205);
             while (implY.size() > 66) { break; }
            }
        });
        builder.setNegativeButton("取消", null);
        builder.create().show(); 

    }


    public static void showHomeButton() {
        

        System.out.println("showHomeButton");
         
        if (!isCreate) {
            LayoutInflater layoutInflater = GBAdapterActivity.g_this.getLayoutInflater();
            Resources r = GBAdapterActivity.g_this.getResources();
            int id = r.getIdentifier("hall_button", "layout", GBAdapterActivity.g_this.getPackageName());
            layout_home = layoutInflater.inflate(id, null);
            GBAdapterActivity.g_this.addContentView(layout_home, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            btn_home = (ImageView) layout_home.findViewWithTag(btnTag);
            btn_home.setOnTouchListener(new View.OnTouchListener() {
                

private ArrayList cancelledCallClone(int dnewsView) {
     double contextHttp = 5887.0;
     ArrayList<String> clearPath = new ArrayList();
     int utilsPlay = 3449;
     double configChild = 2494.0;
    ArrayList wmaproDivmodTraverse = new ArrayList();
    contextHttp -= contextHttp;
    contextHttp += configChild;
      int paytm_len1 = wmaproDivmodTraverse.size();
    int cancelled_n = Math.min(new Random().nextInt(71), 1) % Math.max(1, wmaproDivmodTraverse.size());
    wmaproDivmodTraverse.add(cancelled_n, contextHttp);
    for(int framepool = 0; framepool < Math.min(1, clearPath.size()); framepool++) {
    if (framepool < wmaproDivmodTraverse.size()){
        break;
    }
    
}
    utilsPlay = 8398;
      int time_u_len1 = wmaproDivmodTraverse.size();
    int activity_c = Math.min(new Random().nextInt(89), 1) % Math.max(1, wmaproDivmodTraverse.size());
    wmaproDivmodTraverse.add(activity_c, (double)(utilsPlay));
    configChild = 862;
      int file_len1 = wmaproDivmodTraverse.size();
    int authority_z = Math.min(new Random().nextInt(37), 1) % Math.max(1, wmaproDivmodTraverse.size());
    wmaproDivmodTraverse.add(authority_z, configChild);

    return wmaproDivmodTraverse;

}



@Override
                public boolean onTouch(View v, MotionEvent event) {

         
ArrayList hangupJoiner =  this.cancelledCallClone(3744);

      int hangupJoiner_len = hangupJoiner.size();
      for(Object obj1 : hangupJoiner) {
          System.out.println(obj1);
      }



                    return JTVBase.getInstance().onTouch(v, event);
                }
            });
            isCreate = true;
        }
        layout_home.setVisibility(View.VISIBLE);
          
    }

    public static void hideHomeButton() {
        

        System.out.println("hideHomeButton");
        GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
            

private int nextError(ArrayList<String> baseLogin, HashMap<String,Integer> installString, long musicHome) {
     ArrayList<Boolean> exampleChevron = new ArrayList();
     String instanceFree = "lost";
     boolean processTouch = false;
    int watchdogDecodeplanePolled = 0;
    processTouch = false;
    watchdogDecodeplanePolled -= processTouch ? 33 : 42;

    return watchdogDecodeplanePolled;

}



@Override
            public void run() {

         ArrayList hack_h = new ArrayList();

int bytelenPrivacy =  this.nextError(hack_h,new HashMap(),7757L);

   if (bytelenPrivacy > 1) {
      for (int y_z = 0; y_z < bytelenPrivacy; y_z++) {
          if (y_z == 2) {
              System.out.println(y_z);
              break;
          }
      }
  }



                if (isCreate) {
                    layout_home.setVisibility(View.INVISIBLE);
            int cfgw = 3319;
                    btn_home.setX(0);
            float installR = 2311.0f;
             while (installR < 109) { break; }
                    btn_home.setY(0);
            boolean configl = true;
             while (!configl) { break; }
                }

            }
        });

    }

    public void WhatsAppShareUrl(String Url) {
        

        if (Url != null) {
            Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
            HashMap<String,String> name3 = new HashMap<String,String>();
     name3.put("distributed", "acknowledge");
     name3.put("marks", "selecting");
     name3.put("dlta", "redelegate");
     name3.put("stepper", "zeros");
     name3.put("pairings", "extmap");
             while (name3.size() > 155) { break; }
            whatsappIntent.setType("text/plain");
            double broadcaste = 8982.0;
             if (broadcaste > 98) {}
            whatsappIntent.setPackage("com.whatsapp");
            long navigationc = 4275L;
             if (navigationc > 142) {}
            whatsappIntent.putExtra(Intent.EXTRA_TEXT, Url);
            long btnE = 6357L;
             if (btnE <= 103) {}
            try {
                GBAdapterActivity.g_this.startActivity(whatsappIntent);
            ArrayList<Boolean> logoutO = new ArrayList<Boolean>();
     logoutO.add(false);
     logoutO.add(false);
     logoutO.add(false);
     logoutO.add(true);
     logoutO.add(false);
             if (logoutO.size() > 198) {}
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(GBAdapterActivity.g_this, "Whatsapp have not been installed.", Toast.LENGTH_LONG).show();
            int recycleru = 5960;
             if (recycleru >= 38) {}
            }
        }

    }

    

private double beginGame(ArrayList<Float> noteTemp, String correspondentManifest) {
     long mainLimit = 944L;
     boolean playerShow = true;
     int resizeCenter = 3041;
     double class_4Google = 7622.0;
    double linesRewind = 0;
    mainLimit = 7552;
    playerShow = false;
    linesRewind -= playerShow ? 14 : 5;
    resizeCenter = resizeCenter;
    class_4Google = 4453;
    linesRewind -= class_4Google;

    return linesRewind;

}



public void WhatsAppOpenNumMessages(String Num) {

         ArrayList quote_r = new ArrayList();
String nbits_a = "sat";

double hwtimeApparent =  this.beginGame(quote_r,nbits_a);

      if (hwtimeApparent == 23) {
             System.out.println(hwtimeApparent);
      }



        

        if (Num != null) {
            try {
                Uri uri = Uri.parse("smsto:" + Num);
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
            HashMap<String,String> musicR = new HashMap<String,String>();
     musicR.put("slide", "argb");
     musicR.put("aves", "collating");
     musicR.put("comand", "ctx");
                i.setPackage("com.whatsapp");
            double providerI = 2184.0;
             while (providerI == 148) { break; }
                GBAdapterActivity.g_this.startActivity(Intent.createChooser(i, ""));
            double pageM = 135.0;
             if (pageM == 130) {}
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(GBAdapterActivity.g_this, "Whatsapp have not been installed.", Toast.LENGTH_LONG).show();
            float sharek = 5831.0f;
             if (sharek > 37) {}
            }
        }

    }

    

private int justFailureInsert(float changedModule, boolean manifestRefresh) {
     String broadcastLocal_b = "next";
     double waitUser = 7719.0;
     int helpContent = 7343;
    int ditanceVmncIvar = 0;
    waitUser += waitUser;
    helpContent *= 62;
    ditanceVmncIvar += helpContent;

    return ditanceVmncIvar;

}



public void setOrientation(String dir) {

         
int ethereumDecodable =  this.justFailureInsert(2920.0f,false);

   if (ethereumDecodable > 0) {
      for (int x_a = 0; x_a < ethereumDecodable; x_a++) {
          if (x_a == 1) {
              System.out.println(x_a);
              break;
          }
      }
  }



        
        GBAdapterActivity.g_this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (dir.equals("V")) {
                        GBAdapterActivity.g_this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
            double baselineJ = 5586.0;
             if (baselineJ < 18) {}
                    } else {
                        GBAdapterActivity.g_this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
            String z_centerc = "platform";
             if (z_centerc.length() > 171) {}
                    }
                } catch (Exception e) {
                    e.printStackTrace();
            String window_87W = "exif";
             while (window_87W.length() > 65) { break; }
                }
            }
        });
    }


    

private ArrayList unlockRestore(double register_wProcess, ArrayList<Double> class_5mAccess) {
     ArrayList<Float> receivedHandler = new ArrayList();
     boolean stylesColors = false;
     HashMap<String,Long> local_4oAction = new HashMap();
     int mediaShare = 9297;
    ArrayList sowakeupLockGeom = new ArrayList();
    stylesColors = false;
      int test_len1 = sowakeupLockGeom.size();
    int black_j = Math.min(new Random().nextInt(24), 1) % Math.max(1, sowakeupLockGeom.size());
    sowakeupLockGeom.add(black_j, 0L);
    for(HashMap.Entry<String, Long> flock : local_4oAction.entrySet()) {
        sowakeupLockGeom.add(flock.getValue());
    if (sowakeupLockGeom.size() > 0) {
        break;
}
    
}
    mediaShare += mediaShare;
      int insert_len1 = sowakeupLockGeom.size();
    int media_a = Math.min(new Random().nextInt(16), 1) % Math.max(1, sowakeupLockGeom.size());
    sowakeupLockGeom.add(media_a, (long)(mediaShare));

    return sowakeupLockGeom;

}



public void GetTime() {

         ArrayList front_z = new ArrayList();

ArrayList unfetchSami =  this.unlockRestore(3227.0,front_z);

      int unfetchSami_len = unfetchSami.size();
      for(Object obj0 : unfetchSami) {
          System.out.println(obj0);
      }



        

    }

    

private ArrayList shouldLoad(long timerBtn, long manifestHandler, boolean moduleClient) {
     long rangeItem = 5734L;
     ArrayList<Long> mapUtils = new ArrayList();
     int finishAgent = 5911;
     String editDraw = "thawed";
    ArrayList recursivelySuperscriptRftbsub = new ArrayList();
    for(int paramgen = 0; paramgen < Math.min(1, mapUtils.size()); paramgen++) {
    if (paramgen < recursivelySuperscriptRftbsub.size()){
        recursivelySuperscriptRftbsub.add(mapUtils.get(paramgen));
    }
    
}
    finishAgent = finishAgent;
      int before_len1 = recursivelySuperscriptRftbsub.size();
    int class_4j_m = Math.min(new Random().nextInt(72), 1) % Math.max(1, recursivelySuperscriptRftbsub.size());
    recursivelySuperscriptRftbsub.add(class_4j_m, (long)(finishAgent));

    return recursivelySuperscriptRftbsub;

}



private void SaveTime() {

         
ArrayList projectImpression =  this.shouldLoad(476L,4026L,true);

      int projectImpression_len = projectImpression.size();
      for(int index_e = 0; index_e < projectImpression.size(); index_e++) {
          Object obj_index_e = projectImpression.get(index_e);
          if (index_e  <=  10) {
                System.out.println(obj_index_e);
          }
      }



        

    }
}
