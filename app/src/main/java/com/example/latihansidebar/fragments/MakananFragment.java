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


public class MakananFragment extends Fragment implements SelectListen {

    public MakananFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_makanan, container, false);
        RecyclerView recyclerView = RootView.findViewById(R.id.recycl);
        List<itemsMe> Content = new ArrayList<>();

        Content.add( new itemsMe("Nasi Megono", "nasi megono yang dilengkapi dengan sayur olahan nangka muda yang dipadukan dengan bumbu sambal kelapa. Nasi megono memiliki rasa yang gurih dan pedas yang dapat menggugah selera pengunjung." ,"https://img.kurio.network/oTaqCudxsgZ7ATN6KQoZrqlLVng=/1200x900/filters:quality(80)/https://kurio-img.kurioapps.com/22/07/11/2c66f0b9-b87d-417d-959e-6ffe20ba18b0.jpg"));
        Content.add( new itemsMe("Ongol-Ongol", "Jajanan tradisional ini terbuat dari tepung sagu yang kemudian dicampurkan dengan gula merah atau gula jawa sebagai pelengkapnya. " ,"https://blog.tokowahab.com/wp-content/uploads/2020/01/Resep-Ongol-Ongol.jpg"));
        Content.add( new itemsMe("Apem Kasesi", "Apem kasesi adalah salah satu kue tradisional khas Pekalongan yang terbuat dari bahan kombinasi antara tepung beras dan juga gula aren." ,"https://redaksi.inibaru.id/nuploads/62/Apem-Kesesi-1.jpg"));
        Content.add( new itemsMe("Pindang Tetel", "Sebuah hidangan pindang yang di buat dari tetelan daging sapi, berwarna coklat di karenakan di olah dengan kluwak" ,"https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/sasefoto/original/37850_pindang-tetel.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), Content, this));

        return RootView;
    }

    @Override
    public void OnKlik(itemsMe holding) {

    }
}