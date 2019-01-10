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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class frag3 extends Fragment {


    public frag3() {
        // Required empty public constructor
    }


    String json_string;
    ListView a;
    TextView t;
    String[] name={"Mirpur","DOHS","Farmgate","Shahbag","Uttara","Azimpur"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_frag3, container, false);
        a=(ListView)v.findViewById(R.id.listView);


        ListAdapter l=new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item,name);

        a.setAdapter(l);

        a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String js;
                if (position == 0) {
                    js="http://vaaratia.3eeweb.com/sel.php";
                  new backgroundtask(js).execute();
                }
                if (position == 1) {
                    js="http://vaaratia.3eeweb.com/l2.php";
                    new backgroundtask(js).execute();
                }
                if (position == 2) {
                    js="http://vaaratia.3eeweb.com/l1.php";
                    new backgroundtask(js).execute();
                }
                if (position == 3) {
                    js="http://vaaratia.3eeweb.com/l3.php";
                    new backgroundtask(js).execute();
                }
                if (position == 4) {
                    js="http://vaaratia.3eeweb.com/l5.php";
                    new backgroundtask(js).execute();
                }
                if (position == 5) {
                    js="http://vaaratia.3eeweb.com/l4.php";
                    new backgroundtask(js).execute();
                }

            }
        });


        return v;
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
            Toast.makeText(this.getContext(),"Loading...please wait",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Intent i=new Intent(frag3.this.getContext(),Main.class);
            i.putExtra("json_data",json_string);
            startActivity(i);
        }
    }

}
