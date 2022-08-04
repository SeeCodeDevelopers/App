package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeScreen extends AppCompatActivity {
    // variables
    ImageButton BtLogOut,BtProfile,Quiz,Gallery,Tutorials,Fact,About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        //typecasting variables
        BtLogOut = findViewById(R.id.logOut);
        BtProfile = findViewById(R.id.profile);
        Quiz = findViewById(R.id.btQuiz);
        Gallery = findViewById(R.id.btGallery);
        Tutorials = findViewById(R.id.btTutorial);
        Fact = findViewById(R.id.btFact);
        About = findViewById(R.id.btAbout);

        // onclick
        BtLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        BtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, ViewProfile.class);
                startActivity(intent);
                finish();
            }
        });
        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        Tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        Fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, FactScreen.class);
                startActivity(intent);
                finish();

            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, About.class);
                startActivity(intent);
                finish();
            }
        });
    }
}