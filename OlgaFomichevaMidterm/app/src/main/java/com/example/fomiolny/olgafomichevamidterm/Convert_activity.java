package com.example.fomiolny.olgafomichevamidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Convert_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        TextView result = (TextView) findViewById(R.id.result);
        Intent receive_Intent = getIntent();
        Double miles_num = receive_Intent.getExtras().getDouble("number_inmiles");
        Double kilom_num = miles_num*1.609;
        result.setText(miles_num + " Miles equal to "+Double.toString(kilom_num)+ " Kilometers");
    }

    public void go_back(View view) {

        Intent onclick_Intent2 = new Intent(this,MainActivity.class);
        startActivity(onclick_Intent2);
    }

}
