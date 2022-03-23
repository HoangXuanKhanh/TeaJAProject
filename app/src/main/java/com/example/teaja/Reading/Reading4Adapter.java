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
import com.example.teaja.myInterface.IClickItemReadingN4;

import java.util.List;

public class Reading4Adapter extends RecyclerView.Adapter<Reading4Adapter.ViewHolder> {
    private List<Reading4> reading4List;
    private IClickItemReadingN4 mIClickItemReadingN4;

    public void Reading4Adapter(List<Reading4> reading4List, IClickItemReadingN4 mIClickItemReadingN4) {
        this.reading4List = reading4List;
        this.mIClickItemReadingN4 = mIClickItemReadingN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Reading4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_reading4, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Reading4Adapter.ViewHolder holder, int position) {
        Reading4 reading4 = reading4List.get(position);

        holder.img1.setImageResource(reading4.getResoucedID());
        holder.tvName.setText(reading4.getName());
        holder.img2.setImageResource(reading4.getResouceN4());
        holder.lnjapan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemReadingN4.setOnClickItemListenerN4(reading4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (reading4List != null){
            return reading4List.size();
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
            img1 = itemView.findViewById(R.id.img_ReadingN4);
            tvName = itemView.findViewById(R.id.tv_ReadN4);
            img2 = itemView.findViewById(R.id.img_backReadingN4);
        }
    }
}
