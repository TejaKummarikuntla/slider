package com.teja_kummarikuntla.sliderbottom33.views;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

//import com.teja_kummarikuntla.coffeeevents.MainActivity;
//import com.teja_kummarikuntla.coffeeevents.R;
//import com.teja_kummarikuntla.coffeeevents.data.CustomListviewAdapter;
//import com.teja_kummarikuntla.coffeeevents.model.Event;
import com.teja_kummarikuntla.sliderbottom33.R;
import com.teja_kummarikuntla.sliderbottom33.data.CustomListviewAdapter;
import com.teja_kummarikuntla.sliderbottom33.model.Event;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Day1Fragment extends Fragment {
//private TextView day1TV;
private ArrayList<Event> events = new ArrayList<>();
CustomListviewAdapter adapter;





    public Day1Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View Day1view = inflater.inflate(R.layout.fragment_day1, container, false);

//        TextView textView = Day1view.findViewById(R.id.day1TV);
//        textView.setText("hello I'm done!!!");
        /*ListView listView = Day1view.findViewById(R.id.listID);
        adapter = new CustomListviewAdapter(getActivity(),R.layout.list_row,events);
        listView.setAdapter(adapter);*/


       Event event = new Event();
       Event event1 = new Event();
       Event event2 = new Event();
       Event event3 = new Event();

       String text = getString(R.string.Ses1_intor);
        event.setHeadLiner("Introduction to App Development");
        event.setTime("10.00 AM - 11.00 AM");
        event.setVenue("40Minutes/Understanding");
        event.setWhen("Speaker : Teja ");
        event.setIntro(text);

        //event.setBandImage();

        String text2 = getString(R.string.Ses2_intor);
        event1.setHeadLiner("Understanding the core work of Gradle");
        event1.setTime("11.00 AM - 12.00 PM ");
        event1.setVenue("1 HOUR/HandsOn");
        event1.setWhen("Gaurav");
        event1.setIntro(text2);

        String text3 = getString(R.string.Ses2_intor);

        event2.setHeadLiner("Event1Header2");
        event2.setTime("Event1Time2");
        event2.setVenue("Event1Venue2");
        event2.setWhen("Event1When2");
        event2.setIntro(text3);

        String text4 = getString(R.string.Ses2_intor);

        event3.setHeadLiner("Event1Header2");
        event3.setTime("Event1Time2");
        event3.setVenue("Event1Venue2");
        event3.setWhen("Event1When2");
        event3.setIntro(text4);

        events.add(event);
        events.add(event1);
        events.add(event2);
        events.add(event2);
        events.add(event2);
        events.add(event2);
        events.add(event2);
        events.add(event2);
        events.add(event3);

        ListView listView = Day1view.findViewById(R.id.listID);
        adapter = new CustomListviewAdapter(getActivity(),R.layout.list_row,events);
        listView.setAdapter(adapter);

//        View Day1view = inflater.inflate(R.layout.fragment_day1, container, false);
        return Day1view;
    }


}
