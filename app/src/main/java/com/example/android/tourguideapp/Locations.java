package com.example.android.tourguideapp;

/**
 * Created by mpombos on 30/6/16.
 */
public class Locations {

    //Name of Location
    private String mName;

    //Description of Location
    private int mDescription;

    // Image resource ID for the word
    private int mImageResourceId;

    /**
     * Create a new Location object.
     *
     * @param name is the location title
     * @param description is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Locations(String name, int description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the location
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the string value in the TextView.
     */
    public int getDescription() { return mDescription; }

    /**
     * Get the resource image ID
     */
    public int getImageResourceId() { return mImageResourceId; }

}

