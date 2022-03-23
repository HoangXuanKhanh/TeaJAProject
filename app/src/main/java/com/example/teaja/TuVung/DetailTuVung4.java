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
import com.example.teaja.myInterface.IcClickItemTuVungN4;

import java.util.ArrayList;
import java.util.List;

public class DetailTuVung4 extends Fragment {

    FragmentActivity TuVungActivity;
    private RecyclerView rc_TuvungN4;
    private TuVungN4Adapter mTuVungN4Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_tu_vung4, container, false);
        TuVungActivity = getActivity();
        rc_TuvungN4 = view.findViewById(R.id.rcy_TuVungN4);

        mTuVungN4Adapter = new TuVungN4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(TuVungActivity, 4, RecyclerView.VERTICAL, false);
        rc_TuvungN4.setLayoutManager(layoutManager);
        rc_TuvungN4.setFocusable(false);
        rc_TuvungN4.setNestedScrollingEnabled(false);
        rc_TuvungN4.setAdapter(mTuVungN4Adapter);
        mTuVungN4Adapter.TuVungN4Adapter(getLisTVN4(), new IcClickItemTuVungN4() {
            @Override
            public void setOnClickItemListenerTVN4(TuVungN4 vungN4) {

            }
        });
        return view;
    }

    private List<TuVungN4> getLisTVN4() {
        List<TuVungN4> list = new ArrayList<>();
        list.add(new TuVungN4(1, "Bài 1"));
        list.add(new TuVungN4(2, "Bài 2"));
        list.add(new TuVungN4(3, "Bài 3"));
        list.add(new TuVungN4(4, "Bài 4"));
        list.add(new TuVungN4(5, "Bài 5"));
        list.add(new TuVungN4(6, "Bài 6"));
        list.add(new TuVungN4(7, "Bài 7"));
        list.add(new TuVungN4(8, "Bài 8"));
        list.add(new TuVungN4(9, "Bài 9"));
        list.add(new TuVungN4(10, "Bài 10"));
        list.add(new TuVungN4(11, "Bài 11"));
        list.add(new TuVungN4(12, "Bài 12"));
        list.add(new TuVungN4(13, "Bài 13"));
        list.add(new TuVungN4(14, "Bài 14"));
        list.add(new TuVungN4(15, "Bài 15"));
        list.add(new TuVungN4(16, "Bài 16"));
        list.add(new TuVungN4(17, "Bài 17"));
        list.add(new TuVungN4(18, "Bài 18"));
        list.add(new TuVungN4(19, "Bài 19"));
        list.add(new TuVungN4(20, "Bài 20"));
        list.add(new TuVungN4(21, "Bài 21"));
        list.add(new TuVungN4(22, "Bài 22"));
        list.add(new TuVungN4(23, "Bài 23"));
        list.add(new TuVungN4(24, "Bài 24"));
        list.add(new TuVungN4(25, "Bài 25"));

        return list;
    }
}