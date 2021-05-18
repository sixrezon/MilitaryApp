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
                TransitionManager.beginDelayedTransition(moto, new AutoTransition().setDuration(200));
                moto_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(moto, new AutoTransition().setDuration(0));
                moto_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.tank_text).setOnClickListener(v -> {
            if (tank_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(tank, new AutoTransition().setDuration(200));
                tank_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(tank, new AutoTransition().setDuration(0));
                tank_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.rocket_text).setOnClickListener(v -> {
            if (rocket_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(rocket, new AutoTransition().setDuration(200));
                rocket_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(rocket, new AutoTransition().setDuration(0));
                rocket_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.pvo_text).setOnClickListener(v -> {
            if (pvo_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(pvo, new AutoTransition().setDuration(200));
                pvo_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(pvo, new AutoTransition().setDuration(0));
                pvo_list.setVisibility(View.GONE);
            }
        });

        //vks
        findViewById(R.id.heli_text).setOnClickListener(v -> {
            if (heli_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(heli, new AutoTransition().setDuration(200));
                heli_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(heli, new AutoTransition().setDuration(0));
                heli_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.air_text).setOnClickListener(v -> {
            if (air_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(air, new AutoTransition().setDuration(200));
                air_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(air, new AutoTransition().setDuration(0));
                air_list.setVisibility(View.GONE);
            }
        });

        //vmf
        findViewById(R.id.under_text).setOnClickListener(v -> {
            if (under_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(under, new AutoTransition().setDuration(200));
                under_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(under, new AutoTransition().setDuration(0));
                under_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.surf_text).setOnClickListener(v -> {
            if (surf_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(surf, new AutoTransition().setDuration(200));
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
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_1.png?alt=media&token=9403ccb3-34fd-45ad-a232-e160d86f9eac"));
                break;
            case R.id.moto_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_2.png?alt=media&token=f139ffba-f69d-4fe6-89f6-e822724291cf"));
                break;
            case R.id.moto_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_3.png?alt=media&token=97cd7bac-e3d5-4c4b-9ab8-d33715021177"));
                break;
            case R.id.moto_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_4.png?alt=media&token=1a2d090b-93c4-40ee-b432-a9fb58c053bd"));
                break;
            case R.id.moto_5:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_5")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_5.png?alt=media&token=ee481765-2de6-4198-9320-e34c0118a801"));
                break;
            case R.id.moto_6:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "moto_6")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/moto_6.png?alt=media&token=fa580649-1f5a-4947-ad63-5b1cd1938dba"));
                break;
            case R.id.tank_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "tank_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/tank_1.png?alt=media&token=1132740c-5aed-4ef5-b3c9-db7525a116d3"));
                break;
            case R.id.tank_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "tank_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/tank_2.png?alt=media&token=ccd8c178-6c1b-4549-aa56-51a468226196"));
                break;
            case R.id.tank_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "tank_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/tank_3.png?alt=media&token=b602928b-13bf-40e7-ae40-e815f75ad002"));
                break;
            case R.id.tank_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "tank_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/tank_4.png?alt=media&token=52358e66-9906-42b2-9531-f502fc9f641c"));
                break;
            case R.id.rocket_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "rocket_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/rocket_1.png?alt=media&token=c3e493f6-4a9a-48a0-aeb5-2d3318b32e84"));
                break;
            case R.id.rocket_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "rocket_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/rocket_2.png?alt=media&token=c47bbf56-f32e-4630-b952-ffcb1cd6ad7d"));
                break;
            case R.id.rocket_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "rocket_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/rocket_3.png?alt=media&token=4a462e41-bd38-464b-b86a-09c315d3400a"));
                break;
            case R.id.rocket_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "rocket_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/rocket_4.png?alt=media&token=a69a0a86-5b36-4735-9fef-012fcf31d311"));
                break;
            case R.id.pvo_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "pvo_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pvo_1.png?alt=media&token=7e7e68b0-ce29-4c65-9f2e-2317728f258e"));
                break;
            case R.id.pvo_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "pvo_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pvo_2.png?alt=media&token=2580b0fd-f0fc-4dbb-958c-c7e01e60262b"));
                break;
            case R.id.pvo_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "pvo_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pvo_3.png?alt=media&token=b03966b5-faf0-4c44-9fbc-6baa5877462a"));
                break;
            case R.id.pvo_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "pvo_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/pvo_4.png?alt=media&token=a9e47e35-51c9-4e77-b83b-b2d70481ff80"));
                break;
            case R.id.heli_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_1.png?alt=media&token=96566c39-e372-4931-8105-02b6581bea15"));
                break;
            case R.id.heli_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_2.png?alt=media&token=014d17f5-a01a-4d1e-b0c5-c0fd9c8355b9"));
                break;
            case R.id.heli_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_3.png?alt=media&token=87960101-02b4-43ed-b067-c90f6afe4ed4"));
                break;
            case R.id.heli_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_4.png?alt=media&token=63c693be-e732-40b1-a2ff-d0ad4075a88e"));
                break;
            case R.id.heli_5:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_5")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_5.png?alt=media&token=e7044fff-4b0f-48b7-9d3d-42b8d02c09a4"));
                break;
            case R.id.heli_6:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "heli_6")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/heli_6.png?alt=media&token=a5648c07-c441-4530-a8cd-ac46d933e5a6"));
                break;
            case R.id.air_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "air_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/air_1.png?alt=media&token=841956fd-e89d-4060-8c72-b97a9e7c7541"));
                break;
            case R.id.air_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "air_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/air_2.png?alt=media&token=fa91c4d2-8d55-4b6c-a585-9d13c3e3c971"));
                break;
            case R.id.air_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "air_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/air_3.png?alt=media&token=9d9478be-853d-40d0-990e-56c1e75d2c8b"));
                break;
            case R.id.air_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "air_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/air_4.png?alt=media&token=12288f77-5d58-4ea2-b4b6-530ff43794a0"));
                break;
            case R.id.under_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "under_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/under_1.png?alt=media&token=ed1b1d84-5aab-488d-8ab5-a62e2e098c4e"));
                break;
            case R.id.under_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "under_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/under_2.png?alt=media&token=a515183d-9bda-4bd1-80f6-5d962908b3c4"));
                break;
            case R.id.under_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "under_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/under_3.png?alt=media&token=af23cf0b-49ad-41c5-8b42-bdcf3425eb4c"));
                break;
            case R.id.under_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "under_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/under_4.png?alt=media&token=5a583464-e75e-44bf-b147-ec2bfc45d6f8"));
                break;
            case R.id.surf_1:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "surf_1")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/surf_1.png?alt=media&token=ef988d51-d874-45c6-b381-b7ad408a15f0"));
                break;
            case R.id.surf_2:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "surf_2")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/surf_2.png?alt=media&token=e8701410-1ff0-4477-bcf9-e7ee266fbaca"));
                break;
            case R.id.surf_3:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "surf_3")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/surf_3.png?alt=media&token=19b5b599-139a-47bd-b039-398d4b00f788"));
                break;
            case R.id.surf_4:
                startActivity(new Intent(this, ItemsStruct.class)
                        .putExtra("item_id", "surf_4")
                        .putExtra("url", "https://firebasestorage.googleapis.com/v0/b/militaryapp-98e28.appspot.com/o/surf_4.png?alt=media&token=bcce0bd0-0511-4375-a2e5-58c2d6d486da"));
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}