package com.lucking.shine.app;
import android.widget.TextView;


import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;





 
public class HGItemRazor {
private double update_cAdjustDrawPadding = 0.0;
String enabledVersion_str;




    public static void assistActivity(Activity activity) {
        new HGItemRazor(activity);
    }

    private View mChildOfContent;
    private int usableHeightPrevious;
    private FrameLayout.LayoutParams frameLayoutParams;
    private int contentHeight=-1;
    private Activity activity;
    private int statusBarHeight;

    private HGItemRazor(Activity activity) {
        
        int resourceId = activity.getResources().getIdentifier("status_bar_height"
                , "dimen", "android");
        statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);
        this.activity = activity;
        FrameLayout content = (FrameLayout) activity.findViewById(android.R.id.content);
        mChildOfContent = content.getChildAt(0);

        
        mChildOfContent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            

private float resultCancelledTouch() {
     ArrayList<Integer> urlDefeat = new ArrayList();
     ArrayList<Integer> selectorComputer = new ArrayList();
     HashMap<String,Boolean> contextClass_5 = new HashMap();
     boolean moduleWhite = true;
    float permissionLottiekeypath = 0;
    moduleWhite = false;
    permissionLottiekeypath -= moduleWhite ? 44 : 94;

    return permissionLottiekeypath;

}



public void onGlobalLayout() {

         
float majorAvg =  this.resultCancelledTouch();

      System.out.println(majorAvg);



                possiblyResizeChildOfContent();
            HashMap<String,Boolean> page6 = new HashMap<String,Boolean>();
     page6.put("airing", true);
     page6.put("validations", false);
     page6.put("autoplay", true);
     page6.put("constructormagic", false);
     page6.put("datetime", false);
     page6.put("intersection", false);
             if (page6.get("_") != null) {}
            }
        });

        frameLayoutParams = (FrameLayout.LayoutParams)
                mChildOfContent.getLayoutParams();
    }

    
    

private long sleepRestorePlayer() {
     HashMap<String,Integer> loginData = new HashMap();
     long urlType_7o = 1445L;
     HashMap<String,String> cancelledFunction = new HashMap();
     double tempFunction = 8481.0;
    long hstringBalance = 0;
    urlType_7o *= urlType_7o;
    hstringBalance *= urlType_7o;
    tempFunction = 2791;

    return hstringBalance;

}



private void possiblyResizeChildOfContent() {

         
long extskBackground =  this.sleepRestorePlayer();

      if (extskBackground < 50) {
             System.out.println(extskBackground);
      }




        int usableHeightNow = computeUsableHeight();
            HashMap<String,Integer> savee = new HashMap<String,Integer>();
     savee.put("ipod", 251);
     savee.put("unpoison", 473);
     savee.put("filterbank", 104);
     savee.put("tranfser", 582);
     savee.put("minima", 27);
             if (savee.size() > 103) {}

        
        if (usableHeightNow != usableHeightPrevious) {
            
            int usableHeightSansKeyboard = mChildOfContent.getRootView().getHeight();
            float upload2 = 334.0f;
             while (upload2 == 53) { break; }
            int heightDifference = usableHeightSansKeyboard - usableHeightNow;
            HashMap<String,Boolean> touch7 = new HashMap<String,Boolean>();
     touch7.put("proto", false);
     touch7.put("idet", true);
     touch7.put("intraframe", true);
             while (touch7.size() > 4) { break; }
            if (heightDifference > (usableHeightSansKeyboard / 4)) {
                
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    
                    frameLayoutParams.height = usableHeightSansKeyboard - heightDifference + statusBarHeight;
            int leftB = 7884;
             while (leftB < 29) { break; }
                } else {
                    frameLayoutParams.height = usableHeightSansKeyboard - heightDifference;
            boolean processV = false;
             if (processV) {}
                }
            } else {
                frameLayoutParams.height = -1;
            ArrayList<Float> whatsf = new ArrayList<Float>();
     whatsf.add(332.0f);
     whatsf.add(112.0f);
     whatsf.add(664.0f);
     whatsf.add(380.0f);
     whatsf.add(276.0f);
            }

            mChildOfContent.requestLayout();
            HashMap<String,String> result4 = new HashMap<String,String>();
     result4.put("tfhd", "subtitles");
     result4.put("linear", "additions");
     result4.put("expand", "glyphs");
     result4.put("ints", "calculator");
             if (result4.get("G") != null) {}
            usableHeightPrevious = usableHeightNow;
            int appsflyery = 2358;
             if (appsflyery < 125) {}
        }
    }

     
    private int computeUsableHeight() {
        Rect r = new Rect();
            boolean empty9 = false;
             while (empty9) { break; }
        mChildOfContent.getWindowVisibleDisplayFrame(r);
            ArrayList<Boolean> selectorR = new ArrayList<Boolean>();
     selectorR.add(true);
     selectorR.add(false);
             while (selectorR.size() > 19) { break; }
        return (r.bottom - r.top);
    }


}