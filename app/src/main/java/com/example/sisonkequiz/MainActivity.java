package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SignIn, SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent start = new Intent(MainActivity.this, HomeScreen.class);
       // startActivity(start);
       // finish();
        setContentView(R.layout.activity_main);
        SignIn = findViewById(R.id.BtSignIn);
        SignUp = findViewById(R.id.BtSignUp);

        //onclick
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(login);
                finish();
            }
        });
    }
}