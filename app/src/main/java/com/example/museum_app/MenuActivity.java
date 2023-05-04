package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private ImageButton btnHistoire, btnOeuvres, btnHome, btnLocation, btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        // Récupération des boutons à partir de leurs identifiants
        btnHistoire = findViewById(R.id.histoire);
        btnOeuvres = findViewById(R.id.oeuvres);
        btnHome = findViewById(R.id.home);
        btnLocation = findViewById(R.id.imageLocation);
        btnInfo = findViewById(R.id.info);

        // Ajout d'un écouteur d'événements pour le bouton "Histoire"
        btnHistoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HistoireMuseeActivity.class);
                startActivity(intent);
            }
        });

        // Ajout d'un écouteur d'événements pour le bouton "Oeuvres"
        btnOeuvres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, CarrouselActivity.class);
                startActivity(intent);
            }
        });

        // Ajout d'un écouteur d'événements pour le bouton "Home"
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MenuGeneral.class);
                startActivity(intent);
            }
        });

        // Ajout d'un écouteur d'événements pour le bouton "Location"
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        // Ajout d'un écouteur d'événements pour le bouton "Info"
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, InfosActivity.class);
                startActivity(intent);
            }
        });
    }
}
