package com.example.teaja;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.FragmentTEAJA.MainActivityHomeTEAJA;

public class ViewPagerABC extends FragmentStatePagerAdapter {

    public ViewPagerABC(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetaileHiragana();
            case 1:
                return new DetaileKatakana();
            default:
                return new DetaileHiragana();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
