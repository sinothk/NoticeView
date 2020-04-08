package com.sinothk.widgets.noticeView.marqueeListView.bean;

import java.util.Date;

public class MarqueeListEntity {

    private String id;
    private String name;
    private String date;

    public MarqueeListEntity() {
    }

    public MarqueeListEntity(String name) {
        this.name = name;
    }

    public MarqueeListEntity(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public MarqueeListEntity(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
