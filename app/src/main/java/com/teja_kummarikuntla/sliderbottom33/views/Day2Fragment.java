package com.teja_kummarikuntla.sliderbottom33.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
public class Day2Fragment extends Fragment {
    private ArrayList<Event> events = new ArrayList<>();
    CustomListviewAdapter adapter;


    public Day2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View Day2view = inflater.inflate(R.layout.fragment_day2, container, false);

        Event event = new Event();

        event.setHeadLiner("Introduction to App Development");
        event.setTime("10.00 AM - 11.00 AM");
        event.setVenue("40Minutes/Understanding");
        event.setWhen("Speaker : Gaurav --The all rounder");

        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);
        events.add(event);


        ListView listView = Day2view.findViewById(R.id.listDAy2ID);
        adapter = new CustomListviewAdapter(getActivity(),R.layout.list_row,events);
        listView.setAdapter(adapter);

        return Day2view;
    }

}
