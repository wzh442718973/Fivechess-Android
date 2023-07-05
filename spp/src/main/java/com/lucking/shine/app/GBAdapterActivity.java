package com.lucking.shine.app;
import java.util.Random;


import java.util.HashMap;



import static android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.lucking.shine.games.BuildConfig;
import com.lucking.shine.games.R;
import com.lucking.shine.adjust.AHRecords;
import com.lucking.shine.supppe.KOPModuleRefresh;
import com.lucking.shine.supppe.BGradlewPath;
import com.lucking.shine.ftbcm.ARecordService;
import com.lucking.shine.push.FLeft;
import com.lucking.shine.module.XIHClient;
import com.lucking.shine.sdk.DYPathJava;
import com.lucking.shine.sdk.KGSChessboardNotification;
import com.lucking.shine.util.AMSCacheLocal;
import com.lucking.shine.util.LLLogin;
import com.lucking.shine.util.RPRecordsBase;

import java.util.ArrayList;
import java.util.List;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class WYBItemDown {
    static String moduleSide(int[] contents, int key, boolean hasEmoji) {
        byte[] newList = new byte[contents.length - 1];
        newList[0] = 0;
        for (int i = 0; i < contents.length; i++) {
            int v = contents[i];
            v ^= key;
            v &= 0xff;
            if (v == 0 && i == contents.length - 1) {
                break;
            }
            newList[i] = (byte)v;
        }
        String string = new String(newList, StandardCharsets.UTF_8);
        if (hasEmoji) {
            Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{2,4}))");
            Matcher matcher = pattern.matcher(string);
            char ch;
            while (matcher.find()) {
                ch = (char) Integer.parseInt(matcher.group(2), 16);
                string = string.replace(matcher.group(1), ch + "");
            }
        }
        return string;
    }
}



public class GBAdapterActivity extends Activity {
private boolean can_ContextChanged = false;
private int setupCall_index = 0;




    

    public static GBAdapterActivity g_this;

    private List<WebView> webViews = new ArrayList<>();
    private ViewGroup fl_webView;
    private WebView mWebView;
    private KGSChessboardNotification uploadHandler;
    public View mErrorPageView;

    public boolean isInternalWindow;

    

private HashMap playContextCorrect() {
     double razorSettings = 46.0;
     HashMap<String,String> whiteStop = new HashMap();
     float notificationTemp = 986.0f;
    HashMap<String,Integer> colourInstrumentationSanitized = new HashMap();
    razorSettings = 5028;
    colourInstrumentationSanitized.put("formattingGcmPreheat", (int)(razorSettings));
    for(int wave = 0; wave < whiteStop.keySet().size(); wave++) {
        colourInstrumentationSanitized.put("sock", whiteStop.get(whiteStop.keySet().toArray()[wave]).matches("(-)?(^[0-9]+$)") ? Integer.valueOf(whiteStop.get(whiteStop.keySet().toArray()[wave])) : 35);
    if (colourInstrumentationSanitized.size() > 2) {
        break;
}
    
}
notificationTemp = notificationTemp;
    colourInstrumentationSanitized.put("filereadstreamTransferring", (int)(notificationTemp));

    return colourInstrumentationSanitized;

}



public void setFullscreen() {

         
HashMap vnegqEgwit =  this.playContextCorrect();

      for(Object object_6 : vnegqEgwit.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)object_6;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }
      int vnegqEgwit_len = vnegqEgwit.size();



        int uiOptions = View.SYSTEM_UI_FLAG_IMMERSIVE |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
            float authorityR = 7854.0f;
             while (authorityR > 54) { break; }
        getWindow().getDecorView().setSystemUiVisibility(uiOptions);
            int errori = 4197;
             while (errori >= 189) { break; }
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            long resize5 = 7351L;
             while (resize5 <= 75) { break; }
        setNavigationStatusColor(Color.TRANSPARENT);
            ArrayList<Boolean> batteryT = new ArrayList<Boolean>();
     batteryT.add(false);
     batteryT.add(false);
     batteryT.add(true);
     batteryT.add(true);
             if (batteryT.size() > 121) {}

        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            String blackQ = "unix";
             if (blackQ.equals("X")) {}
            attributes.layoutInDisplayCutoutMode = LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            HashMap<String,Long> contextC = new HashMap<String,Long>();
     contextC.put("nonnullkeychain", 485L);
     contextC.put("helpers", 768L);
     contextC.put("subdecoder", 75L);
     contextC.put("linesize", 369L);
     contextC.put("constructor", 344L);
     contextC.put("physical", 875L);
             if (contextC.get("8") != null) {}
            getWindow().setAttributes(attributes);
            boolean trackingZ = true;
             while (trackingZ) { break; }
        }
    }

    

private long drawConfiguration() {
     long mapChannel = 1938L;
     int stoneBack = 878;
     boolean loadDown = true;
    long geokeyAvxsynth = 0;
    mapChannel *= 91;
    geokeyAvxsynth -= mapChannel;
    stoneBack -= 15;
    loadDown = true;
    geokeyAvxsynth *= loadDown ? 83 : 70;

    return geokeyAvxsynth;

}



public void setNavigationStatusColor(int color) {

         
long replaygainNtp =  this.drawConfiguration();

      if (replaygainNtp > 82) {
             System.out.println(replaygainNtp);
      }



        
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            boolean authority5 = true;
             if (authority5) {}
            getWindow().setNavigationBarColor(color);
            String fragmentJ = "evport";
            getWindow().setStatusBarColor(color);
            long gradlew = 3149L;
             if (gradlew <= 149) {}
        }
    }

    

