package com.example.olga.curvedmotionexercise;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    ViewGroup main_view;
    Scene scene1;
    Scene scene2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_view =
                (ViewGroup) findViewById(R.id.main_view);

        scene1 = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick, this);

        scene2 = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick2, this);

        scene1.enter();
    }

    public void go1 (View view)
    {
        TransitionManager.go(scene2);
    }

    public void go2 (View view)
    {
        TransitionManager.go(scene1);
    }

}

