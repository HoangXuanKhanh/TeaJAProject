package com.example.teaja.Kanji;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerKanji extends FragmentStatePagerAdapter {

    public ViewpagerKanji(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DetailNewKanjiFive();
            case 1:
                return new DetailNewKanjiYour();
            case 2:
                return new DetailNewKanjiThree();
            case 3:
                return new DetailNewKanjiTwo();
            case 4:
                return new DetailNewKanjiOne();
            default:
                return new DetailNewKanjiFive();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
