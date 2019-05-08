package com.example.bloodbank.ui.adapter;

import com.example.bloodbank.ui.fragment.IntroOne;
import com.example.bloodbank.ui.fragment.IntroTwo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class IntroPagerAdapter extends FragmentPagerAdapter {

    public IntroPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new IntroOne();
            case 1: return new IntroTwo();
            default: return new IntroOne();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
