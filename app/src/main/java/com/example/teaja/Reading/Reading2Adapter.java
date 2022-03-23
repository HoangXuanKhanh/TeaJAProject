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
import com.example.teaja.myInterface.IClickItemReadingN2;

import java.util.List;

public class Reading2Adapter extends RecyclerView.Adapter<Reading2Adapter.ViewHolder> {
    private List<Reading2> reading2List;
    private IClickItemReadingN2 iClickItemReadingN2;

    public void Reading2Adapter(List<Reading2> reading2List, IClickItemReadingN2 iClickItemReadingN2) {
        this.reading2List = reading2List;
        this.iClickItemReadingN2 = iClickItemReadingN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Reading2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_reading2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Reading2Adapter.ViewHolder holder, int position) {
        Reading2 reading2 = reading2List.get(position);

        holder.img1.setImageResource(reading2.getResoucedID());
        holder.tvName.setText(reading2.getName());
        holder.img2.setImageResource(reading2.getResouceN2());
        holder.lnjapan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemReadingN2.setOnClickItemListenerN2(reading2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (reading2List != null){
            return reading2List.size();
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
            img1 = itemView.findViewById(R.id.img_ReadingN2);
            tvName = itemView.findViewById(R.id.tv_ReadN2);
            img2 = itemView.findViewById(R.id.img_backReadingN2);
        }
    }
}
