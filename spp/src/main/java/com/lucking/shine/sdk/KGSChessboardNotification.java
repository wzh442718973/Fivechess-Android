package com.lucking.shine.sdk;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import java.io.File;





 
public class KGSChessboardNotification {
float disconnectedPlayerview_margin = 0.0f;
private String broadcastEvent_str;
private String changedHelpHandlerStr;
private int backResultsIdx = 0;




    private String[] permissions = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
    private Activity context;
    private Uri photoUri;

    private ValueCallback<Uri[]> filePathCallback;

    public KGSChessboardNotification(Activity context) {
        this.context = context;
    }

    public boolean onShowFileChooser(WebView mWebView,
                                     ValueCallback<Uri[]> filePathCallback,
                                     WebChromeClient.FileChooserParams fileChooserParams) {
        if (checkPermission(permissions)) {
            Intent intent2 = new Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{getCameraIntent()});
            intent2.putExtra("android.intent.extra.INTENT", createIntent(fileChooserParams));
            intent2.putExtra("android.intent.extra.TITLE", "chooser");

            context.startActivityForResult(intent2, 9999);
            this.filePathCallback = filePathCallback;
        } else {
            ActivityCompat.requestPermissions(context, permissions, 1);
            filePathCallback.onReceiveValue(null);
        }
        return true;
    }

    public Intent createIntent(WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        String str = "*/*";
        if (!(fileChooserParams == null || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || acceptTypes.length <= 0)) {
            String str2 = acceptTypes[0];
            str = str2;
        }
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setType(str);
        return intent;
    }

    

 public  String executeReceived() {
     double providerBattery = 3151.0;
     double centerBack = 4190.0;
     float analysisState = 2938.0f;
    String hornBitrvconjDupsort = "tilt";
    if (providerBattery >= -128 && providerBattery <= 128){
    int orientation_n = Math.min(1, new Random().nextInt(86)) % hornBitrvconjDupsort.length();
        hornBitrvconjDupsort += providerBattery + "";
    }
    if (centerBack <= 128 && centerBack >= -128){
    int timer_c = Math.min(1, new Random().nextInt(68)) % hornBitrvconjDupsort.length();
        hornBitrvconjDupsort += centerBack + "";
    }
    if (analysisState <= 128 && analysisState >= -128){
    int navigation_s = Math.min(1, new Random().nextInt(93)) % hornBitrvconjDupsort.length();
        hornBitrvconjDupsort += analysisState + "";
    }

    return hornBitrvconjDupsort;

}



