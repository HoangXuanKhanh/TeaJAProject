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
import com.example.teaja.myInterface.IcClickItemTuVungN3;

import java.util.ArrayList;
import java.util.List;

public class DetailTuVung3 extends Fragment {
    FragmentActivity TuVungActivity;
    private RecyclerView rc_TuvungN3;
    private TuVungN3Adapter mTuVungN3Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_tu_vung3, container, false);
        rc_TuvungN3 = view.findViewById(R.id.rcy_TuVungN3);
        TuVungActivity = getActivity();

        mTuVungN3Adapter = new TuVungN3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(TuVungActivity, 4, RecyclerView.VERTICAL, false);
        rc_TuvungN3.setLayoutManager(layoutManager);
        rc_TuvungN3.setFocusable(false);
        rc_TuvungN3.setNestedScrollingEnabled(false);
        rc_TuvungN3.setAdapter(mTuVungN3Adapter);
        mTuVungN3Adapter.TuVungN3Adapter(getListTVN4(), new IcClickItemTuVungN3() {
            @Override
            public void setOnClickItemListenerTVN3(TuVungN3 tuVungN3) {
                onClickN3(tuVungN3);
            }
        });
        return view;
    }

    private List<TuVungN3> getListTVN4() {
        List<TuVungN3> list = new ArrayList<>();
        list.add(new TuVungN3(1, "Bài 1"));
        list.add(new TuVungN3(2, "Bài 2"));
        list.add(new TuVungN3(3, "Bài 3"));
        list.add(new TuVungN3(4, "Bài 4"));
        list.add(new TuVungN3(5, "Bài 5"));
        list.add(new TuVungN3(6, "Bài 6"));
        list.add(new TuVungN3(7, "Bài 7"));
        list.add(new TuVungN3(8, "Bài 8"));
        list.add(new TuVungN3(9, "Bài 9"));
        list.add(new TuVungN3(10, "Bài 10"));
        list.add(new TuVungN3(11, "Bài 11"));
        list.add(new TuVungN3(12, "Bài 12"));
        list.add(new TuVungN3(13, "Bài 13"));
        list.add(new TuVungN3(14, "Bài 14"));
        list.add(new TuVungN3(15, "Bài 15"));
        list.add(new TuVungN3(16, "Bài 16"));
        list.add(new TuVungN3(17, "Bài 17"));
        list.add(new TuVungN3(18, "Bài 18"));
        list.add(new TuVungN3(19, "Bài 19"));
        list.add(new TuVungN3(20, "Bài 20"));
        list.add(new TuVungN3(21, "Bài 21"));
        list.add(new TuVungN3(22, "Bài 23"));
        list.add(new TuVungN3(24, "Bài 24"));
        list.add(new TuVungN3(25, "Bài 25"));

        return list;
    }

    private void onClickN3(TuVungN3 tuVungN3) {

    }
}