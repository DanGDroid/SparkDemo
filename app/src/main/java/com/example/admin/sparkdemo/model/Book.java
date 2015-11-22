package com.example.admin.sparkdemo.model;

/**
 * Created by Admin on 11/22/2015.
 */
public class Book {

    private String thumbNail;
    private String title;

    public Book(String thumbNail, String title) {
        this.thumbNail = thumbNail;
        this.title = title;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
