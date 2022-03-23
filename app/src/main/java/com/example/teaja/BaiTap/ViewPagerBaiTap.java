package com.example.teaja.BaiTap;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.NguPhap.DetailNguPhap1;
import com.example.teaja.NguPhap.DetailNguPhap2;
import com.example.teaja.NguPhap.DetailNguPhap3;
import com.example.teaja.NguPhap.DetailNguPhap4;
import com.example.teaja.NguPhap.DetailNguPhap5;

public class ViewPagerBaiTap extends FragmentStatePagerAdapter {
    public ViewPagerBaiTap(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetailBaiTap5();
            case 1:
                return new DetailBaiTap4();
            case 2:
                return new DetailBaiTap3();
            case 3:
                return new DetailBaiTap2();
            case 4:
                return new DetailBaiTap1();
            default:
                return new DetailBaiTap5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
