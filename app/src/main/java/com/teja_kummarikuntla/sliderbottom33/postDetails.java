package com.teja_kummarikuntla.sliderbottom33;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;


public class postDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);
        getIncomingIntent();
    }

    private void getIncomingIntent() {


            String imageUrl = getIntent().getStringExtra("image_url");
            String title = getIntent().getStringExtra("title");
            String des = getIntent().getStringExtra("des");

            setImage(imageUrl,title,des);

    }


    private void setImage(String imageUrl, String imageName,String des) {

        TextView name = findViewById(R.id.title);
        TextView desa = findViewById(R.id.dec);
        name.setText(imageName);
        desa.setText(des +imageUrl);
        ImageView image = findViewById(R.id.image);
        int in = Integer.valueOf(imageUrl);
        image.setImageResource(in);


    }

    }



