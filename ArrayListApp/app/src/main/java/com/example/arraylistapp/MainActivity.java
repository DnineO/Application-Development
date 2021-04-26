package com.example.arraylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] junkFood = {"Пицца","Гамбургер","Пепси","Картошка фри","Чизбургер","Твистер"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("WrongViewCast") ListView listView = findViewById(R.id.FoodList);
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,
                android.R.layout.preference_category, junkFood);

        listView.setAdapter(adapter);
    }
}