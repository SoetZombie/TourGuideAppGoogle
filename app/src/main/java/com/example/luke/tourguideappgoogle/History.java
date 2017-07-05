package com.example.luke.tourguideappgoogle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Luke on 5.7.2017.
 */

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_final);

        //Create an arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.history1), getString(R.string.history_info1), R.mipmap.monument1));
        places.add(new Place(getString(R.string.history2), getString(R.string.history_info2), R.mipmap.monument2));
        places.add(new Place(getString(R.string.history3), getString(R.string.history_info3), R.mipmap.monument3));
        places.add(new Place(getString(R.string.history4), getString(R.string.history_info4), R.mipmap.monument4));
        places.add(new Place(getString(R.string.history5), getString(R.string.history_info5), R.mipmap.monument5));
        places.add(new Place(getString(R.string.history6), getString(R.string.history_info6), R.mipmap.monument6));
        places.add(new Place(getString(R.string.history7), getString(R.string.history_info7), R.mipmap.monument7));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.green);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(adapter);
    }
}