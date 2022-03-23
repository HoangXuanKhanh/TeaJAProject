package com.example.teaja.Listen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemNghe4;


import java.util.List;

public class Nghe4Adapter extends RecyclerView.Adapter<Nghe4Adapter.ViewHolder> {
    private List<Nghe4> nghe4List;
    private IClickItemNghe4 mIClickItemNghe4;

    public void Nghe4Adapter(List<Nghe4> nghe4List, IClickItemNghe4 mIClickItemNghe4) {
        this.nghe4List = nghe4List;
        this.mIClickItemNghe4 = mIClickItemNghe4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Nghe4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nghe4, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nghe4Adapter.ViewHolder holder, int position) {
        Nghe4 nghe4 = nghe4List.get(position);

        holder.img1.setImageResource(nghe4.getResoucedID());
        holder.tvName.setText(nghe4.getName());
        holder.img2.setImageResource(nghe4.getResouceN4());
        holder.lnjapan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemNghe4.setOnClickItemListenerNghe4(nghe4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nghe4List != null){
            return nghe4List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan4;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan4 = itemView.findViewById(R.id.ln_Nghe4);
            img1 = itemView.findViewById(R.id.img_Nghelis4);
            tvName = itemView.findViewById(R.id.tv_Nghe4);
            img2 = itemView.findViewById(R.id.img_backNghe4);
        }
    }
}
