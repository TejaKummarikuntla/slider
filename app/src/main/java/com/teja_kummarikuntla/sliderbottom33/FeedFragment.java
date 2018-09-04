package com.teja_kummarikuntla.sliderbottom33;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeedFragment extends Fragment {
    String[] titles={"Death of The stve","Through the tech","How to make a Jet Engine","Are we Real?"};
    String[] details={"details 1","details 3","details 3","details 4"};
    int[] icon={R.drawable.steve,R.drawable.steve,R.drawable.steve,R.drawable.steve};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_feed,container,false);

        RecyclerView rv= (RecyclerView) rootView.findViewById(R.id.mRecyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        MyAdapter adapter=new MyAdapter(this.getActivity(),titles,details,icon);
        rv.setAdapter(adapter);

        return rootView;
    }
}
