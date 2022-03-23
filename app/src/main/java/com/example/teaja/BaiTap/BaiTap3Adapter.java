package com.example.teaja.BaiTap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN3;

import java.util.List;

public class BaiTap3Adapter extends RecyclerView.Adapter<BaiTap3Adapter.ViewHolder> {
    private List<BaiTap3> baiTap3List;
    private IcClickItemBaiTapN3 mIcClickItemBaiTapN3;

    public void BaiTap3Adapter(List<BaiTap3> baiTap3List, IcClickItemBaiTapN3 mIcClickItemBaiTapN3) {
        this.baiTap3List = baiTap3List;
        this.mIcClickItemBaiTapN3 = mIcClickItemBaiTapN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaiTap3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_baitap3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaiTap3Adapter.ViewHolder holder, int position) {
        BaiTap3 baiTap3 = baiTap3List.get(position);

        holder.tvnameN3.setText(baiTap3.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemBaiTapN3.setOnClickItemListenerBaiTap3(baiTap3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (baiTap3List != null){
            return baiTap3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tvN = itemView.findViewById(R.id.ln_baitapN3);
            tvnameN3 = itemView.findViewById(R.id.tv_baitapN3);
        }
    }
}
