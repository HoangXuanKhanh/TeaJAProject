package com.example.teaja.NguPhap;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerNGuPhap extends FragmentStatePagerAdapter {
    public ViewPagerNGuPhap(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetailNguPhap5();
            case 1:
                return new DetailNguPhap4();
            case 2:
                return new DetailNguPhap3();
            case 3:
                return new DetailNguPhap2();
            case 4:
                return new DetailNguPhap1();
            default:
                return new DetailNguPhap5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
