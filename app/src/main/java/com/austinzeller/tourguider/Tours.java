package com.austinzeller.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Tours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_parks);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.tours_one_name), getString(R.string.tours_one_address), getString(R.string.tours_one_description), R.drawable.private_tours_one_image));
        attractions.add(new Attraction(getString(R.string.tours_two_name), getString(R.string.tours_two_address), getString(R.string.tours_two_description), R.drawable.private_tours_one_image));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AttractionAdapter(this, attractions));
    }
}
