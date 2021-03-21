package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class intra_squad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_squad);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoBarbell_squats = new VideoItem();
        videoBarbell_squats.videoTittle = "WORKOUT#1 BARBELL SQUATS";
        videoBarbell_squats.videoDescription = " 3- Sets (10-15 Reps) ";
        videoBarbell_squats.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FBarbell_Squats.m4v?alt=media&token=aba8c149-1753-4c6f-8bcf-96202fcb694f";
        videoItems.add(videoBarbell_squats);

        VideoItem videoLunges = new VideoItem();
        videoLunges.videoTittle = "WORKOUT#2 LUNGES";
        videoLunges.videoDescription = " 3- Sets (10-15 Reps) ";
        videoLunges.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FLunges.m4v?alt=media&token=b9093c0f-37e6-410c-bd8e-18b623fe6c26";
        videoItems.add(videoLunges);

        VideoItem videoLeg_Press = new VideoItem();
        videoLeg_Press.videoTittle = "WORKOUT#3 LEG PRESS";
        videoLeg_Press.videoDescription = " 3- Sets (10-15 Reps) ";
        videoLeg_Press.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FLeg%20Press.m4v?alt=media&token=d1926135-e09e-443b-871e-7fd4a974727c";
        videoItems.add(videoLeg_Press);

        VideoItem videoLeg_Extensions = new VideoItem();
        videoLeg_Extensions.videoTittle = "WORKOUT#4 LEG Extensions";
        videoLeg_Extensions.videoDescription = " 3- Sets (10-15 Reps) ";
        videoLeg_Extensions.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FLeg%20Extensions.m4v?alt=media&token=c1ed5866-a9a1-45aa-8946-8b0b4d9ce10c";
        videoItems.add(videoLeg_Extensions);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}