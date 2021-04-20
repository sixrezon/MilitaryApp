package com.example.militaryapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsStruct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_struct);

        String data = getIntent().getExtras().getString("struct_id");

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        StructData[] structData = new StructData[0];
        StructData[] vks = new StructData[]{
                new StructData("Вертолёты",R.drawable.heli),
                new StructData("Самолёты",R.drawable.air),
        };
        StructData[] suh = new StructData[]{
                new StructData("Мотострелковые войска",R.drawable.moto),
                new StructData("Танковые войска",R.drawable.tank),
                new StructData("Ракетные войска и артиллерия",R.drawable.rocket),
                new StructData("Войска ПВО Сухопутных Войск",R.drawable.air_defense),
        };
        StructData[] vmf = new StructData[]{
                new StructData("Подводные силы",R.drawable.surf),
                new StructData("Надводные силы",R.drawable.unde),
        };
        if(data.equals("vks")) {
            structData = vks;
        }
        if(data.equals("suh")) {
            structData = suh;
        }
        if(data.equals("vmf")) {
            structData = vmf;
        }
        StructAdapter structAdapter = new StructAdapter(structData, ItemsStruct.this);
        recyclerView.setAdapter(structAdapter);
    }
}