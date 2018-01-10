package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTransltation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
