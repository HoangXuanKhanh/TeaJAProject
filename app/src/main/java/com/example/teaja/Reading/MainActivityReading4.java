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
import com.example.teaja.myInterface.IClickItemReadingN4;
import com.example.teaja.myInterface.IClickItemReadingN5;

import java.util.ArrayList;
import java.util.List;

public class MainActivityReading4 extends Fragment {

    FragmentActivity ReadingN4Activity;
    private RecyclerView rc_DocN4;
    private Reading4Adapter reading4Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_reading4, container, false);
        ReadingN4Activity = getActivity();
        rc_DocN4 = view.findViewById(R.id.rcy_ReadN4);

        reading4Adapter = new Reading4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReadingN4Activity, 1, RecyclerView.VERTICAL, false);
        rc_DocN4.setLayoutManager(layoutManager);
        rc_DocN4.setFocusable(false);
        rc_DocN4.setNestedScrollingEnabled(false);
        rc_DocN4.setAdapter(reading4Adapter);
        reading4Adapter.Reading4Adapter(getListReading4(), new IClickItemReadingN4() {
            @Override
            public void setOnClickItemListenerN4(Reading4 reading4) {
                onClickReadingN4();
            }
        });

        return view;
    }

    private void onClickReadingN4() {
        //code sau
    }

    private List<Reading4> getListReading4() {
        List<Reading4> list = new ArrayList<>();
        list.add(new Reading4(1,R.drawable.ic_reading, "Bài 1", R.drawable.ic_japan5));
        list.add(new Reading4(2,R.drawable.ic_reading, "Bài 2", R.drawable.ic_japan5));
        list.add(new Reading4(3,R.drawable.ic_reading, "Bài 3", R.drawable.ic_japan5));
        list.add(new Reading4(4,R.drawable.ic_reading, "Bài 4", R.drawable.ic_japan5));
        list.add(new Reading4(5,R.drawable.ic_reading, "Bài 5", R.drawable.ic_japan5));
        list.add(new Reading4(6,R.drawable.ic_reading, "Bài 6", R.drawable.ic_japan5));
        list.add(new Reading4(7,R.drawable.ic_reading, "Bài 7", R.drawable.ic_japan5));
        list.add(new Reading4(8,R.drawable.ic_reading, "Bài 8", R.drawable.ic_japan5));
        list.add(new Reading4(9,R.drawable.ic_reading, "Bài 9", R.drawable.ic_japan5));
        list.add(new Reading4(10,R.drawable.ic_reading, "Bài 10", R.drawable.ic_japan5));
        list.add(new Reading4(11,R.drawable.ic_reading, "Bài 11", R.drawable.ic_japan5));
        list.add(new Reading4(12,R.drawable.ic_reading, "Bài 12", R.drawable.ic_japan5));
        list.add(new Reading4(13,R.drawable.ic_reading, "Bài 13", R.drawable.ic_japan5));
        list.add(new Reading4(14,R.drawable.ic_reading, "Bài 14", R.drawable.ic_japan5));
        list.add(new Reading4(15,R.drawable.ic_reading, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}