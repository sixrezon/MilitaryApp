package com.example.militaryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    Context context;
    ArrayList<Posts> list;

    public NewsAdapter(Context context, ArrayList<Posts> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_news,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Posts posts = list.get(position);
        int like_number;
        final boolean[] flag = {false};
        like_number = posts.getLike();
        holder.news_text.setText(posts.getText());
        holder.news_date.setText(posts.getDate());
        holder.like_counter.setText(String.valueOf(like_number));
        Glide.with(holder.news_image.getContext()).load(posts.getImg()).into(holder.news_image);

        holder.like_btn.setOnClickListener(v -> {
            if (flag[0]) {
                holder.like_btn.setImageResource(R.drawable.ic_favorite_false);
                holder.like_counter.setText(String.valueOf(like_number));
                flag[0] = false;
            } else {
                holder.like_btn.setImageResource(R.drawable.ic_favorite_true);
                holder.like_counter.setText(String.valueOf(like_number+1));
                flag[0] = true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView news_text, like_counter, news_date;
        ImageView news_image;
        ImageButton like_btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            
            news_text = itemView.findViewById(R.id.news_text);
            like_counter = itemView.findViewById(R.id.like_counter);
            news_date = itemView.findViewById(R.id.news_date);
            news_image = itemView.findViewById(R.id.news_img);
            like_btn = itemView.findViewById(R.id.like_btn);

        }
    }
}
