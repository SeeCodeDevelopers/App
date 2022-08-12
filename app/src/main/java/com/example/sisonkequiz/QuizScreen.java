package com.example.sisonkequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuizScreen extends AppCompatActivity {
    TextView Question, questionNumber;
    Button optA,optB,optC,optD;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);

        // typecasting variables
        Question = findViewById(R.id.question);
        questionNumber = findViewById(R.id.numQuestions);
        optA = findViewById(R.id.optionA);
        optB = findViewById(R.id.optionB);
        optC = findViewById(R.id.optionC);
        optD = findViewById(R.id.optionD);
        submit = findViewById(R.id.answerBt);

    }
}