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
import com.example.teaja.myInterface.IClickItemNghe1;
import com.example.teaja.myInterface.IClickItemNghe4;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNghe4 extends Fragment {
    FragmentActivity Nghe4Activity;
    private RecyclerView rc_NgheN4;
    private Nghe4Adapter mNghe4Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_nghe4, container, false);
        rc_NgheN4 = view.findViewById(R.id.rcy_NgheN4);
        Nghe4Activity = getActivity();

        mNghe4Adapter = new Nghe4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Nghe4Activity, 1, RecyclerView.VERTICAL, false);
        rc_NgheN4.setLayoutManager(layoutManager);
        rc_NgheN4.setFocusable(false);
        rc_NgheN4.setNestedScrollingEnabled(false);
        rc_NgheN4.setAdapter(mNghe4Adapter);
        mNghe4Adapter.Nghe4Adapter(getListNghe4(), new IClickItemNghe4() {
            @Override
            public void setOnClickItemListenerNghe4(Nghe4 nghe4) {
                onClickNgh1();
            }
        });

        return view;
    }

    private List<Nghe4> getListNghe4() {
        List<Nghe4> list = new ArrayList<>();
        list.add(new Nghe4(1,R.drawable.ic_lisnghe, "Bài 1", R.drawable.ic_japan5));
        list.add(new Nghe4(2,R.drawable.ic_lisnghe, "Bài 2", R.drawable.ic_japan5));
        list.add(new Nghe4(3,R.drawable.ic_lisnghe, "Bài 3", R.drawable.ic_japan5));
        list.add(new Nghe4(4,R.drawable.ic_lisnghe, "Bài 4", R.drawable.ic_japan5));
        list.add(new Nghe4(5,R.drawable.ic_lisnghe, "Bài 5", R.drawable.ic_japan5));
        list.add(new Nghe4(6,R.drawable.ic_lisnghe, "Bài 6", R.drawable.ic_japan5));
        list.add(new Nghe4(7,R.drawable.ic_lisnghe, "Bài 7", R.drawable.ic_japan5));
        list.add(new Nghe4(8,R.drawable.ic_lisnghe, "Bài 8", R.drawable.ic_japan5));
        list.add(new Nghe4(9,R.drawable.ic_lisnghe, "Bài 9", R.drawable.ic_japan5));
        list.add(new Nghe4(10,R.drawable.ic_lisnghe, "Bài 10", R.drawable.ic_japan5));
        list.add(new Nghe4(11,R.drawable.ic_lisnghe, "Bài 11", R.drawable.ic_japan5));
        list.add(new Nghe4(12,R.drawable.ic_lisnghe, "Bài 12", R.drawable.ic_japan5));
        list.add(new Nghe4(13,R.drawable.ic_lisnghe, "Bài 13", R.drawable.ic_japan5));
        list.add(new Nghe4(14,R.drawable.ic_lisnghe, "Bài 14", R.drawable.ic_japan5));
        list.add(new Nghe4(15,R.drawable.ic_lisnghe, "Bài 15", R.drawable.ic_japan5));
        return list;
    }

    private void onClickNgh1() {
        // them sau tet
    }
}