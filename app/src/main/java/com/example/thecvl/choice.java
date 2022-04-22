package com.example.thecvl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportActionBar().hide();

        Button login = findViewById(R.id.loginbtn);
        Button regbtn = findViewById(R.id.regbtn);

//        ImageView splash_layout = findViewById(R.id.imageView2);
//        splash_layout.setAlpha(0f);
//        splash_layout.animate()
//                .translationY(splash_layout.getHeight())
//                .alpha(1f)
//                .setDuration(1500);
        //login Button clicked
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(choice.this, login.class);
                startActivity(log);
            }
        });

            //regestration button clicked
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(choice.this, registration.class);
                startActivity(reg);
            }
        });




    }
}