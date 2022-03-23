package com.example.teaja.Listen;

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
import com.example.teaja.myInterface.IClickItemNghe1;
import com.example.teaja.myInterface.IClickItemNghe5;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNghe5 extends Fragment {
    FragmentActivity Nghe5Activity;
    private RecyclerView rc_NgheN5;
    private Nghe5Adapter mNghe5Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_nghe5, container, false);
        Nghe5Activity = getActivity();
        rc_NgheN5 = view.findViewById(R.id.rcy_NgheN5);

        mNghe5Adapter = new Nghe5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Nghe5Activity, 1, RecyclerView.VERTICAL, false);
        rc_NgheN5.setLayoutManager(layoutManager);
        rc_NgheN5.setFocusable(false);
        rc_NgheN5.setNestedScrollingEnabled(false);
        rc_NgheN5.setAdapter(mNghe5Adapter);
        mNghe5Adapter.Nghe5Adapter(getListNghe5(), new IClickItemNghe5() {
            @Override
            public void setOnClickItemListenerNghe5(Nghe5 nghe5) {
                onClickLis1N5(nghe5);
            }
        });

        return view;
    }

    private void onClickLis1N5(Nghe5 nghe5) {
        if (nghe5.getId() == 1) {
            Intent intent = new Intent(Nghe5Activity, ListenN5Bai1.class);
            startActivity(intent);
        }
    }

    private List<Nghe5> getListNghe5() {
        List<Nghe5> list = new ArrayList<>();
        list.add(new Nghe5(1,R.drawable.ic_lisnghe, "Bài 1", R.drawable.ic_japan5));
        list.add(new Nghe5(2,R.drawable.ic_lisnghe, "Bài 2", R.drawable.ic_japan5));
        list.add(new Nghe5(3,R.drawable.ic_lisnghe, "Bài 3", R.drawable.ic_japan5));
        list.add(new Nghe5(4,R.drawable.ic_lisnghe, "Bài 4", R.drawable.ic_japan5));
        list.add(new Nghe5(5,R.drawable.ic_lisnghe, "Bài 5", R.drawable.ic_japan5));
        list.add(new Nghe5(6,R.drawable.ic_lisnghe, "Bài 6", R.drawable.ic_japan5));
        list.add(new Nghe5(7,R.drawable.ic_lisnghe, "Bài 7", R.drawable.ic_japan5));
        list.add(new Nghe5(8,R.drawable.ic_lisnghe, "Bài 8", R.drawable.ic_japan5));
        list.add(new Nghe5(9,R.drawable.ic_lisnghe, "Bài 9", R.drawable.ic_japan5));
        list.add(new Nghe5(10,R.drawable.ic_lisnghe, "Bài 10", R.drawable.ic_japan5));
        list.add(new Nghe5(11,R.drawable.ic_lisnghe, "Bài 11", R.drawable.ic_japan5));
        list.add(new Nghe5(12,R.drawable.ic_lisnghe, "Bài 12", R.drawable.ic_japan5));
        list.add(new Nghe5(13,R.drawable.ic_lisnghe, "Bài 13", R.drawable.ic_japan5));
        list.add(new Nghe5(14,R.drawable.ic_lisnghe, "Bài 14", R.drawable.ic_japan5));
        list.add(new Nghe5(15,R.drawable.ic_lisnghe, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}