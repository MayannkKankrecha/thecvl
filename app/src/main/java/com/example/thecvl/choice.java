package com.example.thecvl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportActionBar().hide();
//        ImageView splash_layout = findViewById(R.id.imageView2);
//        splash_layout.setAlpha(0f);
//        splash_layout.animate()
//                .translationY(splash_layout.getHeight())
//                .alpha(1f)
//                .setDuration(1500);
    }
}