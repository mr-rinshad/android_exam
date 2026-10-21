
package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView display;
    double firstNumber = 0;
    String operator = "";
    boolean newNumber = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        GridLayout grid = findViewById(R.id.grid);
        Button equals = findViewById(R.id.equals);

        for (int i = 0; i < grid.getChildCount(); i++) {
            View view = grid.getChildAt(i);

            if (view instanceof Button) {
                Button button = (Button) view;

                button.setOnClickListener(v -> {
                    String value = button.getText().toString();

                    if (value.equals("C")) {
                        display.setText("0");
                        firstNumber = 0;
                        operator = "";
                        newNumber = true;

                    } else if ("+-*/".contains(value)
                            && value.length() == 1) {
                        firstNumber = Double.parseDouble(
                                display.getText().toString());
                        operator = value;
                        newNumber = true;

                    } else {
                        if (newNumber) {
                            display.setText(
                                    value.equals(".") ? "0." : value);
                            newNumber = false;
                        } else if (value.equals(".")
                                && display.getText().toString()
                                .contains(".")) {
                            return;
                        } else {
                            display.append(value);
                        }
                    }
                });
            }
        }

        equals.setOnClickListener(v -> {
            if (operator.isEmpty()) return;

            double secondNumber = Double.parseDouble(
                    display.getText().toString());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        display.setText("Error");
                        operator = "";
                        newNumber = true;
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
            }

            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }

            operator = "";
            newNumber = true;
        });
    }
}
