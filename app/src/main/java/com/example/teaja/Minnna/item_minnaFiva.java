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

import com.example.teaja.NguPhap.NguPhap5;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaFive;

import java.util.ArrayList;
import java.util.List;

public class item_minnaFiva extends Fragment {

    View view;
    FragmentActivity mMinnaN5;
    private RecyclerView rc_MinnaN5;
    private MinaFiveAdapter minaFiveAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_item_minna_fiva, container, false);
        mMinnaN5 = getActivity();
        rc_MinnaN5 = view.findViewById(R.id.rcy_MinnaN5);

        minaFiveAdapter = new MinaFiveAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mMinnaN5, 4, RecyclerView.VERTICAL, false);
        rc_MinnaN5.setLayoutManager(layoutManager);
        rc_MinnaN5.setFocusable(false);
        rc_MinnaN5.setNestedScrollingEnabled(false);
        rc_MinnaN5.setAdapter(minaFiveAdapter);
        minaFiveAdapter.MinaFiveAdapter(getList(), new IcClickItemMinaFive() {
            @Override
            public void setOnClickItemListenerMinaFive(MinaFive minaFive) {

            }
        });

        return view;
    }

    private List<MinaFive> getList() {
        List<MinaFive> list = new ArrayList<>();
        list.add(new MinaFive(1, "Bài 1"));
        list.add(new MinaFive(2, "Bài 2"));
        list.add(new MinaFive(3, "Bài 3"));
        list.add(new MinaFive(4, "Bài 4"));
        list.add(new MinaFive(5, "Bài 5"));
        list.add(new MinaFive(6, "Bài 6"));
        list.add(new MinaFive(7, "Bài 7"));
        list.add(new MinaFive(8, "Bài 8"));
        list.add(new MinaFive(9, "Bài 9"));
        list.add(new MinaFive(10, "Bài 10"));
        list.add(new MinaFive(11, "Bài 11"));
        list.add(new MinaFive(12, "Bài 12"));
        list.add(new MinaFive(13, "Bài 13"));
        list.add(new MinaFive(14, "Bài 14"));
        list.add(new MinaFive(15, "Bài 15"));
        list.add(new MinaFive(16, "Bài 16"));
        list.add(new MinaFive(17, "Bài 17"));
        list.add(new MinaFive(18, "Bài 18"));
        list.add(new MinaFive(19, "Bài 19"));
        list.add(new MinaFive(20, "Bài 20"));
        list.add(new MinaFive(21, "Bài 21"));
        list.add(new MinaFive(22, "Bài 22"));
        list.add(new MinaFive(23, "Bài 23"));
        list.add(new MinaFive(24, "Bài 24"));
        list.add(new MinaFive(25, "Bài 25"));

        return list;
    }
}