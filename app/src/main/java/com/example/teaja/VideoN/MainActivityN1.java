package com.example.teaja.VideoN;

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
import com.example.teaja.myInterface.IClickItemVideoN1;

import java.util.ArrayList;
import java.util.List;

public class MainActivityN1 extends Fragment {
    View view;
    FragmentActivity N1Activity;
    private RecyclerView rc_VideoN1;
    private Japan1adapter mJapan1adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_n1, container, false);
        N1Activity = getActivity();
        rc_VideoN1 = view.findViewById(R.id.rcy_VideoN1);

        mJapan1adapter = new Japan1adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(N1Activity, 1, RecyclerView.VERTICAL, false);
        rc_VideoN1.setLayoutManager(layoutManager);
        rc_VideoN1.setFocusable(false);
        rc_VideoN1.setNestedScrollingEnabled(false);
        rc_VideoN1.setAdapter(mJapan1adapter);
        mJapan1adapter.Japan1adapter(getListN1(), new IClickItemVideoN1() {
            @Override
            public void setOnClickItemListenerN1(Japan1 japan1) {

            }
        });
        return view;
    }

    private List<Japan1> getListN1() {
        List<Japan1> list = new ArrayList<>();
        list.add(new Japan1(1,R.drawable.ic_videon5, "Bài 1", R.drawable.ic_japan5));
        list.add(new Japan1(2,R.drawable.ic_videon5, "Bài 2", R.drawable.ic_japan5));
        list.add(new Japan1(3,R.drawable.ic_videon5, "Bài 3", R.drawable.ic_japan5));
        list.add(new Japan1(4,R.drawable.ic_videon5, "Bài 4", R.drawable.ic_japan5));
        list.add(new Japan1(5,R.drawable.ic_videon5, "Bài 5", R.drawable.ic_japan5));
        list.add(new Japan1(6,R.drawable.ic_videon5, "Bài 6", R.drawable.ic_japan5));
        list.add(new Japan1(7,R.drawable.ic_videon5, "Bài 7", R.drawable.ic_japan5));
        list.add(new Japan1(8,R.drawable.ic_videon5, "Bài 8", R.drawable.ic_japan5));
        list.add(new Japan1(9,R.drawable.ic_videon5, "Bài 9", R.drawable.ic_japan5));
        list.add(new Japan1(10,R.drawable.ic_videon5, "Bài 10", R.drawable.ic_japan5));
        list.add(new Japan1(11,R.drawable.ic_videon5, "Bài 11", R.drawable.ic_japan5));
        list.add(new Japan1(12,R.drawable.ic_videon5, "Bài 12", R.drawable.ic_japan5));
        list.add(new Japan1(13,R.drawable.ic_videon5, "Bài 13", R.drawable.ic_japan5));
        list.add(new Japan1(14,R.drawable.ic_videon5, "Bài 14", R.drawable.ic_japan5));
        list.add(new Japan1(15,R.drawable.ic_videon5, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}