package com.example.teaja.VideoN;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemVideoN4;

import java.util.List;

public class Japan4adapter extends RecyclerView.Adapter<Japan4adapter.JViewHolder> {
    private List<Japan4> japan4List;
    private IClickItemVideoN4 iClickItemVideoN4;

    public void Japan4adapter(List<Japan4> japan4List, IClickItemVideoN4 iClickItemVideoN4) {
        this.japan4List = japan4List;
        this.iClickItemVideoN4 = iClickItemVideoN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Japan4adapter.JViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_n4, parent, false);
        JViewHolder jViewHolder = new JViewHolder(view);

        return jViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Japan4adapter.JViewHolder holder, int position) {
        Japan4 japan4 = japan4List.get(position);

        holder.img1.setImageResource(japan4.getResoucedID());
        holder.tvName.setText(japan4.getName());
        holder.img2.setImageResource(japan4.getResouceN4());
        holder.lnjapan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemVideoN4.setOnClickItemListenerN4(japan4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (japan4List != null){
            return japan4List.size();
        }
        return 0;
    }

    public class JViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan5;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public JViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan5 = itemView.findViewById(R.id.ln_JapanN4);
            img1 = itemView.findViewById(R.id.img_japanN4);
            tvName = itemView.findViewById(R.id.tv_japanN4);
            img2 = itemView.findViewById(R.id.img_backvideon4);
        }
    }
}
