package com.example.joeao.menuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView splash = (TextView) findViewById(R.id.splash_top);
        ImageView splash_image = (ImageView) findViewById(R.id.splash_image);
        TextView version = (TextView) findViewById(R.id.version);

        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
        Animation spinin = AnimationUtils.loadAnimation(this, R.anim.custom_anim);

        fade2.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }

            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationRepeat(Animation animation) {

            }
        });

        splash.startAnimation(fade1);
        splash_image.startAnimation(spinin);
        version.startAnimation(fade2);
    }

    // Stops being visible to the user
    public void onPause() {
        super.onPause();

        TextView splash = (TextView) findViewById(R.id.splash_top);
        ImageView splash_image = (ImageView) findViewById(R.id.splash_image);
        TextView version = (TextView) findViewById(R.id.version);

        // Stop animations if paused
        splash.clearAnimation();
        splash_image.clearAnimation();
        version.clearAnimation();
    }
}   // end of mainActivity

    /*  // Not needed for practical 9
        public void ButtonClicked(View view)
        {

            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);

        }
    */