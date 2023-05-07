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
        private ImageButton LouvreButton, OrsayButton, PetitPalaisButton, CiteScienceButton;
        private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menumuseums_activity);

            profileButton = findViewById(R.id.ProfileButton);
            backButton = findViewById(R.id.backButton);
            LouvreButton = findViewById(R.id.LouvreButton);
            OrsayButton = findViewById(R.id.OrsayButton);
            PetitPalaisButton = findViewById(R.id.PetitPalais);
            CiteScienceButton = findViewById(R.id.CiteScience);

            checkBox1 = findViewById(R.id.checkBox1);
            checkBox2 = findViewById(R.id.checkBox2);
            checkBox3 = findViewById(R.id.checkBox3);
            checkBox4 = findViewById(R.id.checkBox4);
            checkBox5 = findViewById(R.id.checkBox5);
            checkBox6 = findViewById(R.id.checkBox6);
            checkBox7 = findViewById(R.id.checkBox7);

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

            LouvreButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

            OrsayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

             PetitPalaisButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

             CiteScienceButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MuseumMenuActivity.this, MenuGeneral.class);
                    startActivity(intent);
                }
            });

            checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override //comme on a utilisé déjà un bouton CheckBox ici le code determine
                //les changements automatiquement avec la méthode OnCheckedChanged qui permet
                //de voir si la case est coché ou pas
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    //ici on aurait pu définir des comportements en cas la case est accoché ou pas
                    //exemple if la case est cochée alor une action est faite else non
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

            checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                }
            });

            checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                }
            });

        }
    }
