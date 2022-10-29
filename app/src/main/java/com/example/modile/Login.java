package com.example.modile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginbutton = findViewById(R.id.loginbutton);
        Button joinbutton = findViewById(R.id.joinbutton);

        loginbutton. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //화면전환
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });

        joinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                //화면전환
                Intent intent1 = new Intent(Login.this, Join.class);
                startActivity(intent1);
            }
        });
    }
}