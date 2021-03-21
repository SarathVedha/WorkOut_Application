package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_bicep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_bicep);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemIncline_Supine = new VideoItem();
        videoItemIncline_Supine.videoTittle = "WORKOUT#1 INCLINE SUPINE CURLS";
        videoItemIncline_Supine.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemIncline_Supine.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Biceps%2FIncline_Supine_Curls.m4v?alt=media&token=8e9bf0ba-7d63-48a5-9a14-42e81cf6f020";
        videoItems.add(videoItemIncline_Supine);

        VideoItem videoItemPreacher_Curl = new VideoItem();
        videoItemPreacher_Curl.videoTittle = "WORKOUT#2 PREACHER CURLS";
        videoItemPreacher_Curl.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemPreacher_Curl.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Biceps%2FPreacher_Curls.m4v?alt=media&token=7db865cb-37de-43df-841b-8e067c763cb7";
        videoItems.add(videoItemPreacher_Curl);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}