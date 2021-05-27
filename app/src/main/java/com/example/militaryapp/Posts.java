package com.example.militaryapp;

public class Posts {
    String img;
    String text;

    public Posts(String img, String text) {
        this.img = img;
        this.text = text;
    }

    Posts() {

    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
