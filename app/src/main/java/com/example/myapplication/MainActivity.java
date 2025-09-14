package com.example.myapplication;

import static com.example.myapplication.R.id.tvMath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // dfdfdfdfkndkj
    private TextView mathTV;
    private TextView xoTV;
    private Button gobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathTV = findViewById(tvMath);
        xoTV = findViewById(R.id.tvXO);
        gobtn = findViewById(R.id.btn_Go);

       mathTV.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mathTV.setAlpha(0.5f);
               xoTV.setAlpha(1f);
           }
       });

       xoTV.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               xoTV.setAlpha(0.5f);
               mathTV.setAlpha(1f);
           }
       });

       gobtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(xoTV.getAlpha()==0.5f) {
                   Intent intent = new Intent(MainActivity.this, MathActivity.class);
                   startActivity(intent);
               }else{
                   Intent intent = new Intent(MainActivity.this, XOActivity.class);
                   startActivity(intent);
               }

           }
       });

    }
}