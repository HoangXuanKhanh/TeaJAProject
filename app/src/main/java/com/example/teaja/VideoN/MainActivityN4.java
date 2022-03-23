package com.example.teaja.VideoN;

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
import com.example.teaja.myInterface.IClickItemVideoN4;
import com.example.teaja.myInterface.IClickItemVideoN5;

import java.util.ArrayList;
import java.util.List;

public class MainActivityN4 extends Fragment {
    View view;
    FragmentActivity N4Activity;
    private RecyclerView rc_VideoN4;
    private Japan4adapter mJapan4adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_n4, container, false);
        N4Activity = getActivity();
        rc_VideoN4 = view.findViewById(R.id.rcy_VideoN4);

        mJapan4adapter = new Japan4adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(N4Activity, 1, RecyclerView.VERTICAL, false);
        rc_VideoN4.setLayoutManager(layoutManager);
        rc_VideoN4.setFocusable(false);
        rc_VideoN4.setNestedScrollingEnabled(false);
        rc_VideoN4.setAdapter(mJapan4adapter);
        mJapan4adapter.Japan4adapter(getListN4(), new IClickItemVideoN4() {
            @Override
            public void setOnClickItemListenerN4(Japan4 japan4) {
                onClickN4(japan4);
            }
        });
        return view;
    }


    private void onClickN4(Japan4 japan4) {
        if (japan4.getId() == 1){
            Intent intent = new Intent(N4Activity, MainActivityVideoN4.class);
            startActivity(intent);
        }else if (japan4.getId() == 2){
            Intent intent = new Intent(N4Activity, MainActivityVN4.class);
            startActivity(intent);
        }
    }

    private List<Japan4> getListN4() {
        List<Japan4> list = new ArrayList<>();
        list.add(new Japan4(1,R.drawable.ic_videon5, "Bài 1", R.drawable.ic_japan5));
        list.add(new Japan4(2,R.drawable.ic_videon5, "Bài 2", R.drawable.ic_japan5));
        list.add(new Japan4(3,R.drawable.ic_videon5, "Bài 3", R.drawable.ic_japan5));
        list.add(new Japan4(4,R.drawable.ic_videon5, "Bài 4", R.drawable.ic_japan5));
        list.add(new Japan4(5,R.drawable.ic_videon5, "Bài 5", R.drawable.ic_japan5));
        list.add(new Japan4(6,R.drawable.ic_videon5, "Bài 6", R.drawable.ic_japan5));
        list.add(new Japan4(7,R.drawable.ic_videon5, "Bài 7", R.drawable.ic_japan5));
        list.add(new Japan4(8,R.drawable.ic_videon5, "Bài 8", R.drawable.ic_japan5));
        list.add(new Japan4(9,R.drawable.ic_videon5, "Bài 9", R.drawable.ic_japan5));
        list.add(new Japan4(10,R.drawable.ic_videon5, "Bài 10", R.drawable.ic_japan5));
        list.add(new Japan4(11,R.drawable.ic_videon5, "Bài 11", R.drawable.ic_japan5));
        list.add(new Japan4(12,R.drawable.ic_videon5, "Bài 12", R.drawable.ic_japan5));
        list.add(new Japan4(13,R.drawable.ic_videon5, "Bài 13", R.drawable.ic_japan5));
        list.add(new Japan4(14,R.drawable.ic_videon5, "Bài 14", R.drawable.ic_japan5));
        list.add(new Japan4(15,R.drawable.ic_videon5, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}