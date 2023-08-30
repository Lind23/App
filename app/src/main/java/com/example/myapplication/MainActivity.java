package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
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


        ActionBar ab = getSupportActionBar();
        ab.setTitle("SALVILLA");


        Button btn_des1 = findViewById(R.id.btn_des1);
        Button btn_des2 = findViewById(R.id.btn_des2);
        Button btn_des3 = findViewById(R.id.btn_des3);
        Button btn_des4 = findViewById(R.id.btn_des4);


        btn_des1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),honda_car.class);
                startActivity(i);
            }
        });

        btn_des2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),mazda_car.class);
                startActivity(i);
            }
        });

        btn_des3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),nissan_car.class);
                startActivity(i);
            }
        });

        btn_des4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),toyota_car.class);
                startActivity(i);
            }
        });

    }
}