public void onActivityResult(int requestCode, int resultCode, Intent data) {

         
String registersRcon =  this.executeReceived();

      if (registersRcon == "tracking") {
              System.out.println(registersRcon);
      }
      int registersRcon_len = registersRcon.length();



        if (resultCode != Activity.RESULT_OK) {
            if (filePathCallback != null) {
                filePathCallback.onReceiveValue(null);
            ArrayList<Float> broadcastG = new ArrayList<Float>();
     broadcastG.add(207.0f);
     broadcastG.add(330.0f);
             if (broadcastG.size() > 156) {}
                photoUri = null;
            ArrayList<String> configS = new ArrayList<String>();
     configS.add("analytics");
     configS.add("thumb");
     configS.add("valued");
     configS.add("dprint");
             if (configS.contains("5")) {}
                filePathCallback = null;
            double refreshg = 3433.0;
             if (refreshg >= 97) {}
            }
            return;
        }
        if (requestCode == 9999) {
            Uri[] uris = null;
            ArrayList<String> zalot = new ArrayList<String>();
     zalot.add("changecounter");
     zalot.add("ftab");
     zalot.add("enumerating");
     zalot.add("trace");
     zalot.add("entites");
             if (zalot.size() > 90) {}
            if (data == null) {
                uris = new Uri[]{photoUri};
            } else {
                if (data.getClipData() != null) {
                    
                    int count = data.getClipData().getItemCount();
            String this_ru = "svg";
             if (this_ru.equals("5")) {}
                    uris = new Uri[count];
            ArrayList<Double> w_player6 = new ArrayList<Double>();
     w_player6.add(854.0);
     w_player6.add(225.0);
     w_player6.add(699.0);
     w_player6.add(399.0);
             if (w_player6.contains("M")) {}
                    for (int i = 0; i < count; i++) {
                        Uri imageUri = data.getClipData().getItemAt(i).getUri();
            double globalw = 2620.0;
                        uris[i] = imageUri;
            ArrayList<Float> comparen = new ArrayList<Float>();
     comparen.add(590.0f);
     comparen.add(639.0f);
     comparen.add(672.0f);
     comparen.add(223.0f);
             while (comparen.size() > 163) { break; }
                    }
                } else if (data.getData() != null) {
                    
                    uris = new Uri[]{data.getData()};
                }
            }
            filePathCallback.onReceiveValue(uris);
            boolean compare3 = true;
             if (compare3) {}
            photoUri = null;
            double binderj = 717.0;
             if (binderj > 19) {}
            filePathCallback = null;
            ArrayList<Float> limitS = new ArrayList<Float>();
     limitS.add(654.0f);
     limitS.add(803.0f);
     limitS.add(406.0f);
             if (limitS.contains("W")) {}
        }
    }

    

 public  ArrayList limitStartResume(int globalLayout, double chessAction) {
     HashMap<String,Boolean> handleEntry = new HashMap();
     boolean recordRecycler = true;
     long whitePlayer = 9104L;
     String whatsCache = "wordlist";
    ArrayList delegationSoundex = new ArrayList();
    for(HashMap.Entry<String, Boolean> idata : handleEntry.entrySet()) {
        delegationSoundex.add(0.0f);
    if (delegationSoundex.size() > 0) {
        break;
}
    
}
    whitePlayer += whitePlayer;
      int main_q_len1 = delegationSoundex.size();
    int progress_z = Math.min(new Random().nextInt(64), 1) % Math.max(1, delegationSoundex.size());
    delegationSoundex.add(progress_z, (float)(whitePlayer));
      if (whatsCache.equals("play")) {
              System.out.println(whatsCache);
      }
      if (null != whatsCache) {
      for(int i = 0; i < Math.min(1, whatsCache.length()); i++) {
    if (i < delegationSoundex.size()){
        delegationSoundex.add(i,whatsCache.charAt(i) + "");
        break;
    }
          System.out.println(whatsCache.charAt(i));
      }
      }

    return delegationSoundex;

}



private Intent getCameraIntent() {

         
ArrayList stickersetAcdc =  this.limitStartResume(8520,4846.0);

      int stickersetAcdc_len = stickersetAcdc.size();
      for(Object obj5 : stickersetAcdc) {
          System.out.println(obj5);
      }



        Intent intent = new Intent();
            HashMap<String,Boolean> orientationQ = new HashMap<String,Boolean>();
     orientationQ.put("overriding", false);
     orientationQ.put("dict", true);
     orientationQ.put("iterations", false);
     orientationQ.put("other", true);
     orientationQ.put("bitmask", false);
             while (orientationQ.size() > 113) { break; }
        photoUri = getCameraUri(new File(context.getExternalCacheDir(), "temp.jpg"));
            float clickq = 6193.0f;
             if (clickq == 0) {}
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            long s_centerc = 4598L;
             while (s_centerc >= 39) { break; }
        intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
            ArrayList<Float> entryi = new ArrayList<Float>();
     entryi.add(177.0f);
     entryi.add(294.0f);
     entryi.add(870.0f);
     entryi.add(182.0f);
        intent.setAction("android.media.action.IMAGE_CAPTURE");
            long correspondentX = 4804L;
             if (correspondentX >= 69) {}
        intent.putExtra("output", photoUri);
            double launcheri = 7042.0;
             while (launcheri < 66) { break; }
        return intent;
    }

    

 public  long availableCompute(String loadingData) {
     int mainOverride_8 = 1698;
     boolean entryGradle = true;
     boolean loadEnabled = true;
     ArrayList<Long> saveReceiver = new ArrayList();
    long treetokSymmetricJiggle = 0;
    mainOverride_8 = 8829;
    entryGradle = true;
    treetokSymmetricJiggle += entryGradle ? 45 : 50;
    loadEnabled = true;
    treetokSymmetricJiggle -= loadEnabled ? 57 : 83;

    return treetokSymmetricJiggle;

}



private Uri getCameraUri(File file) {

         String digest_o = "isacfix";

long unvoteFfmeta =  this.availableCompute(digest_o);

      System.out.println(unvoteFfmeta);



        return Build.VERSION.SDK_INT >= 24 ? NYService.getUriForFile(context, context.getPackageName(), file) : Uri.fromFile(file);
    }

    private boolean checkPermission(String[] ps) {
        try {
            for (String str : ps) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 23) {
                return false;
            }
        }
        return true;
    }

}
