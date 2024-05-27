package com.example.museum_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);  // 确保布局文件名称正确
        setupMenuButtons(this);
    }

    public static void setupMenuButtons(Activity activity) {
        // 获取按钮
        ImageButton btninfo = activity.findViewById(R.id.info);
        ImageButton btnGoods = activity.findViewById(R.id.goods_btn);
        ImageButton btnHome = activity.findViewById(R.id.home);
        ImageButton btnProfile = activity.findViewById(R.id.profile);


        // 设置点击事件监听器
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MenuActivity", "info button clicked");
                Intent intent = new Intent(activity, InfosActivity.class);
                activity.startActivity(intent);
            }
        });

        btnGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MenuActivity", "Oeuvres button clicked");
                Intent intent = new Intent(activity, GoodsActivity.class);
                activity.startActivity(intent);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MenuActivity", "Home button clicked");
                Intent intent = new Intent(activity, MuseumMenuActivity.class);
                activity.startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MenuActivity", "Profile button clicked");
                Intent intent = new Intent(activity, ProfileActivity.class);
                activity.startActivity(intent);
            }
        });
    }
}
