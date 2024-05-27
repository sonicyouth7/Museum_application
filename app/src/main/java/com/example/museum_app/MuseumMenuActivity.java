package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MuseumMenuActivity extends AppCompatActivity {
        private ImageView backButton, profileButton;
        private ImageButton NewsButton, showingButton;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menumuseums_activity);
//chercher les boutons avec findViewById
            profileButton = findViewById(R.id.ProfileButton);
            backButton = findViewById(R.id.backButton);
            NewsButton = findViewById(R.id.NewsButton);
            showingButton = findViewById(R.id.showing);

        setupMenuButtons();
//bouton Back pour aller à la page d'avant avec modèl onBackPressed
            backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
            });

            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //avec intent on lui determine l'activité à faire
                    Intent intent = new Intent(MuseumMenuActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    }
                });


            NewsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, NewsGeneral.class);
                    startActivity(intent);
                }
            });

             showingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, InfosActivity.class);
                    startActivity(intent);
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
                Intent intent = new Intent(MuseumMenuActivity.this, MuseumMenuActivity.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "Profile button clicked");
                Intent intent = new Intent(MuseumMenuActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "info button clicked");
                Intent intent = new Intent(MuseumMenuActivity.this, InfosActivity.class);
                startActivity(intent);
            }
        });

        btnGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ProfileActivity", "Oeuvres button clicked");
                Intent intent = new Intent(MuseumMenuActivity.this, GoodsActivity.class);
                startActivity(intent);
            }
        });
    }
    }
