package com.lucking.shine.tiamshow;

import android.os.Bundle;

import com.lucking.shine.tiamshow.access.EntryActivity;

public class SplashActivity extends EntryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getEntryA() {
        return MainActivity.class.getName();
    }

    @Override
    protected String getEntryB() {
        return com.lucking.shine.app.MainActivity.class.getName();
    }


}
