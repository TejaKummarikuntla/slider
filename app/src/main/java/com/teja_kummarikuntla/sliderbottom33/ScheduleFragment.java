package com.teja_kummarikuntla.sliderbottom33;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentActivity;

import com.teja_kummarikuntla.sliderbottom33.controller.EvPagerAdapter;



import com.teja_kummarikuntla.sliderbottom33.controller.EvPagerAdapter;

public class ScheduleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        ViewPager viewPager = view.findViewById(R.id.viewpagerID);
//        viewPager.setAdapter(new EvPagerAdapter(getSupportFragmentManager()));
//        viewPager.setAdapter(new EvPagerAdapter(getActivity().getSupportFragmentManager()));
        viewPager.setAdapter(new EvPagerAdapter(getChildFragmentManager()));

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayoutID);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}










/*
public class ScheduleFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewpagerID);
//        viewPager.setAdapter(new EvPagerAdapter(getSupportFragmentManager()));
        viewPager.setAdapter(new EvPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayoutID);
        tabLayout.setupWithViewPager(viewPager);
    }
}
*/

