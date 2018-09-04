package com.teja_kummarikuntla.sliderbottom33.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Event implements Serializable{
    private static final long id = 1L;
    //private String title;
    //private String artist;
    private String headLiner;
    private String venue;
    private String time;
    private String when;
    private String intro;
    //private String street;
    //private String postalCode;
    //private String url;
    //private String website;
    //private String venueImage;
    private ImageView bandImage;
    //private String startDate;
    //private String description;
   // private String musicGenre;


    public static long getId() {
        return id;
    }


    public String getHeadLiner() {
        return headLiner;
    }

    public void setHeadLiner(String headLiner) {
        this.headLiner = headLiner;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public ImageView getBandImage() {
        return bandImage;
    }

    public void setBandImage(String bandImage) {
        //this.bandImage = bandImage;


    }


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
