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
import com.example.teaja.myInterface.IClickItemNghe5;

import java.util.List;

public class Nghe5Adapter extends RecyclerView.Adapter<Nghe5Adapter.NgheViewHolder> {
    private List<Nghe5> nghe5List;
    private IClickItemNghe5 mIClickItemNghe5;

    public void Nghe5Adapter(List<Nghe5> nghe5List, IClickItemNghe5 mIClickItemNghe5) {
        this.nghe5List = nghe5List;
        this.mIClickItemNghe5 = mIClickItemNghe5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Nghe5Adapter.NgheViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nghe5, parent, false);
        NgheViewHolder viewHolder = new NgheViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nghe5Adapter.NgheViewHolder holder, int position) {
        Nghe5 nghe5 = nghe5List.get(position);

        holder.img1.setImageResource(nghe5.getResoucedID());
        holder.tvName.setText(nghe5.getName());
        holder.img2.setImageResource(nghe5.getResouceN5());
        holder.lnjapan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemNghe5.setOnClickItemListenerNghe5(nghe5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nghe5List != null){
            return nghe5List.size();
        }
        return 0;
    }

    public class NgheViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan5;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public NgheViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan5 = itemView.findViewById(R.id.ln_Nghe5);
            img1 = itemView.findViewById(R.id.img_Nghelis5);
            tvName = itemView.findViewById(R.id.tv_Nghe5);
            img2 = itemView.findViewById(R.id.img_backNghe5);
        }
    }
}
