package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cf2act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf2act);
        WebView wv2=findViewById(R.id.wv2);
        wv2.loadUrl("https://roadmap.sh/backend");
        wv2.getSettings().setJavaScriptEnabled(true);
        wv2.setWebViewClient(new WebViewClient());
    }
}