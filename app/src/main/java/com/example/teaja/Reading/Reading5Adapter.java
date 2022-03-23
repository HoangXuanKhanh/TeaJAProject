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
import com.example.teaja.myInterface.IClickItemReadingN5;

import java.util.List;

public class Reading5Adapter extends RecyclerView.Adapter<Reading5Adapter.ViewHolder> {
    private List<Reading5> reading5List;
    private IClickItemReadingN5 mIClickItemReadingN5;

    public void Reading5Adapter(List<Reading5> reading5List, IClickItemReadingN5 mIClickItemReadingN5) {
        this.reading5List = reading5List;
        this.mIClickItemReadingN5 = mIClickItemReadingN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Reading5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_reading5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Reading5Adapter.ViewHolder holder, int position) {
        Reading5 reading5 = reading5List.get(position);

        holder.img1.setImageResource(reading5.getResoucedID());
        holder.tvName.setText(reading5.getName());
        holder.img2.setImageResource(reading5.getResouceN5());
        holder.lnjapan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemReadingN5.setOnClickItemListenerN5(reading5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (reading5List != null){
            return reading5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnjapan5;
        private ImageView img1;
        private TextView tvName;
        private ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnjapan5 = itemView.findViewById(R.id.ln_Nghe5);
            img1 = itemView.findViewById(R.id.img_ReadingN5);
            tvName = itemView.findViewById(R.id.tv_ReadN5);
            img2 = itemView.findViewById(R.id.img_backReadingN5);
        }
    }
}
