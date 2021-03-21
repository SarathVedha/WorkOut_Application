package com.example.workout;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class begi_rest extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_rest);

        tv1 = findViewById(R.id.dietPlan);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}