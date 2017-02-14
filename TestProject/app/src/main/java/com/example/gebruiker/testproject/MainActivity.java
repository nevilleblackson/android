package com.example.gebruiker.testproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sound = MediaPlayer.create(this, R.raw.musicmix);
        Button playbutton = (Button) findViewById(R.id.button);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                sound.start();
            }
        });



        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
	   /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }

	   /* Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);

	   /* ArrayList after sorting*/
        System.out.println("After Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }
    }
}