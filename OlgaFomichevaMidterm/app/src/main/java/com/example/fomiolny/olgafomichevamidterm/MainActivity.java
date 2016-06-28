package com.example.fomiolny.olgafomichevamidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void convert_to_kilos(View view) {

        EditText miles_box= (EditText) findViewById(R.id.miles_box);
        TextView error_message = (TextView) findViewById(R.id.error);

        if ((miles_box.getText().toString()).matches("")) {
            Toast.makeText(this, "Number has not been Entered", Toast.LENGTH_SHORT).show();
            error_message.setText("Please, enter a number!");


        }
        else{

        Intent onclick_Intent = new Intent(this,Convert_activity.class);
        Double miles_number = Double.parseDouble(miles_box.getText().toString());
        onclick_Intent.putExtra("number_inmiles", miles_number);
        startActivity(onclick_Intent);}
        }


    }
