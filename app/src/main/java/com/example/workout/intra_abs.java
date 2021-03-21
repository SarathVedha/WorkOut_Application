package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_abs);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemBasic_Crunches = new VideoItem();
        videoItemBasic_Crunches.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Core%20%26%20Abs%2FBasic_Crunches.m4v?alt=media&token=68873bd1-e27b-464e-b75f-5dc8dcbb5100";
        videoItemBasic_Crunches.videoTittle = "WORKOUT#1 BASIC CRUNCHES";
        videoItemBasic_Crunches.videoDescription = "3-Sets (20 Reps)";
        videoItems.add(videoItemBasic_Crunches);

        VideoItem videoItemBicycle_Crunches = new VideoItem();
        videoItemBicycle_Crunches.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Core%20%26%20Abs%2FBicycle_Crunches.m4v?alt=media&token=fe90fb00-8628-4d86-92fc-d09923011484";
        videoItemBicycle_Crunches.videoTittle = "WORKOUT#2 OBLIQUE CRUNCHES";
        videoItemBicycle_Crunches.videoDescription = "3-Sets (20 Reps)";
        videoItems.add(videoItemBicycle_Crunches);

        VideoItem videoItemLeg_Raise = new VideoItem();
        videoItemLeg_Raise.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Core%20%26%20Abs%2FLeg_Raise.m4v?alt=media&token=8e0f5b54-fe3b-4a01-a1ff-f9b460251e77";
        videoItemLeg_Raise.videoTittle = "WORKOUT#3 LEG RAISES";
        videoItemLeg_Raise.videoDescription = "3-Sets (20 Reps)";
        videoItems.add(videoItemLeg_Raise);

        VideoItem videoItemFloor_Climbing = new VideoItem();
        videoItemFloor_Climbing.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Core%20%26%20Abs%2FFloor_Climbing.m4v?alt=media&token=3eddc2cf-558b-4a4f-9628-fce6624a4091";
        videoItemFloor_Climbing.videoTittle = "WORKOUT#4 FLOOR CLIMBING";
        videoItemFloor_Climbing.videoDescription = "3-Sets (20 Reps)";
        videoItems.add(videoItemFloor_Climbing);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}