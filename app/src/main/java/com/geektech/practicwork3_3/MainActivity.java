package com.geektech.practicwork3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private ArrayList<String> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.mainRecyclerView);
        heroes = new ArrayList<>();
        loadData();
        recyclerView.setAdapter(new HeroesAdapter(heroes));

    }

    private void loadData() {
        heroes.add("Pudge");
        heroes.add("Mars");
        heroes.add("Tiny");
        heroes.add("Sven");
        heroes.add("Tusk");
        heroes.add("Medusa");
        heroes.add("Slark");
        heroes.add("Weaver");
        heroes.add("Ursa");
        heroes.add("Invoker");
        heroes.add("Lina");
        heroes.add("Batrider");
        heroes.add("Storm Spirit");
    }
}