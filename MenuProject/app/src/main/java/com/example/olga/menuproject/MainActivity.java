package com.example.olga.menuproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void sendSms(View view) {
        Intent sendsmsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "3478379981"));
        sendsmsIntent.putExtra("sms_body", "Hi, it's Olga Fomicheva");
        startActivity(sendsmsIntent);
    }

    public void phone(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:3478379981"));
        startActivity(phoneIntent);
    }

    public void openBrowser(View view){
        Intent openbrowserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/"));
        startActivity(openbrowserIntent);
    }


    public void showbirthPlace(View view) {
        //  Uri gmmIntentUri = Uri.parse("geo:59.95770402952738,30.217405142784155");
        //Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        //mapIntent.setPackage("com.google.android.apps.maps");
        //if (mapIntent.resolveActivity(getPackageManager()) != null) {
        //  startActivity(mapIntent);
        //}

        double mybirthoplacelatitude = 59.95770402952738;
        double mybirthplacelongitude = 30.217405142784155;
        String mybirthplacetitle = "My birth Place in Saint Petersburg";
        String location = "geo:"+ mybirthoplacelatitude + mybirthplacelongitude;
        String query = mybirthoplacelatitude +","+ mybirthplacelongitude +"("+ mybirthplacetitle+ ")";
        String encodedQuery = Uri.encode(query);
        String uriString = location + "?q=" + encodedQuery +  "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent mybirtholaceIntent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(mybirtholaceIntent);
    }

    public void shareOnclick(View vew) {

        Intent shareonclickIntent = new Intent(android.content.Intent.ACTION_SEND);
        shareonclickIntent.setType("text/plain");
        shareonclickIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Android Tutorials");
        shareonclickIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Watch cool Android tutorials for beginners :https://www.youtube.com/watch?v=QAbQgLGKd3Y&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl ");
        startActivity(Intent.createChooser(shareonclickIntent, "Share with love"));

    }
    public void displayNewactivity(View view) {
        Intent newactivityIntent = new Intent(this,NewActivity.class);
        startActivity(newactivityIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_help) {


            Intent helpIntent = new Intent(this,HelpActivity.class);
            startActivity(helpIntent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
