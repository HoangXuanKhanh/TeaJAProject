package com.example.teaja.HomeRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemPanner;

import java.util.List;

public class PanerAdapter extends RecyclerView.Adapter<PanerAdapter.PViewHolder> {
    List<Paner1> paner1List;
    IClickItemPanner mpanner;

    public void PanerAdapter(List<Paner1> paner1List, IClickItemPanner panner) {
        this.paner1List = paner1List;
        this.mpanner = panner;
    }

    @NonNull
    @Override
    public PanerAdapter.PViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_panner, parent, false);
        PViewHolder pViewHolder = new PViewHolder(view);

        return pViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PanerAdapter.PViewHolder holder, int position) {
        final Paner1 paner1 = paner1List.get(position);

        holder.imgPaner.setImageResource(paner1.getResourceID());
        holder.tvPaner.setText(paner1.getName());
        holder.lnPaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpanner.setOnClickItemListenerPanner(paner1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(paner1List != null){
            return paner1List.size();
        }
        return 0;
    }

    public class PViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnPaner;
        private ImageView imgPaner;
        private TextView tvPaner;
        public PViewHolder(@NonNull View itemView) {
            super(itemView);
            lnPaner = itemView.findViewById(R.id.Ln_Panner);
            imgPaner = itemView.findViewById(R.id.img_Panner);
            tvPaner = itemView.findViewById(R.id.tv_Panner);
        }
    }
}
