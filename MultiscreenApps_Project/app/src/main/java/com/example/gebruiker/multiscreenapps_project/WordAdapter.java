package com.example.gebruiker.multiscreenapps_project;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Gebruiker on 8-2-2017.
 */

public class WordAdapter extends ArrayAdapter<Evenement>{

    private int thelayout;


    public WordAdapter(Activity context, ArrayList<Evenement> androidFlavors,int layout) {
        super(context, 0, androidFlavors);
        thelayout = layout;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    thelayout, parent, false);
        }

        final Evenement currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.naam);
        nameTextView.setText(currentItem.getnaam());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.tweedenaam);
        nameTextView2.setText(currentItem.getnaam2());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.tijd);
        if(!(numberTextView == null)) {
            numberTextView.setText(currentItem.text3());
        }
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.afbeelding);
        imageView.setImageResource(currentItem.getafbeelding());


        return listItemView;
    }
}
