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

import com.example.teaja.JLPT.JLPTN3Adapter;
import com.example.teaja.JLPT.JLPTN5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemKanjiN3;

import java.util.ArrayList;
import java.util.List;

public class DetailNewKanjiThree extends Fragment {

    View view;
    private RecyclerView rcyKanjin3;
    private KanjiN3Adapter mKanjin3Adapter;
    FragmentActivity KanjiN3FragmentActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_new_kanji_three, container, false);
        KanjiN3FragmentActivity = getActivity();
        rcyKanjin3 = view.findViewById(R.id.rcy_KanjiN3);

        mKanjin3Adapter = new KanjiN3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(KanjiN3FragmentActivity, 4, RecyclerView.VERTICAL, false);
        rcyKanjin3.setLayoutManager(layoutManager);
        rcyKanjin3.setFocusable(false);
        rcyKanjin3.setNestedScrollingEnabled(false);
        rcyKanjin3.setAdapter(mKanjin3Adapter);
        mKanjin3Adapter.KanjiN3Adapter(getList(), new IcClickItemKanjiN3() {
            @Override
            public void setOnClickItemListenerKanjiN3(KanjiN3 kanjiN3) {

            }
        });

        return view;
    }

    private List<KanjiN3> getList() {
        List<KanjiN3> list = new ArrayList<>();
        list.add(new KanjiN3(1, "Bài 1"));
        list.add(new KanjiN3(2, "Bài 2"));
        list.add(new KanjiN3(3, "Bài 3"));
        list.add(new KanjiN3(4, "Bài 4"));
        list.add(new KanjiN3(5, "Bài 5"));
        list.add(new KanjiN3(6, "Bài 6"));
        list.add(new KanjiN3(7, "Bài 7"));
        list.add(new KanjiN3(8, "Bài 8"));
        list.add(new KanjiN3(9, "Bài 9"));
        list.add(new KanjiN3(10, "Bài 10"));
        list.add(new KanjiN3(11, "Bài 11"));
        list.add(new KanjiN3(12, "Bài 12"));
        list.add(new KanjiN3(13, "Bài 13"));
        list.add(new KanjiN3(14, "Bài 14"));
        list.add(new KanjiN3(15, "Bài 15"));
        list.add(new KanjiN3(16, "Bài 16"));
        list.add(new KanjiN3(17, "Bài 17"));
        list.add(new KanjiN3(18, "Bài 18"));
        list.add(new KanjiN3(19, "Bài 19"));
        list.add(new KanjiN3(20, "Bài 20"));
        list.add(new KanjiN3(21, "Bài 21"));
        list.add(new KanjiN3(22, "Bài 22"));
        list.add(new KanjiN3(23, "Bài 23"));
        list.add(new KanjiN3(24, "Bài 24"));
        list.add(new KanjiN3(25, "Bài 25"));

        return  list;
    }
}