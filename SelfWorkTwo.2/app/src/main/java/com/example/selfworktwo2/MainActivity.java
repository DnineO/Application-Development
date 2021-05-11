package com.example.selfworktwo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String sendName = "Name";
    public static final String sendFam = "Family";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editTextName = findViewById(R.id.sendName);
        EditText editTextFam = findViewById(R.id.sendFam);

        String sendName = editTextName.getText().toString();
        String sendFam = editTextFam.getText().toString();

        intent.putExtra("name",sendName);
        intent.putExtra("fam",sendFam);

        startActivity(intent);
    }
}