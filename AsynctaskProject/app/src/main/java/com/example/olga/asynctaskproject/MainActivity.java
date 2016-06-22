package com.example.olga.asynctaskproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadimage(View view) {
        Intent loadimage_intent = new Intent(this,Loadimage.class);
        startActivity(loadimage_intent);
    }
}
