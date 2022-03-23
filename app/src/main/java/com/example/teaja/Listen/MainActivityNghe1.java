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
import com.example.teaja.VideoN.Japan1;
import com.example.teaja.VideoN.Japan1adapter;
import com.example.teaja.myInterface.IClickItemNghe1;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNghe1 extends Fragment {

    FragmentActivity Nghe1Activity;
    private RecyclerView rc_NgheN1;
    private Nghe1Adapter mNghe1Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_nghe1, container, false);
        Nghe1Activity = getActivity();
        rc_NgheN1 = view.findViewById(R.id.rcy_NgheN1);

        mNghe1Adapter = new Nghe1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Nghe1Activity, 1, RecyclerView.VERTICAL, false);
        rc_NgheN1.setLayoutManager(layoutManager);
        rc_NgheN1.setFocusable(false);
        rc_NgheN1.setNestedScrollingEnabled(false);
        rc_NgheN1.setAdapter(mNghe1Adapter);
        mNghe1Adapter.Nghe1Adapter(getListNghe1(), new IClickItemNghe1() {
            @Override
            public void setOnClickItemListenerNghe1(Nghe1 nghe1) {
                onClickNgh1();
            }
        });


        return view;
    }

    private void onClickNgh1() {
        // them sau tet
    }

    private List<Nghe1> getListNghe1() {
        List<Nghe1> list = new ArrayList<>();
        list.add(new Nghe1(1,R.drawable.ic_lisnghe, "Bài 1", R.drawable.ic_japan5));
        list.add(new Nghe1(2,R.drawable.ic_lisnghe, "Bài 2", R.drawable.ic_japan5));
        list.add(new Nghe1(3,R.drawable.ic_lisnghe, "Bài 3", R.drawable.ic_japan5));
        list.add(new Nghe1(4,R.drawable.ic_lisnghe, "Bài 4", R.drawable.ic_japan5));
        list.add(new Nghe1(5,R.drawable.ic_lisnghe, "Bài 5", R.drawable.ic_japan5));
        list.add(new Nghe1(6,R.drawable.ic_lisnghe, "Bài 6", R.drawable.ic_japan5));
        list.add(new Nghe1(7,R.drawable.ic_lisnghe, "Bài 7", R.drawable.ic_japan5));
        list.add(new Nghe1(8,R.drawable.ic_lisnghe, "Bài 8", R.drawable.ic_japan5));
        list.add(new Nghe1(9,R.drawable.ic_lisnghe, "Bài 9", R.drawable.ic_japan5));
        list.add(new Nghe1(10,R.drawable.ic_lisnghe, "Bài 10", R.drawable.ic_japan5));
        list.add(new Nghe1(11,R.drawable.ic_lisnghe, "Bài 11", R.drawable.ic_japan5));
        list.add(new Nghe1(12,R.drawable.ic_lisnghe, "Bài 12", R.drawable.ic_japan5));
        list.add(new Nghe1(13,R.drawable.ic_lisnghe, "Bài 13", R.drawable.ic_japan5));
        list.add(new Nghe1(14,R.drawable.ic_lisnghe, "Bài 14", R.drawable.ic_japan5));
        list.add(new Nghe1(15,R.drawable.ic_lisnghe, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}