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
import com.example.teaja.myInterface.IClickItemJLPTN4;

import java.util.ArrayList;
import java.util.List;

public class DetailJLPTN4 extends Fragment {

    private RecyclerView rcy_JLPTn4;
    private JLPTN4Adapter mJlptn4Adapter;
    FragmentActivity JLPtActivity;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_jlptn4, container, false);
        JLPtActivity = getActivity();
        rcy_JLPTn4 = view.findViewById(R.id.rcy_JLPTN4_Teaja);

        mJlptn4Adapter = new JLPTN4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(JLPtActivity, 4, RecyclerView.VERTICAL, false);
        rcy_JLPTn4.setLayoutManager(layoutManager);
        rcy_JLPTn4.setFocusable(false);
        rcy_JLPTn4.setNestedScrollingEnabled(false);
        rcy_JLPTn4.setAdapter(mJlptn4Adapter);
        mJlptn4Adapter.JLPTN4Adapter(getList(), new IClickItemJLPTN4() {
            @Override
            public void setOnClickItemListenerN4(JLPTN4 jlptn4) {

            }
        });

        return view;
    }

    private List<JLPTN4> getList() {
        List<JLPTN4> list = new ArrayList<>();
        list.add(new JLPTN4(1, "Bài 1"));
        list.add(new JLPTN4(2, "Bài 2"));
        list.add(new JLPTN4(3, "Bài 3"));
        list.add(new JLPTN4(4, "Bài 4"));
        list.add(new JLPTN4(5, "Bài 5"));
        list.add(new JLPTN4(6, "Bài 6"));
        list.add(new JLPTN4(7, "Bài 7"));
        list.add(new JLPTN4(8, "Bài 8"));
        list.add(new JLPTN4(9, "Bài 9"));
        list.add(new JLPTN4(10, "Bài 10"));
        list.add(new JLPTN4(11, "Bài 11"));
        list.add(new JLPTN4(12, "Bài 12"));
        list.add(new JLPTN4(13, "Bài 13"));
        list.add(new JLPTN4(14, "Bài 14"));
        list.add(new JLPTN4(15, "Bài 15"));
        list.add(new JLPTN4(16, "Bài 16"));
        list.add(new JLPTN4(17, "Bài 17"));
        list.add(new JLPTN4(18, "Bài 18"));
        list.add(new JLPTN4(19, "Bài 19"));
        list.add(new JLPTN4(20, "Bài 20"));
        list.add(new JLPTN4(21, "Bài 21"));
        list.add(new JLPTN4(22, "Bài 22"));
        list.add(new JLPTN4(23, "Bài 23"));
        list.add(new JLPTN4(24, "Bài 24"));
        list.add(new JLPTN4(25, "Bài 25"));


        return list;
    }
}