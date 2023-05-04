package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private Button loginuserButton, logimdpButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //avec cela on va chercher (findViewById) les boutons dans le layout
        loginuserButton = findViewById(R.id.Loginuser);
        logimdpButton = findViewById(R.id.logimdp);
        loginButton = findViewById(R.id.Loginbutton);

        // Quand on appuie sur le bouton du login on lui demande de faire une action
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // En ce cas on demande d'aller dans la page menumuseums_activity
                Intent intent = new Intent(LoginActivity.this, MuseumMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
