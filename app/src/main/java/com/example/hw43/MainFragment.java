package com.example.hw43;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private MainAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<String> dada;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loutData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new MainAdapter(dada);
        recyclerView.setAdapter(adapter);
    }

    private void loutData() {
        dada = new ArrayList<>();
        dada.add("Android");
        dada.add("Python");
        dada.add("Java");
        dada.add("JavaScript");
        dada.add("IOS");
        dada.add("Frontend");
    }
}