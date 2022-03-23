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
import com.example.teaja.myInterface.IClickItemReadingN1;

import java.util.List;

public class Reading1Adapter extends RecyclerView.Adapter<Reading1Adapter.ViewHolder> {
    private List<Reading1> reading1List;
    private IClickItemReadingN1 iClickItemReadingN1;

    public void Reading1Adapter(List<Reading1> reading1List, IClickItemReadingN1 iClickItemReadingN1) {
        this.reading1List = reading1List;
        this.iClickItemReadingN1 = iClickItemReadingN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Reading1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_reading1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Reading1Adapter.ViewHolder holder, int position) {
        Reading1 reading1 = reading1List.get(position);

        holder.img1.setImageResource(reading1.getResoucedID());
        holder.tvName.setText(reading1.getName());
        holder.img2.setImageResource(reading1.getResouceN1());
        holder.lnjapan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemReadingN1.setOnClickItemListenerN1(reading1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (reading1List != null){
            return reading1List.size();
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
            img1 = itemView.findViewById(R.id.img_ReadingN1);
            tvName = itemView.findViewById(R.id.tv_ReadN1);
            img2 = itemView.findViewById(R.id.img_backReadingN1);
        }
    }
}
