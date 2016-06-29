package com.example.olga.curvedmotionexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.ViewGroup;

public class onclick2_Activity extends AppCompatActivity {

    ViewGroup main_view;
    Scene scene1;
    Scene scene2;
    Transition transition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_onclick2);
        TransitionManager.go(scene1, transition);

        main_view =
                (ViewGroup) findViewById(R.id.main_view);

        transition = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick, this);

        scene2 = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick2, this);

        TransitionManager.go(scene1, transition);

    }
}
