package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_back);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemPull_Ups = new VideoItem();
        videoItemPull_Ups.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FPull_Ups.m4v?alt=media&token=e5294cd7-f357-454d-a801-38ff57bba8e6";
        videoItemPull_Ups.videoTittle = "WORKOUT#1 PULL UPS";
        videoItemPull_Ups.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemPull_Ups);

        VideoItem videoItemTBar_Rowing = new VideoItem();
        videoItemTBar_Rowing.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FT-Bar%20Rowing.m4v?alt=media&token=643888a1-56db-49ad-84b9-0c0b35293276";
        videoItemTBar_Rowing.videoTittle = "WORKOUT#2 T-BAR ROWING";
        videoItemTBar_Rowing.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemTBar_Rowing);

        VideoItem videoItemShrugs = new VideoItem();
        videoItemShrugs.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FShrugs.m4v?alt=media&token=740d2c1b-7500-44c5-8812-b73ac9cd86a7";
        videoItemShrugs.videoTittle = "WORKOUT#3 SHRUGS";
        videoItemShrugs.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemShrugs);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));
    }
}