package com.example.callintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonMail();
        buttonWeb();
        buttonMap();
        buttonCall();
    }

    private void buttonCall() {
        Button buttonCall = findViewById(R.id.button_call);
        buttonCall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri number = Uri.parse("Tel: ");
                Intent callIntent = new Intent(Intent.ACTION_DIAL,number);

                if(isIntentSave(callIntent))
                    startActivity(callIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonMap(){
        Button buttonMap = findViewById(R.id.button_map);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("Geo: 52.01315, -113.50087?z=14");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);

                if(isIntentSave(mapIntent))
                    startActivity(mapIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonWeb(){
        Button buttonWeb = findViewById(R.id.button_web);
        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webPage = Uri.parse("http://vk.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);

                if(isIntentSave(webIntent))
                    startActivity(webIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonMail() {
        Button buttonMail = findViewById(R.id.button_mail);
        buttonMail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto",
                        "example@gmail.com",null));
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hello@mail.com","hi@mail.ru"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Send Intent Message");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I text my mail by Android APP");

            }
        });
    }

    private boolean isIntentSave(Intent intent){
        PackageManager packageManager = getPackageManager();
        @SuppressLint("QueryPermissionsNeeded")
        List <ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        return activities.size() > 0;
    }
}