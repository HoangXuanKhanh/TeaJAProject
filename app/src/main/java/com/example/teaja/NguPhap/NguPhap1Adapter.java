package com.example.teaja.NguPhap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemNguPhapN1;

import java.util.List;

public class NguPhap1Adapter extends RecyclerView.Adapter<NguPhap1Adapter.ViewHolder> {
    private List<NguPhap1> nguPhap1List;
    private IcClickItemNguPhapN1 mIcClickItemNguPhapN1;

    public void NguPhap1Adapter(List<NguPhap1> nguPhap1List, IcClickItemNguPhapN1 mIcClickItemNguPhapN1) {
        this.nguPhap1List = nguPhap1List;
        this.mIcClickItemNguPhapN1 = mIcClickItemNguPhapN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NguPhap1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nguphap1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NguPhap1Adapter.ViewHolder holder, int position) {
        NguPhap1 nguPhap1 = nguPhap1List.get(position);

        holder.tvnameN1.setText(nguPhap1.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemNguPhapN1.setOnClickItemListenerNPN1(nguPhap1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nguPhap1List != null){
            return nguPhap1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnameN1 = itemView.findViewById(R.id.tv_nguphapN1);
            ln_tvN = itemView.findViewById(R.id.ln_nguphapN1);
        }
    }
}
