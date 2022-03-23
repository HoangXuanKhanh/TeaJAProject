package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN4;

import java.util.List;

public class TuVungN4Adapter extends RecyclerView.Adapter<TuVungN4Adapter.ViewHolder> {
    private List<TuVungN4> tuVungN4List;
    private IcClickItemTuVungN4 mIcClickItemTuVungN4;

    public void TuVungN4Adapter(List<TuVungN4> tuVungN4List, IcClickItemTuVungN4 mIcClickItemTuVungN4) {
        this.tuVungN4List = tuVungN4List;
        this.mIcClickItemTuVungN4 = mIcClickItemTuVungN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuVungN4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tuvung4, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TuVungN4Adapter.ViewHolder holder, int position) {
        TuVungN4 tuVungN4 = tuVungN4List.get(position);

        holder.tvnameN4.setText(tuVungN4.getName());
        holder.ln_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemTuVungN4.setOnClickItemListenerTVN4(tuVungN4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (tuVungN4List != null){
            return tuVungN4List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tv;
        private TextView tvnameN4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tv = itemView.findViewById(R.id.ln_TVN4);
            tvnameN4 = itemView.findViewById(R.id.tv_tuvungN4);
        }
    }
}
