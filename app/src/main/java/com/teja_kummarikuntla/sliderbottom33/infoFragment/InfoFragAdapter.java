package com.teja_kummarikuntla.sliderbottom33.infoFragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class InfoFragAdapter extends FragmentPagerAdapter {
    public InfoFragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return new infoEventFragment();
            case 1 : return new infoTravelFragment();
            case 2 : return new infoAboutFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0 : return "Event";
            case 1 : return "Travel";
            case 2 : return "About";
        }

        return null;
    }
}
