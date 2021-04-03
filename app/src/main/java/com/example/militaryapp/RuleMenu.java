package com.example.militaryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class RuleMenu extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_menu);

        CardView rl1 = findViewById(R.id.rule_1);
        CardView rl2 = findViewById(R.id.rule_2);
        CardView rl3 = findViewById(R.id.rule_3);
        CardView rl4 = findViewById(R.id.rule_4);
        CardView rl5 = findViewById(R.id.rule_5);

        rl1.setOnClickListener(this);
        rl2.setOnClickListener(this);
        rl3.setOnClickListener(this);
        rl4.setOnClickListener(this);
        rl5.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rule_1:
                startActivity(new Intent(this, ItemsRule.class).putExtra("rule_id", "rule_1"));
                break;
            case R.id.rule_2:
                startActivity(new Intent(this, ItemsRule.class).putExtra("rule_id", "rule_2"));
                break;
            case R.id.rule_3:
                startActivity(new Intent(this, ItemsRule.class).putExtra("rule_id", "rule_3"));
                break;
            case R.id.rule_4:
                startActivity(new Intent(this, ItemsRule.class).putExtra("rule_id", "rule_4"));
                break;
            case R.id.rule_5:
                startActivity(new Intent(this, ItemsRule.class).putExtra("rule_id", "rule_5"));
                break;
        }
    }
}