package com.example.hw43;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainAdapter.MainViewHolder>{

    private ArrayList <String> Google;

    public MainAdapter(ArrayList<String> google) {
        Google = google;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_android , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(Google.get(position));
    }

    @Override
    public int getItemCount() {
        return Google.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView person;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            person = itemView.findViewById(R.id.Person);
        }

        public void bind(String s) {
            person.setText(s);
        }
    }
}
