package com.example.olga.curvedmotionexercise;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.transition.Scene;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;



public class activity_onclick2_fragment extends Fragment {
    private Bundle savedState = null;
    ViewGroup main_view;
    Scene scene1;
    Scene scene2;
    Transition transition;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_onclick2_fragment, container, false);
        return view;

    }
}