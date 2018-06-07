package com.projekat.metropolitan.codco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login,SignIn;
    private TextView Info;

    private int Counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Info = (TextView) findViewById(R.id.tvInfo);
        SignIn = (Button) findViewById(R.id.btn_singin);


        Info.setText("Broj preostalih pokusaja: 5");

       /* Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        }); */


       Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proveriLogin(Username.getText().toString(), Password.getText().toString());
            }
        });

       SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

    }

    private void proveriLogin(String userName, String userPassword){
        if((userName.equals("111")) && (userPassword.equals("111"))){
            //intent se koristi kada hocemo da se pomerimo sa jedne aktivnosti na drugu
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);
        }else{
            Counter--;
            Info.setText("Broj preostalih pokusaja je: " + String.valueOf(Counter));
            if(Counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}

