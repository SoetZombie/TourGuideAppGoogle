package com.example.luke.tourguideappgoogle;

/**
 * Created by Luke on 5.7.2017.
 */

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String mName, String mInfo, int mImageResourceId) {
        this.mName = mName;
        this.mInfo = mInfo;
        this.mImageResourceId = mImageResourceId;
    }

    public Place(String mName, String mInfo) {
        this.mName = mName;
        this.mInfo = mInfo;
    }







    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
