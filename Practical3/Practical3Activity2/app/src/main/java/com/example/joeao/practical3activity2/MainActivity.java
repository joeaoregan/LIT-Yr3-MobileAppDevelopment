package com.example.joeao.practical3activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.tv);
        display.setText(String.valueOf(message));
    }

    public void buttonClicked(View view){

        EditText editText = (EditText) findViewById(R.id.message);
        message = editText.getText().toString();
        display.setText("Hello, " + String.valueOf(message));
    }
}
