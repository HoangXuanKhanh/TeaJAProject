package com.example.teaja.BaiTap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.NguPhap.NguPhap5;
import com.example.teaja.NguPhap.NguPhap5Adapter;
import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemBaiTapN5;

import java.util.ArrayList;
import java.util.List;

public class DetailBaiTap5 extends Fragment {
    FragmentActivity BaiTapActivity;
    private RecyclerView rc_BaiTapN5;
    private BaiTap5Adapter baiTap5Adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detail_bai_tap5, container, false);
        BaiTapActivity = getActivity();
        rc_BaiTapN5 = view.findViewById(R.id.rcy_BaiTapN5);

        baiTap5Adapter = new BaiTap5Adapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BaiTapActivity, 4, RecyclerView.VERTICAL, false);
        rc_BaiTapN5.setLayoutManager(layoutManager);
        rc_BaiTapN5.setFocusable(false);
        rc_BaiTapN5.setNestedScrollingEnabled(false);
        rc_BaiTapN5.setAdapter(baiTap5Adapter);
        baiTap5Adapter.BaiTap5Adapter(getListN5(), new IcClickItemBaiTapN5() {
            @Override
            public void setOnClickItemListenerBaiTapN5(BaiTap5 baiTap5) {
                onClickN5(baiTap5);
            }
        });
        return view;
    }

    private void onClickN5(BaiTap5 baiTap5) {
        if (baiTap5 != null){
            Intent intent = new Intent(BaiTapActivity, MainActivityBaiTapN5.class);
            startActivity(intent);
        }
    }

    private List<BaiTap5> getListN5() {
        List<BaiTap5> list = new ArrayList<>();
        list.add(new BaiTap5(1, "B??i 1"));
        list.add(new BaiTap5(2, "B??i 2"));
        list.add(new BaiTap5(3, "B??i 3"));
        list.add(new BaiTap5(4, "B??i 4"));
        list.add(new BaiTap5(5, "B??i 5"));
        list.add(new BaiTap5(6, "B??i 6"));
        list.add(new BaiTap5(7, "B??i 7"));
        list.add(new BaiTap5(8, "B??i 8"));
        list.add(new BaiTap5(9, "B??i 9"));
        list.add(new BaiTap5(10, "B??i 10"));
        list.add(new BaiTap5(11, "B??i 11"));
        list.add(new BaiTap5(12, "B??i 12"));
        list.add(new BaiTap5(13, "B??i 13"));
        list.add(new BaiTap5(14, "B??i 14"));
        list.add(new BaiTap5(15, "B??i 15"));
        list.add(new BaiTap5(16, "B??i 16"));
        list.add(new BaiTap5(17, "B??i 17"));
        list.add(new BaiTap5(18, "B??i 18"));
        list.add(new BaiTap5(19, "B??i 19"));
        list.add(new BaiTap5(20, "B??i 20"));
        list.add(new BaiTap5(21, "B??i 21"));
        list.add(new BaiTap5(22, "B??i 22"));
        list.add(new BaiTap5(23, "B??i 23"));
        list.add(new BaiTap5(24, "B??i 24"));
        list.add(new BaiTap5(25, "B??i 25"));

        return list;
    }
}