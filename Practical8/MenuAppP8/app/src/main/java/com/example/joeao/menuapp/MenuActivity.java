package com.example.joeao.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
/*
    String[] items = {getResources().getString(R.string.menu_item_play),
            getResources().getString(R.string.menu_item_scores),
            getResources().getString(R.string.menu_item_settings),
            getResources().getString(R.string.menu_item_help) };
*/
        String[] items = {getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help) };

        ListView menu_items = (ListView) findViewById(R.id.item_list);

    ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);

    // Assign adapter to ListView
    menu_items.setAdapter(adapt);


    menu_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    // Select menu item and go to that screen
        @Override
        public void onItemClick(AdapterView<?> parent, View itemClicked, int
                position, long id) {

            TextView textView = (TextView) itemClicked;
            String strText = textView.getText().toString();

            // Go to PlayGame
            if  (strText.equalsIgnoreCase(getResources().getString(
                    R.string.menu_item_play))) {
                startActivity(new Intent(MenuActivity.this, PlayGame.class));
            } // end if

            // Go to Scores
            if  (strText.equalsIgnoreCase(getResources().getString(
                    R.string.menu_item_scores))) {
                startActivity(new Intent(MenuActivity.this, Scores.class));
            } // end if

            // Go to Settings
            if  (strText.equalsIgnoreCase(getResources().getString(
                    R.string.menu_item_settings))) {
                startActivity(new Intent(MenuActivity.this, Settings.class));
            } // end if

            // Go to Help
            if  (strText.equalsIgnoreCase(getResources().getString(
                    R.string.menu_item_help))) {
                startActivity(new Intent(MenuActivity.this, Help.class));
            } // end if

        }// end function
    });



    }

}
