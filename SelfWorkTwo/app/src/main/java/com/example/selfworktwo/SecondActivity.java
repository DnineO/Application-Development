package com.example.selfworktwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String getName = intent.getStringExtra("name");
        String getFam = intent.getStringExtra("fam");

        TextView textViewName = new TextView(this);
        TextView textViewFam = new TextView(this);

        textViewName.setTextSize(20);
        textViewName.setText(getName);
        setContentView(textViewName);

        textViewFam.setTextSize(20);
        textViewFam.setText(getFam);

        setContentView(textViewFam);
    }
}
