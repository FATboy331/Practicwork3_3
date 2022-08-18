package com.geektech.practicwork3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroViewHolder> {


    private ArrayList<String> heroes;


    public HeroesAdapter(ArrayList<String> heroes) {
        this.heroes = heroes;
    }


    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_heroes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
holder.bind(heroes.get(position));
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }
}
