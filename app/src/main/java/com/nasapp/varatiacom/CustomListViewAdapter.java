package com.nasapp.varatiacom;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.image.SmartImageView;

import org.w3c.dom.Text;

public class CustomListViewAdapter extends ArrayAdapter  {
    Context context;

    String s5=null;
    String s2=null;

    //private static final String baseUrlForImage = "http://vaaratia.3eeweb.com/image/";

    List list= new ArrayList();
    public CustomListViewAdapter(Context context, int resource) {
        super(context, resource);
    }

    public void add(RowItem objects)
    {
        super.add(objects);
        list.add(objects);
    }
    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return  list.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row ;
        row = convertView;


        if(row == null){

            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.list, parent, false);
        }
        final RowItem listItem = (RowItem)list.get(position);
        if(listItem != null) {


            //String nameOfImage = listItem.getImage();
            //String urlForImageInServer = baseUrlForImage + nameOfImage;




           /* new  AsyncTask<String, Void, Bitmap>()

            {



                @Override
                protected Bitmap doInBackground(String... params) {

                    String url = params[0];
                    Bitmap icon = null;


                    try {


                        InputStream in = new URL(url).openStream();
                        icon = BitmapFactory.decodeStream(in);
                        in.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }


                    return icon;
                }

                protected void onPostExecute(Bitmap result) {
                    imageView.setImageBitmap(result);
                }


            }.execute(urlForImageInServer);*/





            TextView txv_name = (TextView) row.findViewById(R.id.title);
            TextView a1 = (TextView) row.findViewById(R.id.p1);
            TextView txv_speak = (TextView) row.findViewById(R.id.desc);
            TextView txv_lft = (TextView) row.findViewById(R.id.price);
            TextView a2 = (TextView) row.findViewById(R.id.p2);
            TextView a3 = (TextView) row.findViewById(R.id.p3);
            TextView a4 = (TextView) row.findViewById(R.id.p4);
            TextView a5 = (TextView) row.findViewById(R.id.p5);


            final ImageView imageView = (ImageView)row. findViewById(R.id.icon);


            imageView.setImageResource(listItem.getImage());
            txv_name.setText(listItem.getLocation());
            a1.setText(listItem.getAddress());
            txv_speak.setText(listItem.getRent());
            txv_lft.setText(listItem.getRooms());
            a2.setText(listItem.getFor_gender());
            a3.setText(listItem.getFor_occupation());
            a4.setText(listItem.getEmail());
            a5.setText(listItem.getPhone());

            s5=listItem.getPhone();
            s2=listItem.getAddress();

           /* b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"hi", Toast.LENGTH_LONG).show();
                   // call();
                }
            });


            b2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    jaom();
                }
            });*/

            ImageButton button =
                    (ImageButton)row.findViewById( R.id.button);

            ImageButton button1 =
                    (ImageButton)row.findViewById(R.id.imageButton);
            ImageButton button2 =
                    (ImageButton)row.findViewById(R.id.imageButton2);
            button.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            String telmsg = "tel:" + s5;
                            Intent callInten = new Intent(Intent.ACTION_CALL);

                       callInten.setData(Uri.parse(telmsg));
        if (ActivityCompat.checkSelfPermission(v.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        v.getContext().startActivity(callInten);
                        }
                    });





            button1.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                             String map = "http://maps.google.co.in/maps?q=" + s2;
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Only if initiating from a Broadcast Receiver
        String mapsPackageName = "com.google.android.apps.maps";
        i.setClassName(mapsPackageName, "com.google.android.maps.MapsActivity");
        i.setPackage(mapsPackageName);
        v.getContext().startActivity(i);
                        }
                    });


            button2.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent i=new Intent(v.getContext(),email.class);
                            v.getContext().startActivity(i);
                        }
                    });

        }




        return row;
    }







}
