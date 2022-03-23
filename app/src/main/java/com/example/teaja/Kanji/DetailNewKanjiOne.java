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

import com.example.teaja.JLPT.JLPTN1Adapter;
import com.example.teaja.JLPT.JLPTN5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN1;
import com.example.teaja.myInterface.IcClickItemKanjiN5;

import java.util.ArrayList;
import java.util.List;

public class DetailNewKanjiOne extends Fragment {

    View view;
    private RecyclerView rcyKanjin1;
    private kanjiN1Adapter mKanjin1Adapter;
    FragmentActivity KanjiN1FragmentActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_new_kanji_one, container, false);
        KanjiN1FragmentActivity = getActivity();
        rcyKanjin1 = view.findViewById(R.id.rcy_KanjiN1);

        mKanjin1Adapter = new kanjiN1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(KanjiN1FragmentActivity, 4, RecyclerView.VERTICAL, false);
        rcyKanjin1.setLayoutManager(layoutManager);
        rcyKanjin1.setFocusable(false);
        rcyKanjin1.setNestedScrollingEnabled(false);
        rcyKanjin1.setAdapter(mKanjin1Adapter);
        mKanjin1Adapter.kanjiN1Adapter(getList(), new IcClickItemKanjiN1() {
            @Override
            public void setOnClickItemListenerKanjiN1(KanjiN1 kanjiN1) {

                }
            });
            return view;
        }

    private List<KanjiN1> getList() {
        List<KanjiN1> list = new ArrayList<>();
        list.add(new KanjiN1(1, "Bài 1"));
        list.add(new KanjiN1(2, "Bài 2"));
        list.add(new KanjiN1(3, "Bài 3"));
        list.add(new KanjiN1(4, "Bài 4"));
        list.add(new KanjiN1(5, "Bài 5"));
        list.add(new KanjiN1(6, "Bài 6"));
        list.add(new KanjiN1(7, "Bài 7"));
        list.add(new KanjiN1(8, "Bài 8"));
        list.add(new KanjiN1(9, "Bài 9"));
        list.add(new KanjiN1(10, "Bài 10"));
        list.add(new KanjiN1(11, "Bài 11"));
        list.add(new KanjiN1(12, "Bài 12"));
        list.add(new KanjiN1(13, "Bài 13"));
        list.add(new KanjiN1(14, "Bài 14"));
        list.add(new KanjiN1(15, "Bài 15"));
        list.add(new KanjiN1(16, "Bài 16"));
        list.add(new KanjiN1(17, "Bài 17"));
        list.add(new KanjiN1(18, "Bài 18"));
        list.add(new KanjiN1(19, "Bài 19"));
        list.add(new KanjiN1(20, "Bài 20"));
        list.add(new KanjiN1(21, "Bài 21"));
        list.add(new KanjiN1(22, "Bài 22"));
        list.add(new KanjiN1(23, "Bài 23"));
        list.add(new KanjiN1(24, "Bài 24"));
        list.add(new KanjiN1(25, "Bài 25"));


        return list;
    }
}