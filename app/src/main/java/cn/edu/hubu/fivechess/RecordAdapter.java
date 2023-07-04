package cn.edu.hubu.fivechess;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.util.List;

public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.VH> {

    private final List<String> records;

    public RecordAdapter(List<String> records) {
        this.records = records;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_records, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        String record = records.get(position);
        try {
            JSONObject json = new JSONObject(record);
            int statue = json.optInt("statue");
            int ss = json.optInt("time");

            if (statue > 0) {
                holder.player.setText(R.string.record_won);//.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_black, 0, 0, 0);
            } else if (statue < 0) {
                holder.player.setText(R.string.record_lost);//.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_white, 0, 0, 0);
            } else {
                holder.player.setText(R.string.record_draw);//.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_black, 0, R.drawable.icon_white, 0);
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

    public static class VH extends RecyclerView.ViewHolder {

        TextView player;
        TextView time;

        public VH(@NonNull View itemView) {
            super(itemView);
            player = itemView.findViewById(R.id.record_player);
            time = itemView.findViewById(R.id.record_time);
        }
    }
}
