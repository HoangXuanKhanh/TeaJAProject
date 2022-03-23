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
import com.example.teaja.myInterface.IClickItemNghe2;

import java.util.List;

public class Nghe2Adapter extends RecyclerView.Adapter<Nghe2Adapter.ViewHolder> {
    private List<Nghe2> nghe2List;
    private IClickItemNghe2 mIClickItemNghe2;

    public void Nghe2Adapter(List<Nghe2> nghe2List, IClickItemNghe2 mIClickItemNghe2) {
        this.nghe2List = nghe2List;
        this.mIClickItemNghe2 = mIClickItemNghe2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Nghe2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nghe2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nghe2Adapter.ViewHolder holder, int position) {
        Nghe2 nghe2 = nghe2List.get(position);

        holder.img1.setImageResource(nghe2.getResoucedID());
        holder.tvName.setText(nghe2.getName());
        holder.img2.setImageResource(nghe2.getResouceN2());
        holder.lnjapan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemNghe2.setOnClickItemListenerNghe2(nghe2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nghe2List != null){
            return nghe2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan2;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan2 = itemView.findViewById(R.id.ln_Nghe2);
            img1 = itemView.findViewById(R.id.img_Nghelis2);
            tvName = itemView.findViewById(R.id.tv_Nghe2);
            img2 = itemView.findViewById(R.id.img_backNghe2);
        }
    }
}
