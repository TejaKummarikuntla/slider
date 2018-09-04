package com.teja_kummarikuntla.sliderbottom33.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//import com.teja_kummarikuntla.coffeeevents.R;
//import com.teja_kummarikuntla.coffeeevents.model.Event;
import com.teja_kummarikuntla.sliderbottom33.R;
import com.teja_kummarikuntla.sliderbottom33.model.Event;

public class EventDetails extends AppCompatActivity {
    private Event event;

    private TextView headliner;
    private ImageView detBandImage;
    private TextView timings;
    private TextView speaker;
    private TextView intro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        event = (Event) getIntent().getSerializableExtra("EventObj");


        headliner = findViewById(R.id.DetHeadlinerID);
        detBandImage = findViewById(R.id.DetbandImgID);
        timings = findViewById(R.id.DetTimingsID);
        speaker = findViewById(R.id.DetSpeakerID);
        intro =  findViewById(R.id.DetIntroID);

        String ses1Text = (String) getString(R.string.Ses1_intor);

        headliner.setText(event.getHeadLiner());
        timings.setText("Timings: "+event.getTime());
        speaker.setText("Speaker: "+event.getWhen());
//        intro.setText(ses1Text);
        intro.setText("Intro: "+event.getIntro());










    }
}
