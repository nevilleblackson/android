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

    public word(String difulttranslation , String miwoktranslation){
        difultWordtranslation = difulttranslation;
        miwokWordtranslation = miwoktranslation;
    }

    public String getmiwok(){
        return  miwokWordtranslation;
    }

    public String getdefult(){
        return  difultWordtranslation;
    }
}
