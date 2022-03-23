package com.example.teaja.Kanji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN5;

import java.util.List;

public class KanjiN5Adapter extends RecyclerView.Adapter<KanjiN5Adapter.ViewHolder> {
    private List<KanjiN5> mKanjiN5List;
    private IcClickItemKanjiN5 mIcClickItemKanjiN5;

    public void KanjiN5Adapter(List<KanjiN5> mKanjiN5List, IcClickItemKanjiN5 mIcClickItemKanjiN5) {
        this.mKanjiN5List = mKanjiN5List;
        this.mIcClickItemKanjiN5 = mIcClickItemKanjiN5;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public KanjiN5Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_newkanji_n5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KanjiN5Adapter.ViewHolder holder, int position) {
        KanjiN5 kanjiN5 = mKanjiN5List.get(position);

        holder.tvNewKanji.setText(kanjiN5.getName());
        holder.lnNewKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemKanjiN5.setOnClickItemListenerKanjiN5(kanjiN5);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mKanjiN5List != null){
            return mKanjiN5List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnNewKanji;
        private TextView tvNewKanji;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnNewKanji = itemView.findViewById(R.id.ln_KanjiN5);
            tvNewKanji = itemView.findViewById(R.id.tv_KanjiN5);
        }
    }
}
