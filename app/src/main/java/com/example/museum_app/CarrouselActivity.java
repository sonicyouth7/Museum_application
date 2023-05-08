package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;
import com.example.museum_app.MenuActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class CarrouselActivity extends AppCompatActivity {

    private ImageButton tableau1, tableau2, statue1, statue2;

    private ImageButton dislike_tableau1, dislike_tableau2, dislike_statue1, dislike_statue2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrousel_activity);
        MenuActivity.setupMenuButtons(this);

        tableau1 = findViewById(R.id.tableau1);
        tableau2 = findViewById(R.id.tableau2);
        statue1 = findViewById(R.id.statue1);
        statue2 = findViewById(R.id.statue2);
        dislike_tableau1 = findViewById(R.id.dislike_tableau1);
        dislike_tableau2 = findViewById(R.id.dislike_tableau2);
        dislike_statue1 = findViewById(R.id.dislike_statue1);
        dislike_statue2 = findViewById(R.id.dislike_statue2);

        //lorsqu'on clic sur le tableau ou la statue, la page description de l'oeuvre s'affiche
        tableau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarrouselActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        //lorsqu'on click sur le coeur ça affiche l'image "like"
        dislike_tableau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_tableau1.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_tableau1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_tableau1.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });

        //lorsqu'on clic sur le tableau ou la statue, la page description de l'oeuvre s'affiche
        tableau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarrouselActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        dislike_tableau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_tableau2.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_tableau2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_tableau2.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });


        //lorsqu'on clic sur le tableau ou la statue, la page description de l'oeuvre s'affiche
        statue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarrouselActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        dislike_statue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_statue1.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_statue1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_statue1.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });


        //lorsqu'on clic sur le tableau ou la statue, la page description de l'oeuvre s'affiche
        statue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarrouselActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        dislike_statue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_statue2.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_statue2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_statue2.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });
    }
}