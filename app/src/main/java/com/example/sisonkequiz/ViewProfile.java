package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ViewProfile extends AppCompatActivity {
    ImageButton back;
    Button LogOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        back = findViewById(R.id.pBack);

        //onclick
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewProfile.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}