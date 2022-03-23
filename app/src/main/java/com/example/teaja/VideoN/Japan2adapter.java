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
import com.example.teaja.myInterface.IClickItemVideoN2;

import java.util.List;

public class Japan2adapter extends RecyclerView.Adapter<Japan2adapter.JViewHolder> {
    private List<Japan2> japan2List;
    private IClickItemVideoN2 iClickItemVideoN2;

    public void Japan2adapter(List<Japan2> japan2List, IClickItemVideoN2 iClickItemVideoN2) {
        this.japan2List = japan2List;
        this.iClickItemVideoN2 = iClickItemVideoN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Japan2adapter.JViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_n2, parent, false);
        JViewHolder jViewHolder = new JViewHolder(view);

        return jViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Japan2adapter.JViewHolder holder, int position) {
        Japan2 japan2 = japan2List.get(position);
        holder.img1.setImageResource(japan2.getResoucedID());
        holder.tvName.setText(japan2.getName());
        holder.img2.setImageResource(japan2.getResouceN2());
        holder.lnjapan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemVideoN2.setOnClickItemListenerN2(japan2);
            }
        });


    }

    @Override
    public int getItemCount() {
        if (japan2List != null){
            return japan2List.size();
        }
        return 0;
    }

    public class JViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan2;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public JViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan2 = itemView.findViewById(R.id.ln_JapanN2);
            img1 = itemView.findViewById(R.id.img_japanN2);
            tvName = itemView.findViewById(R.id.tv_japanN2);
            img2 = itemView.findViewById(R.id.img_backvideon2);
        }
    }
}
