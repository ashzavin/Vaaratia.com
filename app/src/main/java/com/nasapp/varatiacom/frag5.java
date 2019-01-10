package com.nasapp.varatiacom;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class frag5 extends Fragment {


    public frag5() {
        // Required empty public constructor
    }

    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_frag5, container, false);


        b1=(Button)v.findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method();
            }
        });

        return v;
    }

    public void method()
    {
       // Intent i=new Intent(frag5.this.getActivity(),Activity4.class);
        Intent i=new Intent(frag5.this.getActivity(),Activity4.class);
        startActivity(i);

    }
}
