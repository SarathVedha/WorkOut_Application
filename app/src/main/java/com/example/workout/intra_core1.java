package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_core1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_core1);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemTreadmill = new VideoItem();
        videoItemTreadmill.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Cardio%2FTreadmill.m4v?alt=media&token=d886cb7f-5b68-419b-9955-7a30c0d86fc0";
        videoItemTreadmill.videoTittle = "RUN TREADMILL";
        videoItemTreadmill.videoDescription = "(15 MiNs)";
        videoItems.add(videoItemTreadmill);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}