package com.austinzeller.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView adventures = (TextView) findViewById(R.id.adventures);
        adventures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Experiences.class);
                startActivity(intent);
            }
        });

        TextView foodAndDrink = (TextView) findViewById(R.id.food_and_drink);
        foodAndDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FoodAndDrink.class);
                startActivity(intent);
            }
        });

        TextView privateTours = (TextView) findViewById(R.id.private_tours);
        privateTours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tours.class);
                startActivity(intent);
            }
        });

        TextView themeParks = (TextView) findViewById(R.id.theme_parks);
        themeParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThemeParks.class);
                startActivity(intent);
            }
        });
    }
}
