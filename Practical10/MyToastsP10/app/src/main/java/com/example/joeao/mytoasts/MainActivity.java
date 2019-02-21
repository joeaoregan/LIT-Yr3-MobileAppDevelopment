package com.example.joeao.mytoasts;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClicked(View view) {
        Context context = this;
        String msg = "To the Bride and Groom";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);

        // 2. Set the gravity of the toast
        //toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);   // moves toast to top left corner of screen
        //toast.setGravity(Gravity.TOP|Gravity.CENTER_VERTICAL, 0, 0);   // moves toast to top center
        toast.setGravity(Gravity.TOP|Gravity.CENTER_VERTICAL, 100, 80);   // moves toast to top and off center
        toast.show();

    }
}
