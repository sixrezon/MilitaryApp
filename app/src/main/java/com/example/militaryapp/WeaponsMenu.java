package com.example.militaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class WeaponsMenu extends AppCompatActivity implements View.OnClickListener {

    LinearLayout a_rifle_list, pistol_list, m_gun_list, s_rifle_list;
    CardView a_rifle_card, pistol_card, m_gun_card, s_rifle_card;
    TextView a_rifle_1, a_rifle_2, a_rifle_3,
            pistol_1, pistol_2, pistol_3,
            m_gun_1, m_gun_2,
            s_rifle_1, s_rifle_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_menu);

        a_rifle_card = findViewById(R.id.a_rifle_card);
        pistol_card = findViewById(R.id.pistol_card);
        m_gun_card = findViewById(R.id.m_gun_card);
        s_rifle_card = findViewById(R.id.s_rifle_card);

        a_rifle_list = findViewById(R.id.a_rifle_list);
        pistol_list = findViewById(R.id.pistol_list);
        m_gun_list = findViewById(R.id.m_gun_list);
        s_rifle_list = findViewById(R.id.s_rifle_list);

        a_rifle_1 = findViewById(R.id.a_rifle_1);
        a_rifle_2 = findViewById(R.id.a_rifle_2);
        a_rifle_3 = findViewById(R.id.a_rifle_3);
        pistol_1 = findViewById(R.id.pistol_1);
        pistol_2 = findViewById(R.id.pistol_2);
        pistol_3 = findViewById(R.id.pistol_3);
        m_gun_1 = findViewById(R.id.m_gun_1);
        m_gun_2 = findViewById(R.id.m_gun_2);
        s_rifle_1 = findViewById(R.id.s_rifle_1);
        s_rifle_2 = findViewById(R.id.s_rifle_2);

        a_rifle_1.setOnClickListener(this);
        a_rifle_2.setOnClickListener(this);
        a_rifle_3.setOnClickListener(this);
        pistol_1.setOnClickListener(this);
        pistol_2.setOnClickListener(this);
        pistol_3.setOnClickListener(this);
        m_gun_1.setOnClickListener(this);
        m_gun_2.setOnClickListener(this);
        s_rifle_1.setOnClickListener(this);
        s_rifle_2.setOnClickListener(this);

        findViewById(R.id.a_rifle_text).setOnClickListener(v -> {
            if (a_rifle_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(a_rifle_card, new AutoTransition().setDuration(200));
                a_rifle_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(a_rifle_card, new AutoTransition().setDuration(0));
                a_rifle_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.pistol_text).setOnClickListener(v -> {
            if (pistol_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(pistol_card, new AutoTransition().setDuration(200));
                pistol_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(pistol_card, new AutoTransition().setDuration(0));
                pistol_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.m_gun_text).setOnClickListener(v -> {
            if (m_gun_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(m_gun_card, new AutoTransition().setDuration(200));
                m_gun_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(m_gun_card, new AutoTransition().setDuration(0));
                m_gun_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.s_rifle_text).setOnClickListener(v -> {
            if (s_rifle_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(s_rifle_card, new AutoTransition().setDuration(200));
                s_rifle_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(s_rifle_card, new AutoTransition().setDuration(0));
                s_rifle_list.setVisibility(View.GONE);
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a_rifle_1:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "a_rifle_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/a_rifle_1.png?alt=media&token=ec472bbb-db54-4b0c-a5d5-8d00d20d46fb"));
                break;
            case R.id.a_rifle_2:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "a_rifle_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/a_rifle_2.png?alt=media&token=3312a3f2-312f-4ff2-bb7f-c7866e4945e9"));
                break;
            case R.id.a_rifle_3:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "a_rifle_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/a_rifle_3.png?alt=media&token=d0d37336-49aa-4858-a7a3-758def7c2494"));
                break;
            case R.id.pistol_1:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "pistol_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pistol_1.png?alt=media&token=16ed7960-bc56-4cf8-b728-0612c9e285bd"));
                break;
            case R.id.pistol_2:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "pistol_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pistol_2.png?alt=media&token=733ee6cc-13e5-4e57-be49-2065c9a13ae3"));
                break;
            case R.id.pistol_3:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "pistol_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pistol_3.png?alt=media&token=ee94a213-9373-4cd0-939c-d43d1341e3fc"));
                break;
            case R.id.m_gun_1:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "m_gun_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/m_gun_1.png?alt=media&token=39e9c586-a449-4e6a-b884-fe5f23fd14ce"));
                break;
            case R.id.m_gun_2:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "m_gun_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/m_gun_2.png?alt=media&token=b7392ea7-9b29-44d8-b88c-a3a8b02620b2"));
                break;
            case R.id.s_rifle_1:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "s_rifle_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/s_rifle_1.png?alt=media&token=ba95fd8f-e7c1-43b6-96ba-fe5a82b85ac4"));
                break;
            case R.id.s_rifle_2:
                startActivity(new Intent(this, ItemsWeapons.class)
                        .putExtra("item_id", "s_rifle_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/s_rifle_2.png?alt=media&token=3b0e568a-b780-441a-92b1-e872e94b12b5"));
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}