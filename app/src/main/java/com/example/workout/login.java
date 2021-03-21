package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    private Button login;
    private TextView register;
    private ImageView back;
    private EditText userPhoneNo,userPassword;
    Uri uri ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userPhoneNo = findViewById(R.id.editTextTextPersonName);
        userPassword = findViewById(R.id.editTextTextPassword);



        login = findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isUser(login);
            }

        });

        back = findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,sign_in.class);
                startActivity(intent);
            }
        });

        register = findViewById(R.id.textView17);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });


    }

    private void isUser(View view) {
        if (!validatePhoneNo() | !validatePassword()) {

            Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();

        }else {
            String UserEnteredUserName = userPhoneNo.getEditableText().toString();
            String UserEnteredUserPassword = userPassword.getEditableText().toString();

            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");

            Query checkUser = reference.orderByChild("phone").equalTo(UserEnteredUserName);

            checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    if (snapshot.exists()){

                        userPhoneNo.setError(null);

                        String passwordFromDB = snapshot.child(UserEnteredUserName).child("password").getValue(String.class);

                        if (passwordFromDB.equals(UserEnteredUserPassword)) {

                            userPassword.setError(null);

                            String nameFromDB = snapshot.child(UserEnteredUserName).child("username").getValue(String.class);
                            String emailFromDB = snapshot.child(UserEnteredUserName).child("email").getValue(String.class);
                            String phoneFromDB = snapshot.child(UserEnteredUserName).child("phone").getValue(String.class);
                            String imageFromDB = snapshot.child(UserEnteredUserName).child("imageUrl").getValue(String.class);

                            uri = Uri.parse(imageFromDB);


                            Toast.makeText(login.this," Login Success! ",Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(login.this,MainActivity.class);
                            intent.putExtra("Name",nameFromDB);
                            intent.setData(uri);
                            startActivity(intent);
                            finish();

                        }else {
                            userPassword.setError("Wrong Password");
                            userPassword.requestFocus();
                        }
                    }else {
                        userPhoneNo.setError("No such User exists");
                        userPhoneNo.requestFocus();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }

    private Boolean validatePhoneNo() {
        String val = userPhoneNo.getEditableText().toString();

        if (val.isEmpty()) {
            userPhoneNo.setError("Field cannot be empty");
            return false;
        }else if (val.length() != 10) {
            userPhoneNo.setError("Invalid PhoneNumber");
            return false;
        }else {
            userPhoneNo.setError(null);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = userPassword.getEditableText().toString();

        if (val.isEmpty()) {
            userPassword.setError("Field cannot be empty");
            return false;
        } else {
            userPassword.setError(null);
            return true;
        }
    }
}