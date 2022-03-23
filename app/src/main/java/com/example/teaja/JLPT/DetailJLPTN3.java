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
import com.example.teaja.myInterface.IClickItemJLPTN3;

import java.util.ArrayList;
import java.util.List;

public class DetailJLPTN3 extends Fragment {

    private RecyclerView rcy_JLPT;
    private JLPTN3Adapter mJlptn3Adapter;
    FragmentActivity JLPTn3Activity;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_jlptn3, container, false);
        rcy_JLPT = view.findViewById(R.id.rcy_JLPTN3_Teaja);
        JLPTn3Activity = getActivity();

        mJlptn3Adapter = new JLPTN3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(JLPTn3Activity, 4, RecyclerView.VERTICAL, false);
        rcy_JLPT.setLayoutManager(layoutManager);
        rcy_JLPT.setFocusable(false);
        rcy_JLPT.setNestedScrollingEnabled(false);
        rcy_JLPT.setAdapter(mJlptn3Adapter);
        mJlptn3Adapter.JLPTN3Adapter(getList(), new IClickItemJLPTN3() {
            @Override
            public void setOnClickItemListenerN5(JLPTN3 jlptn3) {

            }
        });

        return view;
    }

    private List<JLPTN3> getList() {
        List<JLPTN3> list = new ArrayList<>();
        list.add(new JLPTN3(1, "Bài 1"));
        list.add(new JLPTN3(2, "Bài 2"));
        list.add(new JLPTN3(3, "Bài 3"));
        list.add(new JLPTN3(4, "Bài 4"));
        list.add(new JLPTN3(5, "Bài 5"));
        list.add(new JLPTN3(6, "Bài 6"));
        list.add(new JLPTN3(7, "Bài 7"));
        list.add(new JLPTN3(8, "Bài 8"));
        list.add(new JLPTN3(9, "Bài 9"));
        list.add(new JLPTN3(10, "Bài 10"));
        list.add(new JLPTN3(11, "Bài 11"));
        list.add(new JLPTN3(12, "Bài 12"));
        list.add(new JLPTN3(13, "Bài 13"));
        list.add(new JLPTN3(14, "Bài 14"));
        list.add(new JLPTN3(15, "Bài 15"));
        list.add(new JLPTN3(16, "Bài 16"));
        list.add(new JLPTN3(17, "Bài 17"));
        list.add(new JLPTN3(18, "Bài 18"));
        list.add(new JLPTN3(19, "Bài 19"));
        list.add(new JLPTN3(20, "Bài 20"));
        list.add(new JLPTN3(21, "Bài 21"));
        list.add(new JLPTN3(22, "Bài 22"));
        list.add(new JLPTN3(23, "Bài 23"));
        list.add(new JLPTN3(24, "Bài 24"));
        list.add(new JLPTN3(25, "Bài 25"));

        return list;
    }
}