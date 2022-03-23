package com.example.teaja.JLPT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN5;

import java.util.List;

public class JLPTN5Adapter extends RecyclerView.Adapter<JLPTN5Adapter.ViewHolder> {
    private List<JLPTN5> jlptn5List;
    private IClickItemJLPTN5 iClickItemJLPTN5;

    public void JLPTN5Adapter(List<JLPTN5> jlptn5List, IClickItemJLPTN5 iClickItemJLPTN5) {
        this.jlptn5List = jlptn5List;
        this.iClickItemJLPTN5 = iClickItemJLPTN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JLPTN5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jlptn5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JLPTN5Adapter.ViewHolder holder, int position) {
        JLPTN5 jlptn5 = jlptn5List.get(position);

        holder.tvJLPTN5.setText(jlptn5.getName());
        holder.ln_JLPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemJLPTN5.setOnClickItemListenerN5(jlptn5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (jlptn5List != null){
           return jlptn5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_JLPT;
        private TextView tvJLPTN5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_JLPT = itemView.findViewById(R.id.ln_JLPTN5);
            tvJLPTN5 = itemView.findViewById(R.id.tv_JLPTN5);
        }
    }
}
