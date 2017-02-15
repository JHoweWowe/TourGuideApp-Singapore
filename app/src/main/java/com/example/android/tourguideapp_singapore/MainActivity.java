package com.example.android.tourguideapp_singapore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Food Specialities category
        TextView foodSpecialities = (TextView) findViewById(R.id.category_food_specialities);

        // Set a click listener on that View
        foodSpecialities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent foodSpecialitiesIntent = new Intent(MainActivity.this, FoodSpecialitiesActivity.class);

                // Start the new activity
                startActivity(foodSpecialitiesIntent);
            }
        });

        // Find the View that shows the Nature & Wildlife category
        TextView natureAndWildlife = (TextView) findViewById(R.id.category_nature_and_wildlife);

        // Set a click listener on that View
        natureAndWildlife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent natureAndWildlife = new Intent(MainActivity.this, NatureAndWildlifeActivity.class);

                // Start the new activity
                startActivity(natureAndWildlife);
            }
        });

        // Find the View that shows the Recreation & Leisure category
        TextView recreationAndLeisure = (TextView) findViewById(R.id.category_recreation_and_leisure);

        // Set a click listener on that View
        recreationAndLeisure.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent recreationAndLeisureIntent = new Intent(MainActivity.this, RecreationandLeisureActivity.class);

                // Start the new activity
                startActivity(recreationAndLeisureIntent);
            }
        });

        // Find the View that shows the Shopping Centres category
        TextView shoppingCentres = (TextView) findViewById(R.id.category_shopping_centres);

        // Set a click listener on that View
        shoppingCentres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent shoppingCentresIntent = new Intent(MainActivity.this, ShoppingCentresActivity.class);

                // Start the new activity
                startActivity(shoppingCentresIntent);
            }
        });

        //Find the View that shows the Historical Attractions category
        TextView historicalAttractions = (TextView) findViewById(R.id.category_historical_attractions);

        //Set a click listener on that View
        historicalAttractions.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent historicalAttractionsIntent = new Intent(MainActivity.this, HistoricalAttractionsActivity.class);

                // Start the new activity
                startActivity(historicalAttractionsIntent);
            }
        });
    }
}
