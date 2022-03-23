package com.example.teaja.VideoN;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemVideoN5;

import java.util.ArrayList;
import java.util.List;

public class MainActivityN5 extends Fragment {
    View view;
    FragmentActivity N5Activity;
    private RecyclerView rc_VideoN5;
    private Japan5adapter mJapan5adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_n5, container, false);
        rc_VideoN5 = view.findViewById(R.id.rcy_VideoN5);
        N5Activity = getActivity();

        mJapan5adapter = new Japan5adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(N5Activity, 1, RecyclerView.VERTICAL, false);
        rc_VideoN5.setLayoutManager(layoutManager);
        rc_VideoN5.setFocusable(false);
        rc_VideoN5.setNestedScrollingEnabled(false);
        rc_VideoN5.setAdapter(mJapan5adapter);
        mJapan5adapter.Japan5adapter(getListN5(), new IClickItemVideoN5() {
            @Override
            public void setOnClickItemListenerN5(Japan5 japan5) {
                onClickN5(japan5);
            }
        });
        return view;
    }

    private void onClickN5(Japan5 japan5) {
        if (japan5.getId() == 1){
            Intent intent = new Intent(N5Activity, MainActivityVideoN5.class);
            startActivity(intent);
        }else if (japan5.getId() == 2){
            Intent intent = new Intent(N5Activity, MainActivityVN5.class);
            startActivity(intent);
        }
    }

    private List<Japan5> getListN5() {
        List<Japan5> list = new ArrayList<>();
        list.add(new Japan5(1,R.drawable.ic_videon5, "Bài 1", R.drawable.ic_japan5));
        list.add(new Japan5(2,R.drawable.ic_videon5, "Bài 2", R.drawable.ic_japan5));
        list.add(new Japan5(3,R.drawable.ic_videon5, "Bài 3", R.drawable.ic_japan5));
        list.add(new Japan5(4,R.drawable.ic_videon5, "Bài 4", R.drawable.ic_japan5));
        list.add(new Japan5(5,R.drawable.ic_videon5, "Bài 5", R.drawable.ic_japan5));
        list.add(new Japan5(6,R.drawable.ic_videon5, "Bài 6", R.drawable.ic_japan5));
        list.add(new Japan5(7,R.drawable.ic_videon5, "Bài 7", R.drawable.ic_japan5));
        list.add(new Japan5(8,R.drawable.ic_videon5, "Bài 8", R.drawable.ic_japan5));
        list.add(new Japan5(9,R.drawable.ic_videon5, "Bài 9", R.drawable.ic_japan5));
        list.add(new Japan5(10,R.drawable.ic_videon5, "Bài 10", R.drawable.ic_japan5));
        list.add(new Japan5(11,R.drawable.ic_videon5, "Bài 11", R.drawable.ic_japan5));
        list.add(new Japan5(12,R.drawable.ic_videon5, "Bài 12", R.drawable.ic_japan5));
        list.add(new Japan5(13,R.drawable.ic_videon5, "Bài 13", R.drawable.ic_japan5));
        list.add(new Japan5(14,R.drawable.ic_videon5, "Bài 14", R.drawable.ic_japan5));
        list.add(new Japan5(15,R.drawable.ic_videon5, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}