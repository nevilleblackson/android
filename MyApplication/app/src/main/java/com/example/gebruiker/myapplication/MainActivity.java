package com.example.gebruiker.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    private int ordert = 0;
    private int orderprice = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        CheckBox wippedCreamCheckBox = (CheckBox) findViewById(R.id.wipped_cream_checkBox);
        boolean hasCream = wippedCreamCheckBox.isChecked();

        CheckBox ChocolateCheckBox = (CheckBox) findViewById(R.id.Chocolate);
        boolean hasChocolate = wippedCreamCheckBox.isChecked();


        EditText NameText = (EditText) findViewById(R.id.name_field);
        String textname = NameText.getText().toString();

        String message = "name: " +textname;
        message += "\nQuantity: " + ordert;
        message += "\nadd wipped cream : " + hasCream;
        message += "\nadd Chocolate : " + hasChocolate;
        message += "\nPrice €" + ordert * orderprice;


        displayMessage(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view) {
        ordert += 1;
        display(ordert);
    }

    public void decrement(View view) {
        ordert -= 1;
        display(ordert);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}