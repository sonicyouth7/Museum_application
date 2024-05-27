package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

        // 处理菜单按钮的点击事件
        setupMenuButtons();

        // 处理其他图标的点击事件
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

    private void setupMenuButtons() {
        ImageButton btnHome = findViewById(R.id.home);
        ImageButton btnProfile = findViewById(R.id.profile);
        ImageButton btninfo = findViewById(R.id.info);
        ImageButton btnGoods = findViewById(R.id.goods_btn);


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "Home button clicked");
                Intent intent = new Intent(ProfileActivity.this, MuseumMenuActivity.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "Profile button clicked");
                Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "info button clicked");
                Intent intent = new Intent(ProfileActivity.this, InfosActivity.class);
                startActivity(intent);
            }
        });

        btnGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "Oeuvres button clicked");
                Intent intent = new Intent(ProfileActivity.this, CarrouselActivity.class);
                startActivity(intent);
            }
        });
    }
}
