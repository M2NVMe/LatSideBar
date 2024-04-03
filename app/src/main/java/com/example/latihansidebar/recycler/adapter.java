package com.example.latihansidebar.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.latihansidebar.R;

import java.util.List;

public class adapter extends RecyclerView.Adapter<viewHolder> {

    Context context;
    List<itemsMe> items;
    SelectListen selectListen;

    public adapter(Context context, List<itemsMe> items, SelectListen selectListen) {
        this.context = context;
        this.items = items;
        this.selectListen = selectListen;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(context).inflate(R.layout.recycle_layout_dyna,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(items.get(position).getNama());
        holder.dec.setText(items.get(position).getDesc());
        Glide.with(holder.itemView.getContext()).load(items.get(position).getImg()).into(holder.imageView);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    selectListen.OnKlik(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
