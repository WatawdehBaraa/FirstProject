package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MathActivity extends AppCompatActivity {

    private EditText edA;
    private EditText edB;
    private EditText edC;
    private Button btnSolve;
    private TextView resultTV;
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathactivity);

        edA=findViewById(edA);
        edB=findViewById(edB);
        edC=findViewById(edC);
        btnSolve=findViewById(btnSolve);
        resultTV=findViewById(resultTV)
        btnSolve=findViewById(btnReturn);



        };
    }
