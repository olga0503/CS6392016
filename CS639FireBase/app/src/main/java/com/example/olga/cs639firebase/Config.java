package com.example.olga.cs639firebase;


import android.app.Application;

import com.firebase.client.Firebase;

public class Config extends Application {

    public void onCreate() {

        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
