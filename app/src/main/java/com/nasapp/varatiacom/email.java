package com.nasapp.varatiacom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class email extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        wb=(WebView) findViewById(R.id.webView);
        wb.loadUrl("http://gmail.com");
    }
}
