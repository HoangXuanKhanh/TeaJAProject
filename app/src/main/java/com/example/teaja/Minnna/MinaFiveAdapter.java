package com.example.teaja.Minnna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaFive;

import java.util.List;

public class MinaFiveAdapter extends RecyclerView.Adapter<MinaFiveAdapter.ViewHolder> {
    private List<MinaFive> minaFiveList;
    private IcClickItemMinaFive icClickItemMinaFive;

    public void MinaFiveAdapter(List<MinaFive> minaFiveList, IcClickItemMinaFive icClickItemMinaFive) {
        this.minaFiveList = minaFiveList;
        this.icClickItemMinaFive = icClickItemMinaFive;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MinaFiveAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minnafive, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinaFiveAdapter.ViewHolder holder, int position) {
        MinaFive minaFive = minaFiveList.get(position);

        holder.tvMinna.setText(minaFive.getName());
        holder.mlnMinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemMinaFive.setOnClickItemListenerMinaFive(minaFive);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (minaFiveList != null){
            return minaFiveList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mlnMinna;
        private TextView tvMinna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mlnMinna = itemView.findViewById(R.id.ln_MinaaN5);
            tvMinna = itemView.findViewById(R.id.tv_MinaaN5);
        }
    }
}
