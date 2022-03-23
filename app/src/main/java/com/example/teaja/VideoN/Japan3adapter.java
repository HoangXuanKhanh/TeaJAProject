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
import com.example.teaja.myInterface.IClickItemVideoN3;

import java.util.List;

public class Japan3adapter extends RecyclerView.Adapter<Japan3adapter.JViewHolder> {
    private List<Japan3> japan3List;
    private IClickItemVideoN3 mIClickItemVideoN3;

    public void Japan3adapter(List<Japan3> japan3List, IClickItemVideoN3 mIClickItemVideoN3) {
        this.japan3List = japan3List;
        this.mIClickItemVideoN3 = mIClickItemVideoN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Japan3adapter.JViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_n3, parent, false);
        JViewHolder jViewHolder = new JViewHolder(view);

        return jViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Japan3adapter.JViewHolder holder, int position) {
        Japan3 japan3 = japan3List.get(position);
        holder.img1.setImageResource(japan3.getResoucedID());
        holder.tvName.setText(japan3.getName());
        holder.img2.setImageResource(japan3.getResouceN3());
        holder.lnjapan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemVideoN3.setOnClickItemListenerN3(japan3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (japan3List != null){
            return japan3List.size();
        }
        return 0;
    }

    public class JViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan3;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public JViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan3 = itemView.findViewById(R.id.ln_JapanN3);
            img1 = itemView.findViewById(R.id.img_japanVD3);
            tvName = itemView.findViewById(R.id.tv_japanN3);
            img2 = itemView.findViewById(R.id.img_backvideon3);
        }
    }
}
