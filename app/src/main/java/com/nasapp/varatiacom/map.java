package com.nasapp.varatiacom;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void call1(View v)
    {


        String telmsg = "tel:01684911591";
        Intent callInten = new Intent(Intent.ACTION_CALL);
        callInten.setData(Uri.parse(telmsg));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

       // context.startActivity(callIntent);
        startActivity(callInten);
    }

    public void jao(View v)
    {



        String map = "http://maps.google.co.in/maps?q=mirpur 11 road 7";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Only if initiating from a Broadcast Receiver
        String mapsPackageName = "com.google.android.apps.maps";
        i.setClassName(mapsPackageName, "com.google.android.maps.MapsActivity");
        i.setPackage(mapsPackageName);
        startActivity(i);

    }

    public void nao(View v)

    {
        Intent i=new Intent(map.this,email.class);
        startActivity(i);

    }


}
