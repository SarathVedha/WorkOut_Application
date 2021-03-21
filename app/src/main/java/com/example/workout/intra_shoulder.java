package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_shoulder);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemMilitary_Press = new VideoItem();
        videoItemMilitary_Press.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Shoulder%2FMilitary_Press.m4v?alt=media&token=61c9405e-3c4f-413a-acdd-0a091c666e69";
        videoItemMilitary_Press.videoTittle = "WORKOUT#1 MILITARY PRESS";
        videoItemMilitary_Press.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemMilitary_Press);

        VideoItem videoItemFront_Raises = new VideoItem();
        videoItemFront_Raises.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Shoulder%2FCable_Front_Raises.m4v?alt=media&token=7e6b57e6-b59a-4eb2-9122-857238efc9fa";
        videoItemFront_Raises.videoTittle = "WORKOUT#2 CABLE FRONT RAISES";
        videoItemFront_Raises.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemFront_Raises);

        VideoItem videoItemShoulder_Fly = new VideoItem();
        videoItemShoulder_Fly.videoTittle = "WORKOUT#3 SHOULDER LATERAL RAISE ";
        videoItemShoulder_Fly.videoDescription = "3-sets (10-15 Reps)";
        videoItemShoulder_Fly.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Shoulder%2FShoulder_Lateral_Raise.m4v?alt=media&token=80d31e11-5bd6-4d66-91d3-324da9722211";
        videoItems.add(videoItemShoulder_Fly);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}