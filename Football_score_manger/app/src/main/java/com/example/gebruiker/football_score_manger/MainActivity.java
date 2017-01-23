package com.example.gebruiker.football_score_manger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int team1points = 0;
    int team2points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementTeam1(View view){
        team1points += 1;

        TextView teampoints = (TextView) findViewById(R.id.thuisnummer);
        teampoints.setText("" + team1points);
    }

    public void decrementTeam1(View view){
        if(!(team1points == 0)){
            team1points -= 1;
        }
        TextView teampoints = (TextView) findViewById(R.id.thuisnummer);
        teampoints.setText("" + team1points);

    }


    public void incrementTeam2(View view){
        team2points += 1;

        TextView teampoints = (TextView) findViewById(R.id.uitnummer);
        teampoints.setText("" + team2points);

    }

    public void decrementTeam2(View view){
        if(!(team2points == 0)) {
            team2points -= 1;
        }
        TextView teampoints = (TextView) findViewById(R.id.uitnummer);
        teampoints.setText("" + team2points);
    }
}
