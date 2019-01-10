package com.nasapp.varatiacom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    String area,location,address,rent;
    EditText e_location,e_address,e_rent;

    Spinner spinner,spinner2,spinner3;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner=(Spinner) findViewById(R.id.spinner);
        e_location=(EditText)findViewById(R.id.editText);
        e_address=(EditText)findViewById(R.id.editText1);
        e_rent=(EditText)findViewById(R.id.editText2);

        adapter= ArrayAdapter.createFromResource(Activity2.this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                area = String.valueOf(parent.getItemAtPosition(position));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }



    public void post(View v)
    {


        location = e_location.getText().toString();
        address = e_address.getText().toString();
        rent = e_rent.getText().toString();


        String method = "register";
        post1 p1 = new post1(this);
        p1.execute(method, area, location, address,rent);

        Intent i=new Intent(this,post2.class);
        startActivity(i);



    }
}
