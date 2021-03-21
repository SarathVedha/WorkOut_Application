package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_traps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_traps);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemShrugs = new VideoItem();
        videoItemShrugs.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FShrugs.m4v?alt=media&token=740d2c1b-7500-44c5-8812-b73ac9cd86a7";
        videoItemShrugs.videoTittle = "WORKOUT#1 SHRUGS";
        videoItemShrugs.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemShrugs);

        VideoItem videoItemRear_delt_Fly = new VideoItem();
        videoItemRear_delt_Fly.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FReardelt%20Flys.m4v?alt=media&token=e5ce78fb-299a-4626-a009-ec8b5a518b7f";
        videoItemRear_delt_Fly.videoTittle = "WORKOUT#2 REAR DELT FLY";
        videoItemRear_delt_Fly.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemRear_delt_Fly);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}