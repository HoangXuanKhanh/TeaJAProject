package com.example.teaja.BaiTap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN4;

import java.util.List;

public class BaiTap4Adapter extends RecyclerView.Adapter<BaiTap4Adapter.ViewHolder> {
    private List<BaiTap4> baiTap4List;
    private IcClickItemBaiTapN4 mIcClickItemBaiTapN4;

    public void BaiTap4Adapter(List<BaiTap4> baiTap4List, IcClickItemBaiTapN4 mIcClickItemBaiTapN4) {
        this.baiTap4List = baiTap4List;
        this.mIcClickItemBaiTapN4 = mIcClickItemBaiTapN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaiTap4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_baitap4, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaiTap4Adapter.ViewHolder holder, int position) {
        BaiTap4 baiTap4 = baiTap4List.get(position);

        holder.tvnameN4.setText(baiTap4.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemBaiTapN4.setOnClickItemListenerBaiTapN4(baiTap4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (baiTap4List != null){
            return baiTap4List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tvN = itemView.findViewById(R.id.ln_baitapN4);
            tvnameN4 = itemView.findViewById(R.id.tv_baitapN4);
        }
    }
}
