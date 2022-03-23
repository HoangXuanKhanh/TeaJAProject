package com.example.teaja.Kanji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN4;


import java.util.List;

public class KanjiN4Adapter extends RecyclerView.Adapter<KanjiN4Adapter.ViewHolder> {
    private List<KanjiN4> mKanjiN4sList;
    private IcClickItemKanjiN4 mIcClickItemKanjiN4;

    public void KanjiN4Adapter(List<KanjiN4> mKanjiN4sList, IcClickItemKanjiN4 mIcClickItemKanjiN4) {
        this.mKanjiN4sList = mKanjiN4sList;
        this.mIcClickItemKanjiN4 = mIcClickItemKanjiN4;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public KanjiN4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_newkanji_n4, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KanjiN4Adapter.ViewHolder holder, int position) {
        KanjiN4 kanjiN4 = mKanjiN4sList.get(position);

        holder.tvNewKanji.setText(kanjiN4.getName());
        holder.lnNewKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemKanjiN4.setOnClickItemListenerKanjiN4(kanjiN4);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mKanjiN4sList != null){
            return mKanjiN4sList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnNewKanji;
        private TextView tvNewKanji;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnNewKanji = itemView.findViewById(R.id.ln_KanjiN4);
            tvNewKanji = itemView.findViewById(R.id.tv_KanjiN4);
        }
    }
}
