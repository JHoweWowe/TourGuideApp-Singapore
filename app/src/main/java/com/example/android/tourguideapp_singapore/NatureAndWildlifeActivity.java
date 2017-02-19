package com.example.android.tourguideapp_singapore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureAndWildlifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_and_wildlife);

        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.gardens_by_the_bay_name, R.string.gardens_by_the_bay_description, R.string.chicken_rice_description, R.drawable.gardens_by_the_bay));
        attractions.add(new Attraction(R.string.st_john_island_name, R.string.st_john_island_description, R.string.st_john_island_location, R.drawable.st_john_island));
        attractions.add(new Attraction(R.string.pulau_ubin_name, R.string.pulau_ubin_description, R.string.pulau_ubin_location, R.drawable.pulau_ubin));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_nature_and_wildlife);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }
}
