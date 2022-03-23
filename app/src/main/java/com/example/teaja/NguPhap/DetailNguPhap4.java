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
import com.example.teaja.myInterface.IcClickItemNguPhapN4;

import java.util.ArrayList;
import java.util.List;

public class DetailNguPhap4 extends Fragment {
    FragmentActivity nguPhapActivity;
    private RecyclerView rc_nguPhapN4;
    private NguPhap4Adapter mNguPhap4Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_ngu_phap4, container, false);
        nguPhapActivity = getActivity();
        rc_nguPhapN4 = view.findViewById(R.id.rcy_NguPhapN4);

        mNguPhap4Adapter = new NguPhap4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(nguPhapActivity, 4, RecyclerView.VERTICAL, false);
        rc_nguPhapN4.setLayoutManager(layoutManager);
        rc_nguPhapN4.setFocusable(false);
        rc_nguPhapN4.setNestedScrollingEnabled(false);
        rc_nguPhapN4.setAdapter(mNguPhap4Adapter);
        mNguPhap4Adapter.NguPhap4Adapter(getLisN4(), new IcClickItemNguPhapN4() {
            @Override
            public void setOnClickItemListenerNPN4(NguPhap4 nguPhap4) {

            }
        });

        return  view;
    }

    private List<NguPhap4> getLisN4() {
        List<NguPhap4> list = new ArrayList<>();
        list.add(new NguPhap4(1, "Bài 1"));
        list.add(new NguPhap4(2, "Bài 2"));
        list.add(new NguPhap4(3, "Bài 3"));
        list.add(new NguPhap4(4, "Bài 4"));
        list.add(new NguPhap4(5, "Bài 5"));
        list.add(new NguPhap4(6, "Bài 6"));
        list.add(new NguPhap4(7, "Bài 7"));
        list.add(new NguPhap4(8, "Bài 8"));
        list.add(new NguPhap4(9, "Bài 9"));
        list.add(new NguPhap4(10, "Bài 10"));
        list.add(new NguPhap4(11, "Bài 11"));
        list.add(new NguPhap4(12, "Bài 12"));
        list.add(new NguPhap4(13, "Bài 13"));
        list.add(new NguPhap4(14, "Bài 14"));
        list.add(new NguPhap4(15, "Bài 15"));
        list.add(new NguPhap4(16, "Bài 16"));
        list.add(new NguPhap4(17, "Bài 17"));
        list.add(new NguPhap4(18, "Bài 18"));
        list.add(new NguPhap4(19, "Bài 19"));
        list.add(new NguPhap4(20, "Bài 20"));
        list.add(new NguPhap4(21, "Bài 21"));
        list.add(new NguPhap4(22, "Bài 22"));
        list.add(new NguPhap4(23, "Bài 23"));
        list.add(new NguPhap4(24, "Bài 24"));
        list.add(new NguPhap4(25, "Bài 25"));

        return list;
    }
}