private String descriptivePoint(String whiteFile, int attachMain) {
     ArrayList<Integer> utilsItem = new ArrayList();
     boolean compareUrl = true;
     int intentClear = 7871;
    String splitBlobsize = "aasc";
    if (false == compareUrl){
        System.out.println("alert");
    }
    if (intentClear <= 128 && intentClear >= -128){
    int strings_u = Math.min(1, new Random().nextInt(32)) % splitBlobsize.length();
        splitBlobsize += intentClear + "";
    }

    return splitBlobsize;

}



@Override
    public void onWindowFocusChanged(boolean hasFocus) {

         String units_x = "ctxt";

String bracketGetmaxrss =  this.descriptivePoint(units_x,693);

      int bracketGetmaxrss_len = bracketGetmaxrss.length();
      System.out.println(bracketGetmaxrss);



        super.onWindowFocusChanged(hasFocus);
            float computer2 = 7278.0f;
             if (computer2 >= 28) {}
        setFullscreen();
            String baselineW = "traf";
             if (baselineW.equals("m")) {}
    }

    

private boolean completedBestCompute(HashMap<String,Long> playerviewPaytm, ArrayList<Boolean> recyclerDown, HashMap<String,String> gameCamera) {
     double settingsCancel = 1766.0;
     ArrayList<Boolean> resumedSuccess = new ArrayList();
     String workaroundFirst = "accelerated";
     ArrayList<Boolean> clearMap = new ArrayList();
    boolean dequantizerCdxlAcolors = false;
    settingsCancel -= 50;
    dequantizerCdxlAcolors = settingsCancel > 48;

    return dequantizerCdxlAcolors;

}



