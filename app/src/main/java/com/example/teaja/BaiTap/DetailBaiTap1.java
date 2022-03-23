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

import com.example.teaja.NguPhap.NguPhap1Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN1;

import java.util.ArrayList;
import java.util.List;

public class DetailBaiTap1 extends Fragment {
    FragmentActivity BaiTapActivity;
    private RecyclerView rc_BaiTapN1;
    private BaiTap1Adapter mbaiTap1Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_bai_tap1, container, false);
        BaiTapActivity = getActivity();
        rc_BaiTapN1 = view.findViewById(R.id.rcy_BaiTapN1);

        mbaiTap1Adapter = new BaiTap1Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BaiTapActivity, 4, RecyclerView.VERTICAL, false);
        rc_BaiTapN1.setLayoutManager(layoutManager);
        rc_BaiTapN1.setFocusable(false);
        rc_BaiTapN1.setNestedScrollingEnabled(false);
        rc_BaiTapN1.setAdapter(mbaiTap1Adapter);
        mbaiTap1Adapter.BaiTap1Adapter(getListN1(), new IcClickItemBaiTapN1() {
            @Override
            public void setOnClickItemListenerBaiTapN1(BaiTap1 baiTap1) {

            }
        });
        return view;
    }

    private List<BaiTap1> getListN1() {
        List<BaiTap1> list = new ArrayList<>();
        list.add(new BaiTap1(1, "Bài 1"));
        list.add(new BaiTap1(2, "Bài 2"));
        list.add(new BaiTap1(3, "Bài 3"));
        list.add(new BaiTap1(4, "Bài 4"));
        list.add(new BaiTap1(5, "Bài 5"));
        list.add(new BaiTap1(6, "Bài 6"));
        list.add(new BaiTap1(7, "Bài 7"));
        list.add(new BaiTap1(8, "Bài 8"));
        list.add(new BaiTap1(9, "Bài 9"));
        list.add(new BaiTap1(10, "Bài 10"));
        list.add(new BaiTap1(11, "Bài 11"));
        list.add(new BaiTap1(12, "Bài 12"));
        list.add(new BaiTap1(13, "Bài 13"));
        list.add(new BaiTap1(14, "Bài 14"));
        list.add(new BaiTap1(15, "Bài 15"));
        list.add(new BaiTap1(16, "Bài 16"));
        list.add(new BaiTap1(17, "Bài 17"));
        list.add(new BaiTap1(18, "Bài 18"));
        list.add(new BaiTap1(19, "Bài 19"));
        list.add(new BaiTap1(20, "Bài 20"));
        list.add(new BaiTap1(21, "Bài 21"));
        list.add(new BaiTap1(22, "Bài 22"));
        list.add(new BaiTap1(23, "Bài 23"));
        list.add(new BaiTap1(24, "Bài 24"));
        list.add(new BaiTap1(25, "Bài 25"));

        return list;
    }
}