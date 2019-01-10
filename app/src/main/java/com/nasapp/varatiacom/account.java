package com.nasapp.varatiacom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class account extends AppCompatActivity {


    EditText ET_NAME,ET_USER_PASS,ET_USER_NAME;
    String name,user_pass,user_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ET_NAME = (EditText)findViewById(R.id.name);
        ET_USER_PASS = (EditText)findViewById(R.id.new_user_pass);
        ET_USER_NAME=(EditText)findViewById(R.id.new_user_name);
    }

    public void userReg(View v)
    {

        name = ET_NAME.getText().toString();
        user_pass = ET_USER_PASS.getText().toString();
        user_name = ET_USER_NAME.getText().toString();

        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_pass);
        finish();

    }

}

