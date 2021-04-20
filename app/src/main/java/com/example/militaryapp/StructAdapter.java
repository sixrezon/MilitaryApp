package com.example.militaryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StructAdapter extends RecyclerView.Adapter<StructAdapter.ViewHolder> {

    StructData[] structData;
    Context context;

    public StructAdapter(StructData[] structData, ItemsStruct activity) {
        this.structData = structData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.struct_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final StructData StructDataList = structData[position];
        holder.structTitle.setText(StructDataList.getStructTitle());
        holder.structImage.setImageResource(StructDataList.getStructImage());
    }

    @Override
    public int getItemCount() {
        return structData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView structImage;
        TextView structTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            structImage = itemView.findViewById(R.id.imageView);
            structTitle = itemView.findViewById(R.id.structTitle);
        }
    }
}
