package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_activity extends AppCompatActivity {
    private ImageButton btnProfil, btnMessage, btnLocation, btnSuggestion, btnFavoris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btnProfil = findViewById(R.id.imageProfil);
        btnMessage = findViewById(R.id.imageMessage);
        btnLocation = findViewById(R.id.imageLocation);
        btnSuggestion = findViewById(R.id.imageSuggestion);
        btnFavoris = findViewById(R.id.imageFavoris);

        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_activity.this, menu_general.class);
                startActivity(intent);
            }
        });

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_activity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_activity.this, LocationActivity.class);
                startActivity(intent);
            }
        });

        btnSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_activity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });

        btnFavoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_activity.this, FavorisActivity.class);
                startActivity(intent);
            }
        });
    }
}

