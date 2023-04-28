package com.example.yourapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.museum_app.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.histoiredumusee);

        TextView videoTitle = findViewById(R.id.video_title);
        videoTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutubeVideo();
            }
        });
    }

    private void openYoutubeVideo() {
        String videoId = "id_louvre"; // Remplacez ceci par l'ID de votre vidéo
        String youtubeUrl = "https://www.youtube.com/watch?v=U-DOGB4iVBM" + "id_louvre";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl));
        startActivity(intent);
    }
}
