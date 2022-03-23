package com.example.teaja.Listen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerListen extends FragmentStatePagerAdapter {

    public ViewPagerListen(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainActivityNghe5();
            case 1:
                return new MainActivityNghe4();
            case 2:
                return new MainActivityNghe3();
            case 3:
                return new MainActivityNghe2();
            case 4:
                return new MainActivityNghe1();
            default:
                return new MainActivityNghe5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
