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
    }
}
