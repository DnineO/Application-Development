package com.example.goactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickGoTo(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);

        EditText editText= findViewById(R.id.editTextTextPersonName);
        EditText editText2= findViewById(R.id.editTextTextPersonFam);

        String name = editText.getText().toString();
        String fam = editText2.getText().toString();

        intent.putExtra("name",name);
        intent.putExtra("fam",fam);

        startActivity(intent);
    }
}