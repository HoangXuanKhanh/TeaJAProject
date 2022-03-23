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
import com.example.teaja.myInterface.IcClickItemNguPhapN2;

import java.util.ArrayList;
import java.util.List;

public class DetailNguPhap2 extends Fragment {
    FragmentActivity nguPhapActivity;
    private RecyclerView rc_nguPhapN2;
    private NguPhap2Adapter mNguPhap2Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_ngu_phap2, container, false);
        nguPhapActivity = getActivity();
        rc_nguPhapN2 = view.findViewById(R.id.rcy_NguPhapN2);

        mNguPhap2Adapter = new NguPhap2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(nguPhapActivity, 4, RecyclerView.VERTICAL, false);
        rc_nguPhapN2.setLayoutManager(layoutManager);
        rc_nguPhapN2.setFocusable(false);
        rc_nguPhapN2.setNestedScrollingEnabled(false);
        rc_nguPhapN2.setAdapter(mNguPhap2Adapter);
        mNguPhap2Adapter.NguPhap2Adapter(getListN2(), new IcClickItemNguPhapN2() {
            @Override
            public void setOnClickItemListenerNPN2(NguPhap2 nguPhap2) {

            }
        });
        return view;
    }

    private List<NguPhap2> getListN2() {
        List<NguPhap2> list = new ArrayList<>();
        list.add(new NguPhap2(1, "Bài 1"));
        list.add(new NguPhap2(2, "Bài 2"));
        list.add(new NguPhap2(3, "Bài 3"));
        list.add(new NguPhap2(4, "Bài 4"));
        list.add(new NguPhap2(5, "Bài 5"));
        list.add(new NguPhap2(6, "Bài 6"));
        list.add(new NguPhap2(7, "Bài 7"));
        list.add(new NguPhap2(8, "Bài 8"));
        list.add(new NguPhap2(9, "Bài 9"));
        list.add(new NguPhap2(10, "Bài 10"));
        list.add(new NguPhap2(11, "Bài 11"));
        list.add(new NguPhap2(12, "Bài 12"));
        list.add(new NguPhap2(13, "Bài 13"));
        list.add(new NguPhap2(14, "Bài 14"));
        list.add(new NguPhap2(15, "Bài 15"));
        list.add(new NguPhap2(16, "Bài 16"));
        list.add(new NguPhap2(17, "Bài 17"));
        list.add(new NguPhap2(18, "Bài 18"));
        list.add(new NguPhap2(19, "Bài 19"));
        list.add(new NguPhap2(20, "Bài 20"));
        list.add(new NguPhap2(21, "Bài 21"));
        list.add(new NguPhap2(22, "Bài 22"));
        list.add(new NguPhap2(23, "Bài 23"));
        list.add(new NguPhap2(24, "Bài 24"));
        list.add(new NguPhap2(25, "Bài 25"));

        return list;
    }
}