package com.example.teaja.NguPhap;

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

import com.example.teaja.R;
import com.example.teaja.Reading.Reading5Adapter;
import com.example.teaja.TuVung.TuVungN5;
import com.example.teaja.myInterface.IcClickItemNguPhapN5;

import java.util.ArrayList;
import java.util.List;

public class DetailNguPhap5 extends Fragment {
    FragmentActivity nguPhapActivity;
    private RecyclerView rc_nguPhapN5;
    private NguPhap5Adapter mNguPhap5Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_ngu_phap5, container, false);
        nguPhapActivity = getActivity();
        rc_nguPhapN5 = view.findViewById(R.id.rcy_NguPhapN5);

        mNguPhap5Adapter = new NguPhap5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(nguPhapActivity, 4, RecyclerView.VERTICAL, false);
        rc_nguPhapN5.setLayoutManager(layoutManager);
        rc_nguPhapN5.setFocusable(false);
        rc_nguPhapN5.setNestedScrollingEnabled(false);
        rc_nguPhapN5.setAdapter(mNguPhap5Adapter);
        mNguPhap5Adapter.NguPhap5Adapter(getLisN5(), new IcClickItemNguPhapN5() {
            @Override
            public void setOnClickItemListenerNPN5(NguPhap5 nguPhap5) {
                onClickN5(nguPhap5);
            }
        });
        return view;
    }

    private void onClickN5(NguPhap5 nguPhap5) {
        if (nguPhap5.getId() == 1){
            Intent intent = new Intent(nguPhapActivity, MainActivityNguPhapN5.class);
            startActivity(intent);
        }
    }

    private List<NguPhap5> getLisN5() {
        List<NguPhap5> list = new ArrayList<>();
        list.add(new NguPhap5(1, "B??i 1"));
        list.add(new NguPhap5(2, "B??i 2"));
        list.add(new NguPhap5(3, "B??i 3"));
        list.add(new NguPhap5(4, "B??i 4"));
        list.add(new NguPhap5(5, "B??i 5"));
        list.add(new NguPhap5(6, "B??i 6"));
        list.add(new NguPhap5(7, "B??i 7"));
        list.add(new NguPhap5(8, "B??i 8"));
        list.add(new NguPhap5(9, "B??i 9"));
        list.add(new NguPhap5(10, "B??i 10"));
        list.add(new NguPhap5(11, "B??i 11"));
        list.add(new NguPhap5(12, "B??i 12"));
        list.add(new NguPhap5(13, "B??i 13"));
        list.add(new NguPhap5(14, "B??i 14"));
        list.add(new NguPhap5(15, "B??i 15"));
        list.add(new NguPhap5(16, "B??i 16"));
        list.add(new NguPhap5(17, "B??i 17"));
        list.add(new NguPhap5(18, "B??i 18"));
        list.add(new NguPhap5(19, "B??i 19"));
        list.add(new NguPhap5(20, "B??i 20"));
        list.add(new NguPhap5(21, "B??i 21"));
        list.add(new NguPhap5(22, "B??i 22"));
        list.add(new NguPhap5(23, "B??i 23"));
        list.add(new NguPhap5(24, "B??i 24"));
        list.add(new NguPhap5(25, "B??i 25"));

        return list;
    }
}