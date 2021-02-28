package com.example.militaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_login = findViewById(R.id.btn_login);
        Button btn_register = findViewById(R.id.btn_register);
        btn_login.setOnClickListener(this);
        btn_register.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent i;
        switch(v.getId()) {
            case R.id.btn_login:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.btn_register:
                i = new Intent(this, Register.class);
                startActivity(i);
                break;
            default: break;
        }
    }
}