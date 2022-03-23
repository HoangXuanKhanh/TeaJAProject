package com.example.teaja.NguPhap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemNguPhapN2;

import java.util.List;

public class NguPhap2Adapter extends RecyclerView.Adapter<NguPhap2Adapter.ViewHolder> {
    private List<NguPhap2> nguPhap2List;
    private IcClickItemNguPhapN2 mIcClickItemNguPhapN2;

    public void NguPhap2Adapter(List<NguPhap2> nguPhap2List, IcClickItemNguPhapN2 mIcClickItemNguPhapN2) {
        this.nguPhap2List = nguPhap2List;
        this.mIcClickItemNguPhapN2 = mIcClickItemNguPhapN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NguPhap2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nguphap2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NguPhap2Adapter.ViewHolder holder, int position) {
        NguPhap2 nguPhap2 = nguPhap2List.get(position);

        holder.tvnameN2.setText(nguPhap2.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemNguPhapN2.setOnClickItemListenerNPN2(nguPhap2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nguPhap2List != null){
            return nguPhap2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnameN2 = itemView.findViewById(R.id.tv_nguphapN2);
            ln_tvN = itemView.findViewById(R.id.ln_nguphapN2);
        }
    }
}
