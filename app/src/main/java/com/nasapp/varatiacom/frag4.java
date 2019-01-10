package com.nasapp.varatiacom;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag4 extends Fragment {


    String s1,s2,s3,js,json_string;
    Spinner spinner,spinner2,spinner3;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    public frag4() {
        // Required empty public constructor
    }

    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_frag4, container, false);

        spinner=(Spinner)v.findViewById(R.id.spinner);
        spinner2=(Spinner)v.findViewById(R.id.spinner2);
        spinner3=(Spinner)v.findViewById(R.id.spinner3);



        adapter=ArrayAdapter.createFromResource(getContext(),R.array.locations,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s1 = String.valueOf(parent.getItemAtPosition(position));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        adapter2=ArrayAdapter.createFromResource(getContext(),R.array.low,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                s2 = String.valueOf(parent.getItemAtPosition(position));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        adapter3=ArrayAdapter.createFromResource(getContext(),R.array.high,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s3 = String.valueOf(parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        b1=(Button)v.findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                re();
            }
        });
        return v;
    }

    public void re()
    {


        String m1,m2,m3,m4,m5,m6;
        m1="Mirpur";
        m2="Farmgate";
        m4="Azimpur";
        m3="Uttara";
        m5="Shahbag";
        String n1,n2,h1,h2,h3;
        n1="5000";
        n2="7000";h1="10000";h2="15000";h3="20000";
       if(s1.equals(m1) && s2.equals(n1)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/s1.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m1) && s2.equals(n1)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/s2.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m1) && s2.equals(n1)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/s3.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m1) && s2.equals(n2)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/s4.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m1) && s2.equals(n2)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/s5.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m1) && s2.equals(n2)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/s6.php";
            new backgroundtask(js).execute();
        }






        if(s1.equals(m2) && s2.equals(n1)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/m1.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m2) && s2.equals(n1)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/m2.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m2) && s2.equals(n1)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/m3.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m2) && s2.equals(n2)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/m4.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m2) && s2.equals(n2)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/m5.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m2) && s2.equals(n2)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/m6.php";
            new backgroundtask(js).execute();
        }





        if(s1.equals(m3) && s2.equals(n1)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/u1.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m3) && s2.equals(n1)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/u2.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m3) && s2.equals(n1)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/u3.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m3) && s2.equals(n2)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/u4.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m3) && s2.equals(n2)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/u5.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m3) && s2.equals(n2)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/u6.php";
            new backgroundtask(js).execute();
        }




        if(s1.equals(m4) && s2.equals(n1)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/f1.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m4) && s2.equals(n1)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/f2.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m4) && s2.equals(n1)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/f3.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m4) && s2.equals(n2)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/f4.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m4) && s2.equals(n2)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/f5.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m4) && s2.equals(n2)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/f6.php";
            new backgroundtask(js).execute();
        }





        if(s1.equals(m5) && s2.equals(n1)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/j1.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m5) && s2.equals(n1)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/j2.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m5) && s2.equals(n1)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/j3.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m5) && s2.equals(n2)&& s3.equals(h1))
        {
            js="http://vaaratia.3eeweb.com/j4.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m5) && s2.equals(n2)&& s3.equals(h2))
        {
            js="http://vaaratia.3eeweb.com/j5.php";
            new backgroundtask(js).execute();
        }
        if(s1.equals(m5) && s2.equals(n2)&& s3.equals(h3))
        {
            js="http://vaaratia.3eeweb.com/j6.php";
            new backgroundtask(js).execute();
        }

    }


    class backgroundtask extends AsyncTask<Void,Void,String> {

        String json_url;
        String json;
        String j;
        public backgroundtask(String u)
        {
            j=u;
        }
        @Override
        protected void onPreExecute() {
            json_url = j;
        }

        @Override
        protected String doInBackground(Void... params) {

            try {
                URL url = new URL(json_url);

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                StringBuilder stringBuilder = new StringBuilder();
                while ((json = bufferedReader.readLine()) != null)

                {
                    stringBuilder.append(json + "\n");

                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return stringBuilder.toString().trim();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }



        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {



            // t.setText(result);

            json_string=result;
            parse(json_string);
        }
    }
    public void parse(String json_string)
    {


        if(json_string==null)
        {
            Toast.makeText(this.getContext(), "Loading...please wait", Toast.LENGTH_SHORT).show();
        }

        else
        {
            Intent i=new Intent(frag4.this.getContext(),Main.class);
            i.putExtra("json_data",json_string);
            startActivity(i);
        }
    }

}

