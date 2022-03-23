package com.example.teaja.Kanji;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.JLPT.JLPTN5;
import com.example.teaja.JLPT.JLPTN5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN5;
import com.example.teaja.myInterface.IcClickItemKanjiN5;

import java.util.ArrayList;
import java.util.List;

public class DetailNewKanjiFive extends Fragment {

    View view;
    private RecyclerView rcyKanjin5;
    private KanjiN5Adapter mKanjin5Adapter;
    FragmentActivity KanjiN5FragmentActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_new_kanji_five, container, false);
        KanjiN5FragmentActivity = getActivity();
        rcyKanjin5 = view.findViewById(R.id.rcy_KanjiN5);

        mKanjin5Adapter = new KanjiN5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(KanjiN5FragmentActivity, 4, RecyclerView.VERTICAL, false);
        rcyKanjin5.setLayoutManager(layoutManager);
        rcyKanjin5.setFocusable(false);
        rcyKanjin5.setNestedScrollingEnabled(false);
        rcyKanjin5.setAdapter(mKanjin5Adapter);
        mKanjin5Adapter.KanjiN5Adapter(getList(), new IcClickItemKanjiN5() {
            @Override
            public void setOnClickItemListenerKanjiN5(KanjiN5 kanjiN5) {

            }
        });

        return view;
    }

    private List<KanjiN5> getList() {
        List<KanjiN5> list = new ArrayList<>();
        list.add(new KanjiN5(1, "Bài 1"));
        list.add(new KanjiN5(2, "Bài 2"));
        list.add(new KanjiN5(3, "Bài 3"));
        list.add(new KanjiN5(4, "Bài 4"));
        list.add(new KanjiN5(5, "Bài 5"));
        list.add(new KanjiN5(6, "Bài 6"));
        list.add(new KanjiN5(7, "Bài 7"));
        list.add(new KanjiN5(8, "Bài 8"));
        list.add(new KanjiN5(9, "Bài 9"));
        list.add(new KanjiN5(10, "Bài 10"));
        list.add(new KanjiN5(11, "Bài 11"));
        list.add(new KanjiN5(12, "Bài 12"));
        list.add(new KanjiN5(13, "Bài 13"));
        list.add(new KanjiN5(14, "Bài 14"));
        list.add(new KanjiN5(15, "Bài 15"));
        list.add(new KanjiN5(16, "Bài 16"));
        list.add(new KanjiN5(17, "Bài 17"));
        list.add(new KanjiN5(18, "Bài 18"));
        list.add(new KanjiN5(19, "Bài 19"));
        list.add(new KanjiN5(20, "Bài 20"));
        list.add(new KanjiN5(21, "Bài 21"));
        list.add(new KanjiN5(22, "Bài 22"));
        list.add(new KanjiN5(23, "Bài 23"));
        list.add(new KanjiN5(24, "Bài 24"));
        list.add(new KanjiN5(25, "Bài 25"));


        return list;
    }


}