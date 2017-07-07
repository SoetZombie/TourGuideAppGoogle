package com.example.luke.tourguideappgoogle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView history = (TextView) findViewById(R.id.history_text_view);
        history.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent history = new Intent(MainActivity.this, History.class);
                startActivity(history);
            }
        });
        TextView fun = (TextView) findViewById(R.id.fun_text_view);
        fun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fun = new Intent(MainActivity.this, Fun.class);
                startActivity(fun);
            }
        });

        TextView relax = (TextView) findViewById(R.id.relax_text_view);
        relax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent relax = new Intent(MainActivity.this, Relax.class);
                startActivity(relax);
            }
        });

        TextView restaurant = (TextView) findViewById(R.id.restaurant_text_view);
        restaurant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent res = new Intent(MainActivity.this, Restaurant.class);
                startActivity(res);
            }
        });
    }
}
