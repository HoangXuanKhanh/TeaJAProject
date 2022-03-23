package com.example.teaja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.myInterface.IClickItemHistoryRecyclerView;

import java.util.List;

public class RecycHistoryAdapter extends RecyclerView.Adapter<RecycHistoryAdapter.hViewHolder> {
    List<RecycHistory> mRecycHistories;
    IClickItemHistoryRecyclerView mHistoryRecyclerView;

    public void RecycHistoryAdapter(List<RecycHistory> mList, IClickItemHistoryRecyclerView mHistoryRecyclerView) {
        this.mRecycHistories = mList;
        this.mHistoryRecyclerView = mHistoryRecyclerView;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecycHistoryAdapter.hViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_recyclerviewhistoy, parent, false);
        hViewHolder hViewHolder = new hViewHolder(view);

        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycHistoryAdapter.hViewHolder holder, int position) {
        RecycHistory history  = mRecycHistories.get(position);

        holder.imgHis.setImageResource(history.getResoureHIS());
        holder.tvname1.setText(history.getName1());
        holder.tvname2.setText(history.getName2());
        holder.lncyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHistoryRecyclerView.setOnClickItemListenerHis(history);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mRecycHistories != null){
            return mRecycHistories.size();
        }
        return 0;
    }

    public class hViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lncyc;
        private ImageView imgHis;
        private TextView tvname1;
        private TextView tvname2;
        public hViewHolder(@NonNull View itemView) {
            super(itemView);
            lncyc = itemView.findViewById(R.id.ln_cyc);
            imgHis=itemView.findViewById(R.id.img_hiscyc);
            tvname1=itemView.findViewById(R.id.tv_recyc1);
            tvname2=itemView.findViewById(R.id.tv_recyc2);
        }
    }
}
