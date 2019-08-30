package com.example.pwpb_recyclerviewgmail;

public class Content {
    private String name, title, description, clock;
    private int img;


    public Content(String name, String title, String description, String clock, int img) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.clock = clock;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