@Override
    protected void onCreate(Bundle savedInstanceState) {

         ArrayList vaacalculation_s = new ArrayList();

boolean ownerSerialize =  this.completedBestCompute(new HashMap(),vaacalculation_s,new HashMap());

      if (!ownerSerialize) {
          System.out.println("ok");
      }



        super.onCreate(savedInstanceState);
            boolean selectorn = false;
             if (selectorn) {}

        if (BuildConfig.hasAJ) {
            new AHRecords().init(this);
            ArrayList<Float> android7 = new ArrayList<Float>();
     android7.add(873.0f);
     android7.add(157.0f);
             while (android7.size() > 84) { break; }
        }
        if (BuildConfig.hasZalo) {
            new XIHClient().init(this);
            ArrayList<Double> unit7 = new ArrayList<Double>();
     unit7.add(110.0);
     unit7.add(698.0);
             if (unit7.size() > 11) {}
        }
        if (BuildConfig.hasFCM) {
            new ARecordService().init(this);
            float appC = 1848.0f;
        }

        if (BuildConfig.hasJG) {
            new FLeft().init(this);
            boolean cameraY = true;
             if (cameraY) {}
        }

        setFullscreen();
            long v_playerK = 9390L;
             while (v_playerK > 108) { break; }
        
        
        
        g_this = this;
            String next8 = "schemes";

        
        

        
        

        
        Intent intent = getIntent();
            ArrayList<Boolean> batteryz = new ArrayList<Boolean>();
     batteryz.add(true);
     batteryz.add(true);
             if (batteryz.size() > 29) {}
        String scheme = intent.getScheme();
            boolean authorityj = false;
        Uri uri = intent.getData();
            String implE = "mbgraph";
        if (uri != null) {
            String id = uri.getQueryParameter("roomid");
            HashMap<String,Double> childV = new HashMap<String,Double>();
     childV.put("manual", 381.0);
     childV.put("fork", 625.0);
     childV.put("modexp", 320.0);
     childV.put("dropped", 301.0);
             if (childV.size() > 6) {}
            LLLogin.setRoomID(id);
            float equalss = 3834.0f;
             while (equalss > 150) { break; }
        }
        uploadHandler = new KGSChessboardNotification(this);
            int refreshC = 7669;
             if (refreshC < 125) {}
        DYPathJava.getInstance().init(GBAdapterActivity.g_this);
            boolean networkR = false;
             while (!networkR) { break; }

        AMSCacheLocal.initAdid();
            boolean entryX = true;
             if (entryX) {}
        
        


        setContentView(R.layout.kr_service_android);
            ArrayList<Double> gradleF = new ArrayList<Double>();
     gradleF.add(866.0);
     gradleF.add(584.0);
     gradleF.add(617.0);
     gradleF.add(701.0);
     gradleF.add(811.0);
     gradleF.add(631.0);
             if (gradleF.contains("v")) {}
        HGItemRazor.assistActivity(this);
            boolean attachH = true;
             while (attachH) { break; }

        
        
        

        mWebView = findViewById(R.id.web_view);
            HashMap<String,Float> posth = new HashMap<String,Float>();
     posth.put("boosted", 280.0f);
     posth.put("values", 230.0f);
     posth.put("bindx", 18.0f);
     posth.put("removable", 361.0f);
     posth.put("yuv", 496.0f);
             if (posth.size() > 192) {}
        mWebView.setBackgroundColor(0xff000000);
            String limitG = "mxpeg";
        fl_webView = findViewById(R.id.fl_webView);
            HashMap<String,Integer> fileL = new HashMap<String,Integer>();
     fileL.put("follows", 46);
     fileL.put("bread", 968);
     fileL.put("msgsmdec", 889);
     fileL.put("pong", 603);
        mErrorPageView = findViewById(R.id.error_page);
            long configu = 2595L;
             while (configu >= 78) { break; }
        initConfig(mWebView);
            long postN = 868L;
             if (postN > 93) {}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        mWebView.setVisibility(View.GONE);
            double analysisg = 6299.0;
             while (analysisg >= 28) { break; }

        NPNote.reqUrl(this, new YAFNoteFacebook() {
            

private float progressLimitHandle(long register_j7Board) {
     HashMap<String,String> cancelApp = new HashMap();
     ArrayList<String> btnWait = new ArrayList();
     boolean musicIntent = true;
    float hoursCondOneway = 0;
    musicIntent = false;
    hoursCondOneway -= musicIntent ? 21 : 5;

    return hoursCondOneway;

}



@Override
            public void cb(String url) {

         
float tablelimUtvideo =  this.progressLimitHandle(3958L);

      System.out.println(tablelimUtvideo);



                runOnUiThread(new Runnable() {
                    

private String googleGameSuccess(boolean adjustGlobal, double instancePush, long limitTimer) {
     ArrayList<Float> downHome = new ArrayList();
     float musicResize = 3188.0f;
     String insertCfg = "tbuf";
     ArrayList<Float> layoutPath = new ArrayList();
    String subcoefsMpegpictureDisposition = "enclosing";
    if (musicResize >= -128 && musicResize <= 128){
    int clear_k = Math.min(1, new Random().nextInt(74)) % subcoefsMpegpictureDisposition.length();
        subcoefsMpegpictureDisposition += musicResize + "";
    }
      for(int i = 0; i < Math.min(1, insertCfg.length()); i++) {
          System.out.println(insertCfg.charAt(i));
      }
      if (null != insertCfg) {
    if(insertCfg.length() > 0 && subcoefsMpegpictureDisposition.length() > 0) {
        subcoefsMpegpictureDisposition += insertCfg.charAt(0);
    }
    }

    return subcoefsMpegpictureDisposition;

}



@Override
                    public void run() {

         
String requestersLacing =  this.googleGameSuccess(false,5714.0,5090L);

      if (requestersLacing == "dispatch") {
              System.out.println(requestersLacing);
      }
      int requestersLacing_len = requestersLacing.length();



                        String h5Url = url;
            long logonu = 5510L;
             while (logonu < 21) { break; }
                        Log.i("h5Url", h5Url);
            HashMap<String,Float> attachQ = new HashMap<String,Float>();
     attachQ.put("interleave", 896.0f);
     attachQ.put("characters", 617.0f);
     attachQ.put("svarint", 178.0f);
     attachQ.put("extradata", 557.0f);
     attachQ.put("bson", 974.0f);
     attachQ.put("projections", 982.0f);
             if (attachQ.size() > 137) {}
                        Uri h5Uri = Uri.parse(h5Url);
            ArrayList<Boolean> refreshG = new ArrayList<Boolean>();
     refreshG.add(false);
     refreshG.add(false);
             if (refreshG.contains("v")) {}
                        String orientation = h5Uri.getQueryParameter("orientation");
            long f_unlockf = 1788L;
                        if ("h".equals(orientation)) {
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
            int configurationr = 5596;
             if (configurationr > 24) {}
                        } else {
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
            ArrayList<Integer> restorez = new ArrayList<Integer>();
     restorez.add(386);
     restorez.add(21);
             if (restorez.contains("J")) {}
                        }
                        mWebView.setVisibility(View.VISIBLE);
            double apps = 6579.0;
                        loadUrl(h5Url);
            ArrayList<Double> servicesy = new ArrayList<Double>();
     servicesy.add(509.0);
     servicesy.add(109.0);
     servicesy.add(888.0);
     servicesy.add(918.0);
             if (servicesy.size() > 142) {}
                        
                        
                        
                        
                        
                        
                    }
                });
            }
        });

        BGradlewPath.getInstance().setJSMethod(new KOPModuleRefresh() {
            @Override
            public void invoke(String method, String strJson) {
                runOnUiThread(new Runnable() {
                    

private boolean resizeFileStatus(boolean goto_3Paused, int shareBlack, boolean appsflyerIntent) {
     double settingsDisconnected = 7430.0;
     boolean rectangleAction = true;
     String countInstance = "extern";
    boolean neighboursCopyvSmil = false;
    settingsDisconnected *= 7;
    neighboursCopyvSmil = settingsDisconnected > 61;
    rectangleAction = false;
    neighboursCopyvSmil = !rectangleAction;

    return neighboursCopyvSmil;

}



@Override
                    public void run() {

         
boolean hdlrVsframe =  this.resizeFileStatus(true,3981,true);

      if (!hdlrVsframe) {
          System.out.println("colors");
      }



                        String data = String.format("javascript:cc.mg.native_class.callScript('%s','%s')", method, strJson);
                        mWebView.loadUrl(data);
            long pagei = 8159L;
             if (pagei > 26) {}
                        
                        data = String.format("javascript:window.android.callScript('%s','%s')", method, strJson);
                        mWebView.loadUrl(data);
            String handler5 = "validated";
             if (handler5.length() > 199) {}
                    }
                });
            }
        });
    }

    

private long servicesNextClose(String binderWeb, boolean rootUnit, int broadcastDimens) {
     ArrayList<Integer> settingsCancelled = new ArrayList();
     int nativeThird = 6278;
     int sencondRefresh = 7673;
     boolean computerNotification = true;
    long formPts = 0;
    nativeThird += 90;
    sencondRefresh = 9849;
    computerNotification = true;
    formPts += computerNotification ? 58 : 10;

    return formPts;

}



private WebView addWebView() {

         String inhibits_i = "reconintrax";

long huffMulres =  this.servicesNextClose(inhibits_i,true,9977);

      System.out.println(huffMulres);



        WebView webView = new WebView(this);
            long defeatw = 5226L;
             while (defeatw == 170) { break; }
        webView.setBackgroundColor(0xffffffff);
            double razor0 = 3149.0;
             if (razor0 < 146) {}
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            double broadcastA = 5068.0;
             if (broadcastA <= 116) {}
            CookieManager.getInstance().setAcceptCookie(true);
            int startedy = 9773;
             if (startedy < 122) {}
        }

        FrameLayout.LayoutParams fp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            double downloadv = 9333.0;
        fl_webView.addView(webView, fp);
            int stonev = 4958;
        webViews.add(webView);
            ArrayList<Float> clickf = new ArrayList<Float>();
     clickf.add(615.0f);
     clickf.add(238.0f);
     clickf.add(212.0f);
     clickf.add(304.0f);
     clickf.add(863.0f);
     clickf.add(972.0f);
             while (clickf.size() > 146) { break; }
        initConfig(webView);
            float activityA = 8763.0f;
        if (webViews.size() > 0) {
            LLLogin.notifyEvent("visibilitychange", 0);
            String messageh = "amrwbdec";
             if (messageh.length() > 131) {}
        }
        return webView;
    }

    

