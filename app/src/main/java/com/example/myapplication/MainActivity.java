package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private Integer first = 0, second = 0;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.text_view);
    }

    @SuppressLint("NonConstantResourceId")
    public void OnNumberClick(View view) {
        switch (view.getId()) {
            case R.id.nol: //0
                if (textview.getText().toString().equals("0")) {
                    textview.setText("0");
                } else if (isOperationClick) {
                    textview.setText("0");
                } else if(!textview.getText().toString().equals("0")){
                    textview.append("0");
                }
                break;
            case R.id.nine: //9
                if (textview.getText().toString().equals("0")) {
                    textview.setText("9");
                } else if (isOperationClick) {
                    textview.setText("9");
                } else {
                    textview.append("9");
                }
                break;

            case R.id.eight: //8
                if (textview.getText().toString().equals("0")) {
                    textview.setText("8");
                } else if (isOperationClick) {
                    textview.setText("8");
                } else {
                    textview.append("8");
                }
                break;

            case R.id.seven: //7
                if (textview.getText().toString().equals("0")) {
                    textview.setText("7");
                } else if (isOperationClick) {
                    textview.setText("7");
                } else {
                    textview.append("7");
                }
                break;

            case R.id.six: //6
                if (textview.getText().toString().equals("0")) {
                    textview.setText("6");
                } else if (isOperationClick) {
                    textview.setText("6");
                } else {
                    textview.append("6");
                }
                break;

            case R.id.five: //5
                if (textview.getText().toString().equals("0")) {
                    textview.setText("5");
                } else if (isOperationClick) {
                    textview.setText("5");
                } else {
                    textview.append("5");
                }
                break;

            case R.id.four: //4
                if (textview.getText().toString().equals("0")) {
                    textview.setText("4");
                } else if (isOperationClick) {
                    textview.setText("4");
                } else {
                    textview.append("4");
                }
                break;

            case R.id.btn_three: //3
                if (textview.getText().toString().equals("0")) {
                    textview.setText("3");
                } else if (isOperationClick) {
                    textview.setText("3");
                } else {
                    textview.append("3");
                }
                break;

            case R.id.btn_one://1
                if (textview.getText().toString().equals("0")) {
                    textview.setText("1");
                } else if (isOperationClick) {
                    textview.setText("1");
                } else {
                    textview.append("1");
                }
                break;

            case R.id.btn_two: //2
                if (textview.getText().toString().equals("0")) {
                    textview.setText("2");
                } else if (isOperationClick) {
                    textview.setText("2");
                } else {
                    textview.append("2");
                }
                break;

            case R.id.btn_clear:
                textview.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    @SuppressLint("NonConstantResourceId")
    public void OnOperationClick(View view) {
        switch (view.getId()) {
            case R.id.procents: // :
                first = Integer.valueOf(textview.getText().toString());
                operation = "%";
                break;
            case R.id.delenie: // :
                first = Integer.valueOf(textview.getText().toString());
                operation = "/";
                break;

            case R.id.umnojenie:// *
                first = Integer.valueOf(textview.getText().toString());
                operation = "x";
                break;

            case R.id.minus:// -
                first = Integer.valueOf(textview.getText().toString());
                operation = "-";
                break;

            case R.id.plus:// +
                first = Integer.valueOf(textview.getText().toString());
                operation = "+";
                break;

            case R.id.egual:// =
                second = Integer.valueOf(textview.getText().toString());
                Integer result = null;
                if (operation.equals("%")) {
                    result = first % second;
                }
                if (operation.equals("/")) {
                    result = first / second;
                }
                if (operation.equals("x")) {
                    result = first * second;
                }
                if (operation.equals("+")) {
                    result = first + second;
                }
                if (operation.equals("-")) {
                    result = first - second;
                }
                textview.setText(result.toString());
                break;
        }
        isOperationClick = true;
    }
}