package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;

import java.util.List;

public class Bai1N5Adapter extends RecyclerView.Adapter<Bai1N5Adapter.ViewHolder> {
    private List<Bai1N5> bai1N5List;

    public void Bai1N5Adapter(List<Bai1N5> bai1N5List) {
        this.bai1N5List = bai1N5List;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Bai1N5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_bai1n5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Bai1N5Adapter.ViewHolder holder, int position) {
        Bai1N5 bai1N5 = bai1N5List.get(position);

        holder.tvName1.setText(bai1N5.getName1());
        holder.tvName2.setText(bai1N5.getName2());
    }

    @Override
    public int getItemCount() {
        if (bai1N5List != null){
            return bai1N5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName1;
        private TextView tvName2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName1 = itemView.findViewById(R.id.tv1_Name1);
            tvName2 = itemView.findViewById(R.id.tv2_Name2);
        }
    }
}
