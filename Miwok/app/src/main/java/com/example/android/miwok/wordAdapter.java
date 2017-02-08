package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.onClick;
import static com.example.android.miwok.R.raw.color_black;


/**
 * Created by Gebruiker on 6-2-2017.
 */

public class wordAdapter extends ArrayAdapter<word>  {

    private int background;
    private MediaPlayer sound;

    public wordAdapter(Activity context, ArrayList<word> androidFlavors,int backgroundcolor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
        background = backgroundcolor;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getdefult());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.eng);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getmiwok());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        if(currentAndroidFlavor.hasImage()) {
            imageView.setImageResource(currentAndroidFlavor.getResourceId());
        }else{
            imageView.setVisibility(View.GONE);
        }

        LinearLayout list = (LinearLayout) listItemView.findViewById(R.id.list_item_Id);

        int color = ContextCompat.getColor(getContext(),background);

        list.setBackgroundColor(color);

//        sound = MediaPlayer.create(this, R.raw.color_black);
//
//        list.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sound.start();
//            }
//        });

        return listItemView;
    }
}
