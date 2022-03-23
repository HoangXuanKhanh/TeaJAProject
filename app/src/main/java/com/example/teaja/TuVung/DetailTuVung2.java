package com.example.teaja.TuVung;

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
import com.example.teaja.myInterface.IcClickItemTuVungN2;

import java.util.ArrayList;
import java.util.List;

public class DetailTuVung2 extends Fragment {
    FragmentActivity TuVungActivity;
    private RecyclerView rc_TuvungN2;
    private TuVungN2Adapter mTuVungN2Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_tu_vung2, container, false);
        rc_TuvungN2 = view.findViewById(R.id.rcy_TuVungN2);
        TuVungActivity = getActivity();

        mTuVungN2Adapter = new TuVungN2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(TuVungActivity, 4, RecyclerView.VERTICAL, false);
        rc_TuvungN2.setLayoutManager(layoutManager);
        rc_TuvungN2.setFocusable(false);
        rc_TuvungN2.setNestedScrollingEnabled(false);
        rc_TuvungN2.setAdapter(mTuVungN2Adapter);
        mTuVungN2Adapter.TuVungN2Adapter(getListN2(), new IcClickItemTuVungN2() {
            @Override
            public void setOnClickItemListenerTVN2(TuVungN2 tuVungN2) {

            }
        });
        return view;
    }

    private List<TuVungN2> getListN2() {
        List<TuVungN2> list = new ArrayList<>();
        list.add(new TuVungN2(1, "Bài 1"));
        list.add(new TuVungN2(2, "Bài 2"));
        list.add(new TuVungN2(3, "Bài 3"));
        list.add(new TuVungN2(4, "Bài 4"));
        list.add(new TuVungN2(5, "Bài 5"));
        list.add(new TuVungN2(6, "Bài 6"));
        list.add(new TuVungN2(7, "Bài 7"));
        list.add(new TuVungN2(8, "Bài 8"));
        list.add(new TuVungN2(9, "Bài 9"));
        list.add(new TuVungN2(10, "Bài 10"));
        list.add(new TuVungN2(11, "Bài 11"));
        list.add(new TuVungN2(12, "Bài 12"));
        list.add(new TuVungN2(13, "Bài 13"));
        list.add(new TuVungN2(14, "Bài 14"));
        list.add(new TuVungN2(15, "Bài 15"));
        list.add(new TuVungN2(16, "Bài 16"));
        list.add(new TuVungN2(17, "Bài 17"));
        list.add(new TuVungN2(18, "Bài 18"));
        list.add(new TuVungN2(19, "Bài 19"));
        list.add(new TuVungN2(20, "Bài 20"));
        list.add(new TuVungN2(21, "Bài 21"));
        list.add(new TuVungN2(22, "Bài 22"));
        list.add(new TuVungN2(23, "Bài 23"));
        list.add(new TuVungN2(24, "Bài 24"));
        list.add(new TuVungN2(25, "Bài 25"));

        return list;
    }
}