package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NewsGeneral extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_general);
        //on récupere les boutons, ici j'ai préféré le faire un par un
        ImageButton boutonHistoire = findViewById(R.id.boutonHistoires);
        //avec la méthode OnClickListener on definit les écuteurs d'événements pour les boutons
        boutonHistoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoireMuseeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boutonOeuvres = findViewById(R.id.boutonOeuvres);
        boutonOeuvres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CarrouselActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boutonLocalisation = findViewById(R.id.boutonLocalisation);
        boutonLocalisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boutonInfos = findViewById(R.id.boutonInfos);
        boutonInfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfosActivity.class);
                startActivity(intent);
            }
        });
    }
}
