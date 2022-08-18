package com.geektech.practicwork3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class HeroViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    public HeroViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.heroesTextView);
    }
    public void bind(String heroes){
        textView.setText(heroes);
    }
}
