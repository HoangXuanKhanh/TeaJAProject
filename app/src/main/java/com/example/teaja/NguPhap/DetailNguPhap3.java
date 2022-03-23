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
import com.example.teaja.myInterface.IcClickItemNguPhapN3;

import java.util.ArrayList;
import java.util.List;

public class DetailNguPhap3 extends Fragment {
    FragmentActivity nguPhapActivity;
    private RecyclerView rc_nguPhapN3;
    private NguPhap3Adapter mNguPhap3Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_ngu_phap3, container, false);
        nguPhapActivity = getActivity();
        rc_nguPhapN3 = view.findViewById(R.id.rcy_NguPhapN3);

        mNguPhap3Adapter = new NguPhap3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(nguPhapActivity, 4, RecyclerView.VERTICAL, false);
        rc_nguPhapN3.setLayoutManager(layoutManager);
        rc_nguPhapN3.setFocusable(false);
        rc_nguPhapN3.setNestedScrollingEnabled(false);
        rc_nguPhapN3.setAdapter(mNguPhap3Adapter);
        mNguPhap3Adapter.NguPhap3Adapter(getLisN3(), new IcClickItemNguPhapN3() {
            @Override
            public void setOnClickItemListenerNPN3(NguPhap3 nguPhap3) {

            }
        });

        return view;
    }

    private List<NguPhap3> getLisN3() {
        List<NguPhap3> list = new ArrayList<>();
        list.add(new NguPhap3(1, "Bài 1"));
        list.add(new NguPhap3(2, "Bài 2"));
        list.add(new NguPhap3(3, "Bài 3"));
        list.add(new NguPhap3(4, "Bài 4"));
        list.add(new NguPhap3(5, "Bài 5"));
        list.add(new NguPhap3(6, "Bài 6"));
        list.add(new NguPhap3(7, "Bài 7"));
        list.add(new NguPhap3(8, "Bài 8"));
        list.add(new NguPhap3(9, "Bài 9"));
        list.add(new NguPhap3(10, "Bài 10"));
        list.add(new NguPhap3(11, "Bài 11"));
        list.add(new NguPhap3(12, "Bài 12"));
        list.add(new NguPhap3(13, "Bài 13"));
        list.add(new NguPhap3(14, "Bài 14"));
        list.add(new NguPhap3(15, "Bài 15"));
        list.add(new NguPhap3(16, "Bài 16"));
        list.add(new NguPhap3(17, "Bài 17"));
        list.add(new NguPhap3(18, "Bài 18"));
        list.add(new NguPhap3(19, "Bài 19"));
        list.add(new NguPhap3(20, "Bài 20"));
        list.add(new NguPhap3(21, "Bài 21"));
        list.add(new NguPhap3(22, "Bài 22"));
        list.add(new NguPhap3(23, "Bài 23"));
        list.add(new NguPhap3(24, "Bài 24"));
        list.add(new NguPhap3(25, "Bài 25"));

        return list;
    }
}