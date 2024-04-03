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

        Content.add( new itemsMe("Limun Oriental", "Terbuat dari racikan asam sitrat, air sari buah, dan karbondioksida, membuat minuman ini terkesan beruap. " ,"https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/14/1296140/540x270/mengenal-limun-oriental-minuman-tempo-dulu-khas-pekalongan-cocok-untuk-buka-puasa.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), Content, this));
        return RootView;
    }

    @Override
    public void OnKlik(itemsMe holding) {

    }
}