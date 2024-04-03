package com.example.latihansidebar.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihansidebar.R;
import com.example.latihansidebar.recycler.SelectListen;
import com.example.latihansidebar.recycler.adapter;
import com.example.latihansidebar.recycler.itemsMe;

import java.util.ArrayList;
import java.util.List;


public class MinumanFragment extends Fragment implements SelectListen {

    public MinumanFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_minuman, container, false);
        RecyclerView recyclerView = RootView.findViewById(R.id.recycl);
        List<itemsMe> Content = new ArrayList<>();

        Content.add( new itemsMe("Dawet", "Gula arennya enak" ,R.drawable.baseline_fastfood_24));
        Content.add( new itemsMe("Es Teler", "Kangen ama es teler 77" ,R.drawable.baseline_fastfood_24));
        Content.add( new itemsMe("Degan", "Langganan buka puasa" ,R.drawable.baseline_fastfood_24));
        Content.add( new itemsMe("Cincau", "Dawet deluxe edition" ,R.drawable.baseline_fastfood_24));
        Content.add( new itemsMe("Es Teh", "Greatest of all time" ,R.drawable.baseline_fastfood_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), Content, this));
        return RootView;
    }

    @Override
    public void OnKlik(itemsMe holding) {

    }
}