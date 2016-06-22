package com.example.olga.asynctaskproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.InputStream;
import java.net.URL;
import android.os.AsyncTask;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.Toast;

public class Loadimage extends AppCompatActivity {

    ImageView img_birthplace;
    Bitmap bm;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadimage);
        img_birthplace = (ImageView)findViewById(R.id.image);
        new LoadIm().execute("https://raw.githubusercontent.com/olga0503/CS6392016/master/AsynctaskProject/myBirthplace.jpg");
    }

    private class LoadIm extends AsyncTask<String, String, Bitmap> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(Loadimage.this);
            dialog.setMessage("Loading ... Please Wait!");
            dialog.show();

        }
        protected Bitmap doInBackground(String... args) {
            try {
                bm = BitmapFactory.decodeStream((InputStream)new URL(args[0]).getContent());

            } catch (Exception e) {
                e.printStackTrace();
            }
            return bm;
        }

        protected void onPostExecute(Bitmap image) {

            if(image != null){
                img_birthplace.setImageBitmap(image);
                dialog.dismiss();

            }else{

                dialog.dismiss();
                Toast.makeText(Loadimage.this, "You are experiencing Network Connectivity Issues or Image Doesn't exist", Toast.LENGTH_SHORT).show();

            }
        }
    }


}


