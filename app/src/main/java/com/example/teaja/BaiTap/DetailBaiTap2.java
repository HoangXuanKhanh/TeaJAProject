package com.example.teaja.BaiTap;

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
import com.example.teaja.myInterface.IcClickItemBaiTapN2;

import java.util.ArrayList;
import java.util.List;

public class DetailBaiTap2 extends Fragment {
    FragmentActivity BaiTapActivity;
    private RecyclerView rc_BaiTapN2;
    private BaiTap2Adapter mbaiTap2Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_bai_tap2, container, false);
        BaiTapActivity = getActivity();
        rc_BaiTapN2 = view.findViewById(R.id.rcy_BaiTapN2);

        mbaiTap2Adapter = new BaiTap2Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BaiTapActivity, 4, RecyclerView.VERTICAL, false);
        rc_BaiTapN2.setLayoutManager(layoutManager);
        rc_BaiTapN2.setFocusable(false);
        rc_BaiTapN2.setNestedScrollingEnabled(false);
        rc_BaiTapN2.setAdapter(mbaiTap2Adapter);
        mbaiTap2Adapter.BaiTap2Adapter(getListN2(), new IcClickItemBaiTapN2() {
            @Override
            public void setOnClickItemListenerBaiTapN2(BaiTap2 baiTap2) {

            }
        });
        return view;
    }

    private List<BaiTap2> getListN2() {
        List<BaiTap2> list = new ArrayList<>();
        list.add(new BaiTap2(1, "Bài 1"));
        list.add(new BaiTap2(2, "Bài 2"));
        list.add(new BaiTap2(3, "Bài 3"));
        list.add(new BaiTap2(4, "Bài 4"));
        list.add(new BaiTap2(5, "Bài 5"));
        list.add(new BaiTap2(6, "Bài 6"));
        list.add(new BaiTap2(7, "Bài 7"));
        list.add(new BaiTap2(8, "Bài 8"));
        list.add(new BaiTap2(9, "Bài 9"));
        list.add(new BaiTap2(10, "Bài 10"));
        list.add(new BaiTap2(11, "Bài 11"));
        list.add(new BaiTap2(12, "Bài 12"));
        list.add(new BaiTap2(13, "Bài 13"));
        list.add(new BaiTap2(14, "Bài 14"));
        list.add(new BaiTap2(15, "Bài 15"));
        list.add(new BaiTap2(16, "Bài 16"));
        list.add(new BaiTap2(17, "Bài 17"));
        list.add(new BaiTap2(18, "Bài 18"));
        list.add(new BaiTap2(19, "Bài 19"));
        list.add(new BaiTap2(20, "Bài 20"));
        list.add(new BaiTap2(21, "Bài 21"));
        list.add(new BaiTap2(22, "Bài 22"));
        list.add(new BaiTap2(23, "Bài 23"));
        list.add(new BaiTap2(24, "Bài 24"));
        list.add(new BaiTap2(25, "Bài 25"));

        return list;
    }
}