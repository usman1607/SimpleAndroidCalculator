package com.good.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1 = 0, num2 = 0;
    TextView editText1;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_Add = (Button) findViewById(R.id.badd);
        button_Sub = (Button) findViewById(R.id.bsub);
        button_Mul = (Button) findViewById(R.id.bmul);
        button_Div = (Button) findViewById(R.id.biv);
        button_Remainder = (Button) findViewById(R.id.BRemain);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        editText1 = (TextView) findViewById(R.id.display);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() != 0) {
                    num1 = Float.parseFloat(editText1.getText() + "");
                    Add = true;
                    deci = false;
                    editText1.setText(null);
                }
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() != 0) {
                    num1 = Float.parseFloat(editText1.getText() + "");
                    Sub = true;
                    deci = false;
                    editText1.setText(null);
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() != 0) {
                    num1 = Float.parseFloat(editText1.getText() + "");
                    Multiply = true;
                    deci = false;
                    editText1.setText(null);
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() != 0) {
                    num1 = Float.parseFloat(editText1.getText() + "");
                    Divide = true;
                    deci = false;
                    editText1.setText(null);
                }
            }
        });

        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() != 0) {
                    num1 = Float.parseFloat(editText1.getText() + "");
                    Remainder = true;
                    deci = false;
                    editText1.setText(null);
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    num2 = Float.parseFloat(editText1.getText() + "");
                }

                if (Add) {

                    editText1.setText(num1 + num2 + "");
                    Add = false;
                }

                if (Sub) {

                    editText1.setText(num1 - num2 + "");
                    Sub = false;
                }

                if (Multiply) {
                    editText1.setText(num1 * num2 + "");
                    Multiply = false;
                }

                if (Divide) {
                    editText1.setText(num1 / num2 + "");
                    Divide = false;
                }
                if (Remainder) {
                    editText1.setText(num1 % num2 + "");
                    Remainder = false;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                num1 = 0.0;
                num2 = 0.0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    editText1.setText(editText1.getText() + ".");
                    deci = true;
                }

            }
        });
    }
}