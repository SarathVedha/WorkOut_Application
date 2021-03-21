package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class begi_monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_monday);

        CardView topCard = findViewById(R.id.TopCard);
        CardView rightCard = findViewById(R.id.RightCard);
        CardView leftCard = findViewById(R.id.LeftCard1);
        CardView leftCard2 = findViewById(R.id.LeftCard2);


        Animation AnimBottom_Top = AnimationUtils.loadAnimation(this,R.anim.anime_bottom_top);
        leftCard2.setAnimation(AnimBottom_Top);

        Animation AnimTop_Bottom = AnimationUtils.loadAnimation(this,R.anim.anime_top_bottom);
        topCard.setAnimation(AnimTop_Bottom);

        Animation AnimRight_Left = AnimationUtils.loadAnimation(this,R.anim.anime_right_left);
        rightCard.setAnimation(AnimRight_Left);

        Animation AnimLeft_Right = AnimationUtils.loadAnimation(this,R.anim.anime_left_right);
        leftCard.setAnimation(AnimLeft_Right);

        topCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_monday.this,begi_back.class);
                startActivity(intent);
            }
        });

        rightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_monday.this,begi_chest.class);
                startActivity(intent);
            }
        });

        leftCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_monday.this,begi_bicep.class);
                startActivity(intent);
            }
        });

        leftCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(begi_monday.this, begi_tricep.class);
                startActivity(intent);
            }
        });
    }
}