package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.text.DateFormat;
import java.util.Calendar;

public class beginner_plan extends AppCompatActivity {

    TextView day,Name,Name2;
    private ImageView Back;
    private RoundedImageView MonDay,TuesDay,ThursDay,FriDay,Rest,Diet,Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_plan);

        Intent intent = getIntent();
        Name = findViewById(R.id.usName);
        String user_name = intent.getStringExtra("Name");
        Name.setText(user_name);

        Name2 = findViewById(R.id.usName2);
        Name2.setText("Hii There, "+user_name.toUpperCase());

        Profile = findViewById(R.id.profileImg);
        Uri user_profile = intent.getData();
        Glide.with(this).load(user_profile).into(Profile);

        day = findViewById(R.id.dayTv);
        Calendar calendar = Calendar.getInstance();
        String currentDay = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        day.setText(currentDay);

        Back = findViewById(R.id.backImg);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this,MainActivity.class);
                startActivity(intent);
            }
        });

        MonDay = findViewById(R.id.monday);
        TuesDay = findViewById(R.id.tuesday);
        ThursDay = findViewById(R.id.thursday);
        FriDay = findViewById(R.id.friday);
        Rest = findViewById(R.id.restday);
        Diet = findViewById(R.id.beginnerdiet);

        MonDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_monday.class);
                startActivity(intent);
            }
        });

        TuesDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_tuesday.class);
                startActivity(intent);
            }
        });

        ThursDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_monday.class);
                startActivity(intent);
            }
        });

        FriDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_tuesday.class);
                startActivity(intent);
            }
        });

        Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_rest.class);
                startActivity(intent);
            }
        });

        Diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_plan.this, begi_diet.class);
                startActivity(intent);
            }
        });
    }
}