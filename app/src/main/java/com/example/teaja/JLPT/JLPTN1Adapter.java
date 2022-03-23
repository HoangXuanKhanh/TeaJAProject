package com.example.teaja.JLPT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN1;

import java.util.List;

public class JLPTN1Adapter extends RecyclerView.Adapter<JLPTN1Adapter.ViewHolder> {
    private List<JLPTN1> jlptn1List;
    private IClickItemJLPTN1 mIClickItemJLPTN1;

    public void JLPTN1Adapter(List<JLPTN1> jlptn1List, IClickItemJLPTN1 mIClickItemJLPTN1) {
        this.jlptn1List = jlptn1List;
        this.mIClickItemJLPTN1 = mIClickItemJLPTN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JLPTN1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jlptn1, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JLPTN1Adapter.ViewHolder holder, int position) {
        JLPTN1 jlptn1 = jlptn1List.get(position);

        holder.tvJLPTN5.setText(jlptn1.getName());
        holder.ln_JLPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemJLPTN1.setOnClickItemListenerN1(jlptn1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (jlptn1List != null){
            return jlptn1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_JLPT;
        private TextView tvJLPTN5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_JLPT = itemView.findViewById(R.id.ln_JLPTN1);
            tvJLPTN5 = itemView.findViewById(R.id.tv_JLPTN1);
        }
    }
}
