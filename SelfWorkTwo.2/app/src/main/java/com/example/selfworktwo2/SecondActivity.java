package com.example.selfworktwo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String getName = intent.getStringExtra("name");
        String getFam = intent.getStringExtra("fam");

        TextView textViewName = findViewById(R.id.tvName);
        TextView textViewFam = findViewById(R.id.tvFam);

        String txtName = textViewName.getText().toString();
        String getName1 = txtName + " " + getName;
        textViewName.setText(getName1);


        String txtFam = getFam + " " + textViewFam.getText();
        textViewFam.setText(txtFam);

//        setContentView(textViewName);
//        setContentView(textViewFam);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
