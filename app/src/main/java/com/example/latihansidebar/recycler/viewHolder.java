package com.example.latihansidebar.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihansidebar.R;

public class viewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name,dec;
    RelativeLayout relativeLayout;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ImageVW);
        name = itemView.findViewById(R.id.name);
        dec = itemView.findViewById(R.id.desc);
        relativeLayout = itemView.findViewById(R.id.utama);
    }
}
