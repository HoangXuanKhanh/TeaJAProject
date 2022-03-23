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
import com.example.teaja.myInterface.IClickItemJLPTN2;

import java.util.ArrayList;
import java.util.List;

public class DetailJLPTN2 extends Fragment {

    private RecyclerView rct_JLPT;
    private JLPTN2Adapter mJlptn2Adapter;
    FragmentActivity JLPTN2Activity;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_jlptn2, container, false);
        JLPTN2Activity = getActivity();
        rct_JLPT = view.findViewById(R.id.rcy_JLPTN2_Teaja);

        mJlptn2Adapter = new JLPTN2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(JLPTN2Activity, 4, RecyclerView.VERTICAL, false);
        rct_JLPT.setLayoutManager(layoutManager);
        rct_JLPT.setFocusable(false);
        rct_JLPT.setNestedScrollingEnabled(false);
        rct_JLPT.setAdapter(mJlptn2Adapter);
        mJlptn2Adapter.JLPTN2Adapter(getList(), new IClickItemJLPTN2() {
            @Override
            public void setOnClickItemListenerN2(JLPTN2 jlptn2) {

            }
        });
        return view;
    }

    private List<JLPTN2> getList() {
        List<JLPTN2> list = new ArrayList<>();
        list.add(new JLPTN2(1, "Bài 1"));
        list.add(new JLPTN2(2, "Bài 2"));
        list.add(new JLPTN2(3, "Bài 3"));
        list.add(new JLPTN2(4, "Bài 4"));
        list.add(new JLPTN2(5, "Bài 5"));
        list.add(new JLPTN2(6, "Bài 6"));
        list.add(new JLPTN2(7, "Bài 7"));
        list.add(new JLPTN2(8, "Bài 8"));
        list.add(new JLPTN2(9, "Bài 9"));
        list.add(new JLPTN2(10, "Bài 10"));
        list.add(new JLPTN2(11, "Bài 11"));
        list.add(new JLPTN2(12, "Bài 12"));
        list.add(new JLPTN2(13, "Bài 13"));
        list.add(new JLPTN2(14, "Bài 14"));
        list.add(new JLPTN2(15, "Bài 15"));
        list.add(new JLPTN2(16, "Bài 16"));
        list.add(new JLPTN2(17, "Bài 17"));
        list.add(new JLPTN2(18, "Bài 18"));
        list.add(new JLPTN2(19, "Bài 19"));
        list.add(new JLPTN2(20, "Bài 20"));
        list.add(new JLPTN2(21, "Bài 21"));
        list.add(new JLPTN2(22, "Bài 22"));
        list.add(new JLPTN2(23, "Bài 23"));
        list.add(new JLPTN2(24, "Bài 24"));
        list.add(new JLPTN2(25, "Bài 25"));

        return  list;
    }
}