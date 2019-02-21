package com.example.joeao.practical3activity3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int total = 0;
    String message = "" + total;
    int result = Integer.parseInt(message);
    int operand = 0;
    int number1 = 0;
    int number2 = 0;

    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.message);
    }

    public void button1Clicked(View view) {
        total *= 10;
        total += 1;
        display.setText("" + total);;
    }

    public void button2Clicked(View view) {
        total *= 10;
        total += 2;
        display.setText("" + total);
    }

    public void button3Clicked(View view) {
        total *= 10;
        total += 3;
        display.setText("" + total);
    }

    public void button4Clicked(View view) {
        total *= 10;
        total += 4;
        display.setText("" + total);
    }

    public void button5Clicked(View view) {
        total *= 10;
        total += 5;
        display.setText("" + total);
    }

    public void button6Clicked(View view) {
        total *= 10;
        total += 6;
        display.setText("" + total);
    }

    public void button7Clicked(View view) {
        total *= 10;
        total += 7;
        display.setText("" + total);
    }

    public void button8Clicked(View view) {
        total *= 10;
        total += 8;
        display.setText("" + total);
    }

    public void button9Clicked(View view) {
        total *= 10;
        total += 9;
        display.setText("" + total);
    }

    public void button0Clicked(View view) {
        total *= 10;
        total += 0;
        display.setText("" + total);
    }

    public void buttonAddClicked(View view) {
        number1 = total;
        display.setText(total + " " + "+");
        total = 0;
        operand = 1;
    }

    public void buttonSubClicked(View view) {
        number1 = total;
        display.setText(total + " " + "-");
        total = 0;
        operand = 2;
    }

    public void buttonMultClicked(View view) {
        number1 = total;
        display.setText(total + " " + "*");
        total = 0;
        operand = 3;
    }

    public void buttonDivClicked(View view) {
        number1 = total;
        display.setText(total + " " + "/");
        total = 0;
        operand = 4;
    }
    public void buttonCClicked(View view) {
        total = 0;
        number1 = 0;
        number2 = 0;
        operand = 0;
        display.setText("" + total);
    }
    public void buttonEqClicked(View view) {
        if(operand==0) {
            display.setText("" + total);
        }
        else if(operand == 1) {
            total = number1 + total;    // add new total, to 1st total
            display.setText("" + total);
        }
        else if(operand == 2) {
            total = number1 - total;    // add new total, to 1st total
            display.setText("" + total);
        }
        else if(operand == 3) {
            total = number1 * total;    // add new total, to 1st total
            display.setText("" + total);
        }
        else if(operand == 4) {
            total = number1 / total;    // add new total, to 1st total
            display.setText("" + total);
        }
        total = 0;                      // reset the total
        operand = 0;                    // reset the operand
    }
}