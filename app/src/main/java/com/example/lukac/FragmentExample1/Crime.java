package com.example.lukac.FragmentExample1;

import java.util.UUID;

/**
 * Created by lukac on 12/11/2017.
 */

public class Crime {

    protected UUID mId;

    protected String mTitle;

    protected boolean mSolved = false;

    public void Crime() {
        this.mId = UUID.randomUUID();
    }



    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }







}
