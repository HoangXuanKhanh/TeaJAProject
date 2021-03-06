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
        list.add(new TuVungN5(1, "B??i 1"));
        list.add(new TuVungN5(2, "B??i 2"));
        list.add(new TuVungN5(3, "B??i 3"));
        list.add(new TuVungN5(4, "B??i 4"));
        list.add(new TuVungN5(5, "B??i 5"));
        list.add(new TuVungN5(6, "B??i 6"));
        list.add(new TuVungN5(7, "B??i 7"));
        list.add(new TuVungN5(8, "B??i 8"));
        list.add(new TuVungN5(9, "B??i 9"));
        list.add(new TuVungN5(10, "B??i 10"));
        list.add(new TuVungN5(11, "B??i 11"));
        list.add(new TuVungN5(12, "B??i 12"));
        list.add(new TuVungN5(13, "B??i 13"));
        list.add(new TuVungN5(14, "B??i 14"));
        list.add(new TuVungN5(15, "B??i 15"));
        list.add(new TuVungN5(16, "B??i 16"));
        list.add(new TuVungN5(17, "B??i 17"));
        list.add(new TuVungN5(18, "B??i 18"));
        list.add(new TuVungN5(19, "B??i 19"));
        list.add(new TuVungN5(20, "B??i 20"));
        list.add(new TuVungN5(21, "B??i 21"));
        list.add(new TuVungN5(22, "B??i 22"));
        list.add(new TuVungN5(23, "B??i 23"));
        list.add(new TuVungN5(24, "B??i 24"));
        list.add(new TuVungN5(25, "B??i 25"));

        return list;
    }
}