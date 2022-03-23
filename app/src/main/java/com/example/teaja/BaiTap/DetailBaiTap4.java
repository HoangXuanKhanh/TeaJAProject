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
import com.example.teaja.myInterface.IcClickItemBaiTapN4;

import java.util.ArrayList;
import java.util.List;

public class DetailBaiTap4 extends Fragment {
    FragmentActivity BaiTapActivity;
    private RecyclerView rc_BaiTapN4;
    private BaiTap4Adapter mbaiTap4Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_bai_tap4, container, false);
        BaiTapActivity = getActivity();
        rc_BaiTapN4 = view.findViewById(R.id.rcy_BaiTapN4);

        mbaiTap4Adapter = new BaiTap4Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BaiTapActivity, 4, RecyclerView.VERTICAL, false);
        rc_BaiTapN4.setLayoutManager(layoutManager);
        rc_BaiTapN4.setFocusable(false);
        rc_BaiTapN4.setNestedScrollingEnabled(false);
        rc_BaiTapN4.setAdapter(mbaiTap4Adapter);
        mbaiTap4Adapter.BaiTap4Adapter(getListN4(), new IcClickItemBaiTapN4() {
            @Override
            public void setOnClickItemListenerBaiTapN4(BaiTap4 baiTap4) {

            }
        });
        return view;
    }

    private List<BaiTap4> getListN4() {
        List<BaiTap4> list = new ArrayList<>();
        list.add(new BaiTap4(1, "Bài 1"));
        list.add(new BaiTap4(2, "Bài 2"));
        list.add(new BaiTap4(3, "Bài 3"));
        list.add(new BaiTap4(4, "Bài 4"));
        list.add(new BaiTap4(5, "Bài 5"));
        list.add(new BaiTap4(6, "Bài 6"));
        list.add(new BaiTap4(7, "Bài 7"));
        list.add(new BaiTap4(8, "Bài 8"));
        list.add(new BaiTap4(9, "Bài 9"));
        list.add(new BaiTap4(10, "Bài 10"));
        list.add(new BaiTap4(11, "Bài 11"));
        list.add(new BaiTap4(12, "Bài 12"));
        list.add(new BaiTap4(13, "Bài 13"));
        list.add(new BaiTap4(14, "Bài 14"));
        list.add(new BaiTap4(15, "Bài 15"));
        list.add(new BaiTap4(16, "Bài 16"));
        list.add(new BaiTap4(17, "Bài 17"));
        list.add(new BaiTap4(18, "Bài 18"));
        list.add(new BaiTap4(19, "Bài 19"));
        list.add(new BaiTap4(20, "Bài 20"));
        list.add(new BaiTap4(21, "Bài 21"));
        list.add(new BaiTap4(22, "Bài 22"));
        list.add(new BaiTap4(23, "Bài 23"));
        list.add(new BaiTap4(24, "Bài 24"));
        list.add(new BaiTap4(25, "Bài 25"));

        return list;
    }
}