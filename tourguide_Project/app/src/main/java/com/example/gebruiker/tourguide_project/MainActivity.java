package com.example.gebruiker.tourguide_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView winkels = (TextView) findViewById(R.id.winkels);
        winkels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent winkelintent = new Intent(MainActivity.this,WinkelActivity.class);
                startActivity(winkelintent);
            }
        });

        TextView evenementen = (TextView) findViewById(R.id.evenementen);
        evenementen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent evenementenintent = new Intent(MainActivity.this,EvenementenActivity.class);
                startActivity(evenementenintent);
            }
        });

        TextView stad = (TextView) findViewById(R.id.stad);
        stad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stadintent = new Intent(MainActivity.this,StadActivity.class);
                startActivity(stadintent);
            }
        });

        TextView lidl = (TextView) findViewById(R.id.lidl);
        lidl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lidlintent = new Intent(MainActivity.this,WinkelActivity.class);
                startActivity(lidlintent);
            }
        });

    }
}
