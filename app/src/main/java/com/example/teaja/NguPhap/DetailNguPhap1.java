package com.example.teaja.NguPhap;

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
import com.example.teaja.myInterface.IcClickItemNguPhapN1;

import java.util.ArrayList;
import java.util.List;

public class DetailNguPhap1 extends Fragment {
    FragmentActivity nguPhapActivity;
    private RecyclerView rc_nguPhapN1;
    private NguPhap1Adapter mNguPhap1Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_ngu_phap1, container, false);
        nguPhapActivity = getActivity();
        rc_nguPhapN1 = view.findViewById(R.id.rcy_NguPhapN1);

        mNguPhap1Adapter = new NguPhap1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(nguPhapActivity, 4, RecyclerView.VERTICAL, false);
        rc_nguPhapN1.setLayoutManager(layoutManager);
        rc_nguPhapN1.setFocusable(false);
        rc_nguPhapN1.setNestedScrollingEnabled(false);
        rc_nguPhapN1.setAdapter(mNguPhap1Adapter);
        mNguPhap1Adapter.NguPhap1Adapter(getListN1(), new IcClickItemNguPhapN1() {
            @Override
            public void setOnClickItemListenerNPN1(NguPhap1 nguPhap1) {

            }
        });
        return view;
    }

    private List<NguPhap1> getListN1() {
        List<NguPhap1> list = new ArrayList<>();
        list.add(new NguPhap1(1, "Bài 1"));
        list.add(new NguPhap1(2, "Bài 2"));
        list.add(new NguPhap1(3, "Bài 3"));
        list.add(new NguPhap1(4, "Bài 4"));
        list.add(new NguPhap1(5, "Bài 5"));
        list.add(new NguPhap1(6, "Bài 6"));
        list.add(new NguPhap1(7, "Bài 7"));
        list.add(new NguPhap1(8, "Bài 8"));
        list.add(new NguPhap1(9, "Bài 9"));
        list.add(new NguPhap1(10, "Bài 10"));
        list.add(new NguPhap1(11, "Bài 11"));
        list.add(new NguPhap1(12, "Bài 12"));
        list.add(new NguPhap1(13, "Bài 13"));
        list.add(new NguPhap1(14, "Bài 14"));
        list.add(new NguPhap1(15, "Bài 15"));
        list.add(new NguPhap1(16, "Bài 16"));
        list.add(new NguPhap1(17, "Bài 17"));
        list.add(new NguPhap1(18, "Bài 18"));
        list.add(new NguPhap1(19, "Bài 19"));
        list.add(new NguPhap1(20, "Bài 20"));
        list.add(new NguPhap1(21, "Bài 21"));
        list.add(new NguPhap1(22, "Bài 22"));
        list.add(new NguPhap1(23, "Bài 23"));
        list.add(new NguPhap1(24, "Bài 24"));
        list.add(new NguPhap1(25, "Bài 25"));

        return list;
    }
}