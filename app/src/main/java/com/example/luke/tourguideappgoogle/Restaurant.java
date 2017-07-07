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

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_final);
        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Restaurant.this, MainActivity.class);
                startActivity(back);
            }
        });
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.res1), getString(R.string.res_info1)));
        places.add(new Place(getString(R.string.res2), getString(R.string.res_info2)));
        places.add(new Place(getString(R.string.res3), getString(R.string.res_info3)));
        places.add(new Place(getString(R.string.res4), getString(R.string.res_info4)));
        places.add(new Place(getString(R.string.res5), getString(R.string.res_info5)));




        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.darkorange);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(adapter);

    }


}


