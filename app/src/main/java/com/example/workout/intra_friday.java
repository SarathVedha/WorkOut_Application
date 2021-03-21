package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class intra_friday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_friday);

        CardView topCard = findViewById(R.id.TopCard);
        CardView rightCard = findViewById(R.id.RightCard);
        CardView leftCard = findViewById(R.id.LeftCard1);


        Animation AnimTop_Bottom = AnimationUtils.loadAnimation(this,R.anim.anime_top_bottom);
        topCard.setAnimation(AnimTop_Bottom);

        Animation AnimRight_Left = AnimationUtils.loadAnimation(this,R.anim.anime_right_left);
        rightCard.setAnimation(AnimRight_Left);

        Animation AnimLeft_Right = AnimationUtils.loadAnimation(this,R.anim.anime_left_right);
        leftCard.setAnimation(AnimLeft_Right);


        topCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_friday.this,intra_chest.class);
                startActivity(intent);
            }
        });

        rightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_friday.this,intra_triceps.class);
                startActivity(intent);
            }
        });

        leftCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intra_friday.this,intra_shoulder.class);
                startActivity(intent);
            }
        });
    }
}