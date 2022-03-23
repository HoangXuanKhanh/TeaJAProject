package com.example.teaja.TuVung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN1;

import java.util.List;

public class TuVungN1Adapter extends RecyclerView.Adapter<TuVungN1Adapter.ViewHolDer> {
    private List<TuVungN1> tuVungN1List;
    private IcClickItemTuVungN1 icClickItemTuVungN1;

    public void TuVungN1Adapter(List<TuVungN1> tuVungN1List, IcClickItemTuVungN1 icClickItemTuVungN1) {
        this.tuVungN1List = tuVungN1List;
        this.icClickItemTuVungN1 = icClickItemTuVungN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuVungN1Adapter.ViewHolDer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tuvung1, parent, false);
        ViewHolDer viewHolDer = new ViewHolDer(view);

        return viewHolDer;
    }

    @Override
    public void onBindViewHolder(@NonNull TuVungN1Adapter.ViewHolDer holder, int position) {
        TuVungN1 tuVungN1 = tuVungN1List.get(position);

        holder.tvnameN1.setText(tuVungN1.getName());
        holder.ln_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemTuVungN1.setOnClickItemListenerTV1(tuVungN1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (tuVungN1List != null){
            return tuVungN1List.size();
        }
        return 0;
    }

    public class ViewHolDer extends RecyclerView.ViewHolder {
        private LinearLayout ln_tv;
        private TextView tvnameN1;
        public ViewHolDer(@NonNull View itemView) {
            super(itemView);
            ln_tv = itemView.findViewById(R.id.ln_TVN1);
            tvnameN1 = itemView.findViewById(R.id.tv_tuvungN1);
        }
    }
}
