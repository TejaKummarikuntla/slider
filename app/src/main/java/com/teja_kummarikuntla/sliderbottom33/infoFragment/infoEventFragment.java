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
import android.widget.TextView;

import com.teja_kummarikuntla.sliderbottom33.R;


public class infoEventFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View infoEventInflater = inflater.inflate(R.layout.fragment_info_event,container,false);
        TextView textView = infoEventInflater.findViewById(R.id.tvInfoEvFragID);
        textView.setText("This is Event fragment");


        return infoEventInflater;
    }
}
