package com.example.teaja.Reading;

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

import com.example.teaja.DetaileABC;
import com.example.teaja.Listen.Nghe5;
import com.example.teaja.Listen.Nghe5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemNghe5;
import com.example.teaja.myInterface.IClickItemReadingN5;

import java.util.ArrayList;
import java.util.List;

public class MainActivityReading5 extends Fragment {

    FragmentActivity ReadingN5Activity;
    private RecyclerView rc_DocN5;
    private Reading5Adapter mReading5Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_reading5, container, false);
        ReadingN5Activity = getActivity();
        rc_DocN5 = view.findViewById(R.id.rcy_ReadN5);

        mReading5Adapter = new Reading5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReadingN5Activity, 1, RecyclerView.VERTICAL, false);
        rc_DocN5.setLayoutManager(layoutManager);
        rc_DocN5.setFocusable(false);
        rc_DocN5.setNestedScrollingEnabled(false);
        rc_DocN5.setAdapter(mReading5Adapter);
        mReading5Adapter.Reading5Adapter(getListReading5(), new IClickItemReadingN5() {
            @Override
            public void setOnClickItemListenerN5(Reading5 reading5) {
                onClickReadingN5(reading5);
            }
        });
        return view;
    }

    private void onClickReadingN5(Reading5 Reading5) {
        if (Reading5.getId() == 1){
            Intent intent = new Intent(ReadingN5Activity, DetailVideN5Bai1.class);
            startActivity(intent);
        }
    }

    private List<Reading5> getListReading5() {
        List<Reading5> list = new ArrayList<>();
        list.add(new Reading5(1,R.drawable.ic_reading, "Bài 1", R.drawable.ic_japan5));
        list.add(new Reading5(2,R.drawable.ic_reading, "Bài 2", R.drawable.ic_japan5));
        list.add(new Reading5(3,R.drawable.ic_reading, "Bài 3", R.drawable.ic_japan5));
        list.add(new Reading5(4,R.drawable.ic_reading, "Bài 4", R.drawable.ic_japan5));
        list.add(new Reading5(5,R.drawable.ic_reading, "Bài 5", R.drawable.ic_japan5));
        list.add(new Reading5(6,R.drawable.ic_reading, "Bài 6", R.drawable.ic_japan5));
        list.add(new Reading5(7,R.drawable.ic_reading, "Bài 7", R.drawable.ic_japan5));
        list.add(new Reading5(8,R.drawable.ic_reading, "Bài 8", R.drawable.ic_japan5));
        list.add(new Reading5(9,R.drawable.ic_reading, "Bài 9", R.drawable.ic_japan5));
        list.add(new Reading5(10,R.drawable.ic_reading, "Bài 10", R.drawable.ic_japan5));
        list.add(new Reading5(11,R.drawable.ic_reading, "Bài 11", R.drawable.ic_japan5));
        list.add(new Reading5(12,R.drawable.ic_reading, "Bài 12", R.drawable.ic_japan5));
        list.add(new Reading5(13,R.drawable.ic_reading, "Bài 13", R.drawable.ic_japan5));
        list.add(new Reading5(14,R.drawable.ic_reading, "Bài 14", R.drawable.ic_japan5));
        list.add(new Reading5(15,R.drawable.ic_reading, "Bài 15", R.drawable.ic_japan5));

        return list;
    }
}