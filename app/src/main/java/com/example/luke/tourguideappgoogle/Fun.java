package com.example.luke.tourguideappgoogle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Luke on 6.7.2017.
 */

public class Fun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_final);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.history1), getString(R.string.history_info1), R.mipmap.monument1));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.green);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(adapter);
    }
    }

