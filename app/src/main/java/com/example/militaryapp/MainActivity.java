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

        CardView NewsView = findViewById(R.id.news_id);
        CardView RuleView = findViewById(R.id.rule_id);
        CardView RankView = findViewById(R.id.rank_id);
        CardView StructView = findViewById(R.id.struct_id);
        CardView WeaponsView = findViewById(R.id.weapons_id);

        NewsView.setOnClickListener(this);
        RuleView.setOnClickListener(this);
        RankView.setOnClickListener(this);
        StructView.setOnClickListener(this);
        WeaponsView.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.news_id:
                startActivity(new Intent(this, NewsMenu.class));
                break;
            case R.id.rule_id:
                startActivity(new Intent(this, RuleMenu.class));
                break;
            case R.id.rank_id:
                startActivity(new Intent(this, RankMenu.class));
                break;
            case R.id.struct_id:
                startActivity(new Intent(this, StructMenu.class));
                break;
            case R.id.weapons_id:
                startActivity(new Intent(this, WeaponsMenu.class));
                break;
        }
    }
}