package com.example.teaja.NguPhap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemNguPhapN4;

import java.util.List;

public class NguPhap4Adapter extends RecyclerView.Adapter<NguPhap4Adapter.ViewHoder> {
    private List<NguPhap4> nguPhap4List;
    private IcClickItemNguPhapN4 mIcClickItemNguPhapN4;

    public void NguPhap4Adapter(List<NguPhap4> nguPhap4List, IcClickItemNguPhapN4 mIcClickItemNguPhapN4) {
        this.nguPhap4List = nguPhap4List;
        this.mIcClickItemNguPhapN4 = mIcClickItemNguPhapN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NguPhap4Adapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_nguphap4, parent, false);
        ViewHoder viewHoder = new ViewHoder(view);

        return viewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull NguPhap4Adapter.ViewHoder holder, int position) {
        NguPhap4 nguPhap4 = nguPhap4List.get(position);

        holder.tvnameN4.setText(nguPhap4.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemNguPhapN4.setOnClickItemListenerNPN4(nguPhap4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (nguPhap4List != null){
            return nguPhap4List.size();
        }
        return 0;
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN4;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            tvnameN4 = itemView.findViewById(R.id.tv_nguphapN4);
            ln_tvN = itemView.findViewById(R.id.ln_nguphapN4);
        }
    }
}
