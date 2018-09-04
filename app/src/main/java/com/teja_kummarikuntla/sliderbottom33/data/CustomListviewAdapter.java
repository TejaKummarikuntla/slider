package com.teja_kummarikuntla.sliderbottom33.data;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//import com.teja_kummarikuntla.coffeeevents.R;
//import com.teja_kummarikuntla.coffeeevents.model.Event;
//import com.teja_kummarikuntla.coffeeevents.views.EventDetails;
import com.teja_kummarikuntla.sliderbottom33.R;
import com.teja_kummarikuntla.sliderbottom33.model.Event;
import com.teja_kummarikuntla.sliderbottom33.views.EventDetails;

import java.util.ArrayList;

public class CustomListviewAdapter extends ArrayAdapter<Event>{

    private LayoutInflater inflater;
    private ArrayList<Event> data;
    private Activity mContext;
    private int layoutResourceID;

    public CustomListviewAdapter(Activity context, int resource, @NonNull ArrayList<Event> objs) {
        super(context, resource, objs);
        data = objs;
        mContext = context;
        layoutResourceID = resource;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Nullable
    @Override
    public Event getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable Event item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        ViewHolder viewHolder = null;

        if (row == null || viewHolder==null) {
            inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(layoutResourceID, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.bandImage = (ImageView) row.findViewById(R.id.bandImgID);
            viewHolder.headliner = row.findViewById(R.id.headlinerTVID);
            viewHolder.venue = row.findViewById(R.id.venueTVID);
            viewHolder.time = row.findViewById(R.id.timeTVID);
            viewHolder.when = row.findViewById(R.id.whenTVID);

        } else {
            viewHolder = (ViewHolder) row.getTag();
        }

        viewHolder.event = data.get(position);

        //Now we can display data

        //int id = viewHolder.bandImage.getResources().getIdentifier("com.teja_kummarikuntla.coffeeevents:drawable/" +, null, null);
        int di = R.drawable.coffeedrink;
        //.setImageDrawable(getResources().getDrawable(R.drawable.my_drawable));

        viewHolder.bandImage.setImageResource(di);
        viewHolder.headliner.setText("Title : "+viewHolder.event.getHeadLiner());
        viewHolder.venue.setText(viewHolder.event.getVenue());
        viewHolder.time.setText("Timings : "+viewHolder.event.getTime());
        viewHolder.when.setText(viewHolder.event.getWhen());
        //viewHolder.bandImage.setImageDrawable(Drawable.\\);


        final ViewHolder finalViewHolder = viewHolder;
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, EventDetails.class);
                Bundle mBundle = new Bundle();
                mBundle.putSerializable("EventObj", finalViewHolder.event);
                i.putExtras(mBundle);
                mContext.startActivity(i);

            }
        });

        return row;
    }


    public class ViewHolder {

        Event event;
        TextView headliner;
        TextView time;
        TextView venue;
        TextView when;
        ImageView bandImage;
    }
}
