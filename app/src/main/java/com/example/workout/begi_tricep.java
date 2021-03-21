package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_tricep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_tricep);

        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemDumbbell_Kickback = new VideoItem();
        videoItemDumbbell_Kickback.videoTittle = "WORKOUT#1 DUMBBELL KICKBACKS";
        videoItemDumbbell_Kickback.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemDumbbell_Kickback.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Triceps%2FDumbbell_Kickback.m4v?alt=media&token=799663a0-a0f8-4d2c-a0e7-3020986a4886";
        videoItems.add(videoItemDumbbell_Kickback);

        VideoItem videoItemSkull_Crushers = new VideoItem();
        videoItemSkull_Crushers.videoTittle = "WORKOUT#2 SKULL CRUSHERS";
        videoItemSkull_Crushers.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemSkull_Crushers.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Triceps%2FSkull_Crushers.m4v?alt=media&token=89ddfb58-df13-45d4-99f7-20b5d2113682";
        videoItems.add(videoItemSkull_Crushers);

        videoViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}