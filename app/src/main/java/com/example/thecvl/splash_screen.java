package com.example.thecvl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        ImageView splash_layout = findViewById(R.id.imageView);
        splash_layout.setAlpha(0f);
        splash_layout.animate()
                .translationY(splash_layout.getHeight())
                .alpha(1f)
                .setDuration(1500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //startActivity(new Intent(splash_screen.this,choice.class));
                Intent intent = new Intent(splash_screen.this, choice.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                overridePendingTransition(0,0);
                finish();
            }
        },2000);

    }
}