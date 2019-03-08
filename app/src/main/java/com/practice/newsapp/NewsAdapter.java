package com.practice.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    Context context;
    int resource;
    ArrayList<News> objects;



    public NewsAdapter(Context context, int resource, ArrayList<News> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView txtTitle = view.findViewById(R.id.textViewTitle);
        //TextView txturl = view.findViewById(R.id.textViewUrl);

        News news = objects.get(position);
        imageView.setBackgroundResource(news.image);
        txtTitle.setText(news.title);
       // txturl.setText(news.url);
        return view;
    }
}