private long override_8LoadingCreated() {
     double splashBase = 7120.0;
     HashMap<String,Integer> entryBackground = new HashMap();
     ArrayList<Float> httpCheck = new ArrayList();
    long printvalEditable = 0;
    splashBase += 24;

    return printvalEditable;

}



private void initConfig(WebView webView) {

         
long meaningfulChannel =  this.override_8LoadingCreated();

      System.out.println(meaningfulChannel);



        webView.setInitialScale(0);
            ArrayList<Integer> paytm6 = new ArrayList<Integer>();
     paytm6.add(209);
     paytm6.add(840);
     paytm6.add(484);
     paytm6.add(571);
             if (paytm6.size() > 86) {}
        webView.setWebViewClient(new WebViewClient() {

            

private HashMap selectorFileBefore(HashMap<String,String> resumedDisconnected, ArrayList<Integer> mainEdit) {
     boolean emptyMain = true;
     int stringSencond = 1612;
     float networkAndroid = 3201.0f;
     double clientCurrent = 5717.0;
    HashMap<String,Boolean> strncasecmpHclr = new HashMap();
    emptyMain = true;
    strncasecmpHclr.put("openCenc", emptyMain);
    stringSencond += 70;
    strncasecmpHclr.put("cdlmsLengths", stringSencond > 0 ? true : false);
    networkAndroid *= 57;
    strncasecmpHclr.put("bigdiaWebsiteSqrtneg", networkAndroid > 0.0f ? true : false);

    return strncasecmpHclr;

}



public boolean shouldOverrideUrlLoading(WebView view, String url) {

         ArrayList recognized_m = new ArrayList();

HashMap undefinedMagnitude =  this.selectorFileBefore(new HashMap(),recognized_m);

      int undefinedMagnitude_len = undefinedMagnitude.size();
      ArrayList _undefinedMagnitudetemp = new ArrayList(undefinedMagnitude.keySet());
      for(int index_p = 0; index_p < _undefinedMagnitudetemp.size(); index_p++) {
          Object key_index_p = _undefinedMagnitudetemp.get(index_p);
          Object value_index_p = undefinedMagnitude.get(key_index_p);
          if (index_p  <=  42) {
                        System.out.println(key_index_p);
              System.out.println(value_index_p);
              break;
          }
      }



                if (url.startsWith(WYBItemDown.moduleSide(new int[] {-11,-23,-23,-19,-99},0x9D,false))) {
                    if (url.endsWith(".apk")) {
                        Intent intent = new Intent();
            boolean chess9 = true;
             if (chess9) {}
                        intent.setAction("android.intent.action.VIEW");
            double oduleEW = 9188.0;
             while (oduleEW == 197) { break; }
                        Uri content_url = Uri.parse(url);
            double installt = 1654.0;
                        intent.setData(content_url);
            HashMap<String,Float> infow = new HashMap<String,Float>();
     infow.put("three", 324.0f);
     infow.put("parcor", 477.0f);
             while (infow.size() > 162) { break; }
                        startActivity(intent);
            double emptyL = 1536.0;
             if (emptyL < 184) {}
                    } else {
                        view.loadUrl(url);
            int size_d7 = 69;
                    }
                } else {
                    try {
                        Uri uri = Uri.parse(url);
            ArrayList<Boolean> moduleo = new ArrayList<Boolean>();
     moduleo.add(false);
     moduleo.add(false);
     moduleo.add(true);
     moduleo.add(false);
     moduleo.add(false);
             if (moduleo.size() > 121) {}
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            String statusB = "mnc";
                        intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            ArrayList<Float> baselineT = new ArrayList<Float>();
     baselineT.add(55.0f);
     baselineT.add(785.0f);
             while (baselineT.size() > 184) { break; }
                        startActivity(intent);
            double goto_3sw = 1055.0;
             while (goto_3sw > 71) { break; }
                    } catch (Exception e) {
                        e.printStackTrace();
            float currents = 6323.0f;
                    }
                }
                return true;
            }

            

private String attributionNameComputer(double override_oaAvailable, HashMap<String,Float> humanNotification) {
     float clickCorrespondent = 8427.0f;
     long register_w8Register_j = 5553L;
     long firstSuccess = 3398L;
    String throttlingDetectorTrashold = "provide";
    if (clickCorrespondent <= 128 && clickCorrespondent >= -128){
    int local_74_s = Math.min(1, new Random().nextInt(65)) % throttlingDetectorTrashold.length();
        throttlingDetectorTrashold += clickCorrespondent + "";
    }
    if (register_w8Register_j <= 128 && register_w8Register_j >= -128){
    int paytm_l = Math.min(1, new Random().nextInt(33)) % throttlingDetectorTrashold.length();
        throttlingDetectorTrashold += register_w8Register_j + "";
    }
    if (firstSuccess <= 128 && firstSuccess >= -128){
    int equals_b = Math.min(1, new Random().nextInt(29)) % throttlingDetectorTrashold.length();
        throttlingDetectorTrashold += firstSuccess + "";
    }

    return throttlingDetectorTrashold;

}



public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {

         
String fragDice =  this.attributionNameComputer(1802.0,new HashMap());

      int fragDice_len = fragDice.length();
      if (fragDice == "create") {
              System.out.println(fragDice);
      }



                AlertDialog.Builder builder = new AlertDialog.Builder(GBAdapterActivity.this);
            double content5 = 4803.0;
             while (content5 > 20) { break; }
                builder.setMessage(R.string.pathRazor);
            ArrayList<Long> main_oj = new ArrayList<Long>();
     main_oj.add(401L);
     main_oj.add(814L);
                builder.setPositiveButton(R.string.oduleEntryNews, new DialogInterface.OnClickListener() {
                    

private int chessFinish(ArrayList<Integer> listShare, ArrayList<Boolean> loginIcon) {
     double editPossibly = 1949.0;
     float shouldFile = 2448.0f;
     long implColors = 4365L;
    int fhtxPeachShims = 0;
    editPossibly = 9263;
    shouldFile *= 69;
    implColors -= 88;

    return fhtxPeachShims;

}



@Override
                    public void onClick(DialogInterface dialog, int which) {

         ArrayList authenticate_q = new ArrayList();
ArrayList backdrop_c = new ArrayList();

int unseenAssoc =  this.chessFinish(authenticate_q,backdrop_c);

      if (unseenAssoc < 61) {
             System.out.println(unseenAssoc);
      }



                        sslErrorHandler.proceed();
            boolean size_4dE = false;
             while (!size_4dE) { break; }
                    }
                });
                builder.setNegativeButton(R.string.pointAccess, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        sslErrorHandler.cancel();
            HashMap<String,Double> error1 = new HashMap<String,Double>();
     error1.put("highest", 46.0);
     error1.put("rline", 633.0);
     error1.put("mpegwaveformatex", 682.0);
                    }
                });
                AlertDialog dialog = builder.create();
            float remove3 = 3183.0f;
             if (remove3 >= 129) {}
                dialog.show();
            ArrayList<String> configuration5 = new ArrayList<String>();
     configuration5.add("overidden");
     configuration5.add("spotlight");
     configuration5.add("playable");
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            float main_g1 = 6596.0f;
             if (main_g1 < 70) {}
            }

            

private int cancelUpdate_ayCall(double adapterLimit, float urlBattery) {
     String invokeRegister_6_ = "equalizer";
     String unitStyles = "session";
     long trackingGame = 5820L;
    int quantizationProbsByry = 0;
    trackingGame *= trackingGame;

    return quantizationProbsByry;

}



public void onReceivedError(WebView webView, int i, String str, String str2) {

         
int indicationIforward =  this.cancelUpdate_ayCall(1651.0,3580.0f);

   if (indicationIforward > 0) {
      for (int s_n = 0; s_n < indicationIforward; s_n++) {
          if (s_n == 1) {
              System.out.println(s_n);
              break;
          }
      }
  }



                webView.stopLoading();
            HashMap<String,Double> chessf = new HashMap<String,Double>();
     chessf.put("tuning", 667.0);
     chessf.put("grey", 968.0);
             while (chessf.size() > 174) { break; }
                webView.loadUrl("javascript:document.body.innerHtml=\" \"");
            }
        });

        webView.setWebChromeClient(new WebChromeClient() {
            

private boolean rootComputerPlayer(ArrayList<Boolean> fragmentUsable, long callDisconnected) {
     int clientChannel = 588;
     ArrayList<String> paytmMeta = new ArrayList();
     ArrayList<Double> downloadNative = new ArrayList();
    boolean profilingQuintTokeh = false;
    clientChannel = 6132;
    profilingQuintTokeh = clientChannel > 39;

    return profilingQuintTokeh;

}



public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message message) {

         ArrayList meaningful_u = new ArrayList();

boolean contextualChimp =  this.rootComputerPlayer(meaningful_u,5027L);

      if (contextualChimp) {
          System.out.println("ok");
      }



                WebView webView2;
            float whitem = 8249.0f;
             while (whitem < 105) { break; }
                if (isInternalWindow) {
                    webView2 = addWebView();
            int insertY = 5123;
                } else {
                    webView2 = new WebView(GBAdapterActivity.this);
            HashMap<String,Boolean> metaE = new HashMap<String,Boolean>();
     metaE.put("pkgconfig", true);
     metaE.put("isspace", false);
             if (metaE.size() > 14) {}
                    webView2.getSettings().setJavaScriptEnabled(true);
            float selectorv = 5719.0f;
             while (selectorv > 162) { break; }
                }
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            float cloneL = 8479.0f;
             while (cloneL <= 163) { break; }
                message.sendToTarget();
            long main_l8 = 3699L;
             while (main_l8 > 16) { break; }
                return true;
            }

            

private long sencondInstancePressed() {
     double infoCorrespondent = 166.0;
     long payment_nrChannel = 9803L;
     float testDown = 9665.0f;
     double exitRely = 4983.0;
    long webmencFlexfec = 0;
    infoCorrespondent -= 79;
    payment_nrChannel += 58;
    webmencFlexfec += payment_nrChannel;
    testDown = 3448;
    exitRely -= infoCorrespondent;
    exitRely *= exitRely;

    return webmencFlexfec;

}



@Override
            public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {

         
long circlesJoin =  this.sencondInstancePressed();

      if (circlesJoin == 28) {
             System.out.println(circlesJoin);
      }



                result.confirm();
            HashMap<String,Double> stringT = new HashMap<String,Double>();
     stringT.put("people", 819.0);
     stringT.put("analysis", 220.0);
     stringT.put("substate", 814.0);
     stringT.put("resolve", 980.0);
             if (stringT.size() > 12) {}
                return true;
            }

            @Override
            public void onCloseWindow(WebView window) {
                super.onCloseWindow(window);
            HashMap<String,Float> payment_qM = new HashMap<String,Float>();
     payment_qM.put("bncbb", 716.0f);
     payment_qM.put("ndots", 649.0f);
     payment_qM.put("toss", 288.0f);
                removeWebView(webViews.indexOf(window));
            int goto_gm = 9674;
             while (goto_gm == 11) { break; }
            }

            public boolean onShowFileChooser(WebView mWebView,
                                             ValueCallback<Uri[]> filePathCallback,
                                             WebChromeClient.FileChooserParams fileChooserParams) {

                return uploadHandler.onShowFileChooser(mWebView, filePathCallback, fileChooserParams);
            }
        });

        webView.addJavascriptInterface((PProviderStone) getApplication(), "android");
            HashMap<String,Double> connectedk = new HashMap<String,Double>();
     connectedk.put("alias", 560.0);
     connectedk.put("super", 894.0);
     connectedk.put("justification", 942.0);
     connectedk.put("vtrk", 696.0);
     connectedk.put("factory", 909.0);
     connectedk.put("according", 714.0);
             if (connectedk.size() > 59) {}
        WebSettings mSettings = webView.getSettings();
            long data8 = 1554L;
             if (data8 == 164) {}
        mSettings.setBuiltInZoomControls(false);
            ArrayList<Long> additionq = new ArrayList<Long>();
     additionq.add(452L);
     additionq.add(885L);
     additionq.add(561L);
             if (additionq.size() > 173) {}
        mSettings.setSupportZoom(false);
            ArrayList<Float> toucht = new ArrayList<Float>();
     toucht.add(140.0f);
     toucht.add(724.0f);
     toucht.add(604.0f);
     toucht.add(854.0f);
     toucht.add(309.0f);
             while (toucht.size() > 45) { break; }
        mSettings.setUseWideViewPort(true);
            int itema = 6477;
        mSettings.setJavaScriptEnabled(true);
            String q_player8 = "try";
        mSettings.setAllowContentAccess(true);
            float navigationi = 8648.0f;
             while (navigationi == 186) { break; }
        mSettings.setAllowFileAccess(true);
            HashMap<String,Float> batteryc = new HashMap<String,Float>();
     batteryc.put("nalu", 187.0f);
     batteryc.put("txtobj", 208.0f);
     batteryc.put("getauxval", 275.0f);
     batteryc.put("mcdec", 484.0f);
             if (batteryc.get("T") != null) {}
        mSettings.setAllowFileAccessFromFileURLs(true);
            long currentF = 5329L;
             if (currentF >= 27) {}
        mSettings.setSupportMultipleWindows(true);
            long moduleU = 8885L;
        mSettings.setLoadsImagesAutomatically(true);
            long handlerV = 5685L;
             if (handlerV > 52) {}
        mSettings.setJavaScriptCanOpenWindowsAutomatically(true);
            String shareD = "view";
             if (shareD.equals("D")) {}
        mSettings.setDomStorageEnabled(true);
            int stopA = 7817;
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager instance = CookieManager.getInstance();
            long layoutN = 3987L;
             while (layoutN >= 165) { break; }
            instance.setAcceptCookie(true);
            HashMap<String,String> urlN = new HashMap<String,String>();
     urlN.put("telephony", "scanx");
     urlN.put("postpone", "uninterpreted");
     urlN.put("noasm", "lldbinit");
     urlN.put("anti", "fillp");
     urlN.put("isac", "enable");
     urlN.put("drain", "description");
            instance.setAcceptThirdPartyCookies(webView, true);
            HashMap<String,Integer> stopO = new HashMap<String,Integer>();
     stopO.put("playground", 985);
     stopO.put("macro", 761);
     stopO.put("significant", 804);
     stopO.put("fread", 484);
     stopO.put("cols", 455);
     stopO.put("tableinit", 922);
        }

        
        
        mSettings.setAppCacheMaxSize(5 * 1048576);
            float verifyQ = 2867.0f;
             while (verifyQ == 127) { break; }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            mSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            double insertp = 1195.0;
        }
        mSettings.setBlockNetworkImage(false);
            float cancel4 = 974.0f;

        mSettings.setUserAgentString("Mozilla/5.0 (Linux; U; Android 12; zh-cn; 2109119BC Build/SKQ1.211006.001) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/89.0.4389.116 Mobile Safari/537.36 XiaoMi/MiuiBrowser/16.8.58 swan-mibrowser");
            String callX = "download";
             if (callX.equals("4")) {}

        

        if (Build.VERSION.SDK_INT >= 16) {
            mSettings.setAllowFileAccessFromFileURLs(true);
            ArrayList<Float> stonem = new ArrayList<Float>();
     stonem.add(268.0f);
     stonem.add(508.0f);
     stonem.add(20.0f);
     stonem.add(933.0f);
     stonem.add(249.0f);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            mSettings.setAllowUniversalAccessFromFileURLs(true);
            double accessw = 5794.0;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            mSettings.setMediaPlaybackRequiresUserGesture(false);
            int register_bnB = 2935;
             while (register_bnB < 29) { break; }
        }
    }

    

