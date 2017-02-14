package com.example.gebruiker.multiscreenapps_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weer);


        ArrayList<Evenement> evenementen = new ArrayList<Evenement>();

        evenementen.add(new Evenement("Maandag","80","-10",R.drawable.zon));
        evenementen.add(new Evenement("dinsdag","70","-20",R.drawable.zon));
        evenementen.add(new Evenement("woensdag","60","-30",R.drawable.bewolkt));
        evenementen.add(new Evenement("donderdag","50","-40",R.drawable.regen));
        evenementen.add(new Evenement("vrijdag","40","-50",R.drawable.regen));

        WordAdapter adapter = new WordAdapter(this,evenementen,R.layout.weerlayout);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
