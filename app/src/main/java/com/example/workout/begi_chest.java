package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_chest);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videosItem = new ArrayList<>();

        VideoItem videoItemIncline_Chest = new VideoItem();
        videoItemIncline_Chest.videoTittle = "WORKOUT#1 INCLINE BARBELL PRESS ";
        videoItemIncline_Chest.videoDescription= "3-sets (10-15 Reps)";
        videoItemIncline_Chest.videoURL ="https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FIncline_Bench_Press.m4v?alt=media&token=a2f98044-c4d9-4a5b-b7fe-bbca9c06f3bd";
        videosItem.add(videoItemIncline_Chest);

        VideoItem videoItemDumBBell_Chest = new VideoItem();
        videoItemDumBBell_Chest.videoTittle = "WORKOUT#2 FLAT DUMBBELL PRESS ";
        videoItemDumBBell_Chest.videoDescription = "3-sets (10-15 Reps)";
        videoItemDumBBell_Chest.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FFlat_Dumbbell_Press.m4v?alt=media&token=e03fc986-3d0d-4a7a-a749-e96818856ef4";
        videosItem.add(videoItemDumBBell_Chest);

        VideoItem videoItemDumBBell_Fly = new VideoItem();
        videoItemDumBBell_Fly.videoTittle = "WORKOUT#3 FLAT DUMBBELL FLYS ";
        videoItemDumBBell_Fly.videoDescription = "3-sets (10-15 Reps)";
        videoItemDumBBell_Fly.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Chest%2FFlat_Dumbbell_Fly.m4v?alt=media&token=da4ef1be-6060-4a89-8b2e-4c5ea31476ab";
        videosItem.add(videoItemDumBBell_Fly);

        VideoItem videoItemShoulder_Fly = new VideoItem();
        videoItemShoulder_Fly.videoTittle = "WORKOUT#4 SHOULDER LATERAL RAISE ";
        videoItemShoulder_Fly.videoDescription = "3-sets (10-15 Reps)";
        videoItemShoulder_Fly.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Shoulder%2FShoulder_Lateral_Raise.m4v?alt=media&token=80d31e11-5bd6-4d66-91d3-324da9722211";
        videosItem.add(videoItemShoulder_Fly);

        videosViewPager.setAdapter(new VideoAdapter(videosItem));

    }
}