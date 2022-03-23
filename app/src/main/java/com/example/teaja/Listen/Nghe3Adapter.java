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
import com.example.teaja.myInterface.IClickItemNghe3;

import java.util.List;

public class Nghe3Adapter extends RecyclerView.Adapter<Nghe3Adapter.ViewHolder> {
    private List<Nghe3> nghe3List;
    private IClickItemNghe3 mIClickItemNghe3;

    public void Nghe3Adapter(List<Nghe3> nghe3List, IClickItemNghe3 mIClickItemNghe3) {
        this.nghe3List = nghe3List;
        this.mIClickItemNghe3 = mIClickItemNghe3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Nghe3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nghe3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nghe3Adapter.ViewHolder holder, int position) {
        Nghe3 nghe3 = nghe3List.get(position);

        holder.img1.setImageResource(nghe3.getResoucedID());
        holder.tvName.setText(nghe3.getName());
        holder.img2.setImageResource(nghe3.getResouceN3());
        holder.lnjapan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemNghe3.setOnClickItemListenerNghe3(nghe3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nghe3List != null){
            return nghe3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan3;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan3 = itemView.findViewById(R.id.ln_Nghe3);
            img1 = itemView.findViewById(R.id.img_Nghelis3);
            tvName = itemView.findViewById(R.id.tv_Nghe3);
            img2 = itemView.findViewById(R.id.img_backNghe3);
        }
    }
}
