package com.example.teaja.NguPhap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemNguPhapN5;

import java.util.List;

public class NguPhap5Adapter extends RecyclerView.Adapter<NguPhap5Adapter.ViewHolder> {
    private List<NguPhap5> nguPhap5List;
    private IcClickItemNguPhapN5 mIcClickItemNguPhapN5;

    public void NguPhap5Adapter(List<NguPhap5> nguPhap5List, IcClickItemNguPhapN5 mIcClickItemNguPhapN5) {
        this.nguPhap5List = nguPhap5List;
        this.mIcClickItemNguPhapN5 = mIcClickItemNguPhapN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NguPhap5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nguphap5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NguPhap5Adapter.ViewHolder holder, int position) {
        NguPhap5 nguPhap5 = nguPhap5List.get(position);

        holder.tvnameN5.setText(nguPhap5.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemNguPhapN5.setOnClickItemListenerNPN5(nguPhap5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nguPhap5List != null){
            return nguPhap5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnameN5 = itemView.findViewById(R.id.tv_nguphapN5);
            ln_tvN = itemView.findViewById(R.id.ln_nguphapN5);
        }
    }
}
