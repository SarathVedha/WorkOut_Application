package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class begi_tuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_tuesday);

        CardView leftCard1 = findViewById(R.id.LeftCard1);
        CardView rightCard = findViewById(R.id.RightCard);
        CardView leftCard2 = findViewById(R.id.LeftCard2);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anime_left_right);
        leftCard1.setAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.anime_bottom_top);
        leftCard2.setAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.anime_right_left);
        rightCard.setAnimation(animation2);

        leftCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_tuesday.this,begi_squad.class);
                startActivity(intent);
            }
        });

        leftCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_tuesday.this,begi_hamstring.class);
                startActivity(intent);
            }
        });

        rightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_tuesday.this,begi_calf.class);
                startActivity(intent);
            }
        });

    }
}