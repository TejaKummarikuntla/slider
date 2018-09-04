package com.teja_kummarikuntla.sliderbottom33;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context c;
    String[] movies;
    String[] details;
    int[] icon;

    public MyAdapter(Context c, String[] titles, String[] details, int[] icon) {
        this.c = c;
        this.movies = titles;
        this.icon = icon;
        this.details = details;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item_list_view, parent, false);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.titletxtv.setText(movies[position]);
        holder.detailstxtv.setText(details[position]);
        holder.iconv.setImageResource(icon[position]);


    }

    @Override
    public int getItemCount() {
        return movies.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener
        {

            TextView titletxtv;
            ImageView iconv;

            TextView detailstxtv;

        public MyHolder(View itemView) {
            super(itemView);

            titletxtv = (TextView) itemView.findViewById(R.id.titleTextView);

            detailstxtv = (TextView) itemView.findViewById(R.id.detailsTextView);
            iconv = (ImageView) itemView.findViewById(R.id.postImageView);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }


            @Override
            public void onClick (View v){
            String imgurl= String.valueOf(icon[getPosition()]);
                Intent intent = new Intent(c, postDetails.class);
                intent.putExtra("image_url", imgurl);
                intent.putExtra("title",movies[getPosition()]);
                intent.putExtra("des",details[getPosition()]);
                c.startActivity(intent);


            }


    };
}