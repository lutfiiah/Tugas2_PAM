package com.example.calculatorapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView resultText, nameText, nimText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.resultText);
        nameText = findViewById(R.id.nameText);
        nimText = findViewById(R.id.nimText);

        double result = getIntent().getDoubleExtra("result", 0);
        String name = getIntent().getStringExtra("name");
        String nim = getIntent().getStringExtra("nim");

        resultText.setText("Hasil: " + result);
        nameText.setText("Nama: " + name);
        nimText.setText("NIM: " + nim);
    }
}
