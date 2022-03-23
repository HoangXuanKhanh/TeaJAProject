package com.example.teaja.BaiTap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN2;

import java.util.List;

public class BaiTap2Adapter extends RecyclerView.Adapter<BaiTap2Adapter.ViewHolder> {
    private List<BaiTap2> baiTap2List;
    private IcClickItemBaiTapN2 mIcClickItemBaiTapN2;

    public void BaiTap2Adapter(List<BaiTap2> baiTap2List, IcClickItemBaiTapN2 mIcClickItemBaiTapN2) {
        this.baiTap2List = baiTap2List;
        this.mIcClickItemBaiTapN2 = mIcClickItemBaiTapN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaiTap2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_baitap2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaiTap2Adapter.ViewHolder holder, int position) {
        BaiTap2 baiTap2 = baiTap2List.get(position);

        holder.tvnameN2.setText(baiTap2.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemBaiTapN2.setOnClickItemListenerBaiTapN2(baiTap2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (baiTap2List != null){
            return baiTap2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tvN = itemView.findViewById(R.id.ln_baitapN2);
            tvnameN2 = itemView.findViewById(R.id.tv_baitapN2);
        }
    }
}
