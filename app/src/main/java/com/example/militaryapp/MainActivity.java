package com.example.militaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView directoryView = findViewById(R.id.directoryId);
        directoryView.setOnClickListener(this);
        CardView ustavView = findViewById(R.id.ustavId);
        ustavView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.directoryId:
                i = new Intent(this, TwoActivity.class);
                startActivity(i);
                break;
            case R.id.ustavId:
                i = new Intent(this, ThreeActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}