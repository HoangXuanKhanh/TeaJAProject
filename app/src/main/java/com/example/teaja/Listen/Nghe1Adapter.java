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
import com.example.teaja.myInterface.IClickItemNghe1;

import java.util.List;

public class Nghe1Adapter extends RecyclerView.Adapter<Nghe1Adapter.ViewHolder> {
    private List<Nghe1> nghe1List;
    private IClickItemNghe1 iClickItemNghe1;

    public void Nghe1Adapter(List<Nghe1> nghe1List, IClickItemNghe1 iClickItemNghe1) {
        this.nghe1List = nghe1List;
        this.iClickItemNghe1 = iClickItemNghe1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Nghe1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nghe1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nghe1Adapter.ViewHolder holder, int position) {
        Nghe1 nghe1 = nghe1List.get(position);

        holder.img1.setImageResource(nghe1.getResoucedID());
        holder.tvName.setText(nghe1.getName());
        holder.img2.setImageResource(nghe1.getResouceN1());
        holder.lnjapan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemNghe1.setOnClickItemListenerNghe1(nghe1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nghe1List != null){
           return nghe1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan1;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan1 = itemView.findViewById(R.id.ln_Nghe1);
            img1 = itemView.findViewById(R.id.img_Nghelis1);
            tvName = itemView.findViewById(R.id.tv_Nghe1);
            img2 = itemView.findViewById(R.id.img_backNghe1);
        }
    }
}
