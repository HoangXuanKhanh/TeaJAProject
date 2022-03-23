package com.example.teaja.JLPT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN3;

import java.util.List;

public class JLPTN3Adapter extends RecyclerView.Adapter<JLPTN3Adapter.ViewHolder> {
    private List<JLPTN3> jlptn3List;
    private IClickItemJLPTN3 mIClickItemJLPTN3;

    public void JLPTN3Adapter(List<JLPTN3> jlptn3List, IClickItemJLPTN3 mIClickItemJLPTN3) {
        this.jlptn3List = jlptn3List;
        this.mIClickItemJLPTN3 = mIClickItemJLPTN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JLPTN3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jlptn3, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JLPTN3Adapter.ViewHolder holder, int position) {
        JLPTN3 jlptn3 = jlptn3List.get(position);

        holder.tvJLPTN3.setText(jlptn3.getName());
        holder.ln_JLPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemJLPTN3.setOnClickItemListenerN5(jlptn3);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (jlptn3List != null){
            return jlptn3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_JLPT;
        private TextView tvJLPTN3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_JLPT = itemView.findViewById(R.id.ln_JLPTN3);
            tvJLPTN3 = itemView.findViewById(R.id.tv_JLPTN3);
        }
    }
}
