package com.example.teaja.Kanji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN1;
import com.example.teaja.myInterface.IcClickItemKanjiN2;

import java.util.List;

public class kanjiN1Adapter extends RecyclerView.Adapter<kanjiN1Adapter.ViewHolder>{

    private List<KanjiN1> mKanjiN1List;
    private IcClickItemKanjiN1 mIcClickItemKanjiN1;

    public void kanjiN1Adapter(List<KanjiN1> mKanjiN1List, IcClickItemKanjiN1 mIcClickItemKanjiN1) {
        this.mKanjiN1List = mKanjiN1List;
        this.mIcClickItemKanjiN1 = mIcClickItemKanjiN1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public kanjiN1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_newkanji_n1, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull kanjiN1Adapter.ViewHolder holder, int position) {
        KanjiN1 kanjiN1 = mKanjiN1List.get(position);

        holder.tvNewKanji.setText(kanjiN1.getName());
        holder.lnNewKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemKanjiN1.setOnClickItemListenerKanjiN1(kanjiN1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mKanjiN1List != null){
            return mKanjiN1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnNewKanji;
        private TextView tvNewKanji;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnNewKanji = itemView.findViewById(R.id.ln_KanjiN1);
            tvNewKanji = itemView.findViewById(R.id.tv_KanjiN1);
        }
    }
}
