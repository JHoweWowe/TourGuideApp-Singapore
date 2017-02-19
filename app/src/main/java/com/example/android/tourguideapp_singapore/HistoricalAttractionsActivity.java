package com.example.android.tourguideapp_singapore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_attractions);

        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.asian_civilisations_museum_name, R.string.asian_civilisations_museum_description, R.string.asian_civilisations_museum_location, R.drawable.asian_civilisations_museum));
        attractions.add(new Attraction(R.string.bukit_chandu_name, R.string.bukit_chandu_description, R.string.bukit_chandu_location, R.drawable.bukit_chandu));
        attractions.add(new Attraction(R.string.national_museum_singapore_name, R.string.national_museum_singapore_description, R.string.national_museum_singapore_location, R.drawable.national_museum_singapore));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_historical_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }
}
