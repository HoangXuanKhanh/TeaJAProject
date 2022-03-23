package com.example.teaja.JLPT;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.BaiTap.DetailBaiTap1;
import com.example.teaja.BaiTap.DetailBaiTap2;
import com.example.teaja.BaiTap.DetailBaiTap3;
import com.example.teaja.BaiTap.DetailBaiTap4;
import com.example.teaja.BaiTap.DetailBaiTap5;

public class ViewPagerJLPT extends FragmentStatePagerAdapter {
    public ViewPagerJLPT(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetailJLPTN5();
            case 1:
                return new DetailJLPTN4();
            case 2:
                return new DetailJLPTN3();
            case 3:
                return new DetailJLPTN2();
            case 4:
                return new DetailJLPTN1();
            default:
                return new DetailJLPTN5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
