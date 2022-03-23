package com.example.teaja.BaiTap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN1;

import java.util.List;

public class BaiTap1Adapter extends RecyclerView.Adapter<BaiTap1Adapter.ViewHolder> {
    private List<BaiTap1> baiTap1List;
    private IcClickItemBaiTapN1 mIcClickItemBaiTapN1;

    public void BaiTap1Adapter(List<BaiTap1> baiTap1List, IcClickItemBaiTapN1 mIcClickItemBaiTapN1) {
        this.baiTap1List = baiTap1List;
        this.mIcClickItemBaiTapN1 = mIcClickItemBaiTapN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaiTap1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_baitap1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaiTap1Adapter.ViewHolder holder, int position) {
        BaiTap1 baiTap1 = baiTap1List.get(position);

        holder.tvnameN1.setText(baiTap1.getName());
        holder.tvnameN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemBaiTapN1.setOnClickItemListenerBaiTapN1(baiTap1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (baiTap1List != null){
            return baiTap1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tvN = itemView.findViewById(R.id.ln_baitapN1);
            tvnameN1 = itemView.findViewById(R.id.tv_baitapN1);
        }
    }
}
