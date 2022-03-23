package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN2;

import java.util.List;

public class TuVungN2Adapter extends RecyclerView.Adapter<TuVungN2Adapter.ViewHolder> {
    private List<TuVungN2> tuVungN2List;
    private IcClickItemTuVungN2 mIcClickItemTuVungN2;

    public void TuVungN2Adapter(List<TuVungN2> tuVungN2List, IcClickItemTuVungN2 mIcClickItemTuVungN2) {
        this.tuVungN2List = tuVungN2List;
        this.mIcClickItemTuVungN2 = mIcClickItemTuVungN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuVungN2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tuvung2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TuVungN2Adapter.ViewHolder holder, int position) {
        TuVungN2 tuVungN2 = tuVungN2List.get(position);

        holder.tvnameN2.setText(tuVungN2.getName());
        holder.ln_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemTuVungN2.setOnClickItemListenerTVN2(tuVungN2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (tuVungN2List != null){
            return tuVungN2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tv;
        private TextView tvnameN2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tv = itemView.findViewById(R.id.ln_TVN2);
            tvnameN2 = itemView.findViewById(R.id.tv_tuvungN2);
        }
    }
}