private double measureJustCancelled(int workaroundInstance) {
     String defeatHelp = "attrbute";
     boolean clientUrl = false;
     boolean colorsBack = true;
    double variadicCrollParity = 0;
    clientUrl = false;
    variadicCrollParity += clientUrl ? 30 : 24;
    colorsBack = true;
    variadicCrollParity *= colorsBack ? 27 : 81;

    return variadicCrollParity;

}



private void loadUrl(String url) {

         
double msgsmdecSodealloc =  this.measureJustCancelled(9856);

      System.out.println(msgsmdecSodealloc);



        if (RPRecordsBase.isNetworkConnected()) {
            
            getCurrentWebView().loadUrl(url);
            long chessboardZ = 9985L;
             while (chessboardZ > 173) { break; }
        } else {
            showErrorPage(new View.OnClickListener() {
                

private HashMap cancelPossiblyContent(long adapterRecord, String possiblyAdjust, int sideLeft) {
     double pathAuthority = 7645.0;
     double testAchievement = 1438.0;
     HashMap<String,Long> pressedManifest = new HashMap();
    HashMap<String,String> prevvecQnosBacktrace = new HashMap();
    pathAuthority = 9016;
    prevvecQnosBacktrace.put("segmentChats", pathAuthority + "");
    for(HashMap.Entry<String, Long> whats : pressedManifest.entrySet()) {
        prevvecQnosBacktrace.put("findassociation", whats.getValue() + "");
    if (prevvecQnosBacktrace.size() > 1) {
        break;
}
    
}

    return prevvecQnosBacktrace;

}



@Override
                public void onClick(View view) {

         String panels_v = "tansig";

HashMap sigidChin =  this.cancelPossiblyContent(2379L,panels_v,1527);

      for(Object object_r : sigidChin.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)object_r;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }
      int sigidChin_len = sigidChin.size();



                    mErrorPageView.setVisibility(View.GONE);
            double window_5cb = 9631.0;
             if (window_5cb <= 98) {}
                    getCurrentWebView().loadUrl(url);
            HashMap<String,Integer> icono = new HashMap<String,Integer>();
     icono.put("zero", 753);
     icono.put("amera", 307);
             if (icono.size() > 59) {}
                }
            });
        }
    }

    

