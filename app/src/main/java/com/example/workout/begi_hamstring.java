package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class begi_hamstring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_hamstring);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoHamstring_curl = new VideoItem();
        videoHamstring_curl.videoTittle = "WORKOUT#1 HAMSTRING CURL";
        videoHamstring_curl.videoDescription = " 3- Sets (10-15 Reps) ";
        videoHamstring_curl.videoURL = "https://firebasestorage.googleapis.com/v0/b/workout-d84a8.appspot.com/o/Leg%2FHamstring_Curls.m4v?alt=media&token=70d312a1-164d-448f-b797-d8b503ec0e3c";
        videoItems.add(videoHamstring_curl);

        videosViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}