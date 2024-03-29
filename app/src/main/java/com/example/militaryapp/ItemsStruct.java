package com.example.militaryapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class ItemsStruct extends AppCompatActivity {
    ProgressDialog progressDialog;
    TextView text_items;
    ImageView img_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_struct);

        String data = getIntent().getExtras().getString("item_id");
        String url = getIntent().getExtras().getString("url");

        text_items = findViewById(R.id.text_items);
        img_view = findViewById(R.id.img_view);


        progressDialog = new ProgressDialog(ItemsStruct.this);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        DatabaseReference mDataBase = FirebaseDatabase.getInstance().getReference("Struct");

        mDataBase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                StructClass sc = snapshot.child(data).getValue(StructClass.class);
                String s_text;
                assert sc != null;
                pd_stop();

                Picasso.get().load(url).into(img_view);

                s_text = sc.text.replace("*", "\n\n");
                text_items.setText(s_text);

                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle(sc.title);
                Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    private void pd_stop() {
        progressDialog.dismiss();
    }
}