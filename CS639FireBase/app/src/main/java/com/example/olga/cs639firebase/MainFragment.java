package com.example.olga.cs639firebase;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainFragment extends Fragment {
    private Bundle savedState = null;
    Firebase FB_ref;
    EditText first_name;
    EditText person_id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);


        return view;
    }
}