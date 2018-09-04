package com.teja_kummarikuntla.sliderbottom33.infoFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.teja_kummarikuntla.sliderbottom33.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.media.CamcorderProfile.get;


public class infoTravelFragment extends Fragment {

    private ExpandableListView expandableListView;
    private ExpandableListAdapter expandableListAdapter;
    private List<String> listDataHeader;
    private HashMap<String ,List<String>> listHashMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View infoEventInflater = inflater.inflate(R.layout.fragment_info_travel,container,false);
        TextView textView = infoEventInflater.findViewById(R.id.tvInfoTravelID);
        textView.setText("This is Travel fragment");



        expandableListView = (ExpandableListView)infoEventInflater.findViewById(R.id.lvExp);
        initData();
        expandableListAdapter = new InfoExpandableListAdapter(this,listDataHeader,listHashMap);
        expandableListView.setAdapter(expandableListAdapter);



        return infoEventInflater;
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Driving Directions");
        listDataHeader.add("Shuttle serviee");
        listDataHeader.add("Public Transportaion");
        listDataHeader.add("Bike Riding");
        listDataHeader.add("Ride Sharing");
        listDataHeader.add("Parking & Carpooling");

        List<String> Driving = new ArrayList<>();
        Driving.add("This is expandable list");

        List<String> Shuttle = new ArrayList<>();
        Shuttle.add("Expandable list Public Public Public Public Public Public PublicPublicPublicPublicPublicPublicPublicPublic");
        Shuttle.add("Expandable1 list");
        Shuttle.add("Expandable2 list");
        Shuttle.add("Expandable3 list");
        Shuttle.add("Expandable4 list");
        Shuttle.add("Expandable5 list");
        Shuttle.add("Expandable6 list");


        List<String> Public  = new ArrayList<>();
        Public .add("Expandable list");
        Public .add("Expandable1 list");
        Public .add("Expandable2 list");
        Public .add("Expandable3 list");
        Public .add("Expandable4 list");
        Public .add("Expandable5 list");
        Public .add("Expandable6 list");



        List<String> Ride = new ArrayList<>();
        Ride.add("Expandable list");
        Ride.add("Expandable1 list");
        Ride.add("Expandable2 list");
        Ride.add("Expandable3 list");
        Ride.add("Expandable4 list");
        Ride.add("Expandable5 list");
        Ride.add("Expandable6 list");


        List<String> sharing = new ArrayList<>();
        sharing.add("Expandable list");
        sharing.add("Expandable1 list");
        sharing.add("Expandable2 list");
        sharing.add("Expandable3 list");
        sharing.add("Expandable4 list");
        sharing.add("Expandable5 list");
        sharing.add("Expandable6 list");



        List<String> parking = new ArrayList<>();
        parking.add("Expandable list");
        parking.add("Expandable1 list");
        parking.add("Expandable2 list");
        parking.add("Expandable3 list");
        parking.add("Expandable4 list");
        parking.add("Expandable5 list");
        parking.add("Expandable6 list");



        listHashMap.put(listDataHeader.get(0), Driving);
        listHashMap.put(listDataHeader.get(1), Shuttle);
        listHashMap.put(listDataHeader.get(2), Public);
        listHashMap.put(listDataHeader.get(3), Ride);
        listHashMap.put(listDataHeader.get(4), sharing);
        listHashMap.put(listDataHeader.get(5), parking);




    }
}
