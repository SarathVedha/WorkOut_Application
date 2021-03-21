package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_calf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_calf);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoStandingCalve_raise = new VideoItem();
        videoStandingCalve_raise.videoTittle = "WORKOUT#1 STANDING CALVE RAISE";
        videoStandingCalve_raise.videoDescription = " 3- Sets (10-15 Reps) ";
        videoStandingCalve_raise.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FStanding_Calf_Raise.m4v?alt=media&token=013f46ba-b2fa-4eab-ab65-5cb4295ab5d7";
        videoItems.add(videoStandingCalve_raise);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}