package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RegisterScreen extends AppCompatActivity {
    ImageButton back;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        back = findViewById(R.id.rgBack);
        register = findViewById(R.id.btRegister);

        // onclick listener
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent
                Intent intent = new Intent(RegisterScreen.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}