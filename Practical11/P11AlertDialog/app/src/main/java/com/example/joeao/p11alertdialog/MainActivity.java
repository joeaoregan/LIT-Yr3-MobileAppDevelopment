package com.example.joeao.p11alertdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void buttonClicked(View v){
        AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(context);

        // Set title
        alertDialogueBuilder.setTitle("Your Title");

        // Set dialog message
        alertDialogueBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",new
                        DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                // if this button is clicked, close
                                // current activity
                                MainActivity.this.finish();
                            }
                        })
                .setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int d){
                        // If this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogueBuilder.create();

        // show it
        alertDialog.show();
    }
}
