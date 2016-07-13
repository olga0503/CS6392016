package com.example.olga.cs639firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Firebase FB_ref;
    EditText first_name;
    EditText person_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button submit_button = (Button) findViewById(R.id.submit_button);
        final EditText first_name = (EditText) findViewById(R.id.first_name);
        final EditText person_id =(EditText) findViewById(R.id.person_id);



        submit_button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {


                FB_ref = new Firebase("https://cs639firebase-167a3.firebaseio.com/");

                String fn = first_name.getText().toString().trim();
                String id = person_id.getText().toString().trim();

                Person person = new Person();
                person.setName(fn);
                person.setId(id);

                FB_ref.child("person").setValue(person);
            }
        });

    }
}
