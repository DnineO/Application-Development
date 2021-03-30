package com.example.viewcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        etName = (EditText) findViewById(R.id.etName);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this::onClick);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this::onClick);
    }

    @SuppressLint({"NonConstantResourceId","RtlHardcoded"})
    private void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCreate:
                //create param with height and width
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(wrapContent,wrapContent);

                 @SuppressLint("RtlHardcoded") int btnGravity = Gravity.LEFT;
                switch (rgGravity.getCheckedRadioButtonId()){
                 case R.id.rbLeft:
                     btnGravity = Gravity.LEFT;
                     break;
                 case R.id.rbCenter:
                     btnGravity = Gravity.CENTER;
                     break;
                 case R.id.rbRight:
                     btnGravity = Gravity.RIGHT;
                     break;
             }
             lParams.gravity = btnGravity;

             Button btnNew = new Button(this);
             btnNew.setText(etName.getText().toString());
             llMain.addView(btnNew,lParams);
             break;

            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this,"Удалено",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}