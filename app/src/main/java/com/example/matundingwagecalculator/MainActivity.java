package com.example.matundingwagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    TextView result2;
    TextView result3;
    EditText num1;
    EditText num2;
    EditText num3;
    Button compute;
    Button monthly;
    Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.txtResult);
        result2 = findViewById(R.id.txtResult2);
        result3 = findViewById(R.id.txtResult3);
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        num3 = findViewById(R.id.txtNum3);
        compute = findViewById(R.id.btnCompute);
        monthly = findViewById(R.id.btnMonthly);
        clear = findViewById(R.id.btnClear);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double quotient = number1 * number2;
                double weekly = number2 * 5;
                result.setText(String.valueOf(quotient));
                result3.setText(String.valueOf(weekly));
            }
        });

        monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number3 = Double.parseDouble(num3.getText().toString());
                double monthly = number1 * number3;
                double total = monthly * 52 / 12;
                result2.setText(String.valueOf(total));
                // to compute monthly, you must generate your wage first then enter the generated hours per week in the provided blank to compute your monthly salary.

            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(" ");
                num2.setText(" ");
                num3.setText(" ");
                result.setText("00.00");
                result2.setText("00.00");
                result3.setText("00.00");
            }
        });



    }
}