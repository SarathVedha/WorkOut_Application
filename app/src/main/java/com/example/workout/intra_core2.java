package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_core2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_core2);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemStationary_Bike = new VideoItem();
        videoItemStationary_Bike.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Cardio%2FStationary_Bike.m4v?alt=media&token=4f7b9387-3a04-4a6c-8eef-a84cd2191d0c";
        videoItemStationary_Bike.videoTittle = "DO BIKE";
        videoItemStationary_Bike.videoDescription = "(15 MiNs)";
        videoItems.add(videoItemStationary_Bike);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}