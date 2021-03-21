package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class intra_thursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_thursday);


        CardView topCard = findViewById(R.id.TopCard);
        CardView topCard2 = findViewById(R.id.TopCard2);
        CardView topCard3 = findViewById(R.id.TopCard3);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anime_left_right);
        topCard.setAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.anime_bottom_top);
        topCard3.setAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.anime_right_left);
        topCard2.setAnimation(animation2);

        topCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_thursday.this,intra_core1.class);
                startActivity(intent);
            }
        });

        topCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_thursday.this,intra_core2.class);
                startActivity(intent);
            }
        });

        topCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_thursday.this,intra_abs.class);
                startActivity(intent);
            }
        });

    }
}