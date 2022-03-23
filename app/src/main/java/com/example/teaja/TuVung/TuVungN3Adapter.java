package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN3;

import java.util.List;

public class TuVungN3Adapter extends RecyclerView.Adapter<TuVungN3Adapter.ViewHolder> {
    private List<TuVungN3> tuVungN3List;
    private IcClickItemTuVungN3 mIcClickItemTuVungN3;

    public void TuVungN3Adapter(List<TuVungN3> tuVungN3List, IcClickItemTuVungN3 mIcClickItemTuVungN3) {
        this.tuVungN3List = tuVungN3List;
        this.mIcClickItemTuVungN3 = mIcClickItemTuVungN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuVungN3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tuvung3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TuVungN3Adapter.ViewHolder holder, int position) {
        TuVungN3 tuVungN3 = tuVungN3List.get(position);

        holder.tvnameN3.setText(tuVungN3.getName());
        holder.ln_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemTuVungN3.setOnClickItemListenerTVN3(tuVungN3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (tuVungN3List != null){
            return tuVungN3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_tv;
        private TextView tvnameN3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_tv = itemView.findViewById(R.id.ln_TVN3);
            tvnameN3 = itemView.findViewById(R.id.tv_tuvungN3);
        }
    }
}
