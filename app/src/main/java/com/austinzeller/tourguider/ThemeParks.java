package com.austinzeller.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeParks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiences);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.theme_park_one_name), getString(R.string.theme_park_one_address), getString(R.string.theme_park_one_description), R.drawable.theme_park_one_image));
        attractions.add(new Attraction(getString(R.string.theme_park_two_name), getString(R.string.theme_park_two_address), getString(R.string.theme_park_two_description), R.drawable.theme_park_two_image));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AttractionAdapter(this, attractions));
    }
}
