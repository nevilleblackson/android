package com.example.android.miwok;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;
import android.widget.TextView;

/**
 * Created by Gebruiker on 1-2-2017.
 */

public class word {

    private String miwokWordtranslation;
    private String difultWordtranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String difulttranslation , String miwoktranslation){
        difultWordtranslation = difulttranslation;
        miwokWordtranslation = miwoktranslation;
    }


    public word(String difulttranslation , String miwoktranslation , int imgeId){
        difultWordtranslation = difulttranslation;
        miwokWordtranslation = miwoktranslation;
        mImageResourceId = imgeId;
    }

    public String getmiwok(){
        return  miwokWordtranslation;
    }

    public String getdefult(){
        return  difultWordtranslation;
    }

    public int getResourceId(){
        return  mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}