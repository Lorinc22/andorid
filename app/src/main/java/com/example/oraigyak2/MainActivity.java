package com.example.oraigyak2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private EditText textInput;
    private Button toUppercase;
    private Button toLowercase;
    private Button randomColor;
    private TextView textOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



    }

    private void init(){
        textInput = findViewById(R.id.textInput);
        toUppercase = findViewById(R.id.btnToUppercase);
        toLowercase = findViewById(R.id.btnToLowercase);
        randomColor = findViewById(R.id.btnColor);
        textOutput = findViewById(R.id.textOutput);
        relativeLayout = findViewById(R.id.RelativeLayout);

        toUppercase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToUppercase();
            }
        });
        toLowercase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToLowercase();
            }
        });
        randomColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RandomColor();
            }
        });
    }

    private void ToUppercase(){
        String input = textInput.getText().toString();
        String output = input.toUpperCase(Locale.ROOT);
        textOutput.setText(output);
    }
    private void ToLowercase(){
        String input = textInput.getText().toString();
        String output = input.toLowerCase(Locale.ROOT);
        textOutput.setText(output);
    }
    private void RandomColor(){
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        textOutput.setBackgroundColor(Color.rgb(r, g, b));
    }
}
