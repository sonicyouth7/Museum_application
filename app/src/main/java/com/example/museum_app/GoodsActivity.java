package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;
import com.example.museum_app.MenuActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class GoodsActivity extends AppCompatActivity {

    private ImageButton tableau1, tableau2, morden1, morden2;

    private ImageButton dislike_tableau1, dislike_tableau2, dislike_morden1, dislike_morden2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods_activity);
        MenuActivity.setupMenuButtons(this);

        tableau1 = findViewById(R.id.tableau1);
        tableau2 = findViewById(R.id.tableau2);
        morden1 = findViewById(R.id.morden1);
        morden2 = findViewById(R.id.morden2);
        dislike_tableau1 = findViewById(R.id.dislike_tableau1);
        dislike_tableau2 = findViewById(R.id.dislike_tableau2);
        dislike_morden1 = findViewById(R.id.dislike_morden1);
        dislike_morden2 = findViewById(R.id.dislike_morden2);

        //lorsqu'on clic sur le tableau ou la morden, la page description de l'oeuvre s'affiche
        tableau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoodsActivity.this, OeuvreDescriptionActivity.class);
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

        //lorsqu'on clic sur le tableau ou la morden, la page description de l'oeuvre s'affiche
        tableau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoodsActivity.this, OeuvreDescriptionActivity.class);
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


        //lorsqu'on clic sur le tableau ou la morden, la page description de l'oeuvre s'affiche
        morden1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoodsActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        dislike_morden1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_morden1.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_morden1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_morden1.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });


        //lorsqu'on clic sur le tableau ou la morden, la page description de l'oeuvre s'affiche
        morden2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoodsActivity.this, OeuvreDescriptionActivity.class);
                startActivity(intent);
            }
        });
        dislike_morden2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_morden2.setImageResource(R.drawable.like);

                //lorsqu'on click sur le coeur ça affiche l'image "dislike"
                dislike_morden2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dislike_morden2.setImageResource(R.drawable.dislike);
                    }
                });
            }
        });
    }
}