package com.example.goactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two2);

        Intent intent=getIntent();
        String message =intent.getStringExtra("name");
        String message2 =intent.getStringExtra("fam");

        TextView textView = new TextView(this);

        textView.setText("Ваше имя:" + message + "\nВаша фамилия:" + message2);

        setContentView(textView);

    }

    public void ClickBack(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}