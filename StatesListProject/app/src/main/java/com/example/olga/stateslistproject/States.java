package com.example.olga.stateslistproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class States {


        //private int id;
        private String state_name;
        //private double price;

        public States(){
            super();
        }

        public States(String state_name) {
            super();
            //this.id = id;
            this.state_name = state_name;
            //this.price = price;
        }

        @Override
        public String toString() {
            return this.state_name;
        }






    }

