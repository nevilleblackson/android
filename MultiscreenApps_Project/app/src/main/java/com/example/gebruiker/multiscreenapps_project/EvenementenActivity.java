package com.example.gebruiker.multiscreenapps_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EvenementenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenementen);

        final ArrayList<Evenement> evenementen = new ArrayList<>();

        evenementen.add(new Evenement("Almere","city run","18 jun 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));
        evenementen.add(new Evenement("Geraldine Walther","The Concertgebouw","9 feb 2017",R.drawable.evenement2,true));
        evenementen.add(new Evenement("Sliegh Bells","Tolhuistuin","14 feb 2017",R.drawable.evenement3,true));
        evenementen.add(new Evenement("Saint Motel","Bitterzoet","15 feb 2017",R.drawable.evenement4,true));

        WordAdapter adapter = new WordAdapter(this,evenementen,R.layout.evenementenlayout);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Evenement evt = evenementen.get(position);
                String url = evt.getUrl();

                if(!(url == null)) {
                    Uri uriUrl = Uri.parse(url);
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
            }
        });
    }
}

