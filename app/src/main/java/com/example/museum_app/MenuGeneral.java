package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuGeneral extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_general);

        Button boutonHistoire = findViewById(R.id.boutonHistoires);
        boutonHistoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoireMuseeActivity.class);
                startActivity(intent);
            }
        });

        Button boutonOeuvres = findViewById(R.id.boutonOeuvres);
        boutonOeuvres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CarrouselActivity.class);
                startActivity(intent);
            }
        });

        Button boutonLocalisation = findViewById(R.id.boutonLocalisation);
        boutonLocalisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        Button boutonInfos = findViewById(R.id.boutonInfos);
        boutonInfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfosActivity.class);
                startActivity(intent);
            }
        });
    }
}
