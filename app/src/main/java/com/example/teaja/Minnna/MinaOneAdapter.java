package com.example.teaja.Minnna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaOne;

import java.util.List;

public class MinaOneAdapter extends RecyclerView.Adapter<MinaOneAdapter.ViewHolder> {
    private List<MinaOne> minaOneList;
    private IcClickItemMinaOne icClickItemMinaOne;

    public void MinaOneAdapter(List<MinaOne> minaOneList, IcClickItemMinaOne icClickItemMinaOne) {
        this.minaOneList = minaOneList;
        this.icClickItemMinaOne = icClickItemMinaOne;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MinaOneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minnaone, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinaOneAdapter.ViewHolder holder, int position) {
        MinaOne minaOne = minaOneList.get(position);

        holder.tvMinna.setText(minaOne.getName());
        holder.mlnMinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemMinaOne.setOnClickItemListenerMinaOne(minaOne);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (minaOneList != null){
            return minaOneList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mlnMinna;
        private TextView tvMinna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMinna = itemView.findViewById(R.id.tv_MinaaN1);
            mlnMinna = itemView.findViewById(R.id.ln_MinaaN1);
        }
    }
}
