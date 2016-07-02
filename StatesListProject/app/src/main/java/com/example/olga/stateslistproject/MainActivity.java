package com.example.olga.stateslistproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView1 = (ListView) findViewById(R.id.listView1);

        States[] items = {
                new States("Alabama"),
                new States("Alaska"),
                new States("Arizona"),
                new States("Arkansas"),
                new States("California"),
                new States("Colorado"),
                new States("Connecticut"),
                new States("Delaware"),
                new States("Florida"),
                new States("Georgia"),
                new States("Hawaii"),
                new States("Idaho"),
                new States("Illinois"),
                new States("Indiana"),
                new States("Iowa"),
                new States("Kansas"),
                new States("Kentucky"),
                new States("Louisiana"),
                new States("Maine"),
                new States("Maryland "),
                new States("Massachusetts"),
                new States("Michigan"),
                new States("Minnesota"),
                new States("Mississippi"),
                new States("Missouri"),
                new States("Montana"),
                new States("Nebraska"),
                new States("Nevada"),
                new States("New Hampshire"),
                new States("New Jersey"),
                new States("New Mexico"),
                new States("New York"),
                new States("North Carolina"),
                new States("North Dakota"),
                new States("Ohio"),
                new States("Oregon"),
                new States("Pennsylvania"),
                new States("Rhode Island"),
                new States("South Carolina"),
                new States("South Dakota"),
                new States("Tennessee"),
                new States("Texas"),
                new States("Utah"),
                new States("Vermont"),
                new States("Virginia"),
                new States("Washington"),
                new States("West Virginia"),
                new States("Wisconsin"),
                new States("Wyoming")

        };



        ArrayAdapter<States> adapter = new ArrayAdapter<States>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();
                if (item.matches("Tennessee")) {

                        double capital_latitude=36.1627;
                        double capital_longitude=-86.7816;

                        String location = "geo:"+ capital_latitude + capital_longitude;
                        String query = capital_latitude +","+ capital_longitude;
                        String encodedQuery = Uri.encode(query);
                        String uriString = location + "?q=" + encodedQuery +  "&z=16";
                        Uri uri = Uri.parse(uriString);
                        Intent showcapital_Intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
                        startActivity(showcapital_Intent);

                }  else if (item.matches("Texas")) {

                    double capital_latitude=30.2672;
                    double capital_longitude=-97.7431;

                    String location = "geo:"+ capital_latitude + capital_longitude;
                    String query = capital_latitude +","+ capital_longitude;
                    String encodedQuery = Uri.encode(query);
                    String uriString = location + "?q=" + encodedQuery +  "&z=16";
                    Uri uri = Uri.parse(uriString);
                    Intent showcapital_Intent2 = new Intent(android.content.Intent.ACTION_VIEW, uri);
                    startActivity(showcapital_Intent2);}


                    else {
                    Toast.makeText(getBaseContext(), "Try states that start with 'T'", Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}