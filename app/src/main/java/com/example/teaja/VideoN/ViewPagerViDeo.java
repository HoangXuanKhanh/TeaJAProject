package com.example.teaja.VideoN;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.DetaileHiragana;
import com.example.teaja.DetaileKatakana;

public class ViewPagerViDeo extends FragmentStatePagerAdapter {
    public ViewPagerViDeo(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainActivityN5();
            case 1:
                return new MainActivityN4();
            case 2:
                return new MainActivityN3();
            case 3:
                return new MainActivityN2();
            case 4:
                return new MainActivityN1();
            default:
                return new MainActivityN5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
