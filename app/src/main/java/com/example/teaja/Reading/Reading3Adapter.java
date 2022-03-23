package com.example.teaja.Reading;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemReadingN3;


import java.util.List;

public class Reading3Adapter extends RecyclerView.Adapter<Reading3Adapter.ViewHolder> {

    private List<Reading3> reading3List;
    private IClickItemReadingN3 mIClickItemReadingN3;

    public void Reading3Adapter(List<Reading3> reading3List, IClickItemReadingN3 mIClickItemReadingN3) {
        this.reading3List = reading3List;
        this.mIClickItemReadingN3 = mIClickItemReadingN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Reading3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_reading3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Reading3Adapter.ViewHolder holder, int position) {
        Reading3 reading3 = reading3List.get(position);

        holder.img1.setImageResource(reading3.getResoucedID());
        holder.tvName.setText(reading3.getName());
        holder.img2.setImageResource(reading3.getResouceN3());
        holder.lnjapan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemReadingN3.setOnClickItemListenerN3(reading3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (reading3List != null){
            return reading3List.size();
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
            lnjapan4 = itemView.findViewById(R.id.ln_Nghe3);
            img1 = itemView.findViewById(R.id.img_ReadingN3);
            tvName = itemView.findViewById(R.id.tv_ReadN3);
            img2 = itemView.findViewById(R.id.img_backReadingN3);
        }
    }
}
