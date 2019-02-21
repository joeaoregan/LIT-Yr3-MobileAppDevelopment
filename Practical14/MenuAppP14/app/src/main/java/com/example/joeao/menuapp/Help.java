package com.example.joeao.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String DEBUG_TAG = "Help";

        // Read raw file into string and populate TextView

        InputStream iFile = getResources().openRawResource(R.raw.help);
        try{
            //TextView helpText = (TextView) findViewById(R.id.textHelp);
            TextView helpText = (TextView) findViewById(R.id.help_top);
            String strFile = inputStreamToString(iFile);
            helpText.setText(strFile);
        } catch (Exception e) {
            Log.e(DEBUG_TAG, "InputStreamToString failure", e);
        }
    }

    // Converts an input stream to a string

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuffer sBuffer = new StringBuffer();

        BufferedReader dataIO
                = new BufferedReader(new InputStreamReader(is));

        String strLine = null;

        while((strLine = dataIO.readLine()) != null){
            sBuffer.append(strLine + "\n");
        }

        dataIO.close();
        is.close();

        return sBuffer.toString();
    }
}
