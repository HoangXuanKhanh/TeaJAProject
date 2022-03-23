package com.example.teaja.Reading;

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
import com.example.teaja.myInterface.IClickItemReadingN1;

import java.util.ArrayList;
import java.util.List;

public class MainActivityReading1 extends Fragment {
    FragmentActivity ReadingN1Activity;
    private RecyclerView rc_DocN1;
    private Reading1Adapter mReading1Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_reading1, container, false);
        ReadingN1Activity = getActivity();
        rc_DocN1 = view.findViewById(R.id.rcy_ReadN1);

        mReading1Adapter = new Reading1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReadingN1Activity, 1, RecyclerView.VERTICAL, false);
        rc_DocN1.setLayoutManager(layoutManager);
        rc_DocN1.setFocusable(false);
        rc_DocN1.setNestedScrollingEnabled(false);
        rc_DocN1.setAdapter(mReading1Adapter);
        mReading1Adapter.Reading1Adapter(getListN1(), new IClickItemReadingN1() {
            @Override
            public void setOnClickItemListenerN1(Reading1 reading1) {
                onClickReadingN5();
            }
        });
        return view;
    }

    private void onClickReadingN5() {
        //code sau
    }
    private List<Reading1> getListN1() {
        List<Reading1> list = new ArrayList<>();
        list.add(new Reading1(1,R.drawable.ic_reading, "Bài 1", R.drawable.ic_japan5));
        list.add(new Reading1(2,R.drawable.ic_reading, "Bài 2", R.drawable.ic_japan5));
        list.add(new Reading1(3,R.drawable.ic_reading, "Bài 3", R.drawable.ic_japan5));
        list.add(new Reading1(4,R.drawable.ic_reading, "Bài 4", R.drawable.ic_japan5));
        list.add(new Reading1(5,R.drawable.ic_reading, "Bài 5", R.drawable.ic_japan5));
        list.add(new Reading1(6,R.drawable.ic_reading, "Bài 6", R.drawable.ic_japan5));
        list.add(new Reading1(7,R.drawable.ic_reading, "Bài 7", R.drawable.ic_japan5));
        list.add(new Reading1(8,R.drawable.ic_reading, "Bài 8", R.drawable.ic_japan5));
        list.add(new Reading1(9,R.drawable.ic_reading, "Bài 9", R.drawable.ic_japan5));
        list.add(new Reading1(10,R.drawable.ic_reading, "Bài 10", R.drawable.ic_japan5));
        list.add(new Reading1(11,R.drawable.ic_reading, "Bài 11", R.drawable.ic_japan5));
        list.add(new Reading1(12,R.drawable.ic_reading, "Bài 12", R.drawable.ic_japan5));
        list.add(new Reading1(13,R.drawable.ic_reading, "Bài 13", R.drawable.ic_japan5));
        list.add(new Reading1(14,R.drawable.ic_reading, "Bài 14", R.drawable.ic_japan5));
        list.add(new Reading1(15,R.drawable.ic_reading, "Bài 15", R.drawable.ic_japan5));

        return list;
    }

}