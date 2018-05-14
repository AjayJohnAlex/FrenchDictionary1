package com.example.ajay.frenchdictionary;

public class word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** french translation for the word */
    private String mFrenchTranslation;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;

    }



    public word(String defaultTranslation, String frenchTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the french translation of the word.
     */
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
