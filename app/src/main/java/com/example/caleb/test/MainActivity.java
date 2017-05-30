package com.example.caleb.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //check the first rule: if the password is "password"
    public static boolean checkPW(String s){
        return !s.equalsIgnoreCase("password");
    }

    //check the second rule: if the password length at least 8 characters
    public static boolean checkLength(String s){
        return s.length() > 7 ;
    }
}

