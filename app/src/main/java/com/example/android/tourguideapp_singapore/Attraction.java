package com.example.android.tourguideapp_singapore;

/**
 * Created by ultrajustin22 on 13/2/2017.
 * The Attraction class represents the attraction a user may want to visit.
 * The features include a picture, the name, the description and the location of the attraction!
 */

public class Attraction {

    /** Default name for the Attraction */
    private int mAttractionName;

    /** Description of the Attraction */
    private int mAttractionDescription;

    /** Location of the Attraction */
    private int mAttractionLocation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object.
     *
     * @param attractionName is the name of the attraction
     * @param attractionDescription shows the description of the attraction like the what is special about the attraction
     * @param attractionLocation shows the address of the attraction
     * @param imageResourceID is the resource ID for the image corresponding to the attraction
     */
    public Attraction(int attractionName, int attractionDescription, int attractionLocation, int imageResourceID) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionLocation = attractionLocation;
        mImageResourceId = imageResourceID;
    }

    /**
     * Get the name of the Attraction
     */
    public int getAttractionName() {
        return mAttractionName;
    }
    /**
     * Get the description of the Attraction
     */
    public int getAttractionDescription() {
        return mAttractionDescription;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAttractionLocation() {
        return mAttractionLocation;
    }

}
