package com.teja_kummarikuntla.sliderbottom33;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.teja_kummarikuntla.sliderbottom33.infoFragment.InfoFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new ScheduleFragment());

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
            return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        //AppCompatActivity activity = null;

        switch (item.getItemId()) {

            case R.id.navigation_schedule:
                fragment = new ScheduleFragment();
                break;
//                activity =  startActivity(new Intent(this,ScheduleFragment.class));
                        //sta   rtActivity(new Intent(this, LFMainActivity.class));
                //fragment = new ScheduleFragment();
//                Intent intent = new Intent(MainActivity.this,ScheduleFragment.class);
//                startActivity(intent);
            case R.id.navigation_feed:
                fragment = new FeedFragment();
                break;
            case R.id.navigation_infoo:
                fragment = new InfoFragment();
                break;
        }
        return loadFragment(fragment);
        //return false;
    }
}
