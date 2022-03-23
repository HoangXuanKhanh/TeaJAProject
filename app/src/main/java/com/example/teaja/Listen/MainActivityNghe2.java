package com.example.teaja.Listen;

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
import com.example.teaja.myInterface.IClickItemNghe2;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNghe2 extends Fragment {

    FragmentActivity Nghe2Activity;
    private RecyclerView rc_NgheN2;
    private Nghe2Adapter mNghe2Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_nghe2, container, false);
        Nghe2Activity = getActivity();
        rc_NgheN2 = view.findViewById(R.id.rcy_NgheN2);

        mNghe2Adapter = new Nghe2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Nghe2Activity, 1, RecyclerView.VERTICAL, false);
        rc_NgheN2.setLayoutManager(layoutManager);
        rc_NgheN2.setFocusable(false);
        rc_NgheN2.setNestedScrollingEnabled(false);
        rc_NgheN2.setAdapter(mNghe2Adapter);
        mNghe2Adapter.Nghe2Adapter(getListNghe2(), new IClickItemNghe2() {
            @Override
            public void setOnClickItemListenerNghe2(Nghe2 nghe2) {
                onClickNghe2();
            }
        });
        return view;
    }

    private void onClickNghe2() {

    }

    private List<Nghe2> getListNghe2() {
        List<Nghe2> list = new ArrayList<>();
        list.add(new Nghe2(1,R.drawable.ic_lisnghe, "Bài 1", R.drawable.ic_japan5));
        list.add(new Nghe2(2,R.drawable.ic_lisnghe, "Bài 2", R.drawable.ic_japan5));
        list.add(new Nghe2(3,R.drawable.ic_lisnghe, "Bài 3", R.drawable.ic_japan5));
        list.add(new Nghe2(4,R.drawable.ic_lisnghe, "Bài 4", R.drawable.ic_japan5));
        list.add(new Nghe2(5,R.drawable.ic_lisnghe, "Bài 5", R.drawable.ic_japan5));
        list.add(new Nghe2(6,R.drawable.ic_lisnghe, "Bài 6", R.drawable.ic_japan5));
        list.add(new Nghe2(7,R.drawable.ic_lisnghe, "Bài 7", R.drawable.ic_japan5));
        list.add(new Nghe2(8,R.drawable.ic_lisnghe, "Bài 8", R.drawable.ic_japan5));
        list.add(new Nghe2(9,R.drawable.ic_lisnghe, "Bài 9", R.drawable.ic_japan5));
        list.add(new Nghe2(10,R.drawable.ic_lisnghe, "Bài 10", R.drawable.ic_japan5));
        list.add(new Nghe2(11,R.drawable.ic_lisnghe, "Bài 11", R.drawable.ic_japan5));
        list.add(new Nghe2(12,R.drawable.ic_lisnghe, "Bài 12", R.drawable.ic_japan5));
        list.add(new Nghe2(13,R.drawable.ic_lisnghe, "Bài 13", R.drawable.ic_japan5));
        list.add(new Nghe2(14,R.drawable.ic_lisnghe, "Bài 14", R.drawable.ic_japan5));
        list.add(new Nghe2(15,R.drawable.ic_lisnghe, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}