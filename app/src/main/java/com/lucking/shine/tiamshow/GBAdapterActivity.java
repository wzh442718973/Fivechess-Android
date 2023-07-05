package com.lucking.shine.tiamshow;

import com.lucking.shine.issued.UZEditObject;


import android.widget.ImageView;


import java.util.Random;


import java.util.HashMap;



import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.ArrayList;





public class GBAdapterActivity extends Activity implements IHKGradleUtilsView.YAFNoteFacebook, View.OnClickListener {
private HashMap<String,Double> rectangleFacebookType_sb_dict;
String handlerAppSettings_string;
double mediaResultEditSpace = 0.0;
boolean is_RelyStartedReceiver = false;


 UZEditObject stylesObject;



    private IHKGradleUtilsView playerview;
    private TextView player_my, player_pc;
    private TextView timer, result;

    private long startTimer;

    private int black_ok = 0;
    private int white_ok = 0;

    private boolean isStart = false;

    private RecyclerView recyclerView;
    private final ArrayList<String> records = new ArrayList<>();

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(@NonNull Message msg) {
            int mm = (int) ((System.currentTimeMillis() - startTimer) / 1000);
            int min = (int) (mm / 60);
            int sec = (int) (mm % 60);

            timer.setText(String.format("%02d:%02d", min, sec));

            if (isStart) {
                sendEmptyMessageDelayed(1, 1000);
            }
        }
    };

    Button startBlack, startWhite;
    View btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
