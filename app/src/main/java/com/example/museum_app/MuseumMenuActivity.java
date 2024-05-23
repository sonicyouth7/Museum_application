package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MuseumMenuActivity extends AppCompatActivity {
        private ImageView backButton, profileButton;
        private ImageButton NewsButton, showingButton, goodsButton,productsButton;
        private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menumuseums_activity);
//chercher les boutons avec findViewById
            profileButton = findViewById(R.id.ProfileButton);
            backButton = findViewById(R.id.backButton);

            NewsButton = findViewById(R.id.NewsButton);
            showingButton = findViewById(R.id.showing);
            goodsButton = findViewById(R.id.goods);
            productsButton = findViewById(R.id.products);
            checkBox2 = findViewById(R.id.checkBox2);
            checkBox3 = findViewById(R.id.checkBox3);
            checkBox4 = findViewById(R.id.checkBox4);
            checkBox5 = findViewById(R.id.checkBox5);


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
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

             showingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

             goodsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });
        productsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                startActivity(intent);
            }
        });



            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                }
            });

            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                }
            });

            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                }
            });

            checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                }
            });





        }
    }
