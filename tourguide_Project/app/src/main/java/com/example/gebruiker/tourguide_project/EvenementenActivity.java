package com.example.gebruiker.tourguide_project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EvenementenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenementen);

        final ArrayList<Evenement> evenementen = new ArrayList<Evenement>();

        evenementen.add(new Evenement("Almere","city run","18 juni 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));
        evenementen.add(new Evenement("Almere","city run","18 juni 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));
        evenementen.add(new Evenement("Almere","city run","18 juni 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));
        evenementen.add(new Evenement("Almere","city run","18 juni 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));
        evenementen.add(new Evenement("Almere","city run","18 juni 2017",R.drawable.evenement1,"http://www.almerecityrun.com/Evenement/programma-afstanden/"));

        WordAdapter adapter = new WordAdapter(this,evenementen);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Evenement evt = evenementen.get(position);
                String url = evt.getUrl();

                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}

