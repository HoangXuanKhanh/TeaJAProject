package com.example.teaja.TuVung;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.Listen.Nghe1Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemTuVungN5;

import java.util.ArrayList;
import java.util.List;

public class DetailTuVung5 extends Fragment {

    FragmentActivity TuVungActivity;
    private RecyclerView rc_TuvungN5;
    private TuVungN5Adapter mTuVungN5Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_tu_vung5, container, false);
        rc_TuvungN5 = view.findViewById(R.id.rcy_TuVungN5);
        TuVungActivity = getActivity();

        mTuVungN5Adapter = new TuVungN5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(TuVungActivity, 4, RecyclerView.VERTICAL, false);
        rc_TuvungN5.setLayoutManager(layoutManager);
        rc_TuvungN5.setFocusable(false);
        rc_TuvungN5.setNestedScrollingEnabled(false);
        rc_TuvungN5.setAdapter(mTuVungN5Adapter);
        mTuVungN5Adapter.TuVungN5Adapter(getListN5(), new IcClickItemTuVungN5() {
            @Override
            public void setOnClickItemListenerTVN5(TuVungN5 tuVungN5) {
                onClickN5(tuVungN5);
            }
        });
        return view;
    }

    private void onClickN5(TuVungN5 tuVungN5) {
        if (tuVungN5.getId() == 1){
            Intent intent = new Intent(TuVungActivity, MainActivityDetaiTVN5.class);
            startActivity(intent);
        }
    }

    private List<TuVungN5> getListN5() {
        List<TuVungN5> list = new ArrayList<>();
        list.add(new TuVungN5(1, "Bài 1"));
        list.add(new TuVungN5(2, "Bài 2"));
        list.add(new TuVungN5(3, "Bài 3"));
        list.add(new TuVungN5(4, "Bài 4"));
        list.add(new TuVungN5(5, "Bài 5"));
        list.add(new TuVungN5(6, "Bài 6"));
        list.add(new TuVungN5(7, "Bài 7"));
        list.add(new TuVungN5(8, "Bài 8"));
        list.add(new TuVungN5(9, "Bài 9"));
        list.add(new TuVungN5(10, "Bài 10"));
        list.add(new TuVungN5(11, "Bài 11"));
        list.add(new TuVungN5(12, "Bài 12"));
        list.add(new TuVungN5(13, "Bài 13"));
        list.add(new TuVungN5(14, "Bài 14"));
        list.add(new TuVungN5(15, "Bài 15"));
        list.add(new TuVungN5(16, "Bài 16"));
        list.add(new TuVungN5(17, "Bài 17"));
        list.add(new TuVungN5(18, "Bài 18"));
        list.add(new TuVungN5(19, "Bài 19"));
        list.add(new TuVungN5(20, "Bài 20"));
        list.add(new TuVungN5(21, "Bài 21"));
        list.add(new TuVungN5(22, "Bài 22"));
        list.add(new TuVungN5(23, "Bài 23"));
        list.add(new TuVungN5(24, "Bài 24"));
        list.add(new TuVungN5(25, "Bài 25"));

        return list;
    }
}