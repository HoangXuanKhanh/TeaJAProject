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
import com.example.teaja.myInterface.IClickItemJLPTN1;

import java.util.ArrayList;
import java.util.List;

public class DetailJLPTN1 extends Fragment {

    private RecyclerView rct_JLPTn1;
    private JLPTN1Adapter mJlptn1Adapter;
    FragmentActivity JLPTN1Activity;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_jlptn1, container, false);
        rct_JLPTn1 = view.findViewById(R.id.rcy_JLPTN1_Teaja);
        JLPTN1Activity = getActivity();

        mJlptn1Adapter = new JLPTN1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(JLPTN1Activity, 4, RecyclerView.VERTICAL, false);
        rct_JLPTn1.setLayoutManager(layoutManager);
        rct_JLPTn1.setFocusable(false);
        rct_JLPTn1.setNestedScrollingEnabled(false);
        rct_JLPTn1.setAdapter(mJlptn1Adapter);
        mJlptn1Adapter.JLPTN1Adapter(getList(), new IClickItemJLPTN1() {
            @Override
            public void setOnClickItemListenerN1(JLPTN1 jlptn1) {

            }
        });
        return view;
    }

    private List<JLPTN1> getList() {
        List<JLPTN1> list = new ArrayList<>();

        list.add(new JLPTN1(1, "Bài 1"));
        list.add(new JLPTN1(2, "Bài 2"));
        list.add(new JLPTN1(3, "Bài 3"));
        list.add(new JLPTN1(4, "Bài 4"));
        list.add(new JLPTN1(5, "Bài 5"));
        list.add(new JLPTN1(6, "Bài 6"));
        list.add(new JLPTN1(7, "Bài 7"));
        list.add(new JLPTN1(8, "Bài 8"));
        list.add(new JLPTN1(9, "Bài 9"));
        list.add(new JLPTN1(10, "Bài 10"));
        list.add(new JLPTN1(11, "Bài 11"));
        list.add(new JLPTN1(12, "Bài 12"));
        list.add(new JLPTN1(13, "Bài 13"));
        list.add(new JLPTN1(14, "Bài 14"));
        list.add(new JLPTN1(15, "Bài 15"));
        list.add(new JLPTN1(16, "Bài 16"));
        list.add(new JLPTN1(17, "Bài 17"));
        list.add(new JLPTN1(18, "Bài 18"));
        list.add(new JLPTN1(19, "Bài 19"));
        list.add(new JLPTN1(20, "Bài 20"));
        list.add(new JLPTN1(21, "Bài 21"));
        list.add(new JLPTN1(22, "Bài 22"));
        list.add(new JLPTN1(23, "Bài 23"));
        list.add(new JLPTN1(24, "Bài 24"));
        list.add(new JLPTN1(25, "Bài 25"));

        return list;
    }
}