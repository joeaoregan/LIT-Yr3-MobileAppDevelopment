package com.example.joeao.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textview = (TextView)findViewById(R.id.textView);
        //textview.setText("Select an option");
        textview.setText("Select An Option");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton2:
                if (checked)
                    // option2
                {
                    // Set the button as checked / unchecked if clicked
                    //check(R.id.radioButton2);
                    //R.id.radioButton2.setChecked(false);
                    textview.setText("You Selected Option 2");
                }
                break;
            case R.id.radioButton3:
                if (checked)
                    // option3
                    //textview = (TextView)findViewById(R.id.textView);
                    textview.setText("You Selected Option 3");
                break;
            case R.id.radioButton4:
                if (checked)
                    // option4
                    textview.setText("You Selected Option 4");
                    break;
            case R.id.radioButton5:
                if (checked)
                    // option5
                    textview.setText("You Selected Option 5");
                    break;
        }
    }

}
