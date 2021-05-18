package com.example.militaryapp;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class RankMenu extends AppCompatActivity {

    LinearLayout suh_1_list, suh_2_list, suh_3_list, suh_4_list,
            vmf_1_list, vmf_2_list, vmf_3_list, vmf_4_list;
    CardView suh_1_card, suh_2_card, suh_3_card, suh_4_card,
            vmf_1_card, vmf_2_card, vmf_3_card, vmf_4_card;
    TextView suh_1_1, suh_1_2, suh_1_3, suh_1_4, suh_1_5, suh_1_6, suh_1_7, suh_1_8,
            suh_2_1, suh_2_2, suh_2_3, suh_2_4,
            suh_3_1, suh_3_2, suh_3_3,
            suh_4_1, suh_4_2, suh_4_3, suh_4_4, suh_4_5;
    TextView vmf_1_1, vmf_1_2, vmf_1_3, vmf_1_4, vmf_1_5,
            vmf_2_1, vmf_2_2, vmf_2_3, vmf_2_4,
            vmf_3_1, vmf_3_2, vmf_3_3,
            vmf_4_1, vmf_4_2, vmf_4_3, vmf_4_4;
    TextView rank_text;
    ImageView rank_view, background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_menu);

        rank_view = findViewById(R.id.rank_view);
        background_view = findViewById(R.id.background_view);
        rank_text = findViewById(R.id.rank_text);

        suh_1_card = findViewById(R.id.suh_1_card);
        suh_2_card = findViewById(R.id.suh_2_card);
        suh_3_card = findViewById(R.id.suh_3_card);
        suh_4_card = findViewById(R.id.suh_4_card);
        vmf_1_card = findViewById(R.id.vmf_1_card);
        vmf_2_card = findViewById(R.id.vmf_2_card);
        vmf_3_card = findViewById(R.id.vmf_3_card);
        vmf_4_card = findViewById(R.id.vmf_4_card);

        suh_1_list = findViewById(R.id.suh_1_list);
        suh_2_list = findViewById(R.id.suh_2_list);
        suh_3_list = findViewById(R.id.suh_3_list);
        suh_4_list = findViewById(R.id.suh_4_list);
        vmf_1_list = findViewById(R.id.vmf_1_list);
        vmf_2_list = findViewById(R.id.vmf_2_list);
        vmf_3_list = findViewById(R.id.vmf_3_list);
        vmf_4_list = findViewById(R.id.vmf_4_list);

        suh_1_1 = findViewById(R.id.suh_1_1);
        suh_1_2 = findViewById(R.id.suh_1_2);
        suh_1_3 = findViewById(R.id.suh_1_3);
        suh_1_4 = findViewById(R.id.suh_1_4);
        suh_1_5 = findViewById(R.id.suh_1_5);
        suh_1_6 = findViewById(R.id.suh_1_6);
        suh_1_7 = findViewById(R.id.suh_1_7);
        suh_1_8 = findViewById(R.id.suh_1_8);
        suh_2_1 = findViewById(R.id.suh_2_1);
        suh_2_2 = findViewById(R.id.suh_2_2);
        suh_2_3 = findViewById(R.id.suh_2_3);
        suh_2_4 = findViewById(R.id.suh_2_4);
        suh_3_1 = findViewById(R.id.suh_3_1);
        suh_3_2 = findViewById(R.id.suh_3_2);
        suh_3_3 = findViewById(R.id.suh_3_3);
        suh_4_1 = findViewById(R.id.suh_4_1);
        suh_4_2 = findViewById(R.id.suh_4_2);
        suh_4_3 = findViewById(R.id.suh_4_3);
        suh_4_4 = findViewById(R.id.suh_4_4);
        suh_4_5 = findViewById(R.id.suh_4_5);

        vmf_1_1 = findViewById(R.id.vmf_1_1);
        vmf_1_2 = findViewById(R.id.vmf_1_2);
        vmf_1_3 = findViewById(R.id.vmf_1_3);
        vmf_1_4 = findViewById(R.id.vmf_1_4);
        vmf_1_5 = findViewById(R.id.vmf_1_5);
        vmf_2_1 = findViewById(R.id.vmf_2_1);
        vmf_2_2 = findViewById(R.id.vmf_2_2);
        vmf_2_3 = findViewById(R.id.vmf_2_3);
        vmf_2_4 = findViewById(R.id.vmf_2_4);
        vmf_3_1 = findViewById(R.id.vmf_3_1);
        vmf_3_2 = findViewById(R.id.vmf_3_2);
        vmf_3_3 = findViewById(R.id.vmf_3_3);
        vmf_4_1 = findViewById(R.id.vmf_4_1);
        vmf_4_2 = findViewById(R.id.vmf_4_2);
        vmf_4_3 = findViewById(R.id.vmf_4_3);
        vmf_4_4 = findViewById(R.id.vmf_4_4);

        //suh
        findViewById(R.id.suh_1_text).setOnClickListener(v -> {
            if (suh_1_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(suh_1_card, new AutoTransition().setDuration(200));
                suh_1_list.setVisibility(View.VISIBLE);

            } else {
                TransitionManager.beginDelayedTransition(suh_1_card, new AutoTransition().setDuration(0));
                suh_1_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.suh_2_text).setOnClickListener(v -> {
            if (suh_2_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(suh_2_card, new AutoTransition().setDuration(200));
                suh_2_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(suh_2_card, new AutoTransition().setDuration(0));
                suh_2_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.suh_3_text).setOnClickListener(v -> {
            if (suh_3_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(suh_3_card, new AutoTransition().setDuration(200));
                suh_3_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(suh_3_card, new AutoTransition().setDuration(0));
                suh_3_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.suh_4_text).setOnClickListener(v -> {
            if (suh_4_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(suh_4_card, new AutoTransition().setDuration(200));
                suh_4_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(suh_4_card, new AutoTransition().setDuration(0));
                suh_4_list.setVisibility(View.GONE);
            }
        });
        //vmf
        findViewById(R.id.vmf_1_text).setOnClickListener(v -> {
            if (vmf_1_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(vmf_1_card, new AutoTransition().setDuration(200));
                vmf_1_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(vmf_1_card, new AutoTransition().setDuration(0));
                vmf_1_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.vmf_2_text).setOnClickListener(v -> {
            if (vmf_2_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(vmf_2_card, new AutoTransition().setDuration(200));
                vmf_2_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(vmf_2_card, new AutoTransition().setDuration(0));
                vmf_2_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.vmf_3_text).setOnClickListener(v -> {
            if (vmf_3_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(vmf_3_card, new AutoTransition().setDuration(200));
                vmf_3_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(vmf_3_card, new AutoTransition().setDuration(0));
                vmf_3_list.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.vmf_4_text).setOnClickListener(v -> {
            if (vmf_4_list.getVisibility() == View.GONE) {
                TransitionManager.beginDelayedTransition(vmf_4_card, new AutoTransition().setDuration(200));
                vmf_4_list.setVisibility(View.VISIBLE);
            } else {
                TransitionManager.beginDelayedTransition(vmf_4_card, new AutoTransition().setDuration(0));
                vmf_4_list.setVisibility(View.GONE);
            }
        });

        suh_1_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Рядовой");
        });
        suh_1_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Ефрейтор");
        });
        suh_1_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Младший сержант");
        });
        suh_1_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Сержант");
        });
        suh_1_5.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_5);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старший сержант");
        });
        suh_1_6.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_6);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старшина");
        });
        suh_1_7.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_7);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Прапорщик");
        });
        suh_1_8.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_1_8);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старший прапорщик");
        });
        suh_2_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_2_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Младший лейтенант");
        });
        suh_2_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_2_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Лейтенант");
        });
        suh_2_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_2_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старший лейтенант");
        });
        suh_2_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_2_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Капитан");
        });
        suh_3_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_3_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Майор");
        });
        suh_3_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_3_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Подполковник");
        });
        suh_3_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_3_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Полковник");
        });
        suh_4_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_4_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Генерал-майор");
        });
        suh_4_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_4_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Генерал-лейтенант");
        });
        suh_4_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_4_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Генерал-полковник");
        });
        suh_4_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_4_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Генерал армии");
        });
        suh_4_5.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.suh_4_5);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Маршал Российской Федерации");
        });

        vmf_1_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_1_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Матрос");
        });
        vmf_1_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_1_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старший матрос");
        });
        vmf_1_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_1_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старшина");
        });
        vmf_1_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_1_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Главный старшина");
        });
        vmf_1_5.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_1_5);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Главный корабельный старшина");
        });
        vmf_2_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_2_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Младший лейтенант");
        });
        vmf_2_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_2_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Лейтенант");
        });
        vmf_2_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_2_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Старший лейтенант");
        });
        vmf_2_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_2_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Капитан-лейтенант");
        });
        vmf_3_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_3_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Капитан 3-го ранга");
        });
        vmf_3_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_3_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Капитан 2-го ранга");
        });
        vmf_3_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_3_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Капитан 1-го ранга");
        });
        vmf_4_1.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_4_1);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Контр-адмирал");
        });
        vmf_4_2.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_4_2);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Вице-адмирал");
        });
        vmf_4_3.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_4_3);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Адмирал");
        });
        vmf_4_4.setOnClickListener(v -> {
            rank_view.setVisibility(View.VISIBLE);
            background_view.setVisibility(View.VISIBLE);
            rank_view.setImageResource(R.drawable.vmf_4_4);
            rank_text.setVisibility(View.VISIBLE);
            rank_text.setText("Адмирал флота");
        });

        background_view.setOnClickListener(v -> {
            rank_view.setVisibility(View.GONE);
            background_view.setVisibility(View.GONE);
            rank_text.setVisibility(View.GONE);
        });
    }
}