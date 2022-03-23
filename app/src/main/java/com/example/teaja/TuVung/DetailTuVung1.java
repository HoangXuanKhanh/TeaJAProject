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
import com.example.teaja.myInterface.IcClickItemTuVungN1;

import java.util.ArrayList;
import java.util.List;

public class DetailTuVung1 extends Fragment {
    FragmentActivity TuVungActivity;
    private RecyclerView rc_TuvungN1;
    private TuVungN1Adapter mTuVungN1Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_tu_vung1, container, false);
        TuVungActivity = getActivity();
        rc_TuvungN1 = view.findViewById(R.id.rcy_TuVungN1);

        mTuVungN1Adapter = new TuVungN1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(TuVungActivity, 4, RecyclerView.VERTICAL, false);
        rc_TuvungN1.setLayoutManager(layoutManager);
        rc_TuvungN1.setFocusable(false);
        rc_TuvungN1.setNestedScrollingEnabled(false);
        rc_TuvungN1.setAdapter(mTuVungN1Adapter);
        mTuVungN1Adapter.TuVungN1Adapter(getListN1(), new IcClickItemTuVungN1() {
            @Override
            public void setOnClickItemListenerTV1(TuVungN1 tuVungN1) {

            }
        });
        return view;
    }

    private List<TuVungN1> getListN1() {
        List<TuVungN1> list = new ArrayList<>();
        list.add(new TuVungN1(1, "Bài 1"));
        list.add(new TuVungN1(2, "Bài 2"));
        list.add(new TuVungN1(3, "Bài 3"));
        list.add(new TuVungN1(4, "Bài 4"));
        list.add(new TuVungN1(5, "Bài 5"));
        list.add(new TuVungN1(6, "Bài 6"));
        list.add(new TuVungN1(7, "Bài 7"));
        list.add(new TuVungN1(8, "Bài 8"));
        list.add(new TuVungN1(9, "Bài 9"));
        list.add(new TuVungN1(10, "Bài 10"));
        list.add(new TuVungN1(11, "Bài 11"));
        list.add(new TuVungN1(12, "Bài 12"));
        list.add(new TuVungN1(13, "Bài 13"));
        list.add(new TuVungN1(14, "Bài 15"));
        list.add(new TuVungN1(16, "Bài 16"));
        list.add(new TuVungN1(17, "Bài 17"));
        list.add(new TuVungN1(18, "Bài 18"));
        list.add(new TuVungN1(19, "Bài 19"));
        list.add(new TuVungN1(20, "Bài 20"));
        list.add(new TuVungN1(21, "Bài 21"));
        list.add(new TuVungN1(22, "Bài 22"));
        list.add(new TuVungN1(23, "Bài 23"));
        list.add(new TuVungN1(24, "Bài 24"));
        list.add(new TuVungN1(25, "Bài 25"));

        return list;
    }
}