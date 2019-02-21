package com.example.joeao.practical3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Get the message from the intent
    //Intent intent = getIntent();
    int total = 0;
    //String tot = "Total: " + total;

    private TextView counter;

    //String message = intent.getStringExtra(tot);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = (TextView)findViewById(R.id.counterText);
        counter.setText("Total: " + String.valueOf(total));
    }

    /** add button */
    public void buttonAddClicked(View view){
        total += 1;
        //EditText editText = (EditText) findViewById(R.id.counterText);
        //Intent intent = new Intent(this, MainActivity.class);
        //TextView textView = (TextView) findViewById(R.id.counterText);
        //String counterText = textView.getText().toString();
        //String tot = "Total : " + total;
        //intent.putExtra(tot, counterText);
        counter.setText("Total: " + String.valueOf(total));

    }

    /** add button */
    public void buttonSubClicked(View view){
        total -= 1;
        counter.setText("Total: " + String.valueOf(total));
    }
}
