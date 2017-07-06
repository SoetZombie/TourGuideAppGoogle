package com.example.luke.tourguideappgoogle;

/**
 * Created by Luke on 5.7.2017.
 */

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private String info;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String info, int mImageResourceId) {
        this.name = name;
        this.info = info;
        this.mImageResourceId = mImageResourceId;
    }

    public Place(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
