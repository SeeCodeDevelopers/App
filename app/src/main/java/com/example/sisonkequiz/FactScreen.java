package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FactScreen extends AppCompatActivity {
    // Variables
    ImageButton back;
    CardView Safety, FirstAid, Ocean,Sisonke,SurfBoards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_screen);
        // typecasting variables
        Safety = findViewById(R.id.safetyCard);
        FirstAid = findViewById(R.id.FirstAidCard);
        Ocean = findViewById(R.id.oceanCard);
        Sisonke = findViewById(R.id.SisonkeCard);
        SurfBoards = findViewById(R.id.SurfBoardCard);
        back = findViewById(R.id.fBack);

        // onclick for back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FactScreen.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}