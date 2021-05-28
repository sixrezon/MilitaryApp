package com.example.militaryapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;

public class NewsMenu extends AppCompatActivity {

    private static final int NOTIFY_ID = 1;
    private static final String CHANNEL_ID = "CHANNEL_ID";
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    NewsAdapter newsAdapter;
    ArrayList<Posts> list;
    ImageButton sort_btn;
    NotificationManager notificationManager;

    String[] Sort = {"По возрастанию рейтинга", "По убыванию рейтинга", "Сначала новые", "Сначала старые"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_menu);

        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        recyclerView = findViewById(R.id.recycler1);
        databaseReference = FirebaseDatabase.getInstance().getReference("Posts");

        sort_btn = findViewById(R.id.sort_btn);
        sort_btn.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(NewsMenu.this);
            builder.setTitle("Сортировка");
            builder.setItems(Sort, (dialog, which) -> {
                if (which == 0){
                    Toast.makeText(getApplicationContext(),Sort[which],Toast.LENGTH_LONG).show();
                    Collections.sort(list, Posts.PostsLikeUp);
                    newsAdapter.notifyDataSetChanged();
                }
                if (which == 1){
                    Toast.makeText(getApplicationContext(),Sort[which],Toast.LENGTH_LONG).show();
                    Collections.sort(list, Posts.PostsLikeDown);
                    newsAdapter.notifyDataSetChanged();
                }
                if (which == 2){
                    Toast.makeText(getApplicationContext(),Sort[which],Toast.LENGTH_LONG).show();
                    Collections.sort(list, Posts.PostsDateNew);
                    newsAdapter.notifyDataSetChanged();
                }
                if (which == 3){
                    Toast.makeText(getApplicationContext(),Sort[which],Toast.LENGTH_LONG).show();
                    Collections.sort(list, Posts.PostsDateOld);
                    newsAdapter.notifyDataSetChanged();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        });

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        newsAdapter = new NewsAdapter(this, list);
        recyclerView.setAdapter(newsAdapter);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Posts posts = dataSnapshot.getValue(Posts.class);
                    list.add(posts);
                    notification();
                    newsAdapter.notifyDataSetChanged();
                }
                newsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] catNamesArray = {"Васька", "Рыжик", "Мурзик"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Выберите кота")
                .setItems(catNamesArray, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }

    public void notification() {
        Intent intent = new Intent(getApplicationContext(), NewsMenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                        .setAutoCancel(false)
                        .setSmallIcon(R.drawable.icon)
                        .setWhen(System.currentTimeMillis())
                        .setContentIntent(pendingIntent)
                        .setContentTitle("Опубликована новая новость")
                        .setContentText("Доступно в приложении")
                        .setPriority(PRIORITY_HIGH);
        createChannelIfNeeded(notificationManager);
        notificationManager.notify(NOTIFY_ID, notificationBuilder.build());
    }

    private void createChannelIfNeeded(NotificationManager manager) {
        NotificationChannel notificationChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }
}