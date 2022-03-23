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
import com.example.teaja.myInterface.IClickItemReadingN3;

import java.util.ArrayList;
import java.util.List;

public class MainActivityReading3 extends Fragment {
    FragmentActivity ReadingN3Activity;
    private RecyclerView rc_DocN3;
    private Reading3Adapter mReading3Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_reading3, container, false);
        ReadingN3Activity = getActivity();
        rc_DocN3 = view.findViewById(R.id.rcy_ReadN3);

        mReading3Adapter = new Reading3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReadingN3Activity, 1, RecyclerView.VERTICAL, false);
        rc_DocN3.setLayoutManager(layoutManager);
        rc_DocN3.setFocusable(false);
        rc_DocN3.setNestedScrollingEnabled(false);
        rc_DocN3.setAdapter(mReading3Adapter);
        mReading3Adapter.Reading3Adapter(getListN3(), new IClickItemReadingN3() {
            @Override
            public void setOnClickItemListenerN3(Reading3 reading3) {
                onClickReadingN3();
            }
        });
        return view;
    }

    private void onClickReadingN3() {
        // code sau
    }

    private List<Reading3> getListN3() {
        List<Reading3> list = new ArrayList<>();
        list.add(new Reading3(1,R.drawable.ic_reading, "Bài 1", R.drawable.ic_japan5));
        list.add(new Reading3(2,R.drawable.ic_reading, "Bài 2", R.drawable.ic_japan5));
        list.add(new Reading3(3,R.drawable.ic_reading, "Bài 3", R.drawable.ic_japan5));
        list.add(new Reading3(4,R.drawable.ic_reading, "Bài 4", R.drawable.ic_japan5));
        list.add(new Reading3(5,R.drawable.ic_reading, "Bài 5", R.drawable.ic_japan5));
        list.add(new Reading3(6,R.drawable.ic_reading, "Bài 6", R.drawable.ic_japan5));
        list.add(new Reading3(7,R.drawable.ic_reading, "Bài 7", R.drawable.ic_japan5));
        list.add(new Reading3(8,R.drawable.ic_reading, "Bài 8", R.drawable.ic_japan5));
        list.add(new Reading3(9,R.drawable.ic_reading, "Bài 9", R.drawable.ic_japan5));
        list.add(new Reading3(10,R.drawable.ic_reading, "Bài 10", R.drawable.ic_japan5));
        list.add(new Reading3(11,R.drawable.ic_reading, "Bài 11", R.drawable.ic_japan5));
        list.add(new Reading3(12,R.drawable.ic_reading, "Bài 12", R.drawable.ic_japan5));
        list.add(new Reading3(13,R.drawable.ic_reading, "Bài 13", R.drawable.ic_japan5));
        list.add(new Reading3(14,R.drawable.ic_reading, "Bài 14", R.drawable.ic_japan5));
        list.add(new Reading3(15,R.drawable.ic_reading, "Bài 15", R.drawable.ic_japan5));

        return list;
    }
}