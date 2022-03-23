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
import com.example.teaja.myInterface.IClickItemVideoN2;

import java.util.ArrayList;
import java.util.List;

public class MainActivityN2 extends Fragment {
    View view;
    FragmentActivity N2Activity;
    private RecyclerView rc_VideoN2;
    private Japan2adapter mJapan2adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_n2, container, false);
        rc_VideoN2 = view.findViewById(R.id.rcy_VideoN2);
        N2Activity = getActivity();

        mJapan2adapter = new Japan2adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(N2Activity, 1, RecyclerView.VERTICAL, false);
        rc_VideoN2.setLayoutManager(layoutManager);
        rc_VideoN2.setFocusable(false);
        rc_VideoN2.setNestedScrollingEnabled(false);
        rc_VideoN2.setAdapter(mJapan2adapter);
        mJapan2adapter.Japan2adapter(getListN2(), new IClickItemVideoN2() {
            @Override
            public void setOnClickItemListenerN2(Japan2 japan2) {
                onClickN2();
            }
        });
        return view;
    }

    private void onClickN2() {
        // code sau tet
    }

    private List<Japan2> getListN2() {
        List<Japan2> list = new ArrayList<>();
        list.add(new Japan2(1,R.drawable.ic_videon5, "Bài 1", R.drawable.ic_japan5));
        list.add(new Japan2(2,R.drawable.ic_videon5, "Bài 2", R.drawable.ic_japan5));
        list.add(new Japan2(3,R.drawable.ic_videon5, "Bài 3", R.drawable.ic_japan5));
        list.add(new Japan2(4,R.drawable.ic_videon5, "Bài 4", R.drawable.ic_japan5));
        list.add(new Japan2(5,R.drawable.ic_videon5, "Bài 5", R.drawable.ic_japan5));
        list.add(new Japan2(6,R.drawable.ic_videon5, "Bài 6", R.drawable.ic_japan5));
        list.add(new Japan2(7,R.drawable.ic_videon5, "Bài 7", R.drawable.ic_japan5));
        list.add(new Japan2(8,R.drawable.ic_videon5, "Bài 8", R.drawable.ic_japan5));
        list.add(new Japan2(9,R.drawable.ic_videon5, "Bài 9", R.drawable.ic_japan5));
        list.add(new Japan2(10,R.drawable.ic_videon5, "Bài 10", R.drawable.ic_japan5));
        list.add(new Japan2(11,R.drawable.ic_videon5, "Bài 11", R.drawable.ic_japan5));
        list.add(new Japan2(12,R.drawable.ic_videon5, "Bài 12", R.drawable.ic_japan5));
        list.add(new Japan2(13,R.drawable.ic_videon5, "Bài 13", R.drawable.ic_japan5));
        list.add(new Japan2(14,R.drawable.ic_videon5, "Bài 14", R.drawable.ic_japan5));
        list.add(new Japan2(15,R.drawable.ic_videon5, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}