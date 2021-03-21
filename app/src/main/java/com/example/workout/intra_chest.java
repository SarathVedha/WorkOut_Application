package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_chest);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemIncline_Chest = new VideoItem();
        videoItemIncline_Chest.videoTittle = "WORKOUT#1 INCLINE BARBELL PRESS ";
        videoItemIncline_Chest.videoDescription= "3-sets (10-15 Reps)";
        videoItemIncline_Chest.videoURL ="https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FIncline_Bench_Press.m4v?alt=media&token=a2f98044-c4d9-4a5b-b7fe-bbca9c06f3bd";
        videoItems.add(videoItemIncline_Chest);

        VideoItem videoItemFlat_Chest = new VideoItem();
        videoItemFlat_Chest.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FFlat_Bench_Press.m4v?alt=media&token=46526220-3703-4264-bc4c-2c25be4a7ad3";
        videoItemFlat_Chest.videoTittle = "WORKOUT#2 FLAT BARBELL PRESS";
        videoItemFlat_Chest.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemFlat_Chest);

        VideoItem videoItemPec_Fly = new VideoItem();
        videoItemPec_Fly.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FPec_Fly.m4v?alt=media&token=d4fe69c9-5032-46a0-8fc3-bf9dbf775c83";
        videoItemPec_Fly.videoTittle = "WORKOUT#3 PEC FLY";
        videoItemPec_Fly.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemPec_Fly);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}