package com.example.onclickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
//        btnOk = findViewById(R.id.btnOk);
//        btnCancel = findViewById(R.id.btnCancel);
//
//        Первый вариант
//        btnOk.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                tvOut.setText("Нажата кнопка Ok");
//            }
//        });
//
//        btnCancel.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                tvOut.setText("Нажата кнопка Cancel");
//            }
//        });
//
//
//        Второй вариант
//        View.OnClickListener oclBtnOk = new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                tvOut.setText("Нажата кнопка Ok");
//            }
//        };
//        btnOk.setOnClickListener(oclBtnOk);
//
//        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                tvOut.setText("Нажата кнопка Cancel");
//            }
//        };
//        btnCancel.setOnClickListener(oclBtnCancel);

    }

    //Третий вариант
    public void btnOk(View view) {
        tvOut.setText("Нажата кнопка Ok");
    }

    public void btnCancel(View view) {
        tvOut.setText("Нажата кнопка Cancel");
    }
}