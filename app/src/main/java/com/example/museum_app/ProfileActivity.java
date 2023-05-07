package com.example.museum_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ObjectInputStream;
import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {
    private ImageView backButton, SettingsIcon, EditIcon, imageprofile;
    private TextView ChangePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        SettingsIcon = findViewById(R.id.SettingsIcon);
        EditIcon = findViewById(R.id.EditIcon);
        ChangePassword = findViewById(R.id.ChangePassword);
        backButton = findViewById(R.id.backButton);
        imageprofile = findViewById(R.id.imageprofile);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        Picasso.get().load("https://newprofilepic2.photo-cdn.net//assets/images/article/profile.jpg")
                .centerCrop()
                .fit()
                .into(imageprofile);

//vu qu'on a pas d'autre pages ici nous avons préféré seulement intercepter le click et un pop up apparait
        SettingsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "SettingsIcon cliqué!", Toast.LENGTH_SHORT).show();
            }
        });

        EditIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "EditIcon cliqué!", Toast.LENGTH_SHORT).show();
            }
        });

        ChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "ChangePassword cliqué!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