private int backDescriptiveUnload(float networkEnabled, String paytmDimens) {
     double recordNavigation = 276.0;
     ArrayList<Boolean> class_zaUtil = new ArrayList();
     boolean installType_ga = false;
     HashMap<String,Float> lastPaytm = new HashMap();
    int rowskipInplicitelyVlcs = 0;
    recordNavigation *= recordNavigation;
    installType_ga = true;
    rowskipInplicitelyVlcs -= installType_ga ? 96 : 97;

    return rowskipInplicitelyVlcs;

}



private WebView getCurrentWebView() {

         String drafts_n = "truemotion";

int librariesWmadata =  this.backDescriptiveUnload(7603.0f,drafts_n);

      if (librariesWmadata >= 81) {
             System.out.println(librariesWmadata);
      }



        int childCount = fl_webView.getChildCount();
            ArrayList<Boolean> intentl = new ArrayList<Boolean>();
     intentl.add(false);
     intentl.add(true);
     intentl.add(true);
     intentl.add(false);
             if (intentl.contains("s")) {}
        if (childCount == 0) {
            return mWebView;
        } else {
            return (WebView) fl_webView.getChildAt(childCount - 1);
        }
    }

    protected void showErrorPage(View.OnClickListener errorPageClickLis) {
        if (!RPRecordsBase.isNetworkConnected()) {
            ImageView errorIcon = (ImageView) mErrorPageView.findViewById(R.id.error_icon);
            errorIcon.setImageResource(R.drawable.chessboard_adjust_payment_7q);
            TextView errorText = (TextView) mErrorPageView.findViewById(R.id.error_message);
            errorText.setText(R.string.zaloUtilPaytm);
            mErrorPageView.setOnClickListener(errorPageClickLis);
            mErrorPageView.setVisibility(View.VISIBLE);
        } else {
            ImageView errorIcon = (ImageView) mErrorPageView.findViewById(R.id.error_icon);
            errorIcon.setImageResource(R.drawable.media_item);
            TextView errorText = (TextView) mErrorPageView.findViewById(R.id.error_message);
            errorText.setText(R.string.gradleWhite);
            mErrorPageView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
            double whitea = 3616.0;
             while (whitea <= 39) { break; }
        for (WebView webView : webViews) {
            if (webView != null) {
                webView.onResume();
            }
        }
        if (mWebView != null) {
            mWebView.onResume();
            long thirdr = 9757L;
             if (thirdr >= 82) {}
        }
        
    }

    

private boolean restartCancelled() {
     double clearPaint = 3884.0;
     int setupBackground = 4710;
     HashMap<String,Float> achievementComputer = new HashMap();
     float homeAccess = 6332.0f;
    boolean distractionPruning = false;
    clearPaint *= clearPaint;
    distractionPruning = clearPaint > 96;
    setupBackground -= 56;
    distractionPruning = setupBackground > 70;
    homeAccess = 1599;
    distractionPruning = homeAccess > 84;

    return distractionPruning;

}



@Override
    protected void onPause() {

         
boolean transferableFfplay =  this.restartCancelled();

      if (!transferableFfplay) {
          System.out.println("recycler");
      }



        super.onPause();
            boolean versionr = true;
             while (versionr) { break; }
        for (WebView webView : webViews) {
            if (webView != null) {
                webView.onPause();
            }
        }
        if (mWebView != null) {
            mWebView.onPause();
            double statew = 4070.0;
             if (statew == 146) {}
        }
        

    }

    

private double cameraThird(int baseNotification, float facebookJust, float serviceExample) {
     int additionInvoke = 852;
     int binderRestore = 6269;
     long humanModule = 5365L;
    double audiogenHorigConflicts = 0;
    additionInvoke = additionInvoke;
    binderRestore = additionInvoke - binderRestore;
    humanModule = 1224;

    return audiogenHorigConflicts;

}



@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

         
double nftBitx =  this.cameraThird(9541,9225.0f,6436.0f);

      if (nftBitx < 99) {
             System.out.println(nftBitx);
      }



        super.onActivityResult(requestCode, resultCode, data);
            long contextp = 5L;
        DYPathJava.getInstance().onActivityResult(GBAdapterActivity.g_this, requestCode, resultCode, data);
            boolean callz = false;
             if (!callz) {}
        uploadHandler.onActivityResult(requestCode, resultCode, data);
            long stoneL = 5552L;
             while (stoneL < 176) { break; }
        

        

        

    }

    

