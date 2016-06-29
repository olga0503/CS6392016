package com.example.olga.curvedmotionexercise;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent moveimage_intent = new Intent(this,onclick_Activity.class);
        startActivity(moveimage_intent);


    }
}