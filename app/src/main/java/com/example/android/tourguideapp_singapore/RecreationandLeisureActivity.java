package com.example.android.tourguideapp_singapore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RecreationandLeisureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreation_and_leisure);

        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.sentosa_name, R.string.sentosa_description, R.string.sentosa_location, R.drawable.sentosa));
        attractions.add(new Attraction(R.string.east_coast_park_name, R.string.east_coast_park_description, R.string.east_coast_park_location, R.drawable.east_coast_park));
        attractions.add(new Attraction(R.string.clarke_quay_name, R.string.clarke_quay_description, R.string.clarke_quay_location, R.drawable.clarke_quay));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_recreation_and_leisure);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }
}
