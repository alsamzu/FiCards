package com.example.fi_cards.ui;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fi_cards.R;

public class MainPage extends AppCompatActivity {
        private ConstraintLayout attendance;
        private ConstraintLayout exams;
    private ConstraintLayout fees;
    private ConstraintLayout news;
    private ConstraintLayout discipline;
    private ConstraintLayout health;
    private ConstraintLayout bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        attendance = findViewById(R.id.attendance);
        exams = findViewById(R.id.exams);
        fees = findViewById(R.id.fees);
        news = findViewById(R.id.news);
        discipline = findViewById(R.id.discipline);
        health = findViewById(R.id.health);
        bus = findViewById(R.id.bus);

        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,AtendanceActivity.class);
                startActivity(intent);
            }
        });

        exams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,ExamsActivity.class);
                startActivity(intent);


            }
        });

        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,FeesActivity.class);
                startActivity(intent);


            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,NewsActivity.class);
                startActivity(intent);


            }
        });
        discipline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,DisciplineActivity.class);
                startActivity(intent);


            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,HealthActivity.class);
                startActivity(intent);


            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,BusActivity.class);
                startActivity(intent);


            }
        });


    }
}
