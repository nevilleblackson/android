package com.example.gebruiker.multiscreenapps_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WinkelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winkel);

        ArrayList<Evenement> evenementen = new ArrayList<>();

        evenementen.add(new Evenement("Deen","etage Foodpassage",R.drawable.deen));
        evenementen.add(new Evenement("De niewe bibliotheek","Etage Stadhuisplein 101",R.drawable.bibliotheek ));
        evenementen.add(new Evenement("Icenter","Etage De Diagonaal 193",R.drawable.icenter));
        evenementen.add(new Evenement("intertoys","Etage Forum 9",R.drawable.intertoys));
        evenementen.add(new Evenement("tmobile","Etage Traverse 3",R.drawable.tmobile));
        evenementen.add(new Evenement("etos","Etage De Diagonaal",R.drawable.etos));
        evenementen.add(new Evenement("Deen","etage Foodpassage",R.drawable.deen));
        evenementen.add(new Evenement("De niewe bibliotheek","Etage Stadhuisplein 101",R.drawable.bibliotheek ));
        evenementen.add(new Evenement("Icenter","Etage De Diagonaal 193",R.drawable.icenter));
        evenementen.add(new Evenement("intertoys","Etage Forum 9",R.drawable.intertoys));
        evenementen.add(new Evenement("tmobile","Etage Traverse 3",R.drawable.tmobile));
        evenementen.add(new Evenement("etos","Etage De Diagonaal",R.drawable.etos));
        evenementen.add(new Evenement("Deen","etage Foodpassage",R.drawable.deen));
        evenementen.add(new Evenement("De niewe bibliotheek","Etage Stadhuisplein 101",R.drawable.bibliotheek ));
        evenementen.add(new Evenement("Icenter","Etage De Diagonaal 193",R.drawable.icenter));
        evenementen.add(new Evenement("intertoys","Etage Forum 9",R.drawable.intertoys));
        evenementen.add(new Evenement("tmobile","Etage Traverse 3",R.drawable.tmobile));
        evenementen.add(new Evenement("etos","Etage De Diagonaal",R.drawable.etos));

        WordAdapter adapter = new WordAdapter(this,evenementen,R.layout.winkelslayout);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
