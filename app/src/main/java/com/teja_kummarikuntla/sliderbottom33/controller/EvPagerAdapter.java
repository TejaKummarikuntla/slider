package com.teja_kummarikuntla.sliderbottom33.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.teja_kummarikuntla.sliderbottom33.views.Day1Fragment;
import com.teja_kummarikuntla.sliderbottom33.views.Day2Fragment;

public class EvPagerAdapter extends FragmentPagerAdapter {
    public EvPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 : return new Day1Fragment();
            case 1 : return new Day2Fragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0 : return "Day1";
            case 1 : return "Day2";
        }

        return null;
    }
}
