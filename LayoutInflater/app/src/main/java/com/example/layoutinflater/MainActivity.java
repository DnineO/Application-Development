package com.example.layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String[] name = {"Влад", "Кирилл", "Полина", "Даша", "Иван", "Борис", "Костя"};
    String[] position = {"Программист","Бухгалтер","Директор","Охранник","Программист","Бухгалтер","Охранник"};
    int salary[] = {15000, 13000, 25000, 11000, 15000, 13000, 11000};
    int[] colors = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linlayot);
        LayoutInflater ItInFlater = getLayoutInflater();

        for (int i=0; i< name.length; i++){
            Log.d("mylogs","i = "+ i);

            View item = ItInFlater.inflate(R.layout.item,linLayout,false);

            TextView tvName = item.findViewById(R.id.tvName);
            tvName.setText(name[i]);

            TextView tvPosition = item.findViewById(R.id.tvPosition);
            tvPosition.setText("Должность: "+position[i]);

            TextView tvSalary = item.findViewById(R.id.tvSalary);
            tvSalary.setText("Оклад: "+salary[i]);

            item.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);

            linLayout.addView(item);
        }
    }
}