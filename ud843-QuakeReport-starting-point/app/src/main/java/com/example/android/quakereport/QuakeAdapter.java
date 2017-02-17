package com.example.android.quakereport;

import android.app.Activity;
import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.attr.popupAnimationStyle;

/**
 * Created by Gebruiker on 16-2-2017.
 */

public class QuakeAdapter extends ArrayAdapter<Earthquake>{


    public QuakeAdapter(Activity context, ArrayList<Earthquake> quake) {
        super(context, 0, quake);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquakelayout, parent, false);
        }

        final Earthquake currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.mag);
        nameTextView.setText(currentItem.getMag());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.date);
        nameTextView2.setText(currentItem.getTime());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place);
            numberTextView.setText(currentItem.getPlace());


        return listItemView;
    }
}
