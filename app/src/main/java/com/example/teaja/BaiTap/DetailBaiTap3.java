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
import com.example.teaja.myInterface.IcClickItemBaiTapN3;

import java.util.ArrayList;
import java.util.List;

public class DetailBaiTap3 extends Fragment {
    FragmentActivity BaiTapActivity;
    private RecyclerView rc_BaiTapN3;
    private BaiTap3Adapter mbaiTap3Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_bai_tap3, container, false);
        BaiTapActivity = getActivity();
        rc_BaiTapN3 = view.findViewById(R.id.rcy_BaiTapN3);

        mbaiTap3Adapter = new BaiTap3Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BaiTapActivity, 4, RecyclerView.VERTICAL, false);
        rc_BaiTapN3.setLayoutManager(layoutManager);
        rc_BaiTapN3.setFocusable(false);
        rc_BaiTapN3.setNestedScrollingEnabled(false);
        rc_BaiTapN3.setAdapter(mbaiTap3Adapter);
        mbaiTap3Adapter.BaiTap3Adapter(getListN4(), new IcClickItemBaiTapN3() {
            @Override
            public void setOnClickItemListenerBaiTap3(BaiTap3 baiTap3) {

            }
        });
        return view;
    }

    private List<BaiTap3> getListN4() {
        List<BaiTap3> list = new ArrayList<>();
        list.add(new BaiTap3(1, "Bài 1"));
        list.add(new BaiTap3(2, "Bài 2"));
        list.add(new BaiTap3(3, "Bài 3"));
        list.add(new BaiTap3(4, "Bài 4"));
        list.add(new BaiTap3(5, "Bài 5"));
        list.add(new BaiTap3(6, "Bài 6"));
        list.add(new BaiTap3(7, "Bài 7"));
        list.add(new BaiTap3(8, "Bài 8"));
        list.add(new BaiTap3(9, "Bài 9"));
        list.add(new BaiTap3(10, "Bài 10"));
        list.add(new BaiTap3(11, "Bài 11"));
        list.add(new BaiTap3(12, "Bài 12"));
        list.add(new BaiTap3(13, "Bài 13"));
        list.add(new BaiTap3(14, "Bài 14"));
        list.add(new BaiTap3(15, "Bài 15"));
        list.add(new BaiTap3(16, "Bài 16"));
        list.add(new BaiTap3(17, "Bài 17"));
        list.add(new BaiTap3(18, "Bài 18"));
        list.add(new BaiTap3(19, "Bài 19"));
        list.add(new BaiTap3(20, "Bài 20"));
        list.add(new BaiTap3(21, "Bài 21"));
        list.add(new BaiTap3(22, "Bài 22"));
        list.add(new BaiTap3(23, "Bài 23"));
        list.add(new BaiTap3(24, "Bài 24"));
        list.add(new BaiTap3(25, "Bài 25"));

        return list;
    }
}