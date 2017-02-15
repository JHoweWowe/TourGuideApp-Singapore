package com.example.android.tourguideapp_singapore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodSpecialitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_specialities);

        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Chicken Rice", "Originated from Hainan, this lushious dish quickly became popular worldwide", "Location found: Tian Tian Chicken Rice", R.drawable.chicken_rice));
        attractions.add(new Attraction("Chinese Carrot Cake", "This isn't the Western-style dessert you might be seeking for", "Location found: Seng Heng Carrot Cake", R.drawable.chinese_carrot_cake));
        attractions.add(new Attraction("Laksa", "Loved by many locals and foreigners", "Location found: 328 Katong Laksa", R.drawable.laksa));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_food_specialities);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }
}
