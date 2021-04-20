package com.example.militaryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StructMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struct_menu);

        CardView sm1 = findViewById(R.id.vks);
        CardView sm2 = findViewById(R.id.suh);
        CardView sm3 = findViewById(R.id.vmf);

        sm1.setOnClickListener(this);
        sm2.setOnClickListener(this);
        sm3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.vks:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("struct_id", "vks"));
                break;
            case R.id.suh:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("struct_id", "suh"));
                break;
            case R.id.vmf:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("struct_id", "vmf"));
                break;
        }
    }
}