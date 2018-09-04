package com.teja_kummarikuntla.sliderbottom33.infoFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja_kummarikuntla.sliderbottom33.R;

public class InfoFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View infoFragInf =  inflater.inflate(R.layout.fragment_infoo,container,false);

        ViewPager viewPager = infoFragInf.findViewById(R.id.viewpager_infoFragID);
        viewPager.setAdapter(new InfoFragAdapter(getChildFragmentManager()));

        TabLayout tabLayout = (TabLayout) infoFragInf.findViewById(R.id.tablayout_infoFragID);
        tabLayout.setupWithViewPager(viewPager);

    return infoFragInf;
    }
}
