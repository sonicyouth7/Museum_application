package com.example.museum_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class menumuseums_activity  extends AppCompatActivity {

        private ImageButton OrsayButton1, OrsayButton2, OrsayButton3, OrsayButton4;
        private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menumuseums_activity);

            OrsayButton1 = findViewById(R.id.OrsayButton1);
            OrsayButton2 = findViewById(R.id.OrsayButton2);
            OrsayButton3 = findViewById(R.id.OrsayButton3);
            OrsayButton4 = findViewById(R.id.OrsayButton4);

            checkBox1 = findViewById(R.id.checkBox1);
            checkBox2 = findViewById(R.id.checkBox2);
            checkBox3 = findViewById(R.id.checkBox3);
            checkBox4 = findViewById(R.id.checkBox4);

            OrsayButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menumuseums_activity.this, menu_general.class);
                    startActivity(intent);
                }
            });

            OrsayButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menumuseums_activity.this, menu_general.class);
                    startActivity(intent);
                }
            });

            OrsayButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menumuseums_activity.this, menu_general.class);
                    startActivity(intent);
                }
            });

            OrsayButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menumuseums_activity.this, menu_general.class);
                    startActivity(intent);
                }
            });

            checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        checkBox1.setBackgroundResource(R.drawable.checked_checkbox);
                    } else {
                        checkBox1.setBackgroundResource(R.drawable.unchecked_checkbox);
                    }
                }
            });

            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        checkBox2.setBackgroundResource(R.drawable.checked_checkbox);
                    } else {
                        checkBox2.setBackgroundResource(R.drawable.unchecked_checkbox);
                    }
                }
            });

            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        checkBox3.setBackgroundResource(R.drawable.checked_checkbox);
                    } else {
                        checkBox3.setBackgroundResource(R.drawable.unchecked_checkbox);
                    }
                }
            });

            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        checkBox4.setBackgroundResource(R.drawable.checked_checkbox);
                    } else {
                        checkBox4.setBackgroundResource(R.drawable.unchecked_checkbox);
                    }
                }
            });

        }
    }
