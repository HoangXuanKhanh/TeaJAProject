package com.example.teaja.TuVung;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.teaja.NguPhap.DetailNguPhap1;
import com.example.teaja.NguPhap.DetailNguPhap2;
import com.example.teaja.NguPhap.DetailNguPhap3;
import com.example.teaja.NguPhap.DetailNguPhap4;
import com.example.teaja.NguPhap.DetailNguPhap5;

public class ViewPagerTuVung extends FragmentStatePagerAdapter {
    public ViewPagerTuVung(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetailTuVung5();
            case 1:
                return new DetailTuVung4();
            case 2:
                return new DetailTuVung3();
            case 3:
                return new DetailTuVung2();
            case 4:
                return new DetailTuVung1();
            default:
                return new DetailTuVung5();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
