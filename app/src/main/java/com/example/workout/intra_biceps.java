package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_biceps);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemPreacher_Curl = new VideoItem();
        videoItemPreacher_Curl.videoTittle = "WORKOUT#1 PREACHER CURLS";
        videoItemPreacher_Curl.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemPreacher_Curl.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Biceps%2FPreacher_Curls.m4v?alt=media&token=7db865cb-37de-43df-841b-8e067c763cb7";
        videoItems.add(videoItemPreacher_Curl);

        VideoItem videoItemHammer_Curls = new VideoItem();
        videoItemHammer_Curls.videoTittle = "WORKOUT#2 HAMMER CURLS";
        videoItemHammer_Curls.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemHammer_Curls.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Biceps%2FHammer%20Curls.m4v?alt=media&token=6acb802c-53c2-415a-a73f-59def4f51704";
        videoItems.add(videoItemHammer_Curls);

        VideoItem videoItemReverse_Curls = new VideoItem();
        videoItemReverse_Curls.videoTittle = "WORKOUT#3 REVERSE CURLS";
        videoItemReverse_Curls.videoDescription = "3 - Sets (10-15 Reps)";
        videoItemReverse_Curls.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Biceps%2FReverse%20Curls.m4v?alt=media&token=52a91897-90ae-4e48-b91e-cb3529fb87df";
        videoItems.add(videoItemReverse_Curls);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}