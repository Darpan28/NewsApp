package com.practice.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
   ListView listView;


    ArrayList<News> newsList;
    NewsAdapter newsAdapter;


    void initView(){
        listView = findViewById(R.id.listItem);


        newsList = new ArrayList<>();


        News news1 = new News(R.drawable.abp,"ABP News");
        News news2 = new News(R.drawable.aajtak,"Aaj Tak");
        News news3 = new News(R.drawable.bbc,"BBC");
        News news4 = new News(R.drawable.cnbc,"CNBC");
        News news5 = new News(R.drawable.cnn,"CNN");
        News news6 = new News(R.drawable.intv,"India Tv");
        News news7 = new News(R.drawable.ndtv,"NDTV");
        News news8 = new News(R.drawable.ptc,"PTC");
        News news9 = new News(R.drawable.zn,"Zee News");

        news1.setUrl("https://www.abplive.in/");
        news2.setUrl("https://aajtak.intoday.in/");
        news3.setUrl("https://www.bbc.com/");
        news4.setUrl("https://www.cnbc.com/world/?region=world");
        news5.setUrl("https://edition.cnn.com/");
        news6.setUrl("https://www.indiatvnews.com/");
        news7.setUrl("https://www.ndtv.com/");
        news8.setUrl("https://www.ptcnews.tv/");
        news9.setUrl("https://zeenews.india.com/");

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);
        newsList.add(news8);
        newsList.add(news9);

        newsAdapter = new NewsAdapter(this,R.layout.list_item,newsList);
        listView.setAdapter(newsAdapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        News news = newsList.get(position);
        Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
        intent.putExtra("keyNews",news);
        startActivity(intent);

    }
}
