package com.example.workout;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class begi_diet extends AppCompatActivity {

    private TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begi_diet);

        textView = findViewById(R.id.textView13);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView2 = findViewById(R.id.textView14);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}