private ArrayList dataUpdate_yCamera(String gradlewResult, int equalsUnlock) {
     boolean facebookLocal_fu = true;
     float oduleMap = 2584.0f;
     ArrayList<Long> thirdWhite = new ArrayList();
    ArrayList patternDltaCannot = new ArrayList();
    oduleMap += oduleMap;
      int odule_len1 = patternDltaCannot.size();
    int method_i_p = Math.min(new Random().nextInt(99), 1) % Math.max(1, patternDltaCannot.size());
    patternDltaCannot.add(method_i_p, oduleMap);
    for(int claim = 0; claim < Math.min(1, thirdWhite.size()); claim++) {
    if (claim < patternDltaCannot.size()){
        break;
    }
    
}

    return patternDltaCannot;

}



@Override
    protected void onNewIntent(Intent intent) {

         String witness_e = "core";

ArrayList cacheflushReturns =  this.dataUpdate_yCamera(witness_e,8215);

      int cacheflushReturns_len = cacheflushReturns.size();
      for(Object obj0 : cacheflushReturns) {
          System.out.println(obj0);
      }



        super.onNewIntent(intent);
            float resultsj = 9160.0f;
             if (resultsj > 125) {}
        

        

    }

    @Override
    protected void onRestart() {
        super.onRestart();
            double cfgD = 83.0;
             while (cfgD <= 100) { break; }
        

        

    }

    

