package com.example.check_calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    Button buttonC, buttonDot, buttonEql;
    EditText result;
    float mValueOne, mValueTwo;
    boolean addition, subtraction, multiplication, division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonC = findViewById(R.id.buttonC);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEql = findViewById(R.id.buttonEql);
        result = findViewById(R.id.edt1);
        // Number Buttons
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });
        // Addition
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.length() > 0) {
                    mValueOne = Float.parseFloat(result.getText().toString());
                    addition = true;
                    result.setText("");
                }
            }
        });
        // Subtraction
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.length() > 0) {
                    mValueOne = Float.parseFloat(result.getText().toString());
                    subtraction = true;
                    result.setText("");
                }
            }
        });
        // Multiplication
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.length() > 0) {
                    mValueOne = Float.parseFloat(result.getText().toString());
                    multiplication = true;
                    result.setText("");
                }
            }
        });
        // Division
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.length() > 0) {
                    mValueOne = Float.parseFloat(result.getText().toString());
                    division = true;
                    result.setText("");
                }
            }
        });
        // Clear Button
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                mValueOne = 0;
                mValueTwo = 0;
                addition = false;
                subtraction = false;
                multiplication = false;
                division = false;
            }
        });
        // Decimal Button
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result.setText(".");
            }
        });
        // Equal Button
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.length() > 0) {
                    mValueTwo = Float.parseFloat(result.getText().toString());
                    if (addition) {
                        result.setText(String.valueOf(mValueOne + mValueTwo));
                        addition = false;
                    }
                    if (subtraction) {
                        result.setText(String.valueOf(mValueOne - mValueTwo));
                        subtraction = false;
                    }
                    if (multiplication) {
                        result.setText(String.valueOf(mValueOne * mValueTwo));
                        multiplication = false;
                    }
                    if (division) {
                        if (mValueTwo != 0) {
                            result.setText(String.valueOf(mValueOne / mValueTwo));
                        } else {
                            result.setText("Error");
                        }
                        division = false;
                    }
                }
            }
        });
    }
}
