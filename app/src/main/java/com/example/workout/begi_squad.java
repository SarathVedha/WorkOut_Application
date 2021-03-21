package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_squad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_squad);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoFree_squad = new VideoItem();
        videoFree_squad.videoTittle = "WORKOUT#1 FREE SQUATS";
        videoFree_squad.videoDescription = " 3- Sets (10-15 Reps) ";
        videoFree_squad.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FFree_Squats.m4v?alt=media&token=762e3bff-45b3-413c-aeb7-2d395a2631b2";
        videoItems.add(videoFree_squad);

        VideoItem videoBarbell_squats = new VideoItem();
        videoBarbell_squats.videoTittle = "WORKOUT#2 BARBELL SQUATS";
        videoBarbell_squats.videoDescription = " 3- Sets (10-15 Reps) ";
        videoBarbell_squats.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FBarbell_Squats.m4v?alt=media&token=aba8c149-1753-4c6f-8bcf-96202fcb694f";
        videoItems.add(videoBarbell_squats);

        VideoItem videoLunges = new VideoItem();
        videoLunges.videoTittle = "WORKOUT#3 LUNGES";
        videoLunges.videoDescription = " 3- Sets (10-15 Reps) ";
        videoLunges.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FLunges.m4v?alt=media&token=b9093c0f-37e6-410c-bd8e-18b623fe6c26";
        videoItems.add(videoLunges);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}