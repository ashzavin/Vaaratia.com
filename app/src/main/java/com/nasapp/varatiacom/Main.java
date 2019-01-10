package com.nasapp.varatiacom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main extends AppCompatActivity implements OnItemClickListener {


    public static final Integer[] image = { R.drawable.l1,
            R.drawable.l2, R.drawable.l3, R.drawable.l4, R.drawable.l5, R.drawable.l6, R.drawable.l7, };


    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    ListView listView;

    String loca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

        json_string=getIntent().getExtras().getString("json_data");

        Integer[] image = { R.drawable.a2,
                R.drawable.a1, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,  R.drawable.a1, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,  R.drawable.a1, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7};

        try {
            jsonObject=new JSONObject(json_string);
            jsonArray=jsonObject.getJSONArray("server_response");
            int count=0;
            String location,rent,rooms,for_gender,for_occupation,address,email,phone;




            while(count<jsonArray.length())
            {
                JSONObject jo=jsonArray.getJSONObject(count);


                location=jo.getString("location");
                rent=jo.getString("rent");
                rooms=jo.getString("rooms");
                for_gender=jo.getString("for_gender");
                for_occupation=jo.getString("for_occupation");
                address=jo.getString("address");
                email=jo.getString("email");
                phone=jo.getString("phone");
              //  nameOfImage = jo.getString("image");




                RowItem c=new RowItem(image[count],location,rent,rooms,for_gender,for_occupation,address,email,phone);
                adapter.add(c);
                count++;

            }





        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {



     /*   if (position == 0) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 1) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 2) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 3) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 4) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 5) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }

        if (position == 6) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 7) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 8) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 9) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 10) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }
        if (position == 11) {
            Intent i=new Intent(Main.this,map.class);
            startActivity(i);
        }*/

    }
}
