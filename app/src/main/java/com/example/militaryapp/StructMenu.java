package com.example.militaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class StructMenu extends AppCompatActivity implements View.OnClickListener {

    LinearLayout moto_list, tank_list, rocket_list, pvo_list, heli_list, air_list, under_list, surf_list;
    CardView moto, tank, rocket, pvo, heli, air, under, surf;
    TextView moto_1, moto_2, moto_3, moto_4, moto_5, moto_6,
             tank_1, tank_2, tank_3, tank_4,
             rocket_1, rocket_2, rocket_3, rocket_4,
             pvo_1, pvo_2, pvo_3, pvo_4,
             heli_1, heli_2, heli_3, heli_4, heli_5, heli_6,
             air_1, air_2, air_3, air_4,
             under_1, under_2, under_3, under_4,
             surf_1, surf_2, surf_3, surf_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struct_menu);

        moto = findViewById(R.id.moto_card);
        tank = findViewById(R.id.rocket_card);
        rocket = findViewById(R.id.tank_card);
        pvo = findViewById(R.id.pvo_card);

        heli = findViewById(R.id.heli_card);
        air = findViewById(R.id.air_card);

        under = findViewById(R.id.under_card);
        surf = findViewById(R.id.surf_card);

        moto_list = findViewById(R.id.moto_list);
        tank_list = findViewById(R.id.tank_list);
        rocket_list = findViewById(R.id.rocket_list);
        pvo_list = findViewById(R.id.pvo_list);

        heli_list = findViewById(R.id.heli_list);
        air_list = findViewById(R.id.air_list);

        under_list = findViewById(R.id.under_list);
        surf_list = findViewById(R.id.surf_list);

        moto_1 = findViewById(R.id.moto_1);
        moto_2 = findViewById(R.id.moto_2);
        moto_3 = findViewById(R.id.moto_3);
        moto_4 = findViewById(R.id.moto_4);
        moto_5 = findViewById(R.id.moto_5);
        moto_6 = findViewById(R.id.moto_6);
        tank_1 = findViewById(R.id.tank_1);
        tank_2 = findViewById(R.id.tank_2);
        tank_3 = findViewById(R.id.tank_3);
        tank_4 = findViewById(R.id.tank_4);
        rocket_1 = findViewById(R.id.rocket_1);
        rocket_2 = findViewById(R.id.rocket_2);
        rocket_3 = findViewById(R.id.rocket_3);
        rocket_4 = findViewById(R.id.rocket_4);
        pvo_1 = findViewById(R.id.pvo_1);
        pvo_2 = findViewById(R.id.pvo_2);
        pvo_3 = findViewById(R.id.pvo_3);
        pvo_4 = findViewById(R.id.pvo_4);
        heli_1 = findViewById(R.id.heli_1);
        heli_2 = findViewById(R.id.heli_2);
        heli_3 = findViewById(R.id.heli_3);
        heli_4 = findViewById(R.id.heli_4);
        heli_5 = findViewById(R.id.heli_5);
        heli_6 = findViewById(R.id.heli_6);
        air_1 = findViewById(R.id.air_1);
        air_2 = findViewById(R.id.air_2);
        air_3 = findViewById(R.id.air_3);
        air_4 = findViewById(R.id.air_4);
        under_1 = findViewById(R.id.under_1);
        under_2 = findViewById(R.id.under_2);
        under_3 = findViewById(R.id.under_3);
        under_4 = findViewById(R.id.under_4);
        surf_1 = findViewById(R.id.surf_1);
        surf_2 = findViewById(R.id.surf_2);
        surf_3 = findViewById(R.id.surf_3);
        surf_4 = findViewById(R.id.surf_4);

        moto_1.setOnClickListener(this);
        moto_2.setOnClickListener(this);
        moto_3.setOnClickListener(this);
        moto_4.setOnClickListener(this);
        moto_5.setOnClickListener(this);
        moto_6.setOnClickListener(this);
        tank_1.setOnClickListener(this);
        tank_2.setOnClickListener(this);
        tank_3.setOnClickListener(this);
        tank_4.setOnClickListener(this);
        rocket_1.setOnClickListener(this);
        rocket_2.setOnClickListener(this);
        rocket_3.setOnClickListener(this);
        rocket_4.setOnClickListener(this);
        pvo_1.setOnClickListener(this);
        pvo_2.setOnClickListener(this);
        pvo_3.setOnClickListener(this);
        pvo_4.setOnClickListener(this);
        heli_1.setOnClickListener(this);
        heli_2.setOnClickListener(this);
        heli_3.setOnClickListener(this);
        heli_4.setOnClickListener(this);
        heli_5.setOnClickListener(this);
        heli_6.setOnClickListener(this);
        air_1.setOnClickListener(this);
        air_2.setOnClickListener(this);
        air_3.setOnClickListener(this);
        air_4.setOnClickListener(this);
        under_1.setOnClickListener(this);
        under_2.setOnClickListener(this);
        under_3.setOnClickListener(this);
        under_4.setOnClickListener(this);
        surf_1.setOnClickListener(this);
        surf_2.setOnClickListener(this);
        surf_3.setOnClickListener(this);
        surf_4.setOnClickListener(this);


        //suh
        findViewById(R.id.moto_text).setOnClickListener(v -> {
            if (moto_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(moto, new AutoTransition().setDuration(0));
                moto_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(moto, new AutoTransition().setDuration(0));
                moto_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.tank_text).setOnClickListener(v -> {
            if (tank_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(tank, new AutoTransition().setDuration(0));
                tank_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(tank, new AutoTransition().setDuration(0));
                tank_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.rocket_text).setOnClickListener(v -> {
            if (rocket_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(rocket, new AutoTransition().setDuration(0));
                rocket_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(rocket, new AutoTransition().setDuration(0));
                rocket_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.pvo_text).setOnClickListener(v -> {
            if (pvo_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(pvo, new AutoTransition().setDuration(0));
                pvo_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(pvo, new AutoTransition().setDuration(0));
                pvo_list.setVisibility(View.GONE);
            }
        });

        //vks
        findViewById(R.id.heli_text).setOnClickListener(v -> {
            if (heli_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(heli, new AutoTransition().setDuration(0));
                heli_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(heli, new AutoTransition().setDuration(0));
                heli_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.air_text).setOnClickListener(v -> {
            if (air_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(air, new AutoTransition().setDuration(0));
                air_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(air, new AutoTransition().setDuration(0));
                air_list.setVisibility(View.GONE);
            }
        });

        //vmf
        findViewById(R.id.under_text).setOnClickListener(v -> {
            if (under_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(under, new AutoTransition().setDuration(0));
                under_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(under, new AutoTransition().setDuration(0));
                under_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.surf_text).setOnClickListener(v -> {
            if (surf_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(surf, new AutoTransition().setDuration(0));
                surf_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(surf, new AutoTransition().setDuration(0));
                surf_list.setVisibility(View.GONE);
            }
        });
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.moto_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_1"));
                break;
            case R.id.moto_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_2"));
                break;
            case R.id.moto_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_3"));
                break;
            case R.id.moto_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_4"));
                break;
            case R.id.moto_5:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_5"));
                break;
            case R.id.moto_6:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "moto_6"));
                break;
            case R.id.tank_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "tank_1"));
                break;
            case R.id.tank_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "tank_2"));
                break;
            case R.id.tank_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "tank_3"));
                break;
            case R.id.tank_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "tank_4"));
                break;
            case R.id.rocket_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "rocket_1"));
                break;
            case R.id.rocket_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "rocket_2"));
                break;
            case R.id.rocket_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "rocket_3"));
                break;
            case R.id.rocket_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "rocket_4"));
                break;
            case R.id.pvo_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "pvo_1"));
                break;
            case R.id.pvo_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "pvo_2"));
                break;
            case R.id.pvo_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "pvo_3"));
                break;
            case R.id.pvo_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "pvo_4"));
                break;
            case R.id.heli_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_1"));
                break;
            case R.id.heli_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_2"));
                break;
            case R.id.heli_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_3"));
                break;
            case R.id.heli_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_4"));
                break;
            case R.id.heli_5:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_5"));
                break;
            case R.id.heli_6:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "heli_6"));
                break;
            case R.id.air_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "air_1"));
                break;
            case R.id.air_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "air_2"));
                break;
            case R.id.air_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "air_3"));
                break;
            case R.id.air_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "air_4"));
                break;
            case R.id.under_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "under_1"));
                break;
            case R.id.under_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "under_2"));
                break;
            case R.id.under_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "under_3"));
                break;
            case R.id.under_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "under_4"));
                break;
            case R.id.surf_1:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "surf_1"));
                break;
            case R.id.surf_2:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "surf_2"));
                break;
            case R.id.surf_3:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "surf_3"));
                break;
            case R.id.surf_4:
                startActivity(new Intent(this, ItemsStruct.class).putExtra("item_id", "surf_4"));
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}