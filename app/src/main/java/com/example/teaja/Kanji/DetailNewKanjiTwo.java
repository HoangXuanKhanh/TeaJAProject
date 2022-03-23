package com.example.teaja.Kanji;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.JLPT.JLPTN2Adapter;
import com.example.teaja.JLPT.JLPTN5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN2;

import java.util.ArrayList;
import java.util.List;

public class DetailNewKanjiTwo extends Fragment {

    View view;
    private RecyclerView rcyKanjin2;
    private KanjiN2Adapter mKanjin2Adapter;
    FragmentActivity KanjiN2FragmentActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_new_kanji_two, container, false);
        KanjiN2FragmentActivity = getActivity();
        rcyKanjin2 = view.findViewById(R.id.rcy_KanjiN2);

        mKanjin2Adapter = new KanjiN2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(KanjiN2FragmentActivity, 4, RecyclerView.VERTICAL, false);
        rcyKanjin2.setLayoutManager(layoutManager);
        rcyKanjin2.setFocusable(false);
        rcyKanjin2.setNestedScrollingEnabled(false);
        rcyKanjin2.setAdapter(mKanjin2Adapter);
        mKanjin2Adapter.KanjiN2Adapter(getList(), new IcClickItemKanjiN2() {
            @Override
            public void setOnClickItemListenerKanjiN2(kanjiN2 kanjiN2) {

            }
        });
        return view;

    }
    private List<kanjiN2> getList() {
        List<kanjiN2> list = new ArrayList<>();
        list.add(new kanjiN2(1, "Bài 1"));
        list.add(new kanjiN2(2, "Bài 2"));
        list.add(new kanjiN2(3, "Bài 3"));
        list.add(new kanjiN2(4, "Bài 4"));
        list.add(new kanjiN2(5, "Bài 5"));
        list.add(new kanjiN2(6, "Bài 6"));
        list.add(new kanjiN2(7, "Bài 7"));
        list.add(new kanjiN2(8, "Bài 8"));
        list.add(new kanjiN2(9, "Bài 9"));
        list.add(new kanjiN2(10, "Bài 10"));
        list.add(new kanjiN2(11, "Bài 11"));
        list.add(new kanjiN2(12, "Bài 12"));
        list.add(new kanjiN2(13, "Bài 13"));
        list.add(new kanjiN2(14, "Bài 14"));
        list.add(new kanjiN2(15, "Bài 15"));
        list.add(new kanjiN2(16, "Bài 16"));
        list.add(new kanjiN2(17, "Bài 17"));
        list.add(new kanjiN2(18, "Bài 18"));
        list.add(new kanjiN2(19, "Bài 19"));
        list.add(new kanjiN2(20, "Bài 20"));
        list.add(new kanjiN2(21, "Bài 21"));
        list.add(new kanjiN2(22, "Bài 22"));
        list.add(new kanjiN2(23, "Bài 23"));
        list.add(new kanjiN2(24, "Bài 24"));
        list.add(new kanjiN2(25, "Bài 25"));

        return list;
    }
}