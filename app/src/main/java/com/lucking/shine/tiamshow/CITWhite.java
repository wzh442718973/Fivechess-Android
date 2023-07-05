package com.lucking.shine.tiamshow;
import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.util.List;





public class CITWhite extends RecyclerView.Adapter<CITWhite.HDimensRecord> {
private double beginResumedMax = 0.0;
long logoutDown_count = 0;
private float beforeHeightMin = 0.0f;



    private final List<String> records;

    public CITWhite(List<String> records) {
        this.records = records;
    }

    @NonNull
    @Override
    public HDimensRecord onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HDimensRecord(LayoutInflater.from(parent.getContext()).inflate(R.layout.s_instrumented, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HDimensRecord holder, int position) {
        String record = records.get(position);
        try {
            JSONObject json = new JSONObject(record);
            int statue = json.optInt("statue");
            int ss = json.optInt("time");

            if (statue > 0) {
                holder.player.setText(R.string.moduleTestUpload);
            } else if (statue < 0) {
                holder.player.setText(R.string.recordsPath);
            } else {
                holder.player.setText(R.string.refreshHelp);
            }


            int min = (int) (ss / 60);
            int sec = (int) (ss % 60);
            holder.time.setText(String.format("%02d:%02d", min, sec));
        } catch (Throwable e) {

        }
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    public static class HDimensRecord extends RecyclerView.ViewHolder {
double baselineProgressPostMax = 0.0;
private long enabledClear_index = 0;
double time_j1Instance_margin = 0.0;
long clearCloneIndex = 0;




        TextView player;
        TextView time;

        public HDimensRecord(@NonNull View itemView) {
            super(itemView);
            player = itemView.findViewById(R.id.record_player);
            time = itemView.findViewById(R.id.record_time);
        }
    }
}
