package com.austinzeller.tourguider;


class Attraction {
    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId;

    Attraction(String name, String address, String description, int imageResourceId) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    String getAddress() {
        return mAddress;
    }

    String getDescription() {
        return mDescription;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }
}
