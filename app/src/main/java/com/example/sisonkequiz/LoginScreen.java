package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginScreen extends AppCompatActivity {
    ImageButton Back;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Back = findViewById(R.id.lgBack);
        Login = findViewById(R.id.btLogin);

        // intent activity
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent
                Intent intent = new Intent(LoginScreen.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}