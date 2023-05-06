package com.example.museum_app;

import com.example.museum_app.MenuActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoireMuseeActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.histoiredumusee);
            MenuActivity.setupMenuButtons(this);
            TextView videoTitle = findViewById(R.id.video_title);
            videoTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openYoutubeVideo();
                }
            });

        }

        private void openYoutubeVideo() {
            String videoId = "id_louvre";
            String youtubeUrl = "https://www.youtube.com/watch?v=U-DOGB4iVBM" + "id_louvre"; //ID de votre vidéo
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl));
            startActivity(intent);
        }
    }
