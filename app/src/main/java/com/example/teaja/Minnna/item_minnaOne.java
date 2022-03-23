package com.example.teaja.Minnna;

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
import com.example.teaja.myInterface.IcClickItemMinaOne;

import java.util.ArrayList;
import java.util.List;

public class item_minnaOne extends Fragment {

    View view;
    FragmentActivity MinnaN1;
    private RecyclerView rc_MinnaN1;
    private MinaOneAdapter minaOneAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_item_minna_one, container, false);
        MinnaN1 = getActivity();
        rc_MinnaN1 = view.findViewById(R.id.rcy_MinnaN1);

        minaOneAdapter = new MinaOneAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MinnaN1, 4, RecyclerView.VERTICAL, false);
        rc_MinnaN1.setLayoutManager(layoutManager);
        rc_MinnaN1.setFocusable(false);
        rc_MinnaN1.setNestedScrollingEnabled(false);
        rc_MinnaN1.setAdapter(minaOneAdapter);
        minaOneAdapter.MinaOneAdapter(getList(), new IcClickItemMinaOne() {
            @Override
            public void setOnClickItemListenerMinaOne(MinaOne minaOne) {

            }
        });
        return view;
    }

    private List<MinaOne> getList() {
        List<MinaOne> list = new ArrayList<>();
        list.add(new MinaOne(1, "Bài 1"));
        list.add(new MinaOne(2, "Bài 2"));
        list.add(new MinaOne(3, "Bài 3"));
        list.add(new MinaOne(4, "Bài 4"));
        list.add(new MinaOne(5, "Bài 5"));
        list.add(new MinaOne(6, "Bài 6"));
        list.add(new MinaOne(7, "Bài 7"));
        list.add(new MinaOne(8, "Bài 8"));
        list.add(new MinaOne(9, "Bài 9"));
        list.add(new MinaOne(10, "Bài 10"));
        list.add(new MinaOne(11, "Bài 11"));
        list.add(new MinaOne(12, "Bài 12"));
        list.add(new MinaOne(13, "Bài 13"));
        list.add(new MinaOne(14, "Bài 14"));
        list.add(new MinaOne(15, "Bài 15"));
        list.add(new MinaOne(16, "Bài 16"));
        list.add(new MinaOne(17, "Bài 17"));
        list.add(new MinaOne(18, "Bài 18"));
        list.add(new MinaOne(19, "Bài 19"));
        list.add(new MinaOne(20, "Bài 20"));
        list.add(new MinaOne(21, "Bài 21"));
        list.add(new MinaOne(22, "Bài 22"));
        list.add(new MinaOne(23, "Bài 23"));
        list.add(new MinaOne(24, "Bài 24"));
        list.add(new MinaOne(25, "Bài 25"));

        return list;
    }
}