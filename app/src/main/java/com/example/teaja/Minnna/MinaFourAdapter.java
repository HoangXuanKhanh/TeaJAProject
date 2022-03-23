package com.example.teaja.Minnna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaFour;

import java.util.List;

public class MinaFourAdapter extends RecyclerView.Adapter<MinaFourAdapter.ViewHolder> {
    private List<MinaFour> minaFourList;
    private IcClickItemMinaFour icClickItemMinaFour;

    public void MinaFourAdapter(List<MinaFour> minaFourList, IcClickItemMinaFour icClickItemMinaFour) {
        this.minaFourList = minaFourList;
        this.icClickItemMinaFour = icClickItemMinaFour;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MinaFourAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minnafour, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinaFourAdapter.ViewHolder holder, int position) {
        MinaFour minaFour = minaFourList.get(position);

        holder.tvMinna.setText(minaFour.getName());
        holder.mlnMinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemMinaFour.setOnClickItemListenerMinaFour(minaFour);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (minaFourList != null){
            return minaFourList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mlnMinna;
        private TextView tvMinna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mlnMinna = itemView.findViewById(R.id.ln_MinaaN4);
            tvMinna = itemView.findViewById(R.id.tv_MinaaN4);
        }
    }
}
