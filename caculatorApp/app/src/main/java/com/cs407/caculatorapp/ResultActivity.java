package com.cs407.caculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int result = intent.getIntExtra("result", 0);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        String resultStr = Integer.toString(result);

        textViewResult.setText(resultStr);
    }
}