this.stylesObject = new UZEditObject();

        super.onCreate(savedInstanceState);
            String chevroni = "greatest";
             if (chevroni.equals("t")) {}

        requestWindowFeature(Window.FEATURE_NO_TITLE);
            double fullscreenB = 3168.0;
             if (fullscreenB < 52) {}
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            ArrayList<Long> recordsi = new ArrayList<Long>();
     recordsi.add(384L);
     recordsi.add(132L);
     recordsi.add(80L);
     recordsi.add(79L);
     recordsi.add(128L);
             if (recordsi.contains("k")) {}

        setContentView(R.layout.hh_service_receiver);
            boolean urlc = true;
             if (!urlc) {}
        playerview = (IHKGradleUtilsView) findViewById(R.id.chessView);
            String nameY = "blank";
             while (nameY.length() > 117) { break; }

        player_my = findViewById(R.id.player_my);
            int serviceS = 2522;
             if (serviceS < 32) {}
        player_pc = findViewById(R.id.player_pc);
            ArrayList<Integer> cacheF = new ArrayList<Integer>();
     cacheF.add(519);
     cacheF.add(234);
             while (cacheF.size() > 178) { break; }
        timer = findViewById(R.id.timer);
            String computer9 = "role";
        result = findViewById(R.id.results);
            long playerviewX = 5476L;
             while (playerviewX <= 45) { break; }
        recyclerView = findViewById(R.id.recycler_view);
            boolean computer2 = false;
             if (computer2) {}
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
            String blackL = "redspark";
        startBlack = findViewById(R.id.btn_start_black);
            long adapterS = 6879L;
             while (adapterS >= 187) { break; }
        startWhite = findViewById(R.id.btn_start_white);
            float configv = 2764.0f;
             while (configv == 73) { break; }
        btnClear = findViewById(R.id.btn_clear);
            ArrayList<Integer> adapterB = new ArrayList<Integer>();
     adapterB.add(918);
     adapterB.add(923);
     adapterB.add(425);
     adapterB.add(822);
             if (adapterB.size() > 48) {}


        playerview.setCallBack(this);
            String infoc = "collapse";
             if (infoc.equals("T")) {}
        startBlack.setOnClickListener(this);
            double playerviewh = 9551.0;
             while (playerviewh >= 7) { break; }
        startWhite.setOnClickListener(this);
            double advertisings = 259.0;
        btnClear.setOnClickListener(this);
            boolean fileg = false;
             if (fileg) {}
        recyclerView.setAdapter(new CITWhite(records));
            int playerviewz = 3632;
             if (playerviewz < 49) {}
        load_config();
            int mapV = 6135;
             while (mapV <= 18) { break; }
    }

    private void game_end(int statue) {
        if (this.stylesObject != null) {
        }

        int ss = (int) ((System.currentTimeMillis() - startTimer) / 1000); 
        if (statue > 0) {
            black_ok += 1;
            float razora = 5790.0f;
             while (razora == 111) { break; }
        } else if (statue < 0) {
            white_ok += 1;
            boolean noteP = false;
        } else {
            black_ok += 1;
            long musicA = 389L;
             if (musicA <= 55) {}
            white_ok += 1;
            ArrayList<Long> musicb = new ArrayList<Long>();
     musicb.add(749L);
     musicb.add(618L);
     musicb.add(868L);
     musicb.add(40L);
     musicb.add(373L);
     musicb.add(214L);
             if (musicb.contains("g")) {}
        }

        try {
            records.add(0, new JSONObject().put("statue", statue).put("time", ss).toString());
            ArrayList<Long> next6 = new ArrayList<Long>();
     next6.add(211L);
     next6.add(762L);
             while (next6.size() > 103) { break; }
        } catch (Throwable e) {

        }

        recyclerView.getAdapter().notifyItemInserted(0);
            float test6 = 1633.0f;
             while (test6 > 130) { break; }
        
        save_config();
            ArrayList<Long> drawn = new ArrayList<Long>();
     drawn.add(494L);
     drawn.add(210L);
     drawn.add(740L);

    }


    @Override
    protected void onResume() {
        if (this.stylesObject != null) {
            
float simpletagCodecraw =  this.stylesObject.nativeMessagesGlobal(2972.0,new HashMap(),8742.0);

      System.out.println(simpletagCodecraw);

            
boolean foriWindows =  this.stylesObject.exitLayout(new HashMap(),239);

      if (!foriWindows) {
          System.out.println("ok");
      }

        }

         
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            ArrayList<String> instancer = new ArrayList<String>();
     instancer.add("file");
     instancer.add("cross");
     instancer.add("decoderthreading");
     instancer.add("setctx");
     instancer.add("translated");
     instancer.add("txtnid");
        }
        super.onResume();
            HashMap<String,Double> authorityx = new HashMap<String,Double>();
     authorityx.put("lagarithrac", 518.0);
     authorityx.put("mono", 577.0);
     authorityx.put("alphanum", 976.0);
     authorityx.put("deblocking", 21.0);
     authorityx.put("speed", 714.0);
     authorityx.put("relative", 492.0);
             if (authorityx.size() > 77) {}

    }

    
    private static boolean isExit = false;

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
        if (this.stylesObject != null) {
            
String ublicPasses =  this.stylesObject.alertData(true,2481);

      int ublicPasses_len = ublicPasses.length();
      System.out.println(ublicPasses);

            
float streamidPupil =  this.stylesObject.mainDestroy(4913);

      if (streamidPupil < 55) {
             System.out.println(streamidPupil);
      }

        }

            super.handleMessage(msg);
            double oduleR = 4539.0;
             while (oduleR < 57) { break; }
            isExit = false;
            double emptyZ = 1267.0;
             while (emptyZ < 103) { break; }
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (null != this.stylesObject) {
            String star_p = "scanned";

HashMap indexedAlias =  this.stylesObject.stateShould(new HashMap(),star_p,false);

      int indexedAlias_len = indexedAlias.size();
      ArrayList _indexedAliastemp = new ArrayList(indexedAlias.keySet());
      for(int index_e = 0; index_e < _indexedAliastemp.size(); index_e++) {
          Object key_index_e = _indexedAliastemp.get(index_e);
          Object value_index_e = indexedAlias.get(key_index_e);
          if (index_e  >  15) {
              System.out.println(key_index_e);
              System.out.println(value_index_e);
              break;
          }
      }

            
HashMap sctePutbitbuffer =  this.stylesObject.freeTrackingTracking(3757L);

      int sctePutbitbuffer_len = sctePutbitbuffer.size();
      for(Object object_p : sctePutbitbuffer.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)object_p;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }

        }

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            float urli = 1485.0f;
             if (urli >= 189) {}
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (this.stylesObject != null) {
            
int smiliesTwoway =  this.stylesObject.hashListGlobal(false);

   if (smiliesTwoway > 2) {
      for (int z_1 = 0; z_1 < smiliesTwoway; z_1++) {
          if (z_1 == 1) {
              System.out.println(z_1);
              break;
          }
      }
  }

        }

        if (!isExit) {
            isExit = true;
            String splashX = "mpegaudiodsp";
             if (splashX.length() > 183) {}
            Toast.makeText(getApplicationContext(), "Press again to back", Toast.LENGTH_SHORT).show();
            boolean resultX = false;
             while (resultX) { break; }
            
            mHandler.sendEmptyMessageDelayed(0, 2000);
            boolean completedR = false;
             if (completedR) {}
        } else {
            finish();
            long baseN = 5437L;
             while (baseN >= 120) { break; }
            System.exit(0);
            HashMap<String,Long> trackingy = new HashMap<String,Long>();
     trackingy.put("max", 32L);
     trackingy.put("elliptic", 360L);
             while (trackingy.size() > 80) { break; }
        }
    }

    void load_config() {
        SharedPreferences sh = getSharedPreferences("records", 0);
        this.black_ok = sh.getInt("won_cout", 0);
        this.white_ok = sh.getInt("lost_cout", 0);
        result.setText(String.format("%d : %d", black_ok, white_ok));

        new Thread() {
            @Override
            public void run() {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(getFileStreamPath(file_name)));
            long playerviewO = 293L;
             while (playerviewO >= 110) { break; }
                    String line = reader.readLine();
            String loginU = "aware";
             if (loginU.equals("A")) {}
                    while (line != null && line.length() > 2) {
                        records.add(line);
            boolean channelo = false;
             while (channelo) { break; }
                        line = reader.readLine();
            HashMap<String,Long> timerj = new HashMap<String,Long>();
     timerj.put("mbfilter", 496L);
     timerj.put("apic", 532L);
     timerj.put("capture", 0L);
     timerj.put("fpmb", 605L);
     timerj.put("lockmgr", 312L);
             if (timerj.get("i") != null) {}
                    }
                    reader.close();
            boolean modityI = false;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            recyclerView.getAdapter().notifyDataSetChanged();
            String webE = "momentary";
             while (webE.length() > 154) { break; }
                        }
                    });
                } catch (Throwable e) {

                }
            }
        }.start();
    }

    static final String file_name = "history.txt";

    void save_config() {
        String[] list = records.toArray(new String[0]);

        SharedPreferences sh = getSharedPreferences("records", 0);
        sh.edit().putInt("won_cout", this.black_ok).putInt("lost_cout", this.white_ok).commit();
        result.setText(String.format("%d : %d", black_ok, white_ok));

        new Thread() {
            @Override
            public void run() {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(getFileStreamPath(file_name)));
            String main_if = "scrubbing";
                    for (String item : list) {
                        writer.write(item);
                        writer.write("\n");
            double uploadU = 4490.0;
             while (uploadU > 114) { break; }
                    }
                    writer.flush();
            double update_lrD = 5354.0;
             if (update_lrD < 99) {}
                    writer.close();
            boolean computerX = false;
                } catch (Throwable e) {

                }
            }
        }.start();
    }

    @Override
    public void onPlayer(boolean black) {
        player_pc.setCompoundDrawablesWithIntrinsicBounds(R.drawable.gradle_odule_util, 0, black ? 0 : R.drawable.a_utils, 0);
        player_my.setCompoundDrawablesWithIntrinsicBounds(R.drawable.build_share, 0, black ? R.drawable.a_utils : 0, 0);
    }

    @Override
    public void onStart(boolean black) {
        startTimer = System.currentTimeMillis();
            HashMap<String,Float> splashi = new HashMap<String,Float>();
     splashi.put("drift", 92.0f);
     splashi.put("dynlock", 425.0f);
     splashi.put("jpeg", 298.0f);
     splashi.put("eyboard", 83.0f);
        isStart = true;
            double startedW = 1603.0;
             while (startedW < 98) { break; }
        handler.removeMessages(1);
            boolean limitj = false;
        handler.sendEmptyMessage(1);
            double resultsq = 4228.0;
             while (resultsq <= 44) { break; }

        startBlack.setEnabled(false);
            ArrayList<String> serviceS = new ArrayList<String>();
     serviceS.add("dimensions");
     serviceS.add("peel");
             if (serviceS.contains("F")) {}
        startWhite.setEnabled(false);
            ArrayList<Float> instrumentedU = new ArrayList<Float>();
     instrumentedU.add(416.0f);
     instrumentedU.add(898.0f);
     instrumentedU.add(813.0f);
             while (instrumentedU.size() > 163) { break; }
        onPlayer(black);
            float pushn = 2573.0f;
             while (pushn >= 159) { break; }
    }

    @Override
    public void onEnd(int statue) {
        game_end(statue);
            int paint0 = 3305;
             while (paint0 == 102) { break; }
        isStart = false;
            ArrayList<Boolean> loginu = new ArrayList<Boolean>();
     loginu.add(true);
     loginu.add(true);
     loginu.add(true);
     loginu.add(true);
     loginu.add(false);
        handler.removeMessages(1);
            ArrayList<Boolean> attach2 = new ArrayList<Boolean>();
     attach2.add(false);
     attach2.add(true);
     attach2.add(false);
     attach2.add(false);
     attach2.add(true);
             while (attach2.size() > 178) { break; }

        startBlack.setEnabled(true);
            float testz = 1621.0f;
             if (testz >= 70) {}
        startWhite.setEnabled(true);
            int whatsp = 6482;
             while (whatsp > 147) { break; }
    }

    @Override
    public void onClick(View v) {
        if (v == startBlack) {
            playerview.startBlack();
            double recordsT = 9242.0;
             if (recordsT == 141) {}
        } else if (v == startWhite) {
            playerview.startWhite();
            float progress5 = 4574.0f;
             if (progress5 < 40) {}
        } else if (v == btnClear) {
            this.black_ok = this.white_ok = 0;
            String restart0 = "bitdepth";
             if (restart0.length() > 93) {}
            this.records.clear();
            float statusN = 5732.0f;
             if (statusN >= 73) {}
            save_config();
            float unitp = 9399.0f;
             while (unitp >= 89) { break; }
            this.recyclerView.getAdapter().notifyDataSetChanged();
            float versionD = 5381.0f;
        }
    }
}
