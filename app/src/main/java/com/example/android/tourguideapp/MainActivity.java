package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the food category
        TextView city = (TextView) findViewById(R.id.cities);

        // Set a click listener on that View
        city.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link City}
                Intent cityIntent = new Intent(MainActivity.this, CitiesActivity.class);

                // Start the new activity
                startActivity(cityIntent);
            }
        });

        // Find the View that shows the food category
        TextView monuments = (TextView) findViewById(R.id.monuments);

        // Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Monuments}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
            }
        });

    }
}
