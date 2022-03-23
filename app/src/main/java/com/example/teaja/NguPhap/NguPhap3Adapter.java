package com.example.teaja.NguPhap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemNguPhapN3;

import java.util.List;

public class NguPhap3Adapter extends RecyclerView.Adapter<NguPhap3Adapter.ViewHolder> {
    private List<NguPhap3> nguPhap3List;
    private IcClickItemNguPhapN3 mIcClickItemNguPhapN3;

    public void NguPhap3Adapter(List<NguPhap3> nguPhap3List, IcClickItemNguPhapN3 mIcClickItemNguPhapN3) {
        this.nguPhap3List = nguPhap3List;
        this.mIcClickItemNguPhapN3 = mIcClickItemNguPhapN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NguPhap3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nguphap3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NguPhap3Adapter.ViewHolder holder, int position) {
        NguPhap3 nguPhap3 = nguPhap3List.get(position);

        holder.tvnameN3.setText(nguPhap3.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemNguPhapN3.setOnClickItemListenerNPN3(nguPhap3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nguPhap3List != null){
            return nguPhap3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnameN3 = itemView.findViewById(R.id.tv_nguphapN3);
            ln_tvN = itemView.findViewById(R.id.ln_nguphapN3);
        }
    }
}
