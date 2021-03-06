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

import com.example.teaja.JLPT.JLPTN4;
import com.example.teaja.JLPT.JLPTN4Adapter;
import com.example.teaja.JLPT.JLPTN5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemJLPTN4;
import com.example.teaja.myInterface.IcClickItemKanjiN4;

import java.util.ArrayList;
import java.util.List;

public class DetailNewKanjiYour extends Fragment {

    View view;
    private RecyclerView rcyKanjin4;
    private KanjiN4Adapter mKanjin4Adapter;
    FragmentActivity KanjiN4FragmentActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_new_kanji_your, container, false);
        KanjiN4FragmentActivity = getActivity();
        rcyKanjin4 = view.findViewById(R.id.rcy_KanjiN4);

        mKanjin4Adapter = new KanjiN4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(KanjiN4FragmentActivity, 4, RecyclerView.VERTICAL, false);
        rcyKanjin4.setLayoutManager(layoutManager);
        rcyKanjin4.setFocusable(false);
        rcyKanjin4.setNestedScrollingEnabled(false);
        rcyKanjin4.setAdapter(mKanjin4Adapter);
        mKanjin4Adapter.KanjiN4Adapter(getList(), new IcClickItemKanjiN4() {
            @Override
            public void setOnClickItemListenerKanjiN4(KanjiN4 kanjiN4) {

            }
        });

        return view;
    }

    private List<KanjiN4> getList() {
        List<KanjiN4> list = new ArrayList<>();
        list.add(new KanjiN4(1, "B??i 1"));
        list.add(new KanjiN4(2, "B??i 2"));
        list.add(new KanjiN4(3, "B??i 3"));
        list.add(new KanjiN4(4, "B??i 4"));
        list.add(new KanjiN4(5, "B??i 5"));
        list.add(new KanjiN4(6, "B??i 6"));
        list.add(new KanjiN4(7, "B??i 7"));
        list.add(new KanjiN4(8, "B??i 8"));
        list.add(new KanjiN4(9, "B??i 9"));
        list.add(new KanjiN4(10, "B??i 10"));
        list.add(new KanjiN4(11, "B??i 11"));
        list.add(new KanjiN4(12, "B??i 12"));
        list.add(new KanjiN4(13, "B??i 13"));
        list.add(new KanjiN4(14, "B??i 14"));
        list.add(new KanjiN4(15, "B??i 15"));
        list.add(new KanjiN4(16, "B??i 16"));
        list.add(new KanjiN4(17, "B??i 17"));
        list.add(new KanjiN4(18, "B??i 18"));
        list.add(new KanjiN4(19, "B??i 19"));
        list.add(new KanjiN4(20, "B??i 20"));
        list.add(new KanjiN4(21, "B??i 21"));
        list.add(new KanjiN4(22, "B??i 22"));
        list.add(new KanjiN4(23, "B??i 23"));
        list.add(new KanjiN4(24, "B??i 24"));
        list.add(new KanjiN4(25, "B??i 25"));

        return list;
    }
}