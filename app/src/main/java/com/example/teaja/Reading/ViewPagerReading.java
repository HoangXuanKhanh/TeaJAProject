package com.example.teaja.Reading;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.Listen.MainActivityNghe1;
import com.example.teaja.Listen.MainActivityNghe2;
import com.example.teaja.Listen.MainActivityNghe3;
import com.example.teaja.Listen.MainActivityNghe4;
import com.example.teaja.Listen.MainActivityNghe5;

public class ViewPagerReading extends FragmentStatePagerAdapter {
    public ViewPagerReading(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainActivityReading5();
            case 1:
                return new MainActivityReading4();
            case 2:
                return new MainActivityReading3();
            case 3:
                return new MainActivityReading2();
            case 4:
                return new MainActivityReading1();
            default:
                return new MainActivityReading5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
