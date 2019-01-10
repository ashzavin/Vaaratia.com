package com.nasapp.varatiacom;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class frag1 extends Fragment {


    public frag1() {
        // Required empty public constructor
    }
    ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_frag1, container, false);

        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goI();
            }
        });

        iv = (ImageView) v.findViewById(R.id.pic);

        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int []imageArray={R.drawable.h2,R.drawable.h1,R.drawable.h3,R.drawable.h4,R.drawable.h5,R.drawable.h6,R.drawable.h7,R.drawable.h8,R.drawable.h9};
            //Animation anim = AnimationUtils.loadAnimation(getContext(), R.anim.alpha);
            int i=0;
            public void run() {
                iv.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 8000);

               // iv.clearAnimation();
               // iv.startAnimation(anim);//for interval...
            }
        };
        handler.postDelayed(runnable, 50); //for initial delay..

        return v;
    }
    public void goI()
    {
        Intent i=new Intent(frag1.this.getActivity(),MapsActivity.class);
        startActivity(i);

    }
}
