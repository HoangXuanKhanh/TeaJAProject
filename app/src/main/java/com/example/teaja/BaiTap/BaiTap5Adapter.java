package com.example.teaja.BaiTap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN5;

import java.util.List;

public class BaiTap5Adapter extends RecyclerView.Adapter<BaiTap5Adapter.ViewHolder> {
    private List<BaiTap5> baiTap5List;
    private IcClickItemBaiTapN5 mIcClickItemBaiTapN5;

    public void BaiTap5Adapter(List<BaiTap5> baiTap5List, IcClickItemBaiTapN5 mIcClickItemBaiTapN5) {
        this.baiTap5List = baiTap5List;
        this.mIcClickItemBaiTapN5 = mIcClickItemBaiTapN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaiTap5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_baitap5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaiTap5Adapter.ViewHolder holder, int position) {
        BaiTap5 baiTap5 = baiTap5List.get(position);

        holder.tvnameN5.setText(baiTap5.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemBaiTapN5.setOnClickItemListenerBaiTapN5(baiTap5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (baiTap5List != null){
            return baiTap5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tvN = itemView.findViewById(R.id.ln_baitapN5);
            tvnameN5 = itemView.findViewById(R.id.tv_baitapN5);
        }
    }
}
