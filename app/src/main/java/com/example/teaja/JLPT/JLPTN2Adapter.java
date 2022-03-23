package com.example.teaja.JLPT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN2;

import java.util.List;

public class JLPTN2Adapter extends RecyclerView.Adapter<JLPTN2Adapter.ViewHolder> {
    private List<JLPTN2> jlptn2List;
    private IClickItemJLPTN2 mIClickItemJLPTN2;

    public void JLPTN2Adapter(List<JLPTN2> jlptn2List, IClickItemJLPTN2 mIClickItemJLPTN2) {
        this.jlptn2List = jlptn2List;
        this.mIClickItemJLPTN2 = mIClickItemJLPTN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JLPTN2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jlptn2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JLPTN2Adapter.ViewHolder holder, int position) {
        JLPTN2 jlptn2 = jlptn2List.get(position);

        holder.tvJLPTN2.setText(jlptn2.getName());
        holder.ln_JLPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIClickItemJLPTN2.setOnClickItemListenerN2(jlptn2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (jlptn2List != null){
            return jlptn2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout ln_JLPT;
        private TextView tvJLPTN2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ln_JLPT = itemView.findViewById(R.id.ln_JLPTN2);
            tvJLPTN2 = itemView.findViewById(R.id.tv_JLPTN2);
        }
    }
}
