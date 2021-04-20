package com.example.militaryapp;

public class StructData {
    private String structTitle;
    private Integer structImage;

    public StructData(String structName, Integer structImage) {
        this.structTitle = structName;
        this.structImage = structImage;
    }

    public String getStructTitle() {
        return structTitle;
    }

    public void setStructTitle(String structTitle) {
        this.structTitle = structTitle;
    }

    public Integer getStructImage() {
        return structImage;
    }

    public void setStructImage(Integer structImage) {
        this.structImage = structImage;
    }
}
