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

public class Fun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_final);
        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Fun.this, MainActivity.class);
                startActivity(back);
            }
        });
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.fun1), getString(R.string.fun_info1), R.mipmap.fun1));
        places.add(new Place(getString(R.string.fun2), getString(R.string.fun_info2), R.mipmap.fun2));
        places.add(new Place(getString(R.string.fun3), getString(R.string.fun_info3), R.mipmap.fun3));
        places.add(new Place(getString(R.string.fun4), getString(R.string.fun_info4), R.mipmap.fun4));
        places.add(new Place(getString(R.string.fun5), getString(R.string.fun_info5), R.mipmap.fun5));
        places.add(new Place(getString(R.string.fun6), getString(R.string.fun_info6), R.mipmap.fun6));
        places.add(new Place(getString(R.string.fun7), getString(R.string.fun_info7), R.mipmap.fun7));




        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.blue);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(adapter);

    }


    }


