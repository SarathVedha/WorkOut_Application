package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.makeramen.roundedimageview.RoundedImageView;

public class MainActivity extends AppCompatActivity {

    private CardView Beginner,Intra;
    private Button logOut;
    private TextView Name;
    private RoundedImageView Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.usName);
        Profile = findViewById(R.id.profileImg);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();


            Name.setText(personGivenName);
            Glide.with(this).load(personPhoto).into(Profile);
            Toast.makeText(this,"Sign In as "+personEmail,Toast.LENGTH_LONG).show();

            Beginner = findViewById(R.id.cardBE);
            Beginner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, beginner_plan.class);
                    intent.putExtra("Name",personGivenName);
                    intent.setData(personPhoto);
                    startActivity(intent);
                }
            });

            Intra = findViewById(R.id.cardIN);
            Intra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(MainActivity.this,intra_plan.class);
                    intent2.putExtra("Name",personGivenName);
                    intent2.setData(personPhoto);
                    startActivity(intent2);
                }
            });
        }else {
            Intent intent = getIntent();
            String user_name = intent.getStringExtra("Name");
            Name.setText(user_name);

            Uri user_photo = intent.getData();
            Glide.with(this).load(user_photo).into(Profile);

            Beginner = findViewById(R.id.cardBE);
            Beginner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, beginner_plan.class);
                    intent.putExtra("Name",user_name);
                    intent.setData(user_photo);
                    startActivity(intent);
                }
            });

            Intra = findViewById(R.id.cardIN);
            Intra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this,intra_plan.class);
                    intent.putExtra("Name",user_name);
                    intent.setData(user_photo);
                    startActivity(intent);
                }
            });
        }

        logOut = findViewById(R.id.logOutBtn);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),sign_in.class));
                finish();
            }
        });

        Animation AnimBottom_Top = AnimationUtils.loadAnimation(this,R.anim.anime_bottom_top);
        Beginner.setAnimation(AnimBottom_Top);

        Animation AnimBottomTop2 = AnimationUtils.loadAnimation(this,R.anim.anime_bottom_top);
        Intra.setAnimation(AnimBottomTop2);

    }

}