package com.example.gebruiker.tourguide_project;

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



    public WordAdapter(Activity context, ArrayList<Evenement> androidFlavors) {
        super(context, 0, androidFlavors);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.evenementenlayout, parent, false);
        }

        final Evenement currentAndroidFlavor = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.naam);
        nameTextView.setText(currentAndroidFlavor.getnaam());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.tweedenaam);
        nameTextView2.setText(currentAndroidFlavor.getnaam2());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.tijd);
        numberTextView.setText(currentAndroidFlavor.gettijd());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.afbeelding);
            imageView.setImageResource(currentAndroidFlavor.getafbeelding());


        return listItemView;
    }
}
