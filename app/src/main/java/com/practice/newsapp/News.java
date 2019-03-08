package com.practice.newsapp;

import java.io.Serializable;

public class News implements Serializable {

    public int image;
    public String title;
    public String url;

    public News(){


    }

    public News(int image, String title) {
        this.image = image;
        this.title = title;

    }

    public void setUrl(String url){
        this.url = url;
    }
}
