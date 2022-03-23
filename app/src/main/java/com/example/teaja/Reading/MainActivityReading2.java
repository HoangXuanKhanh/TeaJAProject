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
import com.example.teaja.myInterface.IClickItemReadingN2;

import java.util.ArrayList;
import java.util.List;

public class MainActivityReading2 extends Fragment {
    FragmentActivity ReadingN2Activity;
    private RecyclerView rc_DocN2;
    private Reading2Adapter mReading2Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_reading2, container, false);
        ReadingN2Activity = getActivity();
        rc_DocN2 = view.findViewById(R.id.rcy_ReadN2);

        mReading2Adapter = new Reading2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReadingN2Activity, 1, RecyclerView.VERTICAL, false);
        rc_DocN2.setLayoutManager(layoutManager);
        rc_DocN2.setFocusable(false);
        rc_DocN2.setNestedScrollingEnabled(false);
        rc_DocN2.setAdapter(mReading2Adapter);
        mReading2Adapter.Reading2Adapter(getListN2(), new IClickItemReadingN2() {
            @Override
            public void setOnClickItemListenerN2(Reading2 reading2) {
                onClickReadingN2();
            }
        });
        return view;
    }

    private void onClickReadingN2() {
        //code sau
    }

    private List<Reading2> getListN2() {
        List<Reading2> list = new ArrayList<>();
        list.add(new Reading2(1,R.drawable.ic_reading, "Bài 1", R.drawable.ic_japan5));
        list.add(new Reading2(2,R.drawable.ic_reading, "Bài 2", R.drawable.ic_japan5));
        list.add(new Reading2(3,R.drawable.ic_reading, "Bài 3", R.drawable.ic_japan5));
        list.add(new Reading2(4,R.drawable.ic_reading, "Bài 4", R.drawable.ic_japan5));
        list.add(new Reading2(5,R.drawable.ic_reading, "Bài 5", R.drawable.ic_japan5));
        list.add(new Reading2(6,R.drawable.ic_reading, "Bài 6", R.drawable.ic_japan5));
        list.add(new Reading2(7,R.drawable.ic_reading, "Bài 7", R.drawable.ic_japan5));
        list.add(new Reading2(8,R.drawable.ic_reading, "Bài 8", R.drawable.ic_japan5));
        list.add(new Reading2(9,R.drawable.ic_reading, "Bài 9", R.drawable.ic_japan5));
        list.add(new Reading2(10,R.drawable.ic_reading, "Bài 10", R.drawable.ic_japan5));
        list.add(new Reading2(11,R.drawable.ic_reading, "Bài 11", R.drawable.ic_japan5));
        list.add(new Reading2(12,R.drawable.ic_reading, "Bài 12", R.drawable.ic_japan5));
        list.add(new Reading2(13,R.drawable.ic_reading, "Bài 13", R.drawable.ic_japan5));
        list.add(new Reading2(14,R.drawable.ic_reading, "Bài 14", R.drawable.ic_japan5));
        list.add(new Reading2(15,R.drawable.ic_reading, "Bài 15", R.drawable.ic_japan5));


        return list;
    }
}