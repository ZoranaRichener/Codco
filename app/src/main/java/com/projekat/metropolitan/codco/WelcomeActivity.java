package com.projekat.metropolitan.codco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button Learn ;
    private Button Test;
    private Button AboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Learn = (Button) findViewById(R.id.btn_learn);

        AboutUs = (Button) findViewById(R.id.btn_AboutUs);

        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });

     Learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });


    }
}

