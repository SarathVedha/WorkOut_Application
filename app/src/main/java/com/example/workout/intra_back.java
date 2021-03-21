package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_back);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemBack_Extension = new VideoItem();
        videoItemBack_Extension.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FBack%20Extensions.m4v?alt=media&token=7091bdd4-035a-44cd-b696-1b123c346461";
        videoItemBack_Extension.videoTittle = "WORKOUT#1 BACK EXTENSIONS";
        videoItemBack_Extension.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemBack_Extension);

        VideoItem videoItemBarbell_Rowing = new VideoItem();
        videoItemBarbell_Rowing.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FBarbell%20Rowing.m4v?alt=media&token=2ac01a8e-4065-4fce-8694-84ccffaf0754";
        videoItemBarbell_Rowing.videoTittle = "WORKOUT#2 BARBELL ROWING";
        videoItemBarbell_Rowing.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemBarbell_Rowing);

        VideoItem videoItemDumbbell_Rowing = new VideoItem();
        videoItemDumbbell_Rowing.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FOnearm%20Dumbell%20Rowing.m4v?alt=media&token=8dc854e6-3fee-493c-a5de-ed3628309a14";
        videoItemDumbbell_Rowing.videoTittle = "WORKOUT#3 ONE_ARM DUMBBELL ROWING";
        videoItemDumbbell_Rowing.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemDumbbell_Rowing);

        VideoItem videoItemPull_Ups = new VideoItem();
        videoItemPull_Ups.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Back%2FPull_Ups.m4v?alt=media&token=e5294cd7-f357-454d-a801-38ff57bba8e6";
        videoItemPull_Ups.videoTittle = "WORKOUT#4 PULL UPS";
        videoItemPull_Ups.videoDescription = "3-Sets (10-15 Reps)";
        videoItems.add(videoItemPull_Ups);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}