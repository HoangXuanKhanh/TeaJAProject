package com.example.teaja.Kanji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN3;
import com.example.teaja.myInterface.IcClickItemKanjiN4;
import com.example.teaja.myInterface.IcClickItemKanjiN5;

import java.util.List;

public class KanjiN3Adapter extends RecyclerView.Adapter<KanjiN3Adapter.ViewHolder> {

    private List<KanjiN3> mKanjiN3List;
    private IcClickItemKanjiN3 mIcClickItemKanjiN3;

    public void KanjiN3Adapter(List<KanjiN3> mKanjiN3List, IcClickItemKanjiN3 mIcClickItemKanjiN3) {
        this.mKanjiN3List = mKanjiN3List;
        this.mIcClickItemKanjiN3 = mIcClickItemKanjiN3;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public KanjiN3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.item_newkanji_n3, parent, false);

      ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KanjiN3Adapter.ViewHolder holder, int position) {
        KanjiN3 kanjiN3 = mKanjiN3List.get(position);

        holder.tvNewKanji.setText(kanjiN3.getName());
        holder.lnNewKanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIcClickItemKanjiN3.setOnClickItemListenerKanjiN3(kanjiN3);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mKanjiN3List != null){
            return mKanjiN3List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnNewKanji;
        private TextView tvNewKanji;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lnNewKanji = itemView.findViewById(R.id.ln_KanjiN3);
            tvNewKanji = itemView.findViewById(R.id.tv_KanjiN3);
        }
    }
}
