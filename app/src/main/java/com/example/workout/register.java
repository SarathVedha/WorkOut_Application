package com.example.workout;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class register extends AppCompatActivity {

    ImageView back,profileupload;
    Button register;
    EditText useremail,username,userphoneno,userpassword;
    ProgressBar progressBar;
    Uri imageUri;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    StorageReference storageReference = FirebaseStorage.getInstance().getReference("Users_Profiles");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        back = findViewById(R.id.backbtn);
        register = findViewById(R.id.registerbtn);
        useremail = findViewById(R.id.editTextTextEmailAddress);
        username = findViewById(R.id.editTextTextPersonName);
        userphoneno = findViewById(R.id.editTextTextPersonName2);
        userpassword = findViewById(R.id.editTextTextPassword);
        profileupload = findViewById(R.id.imageView2);
        progressBar = findViewById(R.id.progressBar);

        progressBar.setVisibility(View.INVISIBLE);

        profileupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent();
                galleryIntent.setAction(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, 2);
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                registerUser(register);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this,login.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==2 && resultCode==RESULT_OK && data !=null){
            imageUri = data.getData();profileupload.setImageURI(imageUri);
            profileupload.setImageURI(imageUri);
        }
    }

    private Boolean validateName() {
        String val = username.getEditableText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (val.isEmpty()) {
            username.setError("Field cannot be empty");
            return false;
        } else if (val.length() >= 15) {
            username.setError("Username too long");
            return false;
        } else if (!val.matches(noWhiteSpace)) {
            username.setError("White Spaces are not allowed");
            return false;
        } else {
            username.setError(null);
            return true;
        }
    }

    private Boolean validateEmail() {
        String val = useremail.getEditableText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()) {
            useremail.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            useremail.setError("Invalid email address");
            return false;
        } else {
            useremail.setError(null);
            return true;
        }
    }

    private Boolean validatePhoneNo() {
        String val = userphoneno.getEditableText().toString();

        if (val.isEmpty()) {
            userphoneno.setError("Field cannot be empty");
            return false;
        }else if (val.length() != 10) {
            userphoneno.setError("Invalid PhoneNumber");
            return false;
        }else {
            userphoneno.setError(null);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = userpassword.getEditableText().toString();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (val.isEmpty()) {
            userpassword.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(passwordVal)) {
            userpassword.setError("Password is too weak");
            return false;
        } else {
            userpassword.setError(null);
            return true;
        }
    }

    private void uploadTOFirebase (Uri uri) {

        StorageReference fileRef = storageReference.child(System.currentTimeMillis()+ "." + getFileExtension(uri));
        fileRef.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        String email = useremail.getEditableText().toString();
                        String name = username.getEditableText().toString();
                        String phone = userphoneno.getEditableText().toString();
                        String password = userpassword.getEditableText().toString();
                        String imageUrl = uri.toString();

                        UserHelperClass helperClass = new UserHelperClass(email, name, phone, password, imageUrl);
                        reference.child(phone).setValue(helperClass);

                        progressBar.setVisibility(View.INVISIBLE);

                        Toast.makeText(register.this, "Register Success", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(register.this,login.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                progressBar.setVisibility(View.VISIBLE);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressBar.setVisibility(View.INVISIBLE);
                Toast.makeText(register.this, "Uploading Failed !!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getFileExtension(Uri muri) {

        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(muri));
    }

    public void registerUser(View view) {

        if(!validateName() |!validatePassword() | !validatePhoneNo() | !validateEmail() )
        {
            Toast.makeText(this,"Register Failed",Toast.LENGTH_LONG).show();

        }else {

            if (imageUri != null){
                uploadTOFirebase(imageUri);
            }else {
                Toast.makeText(this, "Please Select Image", Toast.LENGTH_SHORT).show();
            }

        }

    }


}