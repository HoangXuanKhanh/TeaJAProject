package com.example.teaja.VideoN;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemVideoN3;

import java.util.ArrayList;
import java.util.List;

public class MainActivityN3 extends Fragment {
    View view;
    FragmentActivity N3Activity;
    private RecyclerView rc_VideoN3;
    private Japan3adapter mJapan3adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_n3, container, false);
        N3Activity = getActivity();
        rc_VideoN3 = view.findViewById(R.id.rcy_VideoN3);

        mJapan3adapter = new Japan3adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(N3Activity, 1, RecyclerView.VERTICAL, false);
        rc_VideoN3.setLayoutManager(layoutManager);
        rc_VideoN3.setFocusable(false);
        rc_VideoN3.setNestedScrollingEnabled(false);
        rc_VideoN3.setAdapter(mJapan3adapter);
        mJapan3adapter.Japan3adapter(getListN3(), new IClickItemVideoN3() {
            @Override
            public void setOnClickItemListenerN3(Japan3 japan3) {
                onClickN3();
            }
        });

        return view;
    }

    private void onClickN3() {
        //them du lieu sau tet
    }

    private List<Japan3> getListN3() {
        List<Japan3> list = new ArrayList<>();
        list.add(new Japan3(1,R.drawable.ic_videon5, "Bài 1", R.drawable.ic_japan5));
        list.add(new Japan3(2,R.drawable.ic_videon5, "Bài 2", R.drawable.ic_japan5));
        list.add(new Japan3(3,R.drawable.ic_videon5, "Bài 3", R.drawable.ic_japan5));
        list.add(new Japan3(4,R.drawable.ic_videon5, "Bài 4", R.drawable.ic_japan5));
        list.add(new Japan3(5,R.drawable.ic_videon5, "Bài 5", R.drawable.ic_japan5));
        list.add(new Japan3(6,R.drawable.ic_videon5, "Bài 6", R.drawable.ic_japan5));
        list.add(new Japan3(7,R.drawable.ic_videon5, "Bài 7", R.drawable.ic_japan5));
        list.add(new Japan3(8,R.drawable.ic_videon5, "Bài 8", R.drawable.ic_japan5));
        list.add(new Japan3(9,R.drawable.ic_videon5, "Bài 9", R.drawable.ic_japan5));
        list.add(new Japan3(10,R.drawable.ic_videon5, "Bài 10", R.drawable.ic_japan5));
        list.add(new Japan3(11,R.drawable.ic_videon5, "Bài 11", R.drawable.ic_japan5));
        list.add(new Japan3(12,R.drawable.ic_videon5, "Bài 12", R.drawable.ic_japan5));
        list.add(new Japan3(13,R.drawable.ic_videon5, "Bài 13", R.drawable.ic_japan5));
        list.add(new Japan3(14,R.drawable.ic_videon5, "Bài 14", R.drawable.ic_japan5));
        list.add(new Japan3(15,R.drawable.ic_videon5, "Bài 15", R.drawable.ic_japan5));

        return list;
    }
}