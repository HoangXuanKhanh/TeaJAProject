package com.example.teaja.JLPT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN4;


import java.util.List;

public class JLPTN4Adapter extends RecyclerView.Adapter<JLPTN4Adapter.ViewHlder> {
    private List<JLPTN4> jlptn4List;
    private IClickItemJLPTN4 mIClickItemJLPTN4;

    public void JLPTN4Adapter(List<JLPTN4> jlptn4List, IClickItemJLPTN4 mIClickItemJLPTN4) {
        this.jlptn4List = jlptn4List;
        this.mIClickItemJLPTN4 = mIClickItemJLPTN4;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JLPTN4Adapter.ViewHlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jlptn4, parent, false);
        ViewHlder viewHlder = new ViewHlder(view);

        return viewHlder;
    }

    @Override
    public void onBindViewHolder(@NonNull JLPTN4Adapter.ViewHlder holder, int position) {
        JLPTN4 jlptn4 = jlptn4List.get(position);

        holder.tvJLPTN4.setText(jlptn4.getName());
        holder.ln_JLPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemJLPTN4.setOnClickItemListenerN4(jlptn4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (jlptn4List != null){
            return jlptn4List.size();
        }
        return 0;
    }

    public class ViewHlder extends RecyclerView.ViewHolder {
        private LinearLayout ln_JLPT;
        private TextView tvJLPTN4;
        public ViewHlder(@NonNull View itemView) {
            super(itemView);
            ln_JLPT = itemView.findViewById(R.id.ln_JLPTN4);
            tvJLPTN4 = itemView.findViewById(R.id.tv_JLPTN4);
        }
    }
}
