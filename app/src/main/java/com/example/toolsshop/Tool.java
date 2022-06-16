package com.example.toolsshop;

import androidx.annotation.NonNull;

public class Tool {

    private final String title;
    private final String info;
    private final int imageResourceId;

    public Tool(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public Tool(Drill drill) {
        this.title = drill.getTitle();
        this.info = drill.getInfo();
        this.imageResourceId = drill.getImageResourceId();
    }

    public Tool(Perforator perforator) {
        this.title = perforator.getTitle();
        this.info = perforator.getInfo();
        this.imageResourceId = perforator.getImageResourceId();
    }

    public Tool(GrinderTool grinderTool) {
        this.title = grinderTool.getTitle();
        this.info = grinderTool.getInfo();
        this.imageResourceId = grinderTool.getImageResourceId();
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
