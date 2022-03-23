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
import com.example.teaja.myInterface.IClickItemNghe3;

import java.util.ArrayList;
import java.util.List;

public class MainActivityNghe3 extends Fragment {
    FragmentActivity Nghe3Activity;
    private RecyclerView rc_NgheN3;
    private Nghe3Adapter mNghe3Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_nghe3, container, false);
        Nghe3Activity = getActivity();
        rc_NgheN3 = view.findViewById(R.id.rcy_NgheN3);

        mNghe3Adapter = new Nghe3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Nghe3Activity, 1, RecyclerView.VERTICAL, false);
        rc_NgheN3.setLayoutManager(layoutManager);
        rc_NgheN3.setFocusable(false);
        rc_NgheN3.setNestedScrollingEnabled(false);
        rc_NgheN3.setAdapter(mNghe3Adapter);
        mNghe3Adapter.Nghe3Adapter(getListNghe3(), new IClickItemNghe3() {
            @Override
            public void setOnClickItemListenerNghe3(Nghe3 nghe3) {
                onClickNgh3();
            }
        });


        return view;
    }

    private void onClickNgh3() {
        // them sau tet
    }

    private List<Nghe3> getListNghe3() {
        List<Nghe3> list = new ArrayList<>();
        list.add(new Nghe3(1,R.drawable.ic_lisnghe, "Bài 1", R.drawable.ic_japan5));
        list.add(new Nghe3(2,R.drawable.ic_lisnghe, "Bài 2", R.drawable.ic_japan5));
        list.add(new Nghe3(3,R.drawable.ic_lisnghe, "Bài 3", R.drawable.ic_japan5));
        list.add(new Nghe3(4,R.drawable.ic_lisnghe, "Bài 4", R.drawable.ic_japan5));
        list.add(new Nghe3(5,R.drawable.ic_lisnghe, "Bài 5", R.drawable.ic_japan5));
        list.add(new Nghe3(6,R.drawable.ic_lisnghe, "Bài 6", R.drawable.ic_japan5));
        list.add(new Nghe3(7,R.drawable.ic_lisnghe, "Bài 7", R.drawable.ic_japan5));
        list.add(new Nghe3(8,R.drawable.ic_lisnghe, "Bài 8", R.drawable.ic_japan5));
        list.add(new Nghe3(9,R.drawable.ic_lisnghe, "Bài 9", R.drawable.ic_japan5));
        list.add(new Nghe3(10,R.drawable.ic_lisnghe, "Bài 10", R.drawable.ic_japan5));
        list.add(new Nghe3(11,R.drawable.ic_lisnghe, "Bài 11", R.drawable.ic_japan5));
        list.add(new Nghe3(12,R.drawable.ic_lisnghe, "Bài 12", R.drawable.ic_japan5));
        list.add(new Nghe3(13,R.drawable.ic_lisnghe, "Bài 13", R.drawable.ic_japan5));
        list.add(new Nghe3(14,R.drawable.ic_lisnghe, "Bài 14", R.drawable.ic_japan5));
        list.add(new Nghe3(15,R.drawable.ic_lisnghe, "Bài 15", R.drawable.ic_japan5));
        return list;
    }
}