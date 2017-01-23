package com.example.gebruiker.project2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int vraagnnummer = 0;
    int punten = 0;
    CharSequence text = "laten we beginnen";
    int spelerantwoord;
    int echteantwoord = 0 ;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
      //  client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    protected void next(View view) {
        if (echteantwoord == spelerantwoord) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            text = "je had het goed";
            punten += 1;
        }
        Button volgende = (Button) findViewById(R.id.volgende);
        volgende.setText("volgende");

        if (vraagnnummer < 11) {
            vraagnnummer += 1;
        }
        TextView ask = (TextView) findViewById(R.id.ask);
        TextView vraagnr = (TextView) findViewById(R.id.vraagnummer);

        vraagnr.setText("vraag: " + vraagnnummer);
        ask.setText(vragenen(vraagnnummer));
    }

    protected String vragenen(int vraagnnummer) {
        String tekst;
        switch (vraagnnummer) {
            case 1:
                echteantwoord = 1;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "A" + "\n" + "\n";
                break;
            case 2:
                echteantwoord = 2;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 2";
                break;
            case 3:
                echteantwoord = 3;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 3";
                break;
            case 4:
                echteantwoord = 4;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 4";
                break;
            case 5:
                echteantwoord = 3;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 5";
                break;
            case 6:
                echteantwoord = 2;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 6";
                break;
            case 7:
                echteantwoord = 1;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 7";
                break;
            case 8:
                echteantwoord = 2;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 8";
                break;
            case 9:
                echteantwoord = 3;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 9";
                break;
            case 10:
                echteantwoord = 2;
                tekst = "blablalbblblablbla  blablalbblblablbla blablalbblblablbla blablalbblblablbla \n" +
                        "  dit is vraag 10";
                break;
            default:
                tekst = "je had " + punten + " vragen goed ";
                break;
        }
        return tekst;
    }

    public void points(View view) {
        switch (view.getId()) {
            case R.id.knopa:
                spelerantwoord = 1;
                break;
            case R.id.knopb:
                spelerantwoord = 2;
                break;
            case R.id.knopc:
                spelerantwoord = 3;
                break;
            case R.id.knopd:
                spelerantwoord = 4;
                break;
            default:
                spelerantwoord = 1;
                break;
        }
    }

    /*
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
*/
}
