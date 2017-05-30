package com.example.caleb.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.messageText);
        password = (EditText) findViewById(R.id.passwordText);

    }

    public static boolean checkPassword(String s){
        //check the first rule: if the password is "password"
        if(s.equalsIgnoreCase("password")) return false;

        //check the second rule: if the password length at least 8 characters
        if(s.length() < 7) return false;

        //check if the password contains a least 1 digit
        if(!s.matches(".*[0-9]+.*")) return false;

        //check if the password contains both upper and lower case
        if(s.matches("[[!a-z]0-9_]+") || s.matches("[[!A-Z]0-9_]+")) return false;

        //check if the password contains special characters
        if(!s.matches(".*_.*") || s.matches(".*!.*") || s.matches(".*@.*")
                || s.matches(".*@.*") || s.matches(".*#.*") || s.matches(".*%.*"))
            return false;

        return true;
    }

    public void Validator(View v){
        if(checkPassword(password.getText().toString()))
            tv.setText("Well done, you enter a strong password");
        else
            tv.setText("Try again, not strong enough");
    }

}