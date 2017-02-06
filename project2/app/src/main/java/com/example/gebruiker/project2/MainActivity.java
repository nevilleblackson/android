package com.example.gebruiker.project2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

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
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
                tekst = "1 + 1 \n\n" + "A: 2\n" + "B: 3\n" + "C: 999\n" + "C: 42";
                break;
            case 2:
                echteantwoord = 2;
                tekst = "1 * 1 \n\n" + "A: 2\n" + "B: 1\n" + "C: 42\n" + "C: 9";
                break;
            case 3:
                echteantwoord = 3;
                tekst = "1 : 1 \n\n" + "A: 20\n" + "B: 1\n" + "C: 0\n" + "C: 412";
                break;
            case 4:
                echteantwoord = 4;
                tekst = "1 + 2 \n\n" + "A: 412\n" + "B: 23\n" + "C: 999\n" + "C: 3";
                break;
            case 5:
                echteantwoord = 3;
                tekst = "1 + 5 \n\n" + "A: 234\n" + "B: 12\n" + "C: 6\n" + "C: 42";
                break;
            case 6:
                echteantwoord = 2;
                tekst = "1 + 9 \n\n" + "A: 134\n" + "B: 10\n" + "C: 5\n" + "C: 424242";
                break;
            case 7:
                echteantwoord = 1;
                tekst = "1 + 25 \n\n" + "A: 26\n" + "B: 59\n" + "C: 95\n" + "C: 62";
                break;
            case 8:
                echteantwoord = 2;
                tekst = "1 + 1 + 1  \n\n" + "A: 33\n" + "B: 3\n" + "C: 546\n" + "C: 42";
                break;
            case 9:
                echteantwoord = 3;
                tekst = "1 + 1 - 2 \n\n" + "A: 3\n" + "B: 1\n" + "C: 0\n" + "C: 2";
                break;
            case 10:
                echteantwoord = 4;
                tekst = "(5*17 (98 * 105) + 16 - 39 (39² - 999999) +200000) ÷ 1 + 42  \n" + "A: 2\n" + "B: 3\n" + "C: 999\n" + "C: 42";
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

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
