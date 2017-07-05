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

        TextView toeat = (TextView) findViewById(R.id.history_text_view);
        // Set a clickListener on that View
        toeat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link WhereToEatActivity}
                Intent history = new Intent(MainActivity.this, History.class);
                //Start the new activity
                startActivity(history);
            }
        });
    }
}
