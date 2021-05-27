package com.example.militaryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String userID;
    String guest_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView NewsView = findViewById(R.id.news_id);
        CardView RuleView = findViewById(R.id.rule_id);
        CardView RankView = findViewById(R.id.rank_id);
        CardView StructView = findViewById(R.id.struct_id);
        CardView WeaponsView = findViewById(R.id.weapons_id);
        CardView exit = findViewById(R.id.exit_btn);

        TextView login_tv = findViewById(R.id.user_login);

        guest_status = getIntent().getExtras().getString("guest_status");

        NewsView.setOnClickListener(this);
        RuleView.setOnClickListener(this);
        RankView.setOnClickListener(this);
        StructView.setOnClickListener(this);
        WeaponsView.setOnClickListener(this);
        exit.setOnClickListener(this);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User user = snapshot.getValue(User.class);
                if (user != null && guest_status.equals("false")) {
                    String login_s = user.login;
                    login_tv.setText("С возвращением, "+login_s+"!");
                }
                if (guest_status.equals("true")){
                    login_tv.setText("Вы вошли как гость");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                login_tv.setText("Вы вошли как гость");
            }
        });
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
            case R.id.exit_btn:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}