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

public class intra_plan extends AppCompatActivity {

    private TextView day,Name,Name2;
    private ImageView back;
    private RoundedImageView monday,tuesday,thursday,friday,saturday,rest,diet,Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_plan);


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

        back = findViewById(R.id.backImg);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this,MainActivity.class);
                startActivity(intent);
            }
        });

        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        rest = findViewById(R.id.restday);
        diet = findViewById(R.id.intra_diet);

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_monday.class);
                startActivity(intent);
            }
        });

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_tuesday.class);
                startActivity(intent);
            }
        });

        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_thursday.class);
                startActivity(intent);
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_friday.class);
                startActivity(intent);
            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_thursday.class);
                startActivity(intent);
            }
        });

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_rest.class);
                startActivity(intent);
            }
        });

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_plan.this, intra_diet.class);
                startActivity(intent);
            }
        });
    }
}