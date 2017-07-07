package com.example.luke.tourguideappgoogle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Luke on 6.7.2017.
 */

public class Relax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_final);
        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Relax.this, MainActivity.class);
                startActivity(back);
            }
        });
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.rex1), getString(R.string.rex_info1)));
        places.add(new Place(getString(R.string.rex2), getString(R.string.rex_info2)));
        places.add(new Place(getString(R.string.rex3), getString(R.string.rex_info3)));
        places.add(new Place(getString(R.string.rex4), getString(R.string.rex_info4)));
        places.add(new Place(getString(R.string.rex5), getString(R.string.rex_info5)));
        places.add(new Place(getString(R.string.rex6), getString(R.string.rex_info6)));
        places.add(new Place(getString(R.string.rex7), getString(R.string.rex_info7)));




        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.red);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(adapter);

    }


}


