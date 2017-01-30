package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    private TextView quantityTextView;
    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String message = "Item count " + quantity + " for a €" + price + " total.";
        displayMessage(message);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity--;
        display(quantity);
    }

    /**
     * This method display the given quantity value on the screen.
     */
    public void display(int number) {
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method display the given price on the screen.
     */
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
