package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_triceps);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemDumbbell_Kickback = new VideoItem();
        videoItemDumbbell_Kickback.videoTittle = "WORKOUT#1 DUMBBELL KICKBACKS";
        videoItemDumbbell_Kickback.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemDumbbell_Kickback.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Triceps%2FDumbbell_Kickback.m4v?alt=media&token=799663a0-a0f8-4d2c-a0e7-3020986a4886";
        videoItems.add(videoItemDumbbell_Kickback);

        VideoItem videoItemTriceps_Extensions = new VideoItem();
        videoItemTriceps_Extensions.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Triceps%2FTriceps_Push_Down.m4v?alt=media&token=76bc6548-bc62-4957-8212-cbd40ce53985";
        videoItemTriceps_Extensions.videoTittle = "WORKOUT#2 TRICEPS EXTENSIONS";
        videoItemTriceps_Extensions.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemTriceps_Extensions);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}