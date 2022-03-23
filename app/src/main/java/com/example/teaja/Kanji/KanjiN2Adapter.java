package com.example.teaja.Kanji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN2;
import com.example.teaja.myInterface.IcClickItemKanjiN3;

import java.util.List;

public class KanjiN2Adapter extends RecyclerView.Adapter<KanjiN2Adapter.ViewHolder> {

    private List<kanjiN2> mKanjiN2List;
    private IcClickItemKanjiN2 mClickItemKanjiN2;

    public void KanjiN2Adapter(List<kanjiN2> mKanjiN2List, IcClickItemKanjiN2 mClickItemKanjiN2) {
        this.mKanjiN2List = mKanjiN2List;
        this.mClickItemKanjiN2 = mClickItemKanjiN2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public KanjiN2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_newkanji_n2, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KanjiN2Adapter.ViewHolder holder, int position) {
        kanjiN2 kanjiN2 = mKanjiN2List.get(position);

        holder.tvNewKanji.setText(kanjiN2.getName());
        holder.lnNewKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickItemKanjiN2.setOnClickItemListenerKanjiN2(kanjiN2);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mKanjiN2List != null){
            return mKanjiN2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnNewKanji;
        private TextView tvNewKanji;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnNewKanji = itemView.findViewById(R.id.ln_KanjiN2);
            tvNewKanji = itemView.findViewById(R.id.tv_KanjiN2);
        }
    }
}
