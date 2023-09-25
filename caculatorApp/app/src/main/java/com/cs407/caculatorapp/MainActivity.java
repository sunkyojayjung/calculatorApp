package com.cs407.caculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        EditText firstNum = (EditText) findViewById(R.id.myTextField);
        EditText secondNum = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1 + num2;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);

        startActivity(intent);
    }

    public void clickSub(View view){
        EditText firstNum = (EditText) findViewById(R.id.myTextField);
        EditText secondNum = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1 - num2;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);

        startActivity(intent);
    }

    public void clickMul(View view){
        EditText firstNum = (EditText) findViewById(R.id.myTextField);
        EditText secondNum = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        int result = num1 * num2;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);

        startActivity(intent);
    }

    public void clickDiv(View view){
        EditText firstNum = (EditText) findViewById(R.id.myTextField);
        EditText secondNum = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());

        if(num2 == 0){
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
        } else{
            int result = num1 / num2;

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", result);

            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}