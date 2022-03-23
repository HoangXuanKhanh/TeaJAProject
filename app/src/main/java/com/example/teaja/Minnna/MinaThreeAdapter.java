package com.example.teaja.Minnna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaThree;

import java.util.List;

public class MinaThreeAdapter extends RecyclerView.Adapter<MinaThreeAdapter.ViewHolder> {
    private List<MinaThree> minaThreeList;
    private IcClickItemMinaThree icClickItemMinaThree;

    public void MinaThreeAdapter(List<MinaThree> minaThreeList, IcClickItemMinaThree icClickItemMinaThree) {
        this.minaThreeList = minaThreeList;
        this.icClickItemMinaThree = icClickItemMinaThree;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MinaThreeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minnathree, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinaThreeAdapter.ViewHolder holder, int position) {
        MinaThree minaThree = minaThreeList.get(position);

        holder.tvMinna.setText(minaThree.getName());
        holder.mlnMinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemMinaThree.setOnClickItemListenerMinaThree(minaThree);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (minaThreeList != null){
            return minaThreeList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mlnMinna;
        private TextView tvMinna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMinna = itemView.findViewById(R.id.tv_MinaaN3);
            mlnMinna = itemView.findViewById(R.id.ln_MinaaN3);
        }
    }
}
