package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mpombos on 30/6/16.
 */
public class RentACarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        // Create a list of locations
        final ArrayList<Locations> locations = new ArrayList<>();
        locations.add(new Locations("Montevideo", R.string.montevideo_description));
        locations.add(new Locations("Salto", R.string.salto_description));
        locations.add(new Locations("Rivera", R.string.rivera_description));
        locations.add(new Locations("Mercedes", R.string.mercedes_description));
        locations.add(new Locations("Colonia", R.string.colonia_description));

        //Create AdapterView adapter with this activity as the context, and the arrayList of Locations
        LocationsAdapter adapter = new LocationsAdapter(this, locations);

        //Create ListView listView
        ListView listView = (ListView) findViewById(R.id.list);

        //set the AdapterView to the newly created listView
        listView.setAdapter(adapter);
    }
}
