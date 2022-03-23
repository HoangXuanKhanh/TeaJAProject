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
import com.example.teaja.myInterface.IClickItemVideoN1;

import java.util.List;

public class Japan1adapter extends RecyclerView.Adapter<Japan1adapter.JViewHolder> {
    private List<Japan1> japan1List;
    private IClickItemVideoN1 mIClickItemVideoN1;

    public void Japan1adapter(List<Japan1> japan1List, IClickItemVideoN1 mIClickItemVideoN1) {
        this.japan1List = japan1List;
        this.mIClickItemVideoN1 = mIClickItemVideoN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Japan1adapter.JViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_n1, parent, false);
        JViewHolder jViewHolder = new JViewHolder(view);

        return jViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Japan1adapter.JViewHolder holder, int position) {
        Japan1 japan1 = japan1List.get(position);

        holder.img1.setImageResource(japan1.getResoucedID());
        holder.tvName.setText(japan1.getName());
        holder.img2.setImageResource(japan1.getResouceN1());
        holder.lnjapan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemVideoN1.setOnClickItemListenerN1(japan1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (japan1List != null){
            return japan1List.size();
        }
        return 0;
    }

    public class JViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan1;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public JViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan1 = itemView.findViewById(R.id.ln_JapanN1);
            img1 = itemView.findViewById(R.id.img_japanN1);
            tvName = itemView.findViewById(R.id.tv_japanN1);
            img2 = itemView.findViewById(R.id.img_backvideon1);
        }
    }
}
