package com.example.museum_app;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.imageview.ShapeableImageView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

    public class OeuvreDescriptionActivity extends AppCompatActivity {
        private ImageButton play_button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.description_oeuvre);

            play_button = findViewById(R.id.play_button);

            play_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Lecture de l'audio...", Toast.LENGTH_SHORT).show();
                    // Insérer ici le code pour lire l'audio
                }
            });
        }
    }

