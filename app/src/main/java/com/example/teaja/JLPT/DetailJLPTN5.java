package com.example.teaja.JLPT;

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

import com.example.teaja.R;
import com.example.teaja.TuVung.TuVungN5;
import com.example.teaja.myInterface.IClickItemJLPTN5;

import java.util.ArrayList;
import java.util.List;

public class DetailJLPTN5 extends Fragment {

    View view;
    private RecyclerView rcy_JLPT;
    private JLPTN5Adapter mJlptn5Adapter;
    FragmentActivity JlptActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_jlptn5, container, false);
        rcy_JLPT = view.findViewById(R.id.rcy_JLPT_Teaja);
        JlptActivity = getActivity();

        mJlptn5Adapter = new JLPTN5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(JlptActivity, 4, RecyclerView.VERTICAL, false);
        rcy_JLPT.setLayoutManager(layoutManager);
        rcy_JLPT.setFocusable(false);
        rcy_JLPT.setNestedScrollingEnabled(false);
        rcy_JLPT.setAdapter(mJlptn5Adapter);
        mJlptn5Adapter.JLPTN5Adapter(getList(), new IClickItemJLPTN5() {
            @Override
            public void setOnClickItemListenerN5(JLPTN5 jlptn5) {

            }
        });
        return view;
    }

    private List<JLPTN5> getList() {
        List<JLPTN5> list = new ArrayList<>();
        list.add(new JLPTN5(1, "Bài 1"));
        list.add(new JLPTN5(2, "Bài 2"));
        list.add(new JLPTN5(3, "Bài 3"));
        list.add(new JLPTN5(4, "Bài 4"));
        list.add(new JLPTN5(5, "Bài 5"));
        list.add(new JLPTN5(6, "Bài 6"));
        list.add(new JLPTN5(7, "Bài 7"));
        list.add(new JLPTN5(8, "Bài 8"));
        list.add(new JLPTN5(9, "Bài 9"));
        list.add(new JLPTN5(10, "Bài 10"));
        list.add(new JLPTN5(11, "Bài 11"));
        list.add(new JLPTN5(12, "Bài 12"));
        list.add(new JLPTN5(13, "Bài 13"));
        list.add(new JLPTN5(14, "Bài 14"));
        list.add(new JLPTN5(15, "Bài 15"));
        list.add(new JLPTN5(16, "Bài 16"));
        list.add(new JLPTN5(17, "Bài 17"));
        list.add(new JLPTN5(18, "Bài 18"));
        list.add(new JLPTN5(19, "Bài 19"));
        list.add(new JLPTN5(20, "Bài 20"));
        list.add(new JLPTN5(21, "Bài 21"));
        list.add(new JLPTN5(22, "Bài 22"));
        list.add(new JLPTN5(23, "Bài 23"));
        list.add(new JLPTN5(24, "Bài 24"));
        list.add(new JLPTN5(25, "Bài 25"));

        return list;
    }
}