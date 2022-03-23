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
import com.example.teaja.myInterface.IClickItemVideoN5;

import java.util.List;

public class Japan5adapter extends RecyclerView.Adapter<Japan5adapter.JViewHolder> {
    private List<Japan5> japan5List;
    private IClickItemVideoN5 iClickItemVideoN5;

    public void Japan5adapter(List<Japan5> japan5List, IClickItemVideoN5 iClickItemVideoN5) {
        this.japan5List = japan5List;
        this.iClickItemVideoN5 = iClickItemVideoN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Japan5adapter.JViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_n5, parent, false);
        JViewHolder jViewHolder = new JViewHolder(view);

        return jViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Japan5adapter.JViewHolder holder, int position) {
        Japan5 japan5 = japan5List.get(position);

        holder.img1.setImageResource(japan5.getResoucedID());
        holder.tvName.setText(japan5.getName());
        holder.img2.setImageResource(japan5.getResouceN5());
        holder.lnjapan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemVideoN5.setOnClickItemListenerN5(japan5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (japan5List != null){
            return japan5List.size();
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
            lnjapan5 = itemView.findViewById(R.id.ln_JapanN5);
            img1 = itemView.findViewById(R.id.img_japanN5);
            tvName = itemView.findViewById(R.id.tv_japanN5);
            img2 = itemView.findViewById(R.id.img_backvideon5);
        }
    }
}
