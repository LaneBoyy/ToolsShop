package com.example.toolsshop;

import androidx.annotation.NonNull;

public class GrinderTool {

    private final String title;
    private final String info;
    private final int imageResourceId;

    public GrinderTool(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
