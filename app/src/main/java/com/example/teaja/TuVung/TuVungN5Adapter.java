package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN5;

import java.util.List;

public class TuVungN5Adapter extends RecyclerView.Adapter<TuVungN5Adapter.ViewHolder> {
    private List<TuVungN5> tuVungN5List;
    private IcClickItemTuVungN5 mClickItemTuVungN5;

    public void TuVungN5Adapter(List<TuVungN5> tuVungN5List, IcClickItemTuVungN5 mClickItemTuVungN5) {
        this.tuVungN5List = tuVungN5List;
        this.mClickItemTuVungN5 = mClickItemTuVungN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuVungN5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tuvung5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TuVungN5Adapter.ViewHolder holder, int position) {
        TuVungN5 tuVungN5 = tuVungN5List.get(position);

        holder.tvnameN5.setText(tuVungN5.getName());
        holder.ln_tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickItemTuVungN5.setOnClickItemListenerTVN5(tuVungN5);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (tuVungN5List != null){
            return tuVungN5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tvN;
        private TextView tvnameN5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnameN5 = itemView.findViewById(R.id.tv_tuvungN5);
            ln_tvN = itemView.findViewById(R.id.ln_TVN5);
        }
    }
}
