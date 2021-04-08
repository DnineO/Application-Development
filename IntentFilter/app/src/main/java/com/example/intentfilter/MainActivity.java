package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTime = findViewById(R.id.btnTime);
        Button btnDate = findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this::onClick);
        btnDate.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.btnTime:
                intent = new Intent("action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("action.showdate");
                startActivity(intent);
                break;
        }
    }
}