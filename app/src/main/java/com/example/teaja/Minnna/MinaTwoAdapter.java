package com.example.teaja.Minnna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaTwo;

import java.util.List;

public class MinaTwoAdapter extends RecyclerView.Adapter<MinaTwoAdapter.ViewHolder> {
    private List<MinaTwo> minaTwoList;
    private IcClickItemMinaTwo icClickItemMinaTwo;

    public void MinaTwoAdapter(List<MinaTwo> minaTwoList, IcClickItemMinaTwo icClickItemMinaTwo) {
        this.minaTwoList = minaTwoList;
        this.icClickItemMinaTwo = icClickItemMinaTwo;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MinaTwoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minnatwo, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinaTwoAdapter.ViewHolder holder, int position) {
        MinaTwo minaTwo = minaTwoList.get(position);

        holder.tvMinna.setText(minaTwo.getName());
        holder.mlnMinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemMinaTwo.setOnClickItemListenerMinaTwo(minaTwo);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (minaTwoList != null){
            return minaTwoList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mlnMinna;
        private TextView tvMinna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMinna = itemView.findViewById(R.id.tv_MinaaN2);
            mlnMinna = itemView.findViewById(R.id.ln_MinaaN2);
        }
    }
}