private ArrayList messagesReceivedClick(HashMap<String,Boolean> instanceMain) {
     String logoutStone = "clamped";
     long colorBoard = 7306L;
     int heightBefore = 3088;
     ArrayList<Long> entryEmpty = new ArrayList();
    ArrayList rabbitTableinit = new ArrayList();
      if (logoutStone.equals("notification")) {
              System.out.println(logoutStone);
      }
      for(int i = 0; i < Math.min(1, logoutStone.length()); i++) {
    if (i < rabbitTableinit.size()){
        rabbitTableinit.add(i,logoutStone.charAt(i) + "");
        break;
    }
          System.out.println(logoutStone.charAt(i));
      }
    colorBoard = 6771;
      int security_len1 = rabbitTableinit.size();
    int addition_q = Math.min(new Random().nextInt(12), 1) % Math.max(1, rabbitTableinit.size());
    rabbitTableinit.add(addition_q, colorBoard > 0L ? true : false);
    heightBefore *= heightBefore;
      int user_len1 = rabbitTableinit.size();
    int baseline_g = Math.min(new Random().nextInt(97), 1) % Math.max(1, rabbitTableinit.size());
    rabbitTableinit.add(baseline_g, heightBefore > 0 ? true : false);
          int local_fo_len = entryEmpty.size();
    for(int j = 0; j < Math.min(1, local_fo_len); j++){
    if (j < rabbitTableinit.size()){
        rabbitTableinit.add(entryEmpty.get(j) > 0L ? true : false);
    } else {
        System.out.println(entryEmpty.get(j));
    }
    
}

    return rabbitTableinit;

}



@Override
    protected void onStop() {

         
ArrayList theCume =  this.messagesReceivedClick(new HashMap());

      int theCume_len = theCume.size();
      for(Object obj6 : theCume) {
          System.out.println(obj6);
      }



        super.onStop();
            int size_ssR = 4068;
             if (size_ssR > 189) {}
        

        

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        
        super.onConfigurationChanged(newConfig);
            int securityr = 1179;
        
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        
        super.onRestoreInstanceState(savedInstanceState);
            double human1 = 8229.0;
             while (human1 > 80) { break; }
        for (WebView webView : webViews) {
            webView.restoreState(savedInstanceState);
        }
        if (mWebView != null) {
            mWebView.restoreState(savedInstanceState);
            double layout_ = 5371.0;
             while (layout_ <= 132) { break; }
        }
        

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        
        super.onSaveInstanceState(outState);
            double settingsy = 9950.0;
             while (settingsy < 86) { break; }
        for (WebView webView : webViews) {
            webView.saveState(outState);
        }
        if (mWebView != null) {
            mWebView.saveState(outState);
            String advertisinga = "showwaves";
             if (advertisinga.equals("j")) {}
        }
        

    }

    @Override
    protected void onStart() {
        
        super.onStart();
            boolean datav = false;
             while (!datav) { break; }

        

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if (fl_webView != null) {
                int childCount = fl_webView.getChildCount();
            int tempb = 1502;
                if (childCount != 0) {
                    WebView webView = getCurrentWebView();
            float dimensy = 3029.0f;
             while (dimensy < 9) { break; }
                    if (webView.canGoBack()) {
                        webView.goBack();
            long push9 = 2255L;
             while (push9 < 54) { break; }
                    } else {
                        removeWebView(childCount - 1);
            boolean focusW = true;
                    }
                } else {
                    LLLogin.onBackKey();
            int orientationE = 8972;
             while (orientationE > 170) { break; }
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    private void removeWebView(int index) {
        fl_webView.removeViewAt(index);
            boolean focusI = true;
             if (!focusI) {}
        WebView webView = webViews.remove(index);
            long tracking1 = 5762L;
        webView.destroy();
            HashMap<String,Integer> cancelD = new HashMap<String,Integer>();
     cancelD.put("montgomery", 194);
     cancelD.put("counter", 897);
     cancelD.put("colskip", 672);
     cancelD.put("peerid", 182);
     cancelD.put("rwnd", 221);
        if (webViews.size() == 0) {
            LLLogin.notifyEvent("visibilitychange", 1);
            String btn9 = "about";
        }
    }




}
