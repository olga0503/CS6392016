package com.example.olga.curvedmotionexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class onclick_Activity extends AppCompatActivity {


    ViewGroup main_view;
    Scene image_topleft;
    Scene image_bottomright;
    Transition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_view = (ViewGroup) findViewById(R.id.main_view);

        transition = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition);

       image_topleft = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick_fragment, this);

       image_bottomright = Scene.getSceneForLayout(main_view,
                R.layout.activity_onclick2_fragment, this);

        image_topleft.enter();
    }

    public void go2 (View view)
    {
         TransitionManager.go( image_topleft, transition);

    }

    public void go1 (View view)
    {

         TransitionManager.go(image_bottomright, transition);

    }





}
