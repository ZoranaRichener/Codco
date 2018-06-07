package com.projekat.metropolitan.codco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

    private Button JAVA;
    private Button SQL;
    private Button PHP;
    private Button HTML;
    private Button CSS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        JAVA = (Button) findViewById(R.id.btnJava);
        SQL = (Button) findViewById(R.id.btnSql);
        PHP = (Button) findViewById(R.id.btnPhp);
        HTML = (Button) findViewById(R.id.btnHtml);
        CSS = (Button) findViewById(R.id.btnCss);

        JAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnJavaActivity.class);
                startActivity(intent);
            }
        });

        SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnSQLActivity.class);
                startActivity(intent);
            }
        });

        PHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnPHPActivity.class);
                startActivity(intent);
            }
        });

        HTML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnHTMLActivity.class);
                startActivity(intent);
            }
        });

        CSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnCSSActivity.class);
                startActivity(intent);
            }
        });
    }
}

