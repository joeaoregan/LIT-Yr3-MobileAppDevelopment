package com.example.joeao.p6lifecycleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onStart(){
        super.onStart();
        // The activity is about to become visible
        Log.d(TAG, "In the onStart method");
    }
    @Override
    protected void onResume(){
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.d(TAG, "in the onResume method");
    }
    @Override
    protected void onPause(){
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.d(TAG, "in the onPause method");
    }
    @Override
    protected void onStop(){
        super.onStop();
        // The activity is no longer visible (it is now "stopped").
        Log.d(TAG, "in the onStop method");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.d(TAG, "in the onDestroy method");
    }
}
