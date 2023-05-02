package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu_general extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_general);

        Button boutonHistoire = findViewById(R.id.bouton_histoire);
        boutonHistoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), histoiremusee.class);
                startActivity(intent);
            }
        });

        Button boutonOeuvres = findViewById(R.id.bouton_oeuvres);
        boutonOeuvres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), carrousel_activity.class);
                startActivity(intent);
            }
        });

        Button boutonLocalisation = findViewById(R.id.bouton_localisation);
        boutonLocalisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), map_activity.class);
                startActivity(intent);
            }
        });

        Button boutonInfos = findViewById(R.id.bouton_infos);
        boutonInfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), infos_activity.class);
                startActivity(intent);
            }
        });
    }
}
