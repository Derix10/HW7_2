package com.example.myapplication;

import static com.example.myapplication.R.id.egual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("MissingInFlateId")
public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private Button button;
    private Integer first = 0, second = 0;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("shavel", "OnCreate police");
        textview = findViewById(R.id.text_view);
        button = findViewById(R.id.buttonn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PoliceActivity.class);
            String text = textview.getText().toString();
            intent.putExtra("key",text);
            startActivity(intent);
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void OnNumberClick(View view) {
        switch (view.getId()) {
            case R.id.nol: //0
                if (textview.getText().toString().equals("0")) {
                    textview.setText("0");
                } else if (isOperationClick) {
                    textview.setText("0");
                } else if (!textview.getText().toString().equals("0")) {
                    textview.append("0");
                }
                button.setVisibility(View.INVISIBLE);
                break;
            case R.id.nine: //9
                if (textview.getText().toString().equals("0")) {
                    textview.setText("9");
                } else if (isOperationClick) {
                    textview.setText("9");
                } else {
                    textview.append("9");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.eight: //8
                if (textview.getText().toString().equals("0")) {
                    textview.setText("8");
                } else if (isOperationClick) {
                    textview.setText("8");
                } else {
                    textview.append("8");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.seven: //7
                if (textview.getText().toString().equals("0")) {
                    textview.setText("7");
                } else if (isOperationClick) {
                    textview.setText("7");
                } else {
                    textview.append("7");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.six: //6
                if (textview.getText().toString().equals("0")) {
                    textview.setText("6");
                } else if (isOperationClick) {
                    textview.setText("6");
                } else {
                    textview.append("6");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.five: //5
                if (textview.getText().toString().equals("0")) {
                    textview.setText("5");
                } else if (isOperationClick) {
                    textview.setText("5");
                } else {
                    textview.append("5");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.four: //4
                if (textview.getText().toString().equals("0")) {
                    textview.setText("4");
                } else if (isOperationClick) {
                    textview.setText("4");
                } else {
                    textview.append("4");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.btn_three: //3
                if (textview.getText().toString().equals("0")) {
                    textview.setText("3");
                } else if (isOperationClick) {
                    textview.setText("3");
                } else {
                    textview.append("3");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.btn_one://1
                if (textview.getText().toString().equals("0")) {
                    textview.setText("1");
                } else if (isOperationClick) {
                    textview.setText("1");
                } else {
                    textview.append("1");
                }
                button.setVisibility(View.INVISIBLE);
                break;

            case R.id.btn_two: //2
                if (textview.getText().toString().equals("0")) {
                    textview.setText("2");
                } else if (isOperationClick) {
                    textview.setText("2");
                } else {
                    textview.append("2");
                }
                button.setVisibility(View.INVISIBLE);
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
                button.setVisibility(View.INVISIBLE);

                break;
            case R.id.delenie: // :
                first = Integer.valueOf(textview.getText().toString());
                operation = "/";
                button.setVisibility(View.INVISIBLE);

                break;

            case R.id.umnojenie:// *
                first = Integer.valueOf(textview.getText().toString());
                operation = "x";
                button.setVisibility(View.INVISIBLE);

                break;

            case R.id.minus:// -
                first = Integer.valueOf(textview.getText().toString());
                operation = "-";
                button.setVisibility(View.INVISIBLE);

                break;

            case R.id.plus:// +
                first = Integer.valueOf(textview.getText().toString());
                operation = "+";
                button.setVisibility(View.INVISIBLE);

                break;

            case egual:// =
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

                    button.setVisibility(View.VISIBLE);


                textview.setText(result.toString());

                break;

        }
        isOperationClick = true;
    }
}