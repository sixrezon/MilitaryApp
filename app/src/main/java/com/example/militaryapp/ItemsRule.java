package com.example.militaryapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ItemsRule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_rule);

        String data = getIntent().getExtras().getString("rule_id");

        TextView title_items = findViewById(R.id.title_items);
        TextView text_items = findViewById(R.id.text_items);

        DatabaseReference mDataBase = FirebaseDatabase.getInstance().getReference("Rule");

        mDataBase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                RuleClass rc = snapshot.child(data).getValue(RuleClass.class);
                String s_title, s_text;
                assert rc != null;
                s_title = rc.title;
                s_text = rc.text.replace("/","\n\n");
                title_items.setText(s_title);
                text_items.setText(s_text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}