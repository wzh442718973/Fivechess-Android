package com.lucking.shine.tiamshow;

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

public class MainActivity extends Activity implements ChessView.CallBack, View.OnClickListener {


    private ChessView playerview;
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
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题
        // 全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        playerview = (ChessView) findViewById(R.id.chessView);

        player_my = findViewById(R.id.player_my);
        player_pc = findViewById(R.id.player_pc);
        timer = findViewById(R.id.timer);
        result = findViewById(R.id.results);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        startBlack = findViewById(R.id.btn_start_black);
        startWhite = findViewById(R.id.btn_start_white);
        btnClear = findViewById(R.id.btn_clear);


        playerview.setCallBack(this);
        startBlack.setOnClickListener(this);
        startWhite.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        recyclerView.setAdapter(new RecordAdapter(records));
        load_config();
    }

    private void game_end(int statue) {
        int ss = (int) ((System.currentTimeMillis() - startTimer) / 1000); //耗时
        if (statue > 0) {
            black_ok += 1;
        } else if (statue < 0) {
            white_ok += 1;
        } else {
            black_ok += 1;
            white_ok += 1;
        }

        try {
            records.add(0, new JSONObject().put("statue", statue).put("time", ss).toString());
        } catch (Throwable e) {

        }

        recyclerView.getAdapter().notifyItemInserted(0);
        //保存
        save_config();

    }


    @Override
    protected void onResume() {
        /**
         * 设置为横屏
         */
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();

    }

    // 定义一个变量，来标识是否退出
    private static boolean isExit = false;

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Toast.makeText(getApplicationContext(), "Press again to back", Toast.LENGTH_SHORT).show();
            // 利用handler延迟发送更改状态信息
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(Menu.NONE, Menu.FIRST, 0, "开局(黑棋)");
//        menu.add(Menu.NONE, Menu.FIRST + 1, 1, "开局(白棋)");
//        menu.add(Menu.NONE, Menu.FIRST + 2, 2, "悔棋");
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case Menu.FIRST:
//                playerview.startBlack();
//                return true;
//            case Menu.FIRST + 1:
//                playerview.startWhite();
//                return true;
//            case Menu.FIRST + 2:
//                playerview.back();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

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
                    String line = reader.readLine();
                    while (line != null && line.length() > 2) {
                        records.add(line);
                        line = reader.readLine();
                    }
                    reader.close();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            recyclerView.getAdapter().notifyDataSetChanged();
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
                    for (String item : list) {
                        writer.write(item);
                        writer.write("\n");
                    }
                    writer.flush();
                    writer.close();
                } catch (Throwable e) {

                }
            }
        }.start();
    }

    @Override
    public void onPlayer(boolean black) {
        player_pc.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_white, 0, black ? 0 : R.drawable.baseline_chevron_left_24, 0);
        player_my.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_black, 0, black ? R.drawable.baseline_chevron_left_24 : 0, 0);
    }

    @Override
    public void onStart(boolean black) {
        startTimer = System.currentTimeMillis();
        isStart = true;
        handler.removeMessages(1);
        handler.sendEmptyMessage(1);

        startBlack.setEnabled(false);
        startWhite.setEnabled(false);
        onPlayer(black);
    }

    @Override
    public void onEnd(int statue) {
        game_end(statue);
        isStart = false;
        handler.removeMessages(1);

        startBlack.setEnabled(true);
        startWhite.setEnabled(true);
    }

    @Override
    public void onClick(View v) {
        if (v == startBlack) {
            playerview.startBlack();
        } else if (v == startWhite) {
            playerview.startWhite();
        } else if (v == btnClear) {
            this.black_ok = this.white_ok = 0;
            this.records.clear();
            save_config();
            this.recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}
