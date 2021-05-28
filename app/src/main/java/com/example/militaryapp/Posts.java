package com.example.militaryapp;

import java.util.Comparator;

public class Posts {
    String img;
    String text;
    Integer like;
    String date;
    String id;
    public static Comparator<Posts> PostsLikeUp = new Comparator<Posts>() {
        @Override
        public int compare(Posts p1, Posts p2) {
            return p1.getLike() - p2.getLike();
        }
    };
    public static Comparator<Posts> PostsLikeDown = new Comparator<Posts>() {
        @Override
        public int compare(Posts p1, Posts p2) {
            return p2.getLike() - p1.getLike();
        }
    };
    public static Comparator<Posts> PostsDateNew = new Comparator<Posts>() {
        @Override
        public int compare(Posts p1, Posts p2) {
            return p2.getId().compareTo(p1.getId());
        }
    };
    public static Comparator<Posts> PostsDateOld = new Comparator<Posts>() {
        @Override
        public int compare(Posts p1, Posts p2) {
            return p1.getId().compareTo(p2.getId());
        }
    };

    public Posts(Integer like, String date, String img, String text, String id) {
        this.like = like;
        this.date = date;
        this.img = img;
        this.text = text;
        this.id = id;
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

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    Posts() {
    }
}
