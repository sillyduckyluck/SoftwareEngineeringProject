package com.example.smnc.battlebishops;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        //Code for the play_variant button, brings up the play_variant activity when pressed.
        Button play_button = (Button)findViewById(R.id.play_button);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, play_variant_activity.class));
            }
        });

        //code for the choose button. Brings up the list of available variants.
        Button choose_button = (Button)findViewById(R.id.choose_button);
        choose_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, choose_variant_activity.class));
            }
        });
        */

        Button create_button = (Button)findViewById(R.id.create_button);
        create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, create_variant_activity.class));
            }
        });




    }

}
