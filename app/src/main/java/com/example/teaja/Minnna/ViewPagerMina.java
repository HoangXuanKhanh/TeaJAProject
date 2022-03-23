package com.example.teaja.Minnna;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerMina extends FragmentStatePagerAdapter {
    public ViewPagerMina(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new item_minnaFiva();
            case 1:
                return new item_minnaFour();
            case 2:
                return new item_minnaThree();
            case 3:
                return new item_minnaTwo();
            case 4:
                return new item_minnaOne();
            default:
                return new item_minnaFiva();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
