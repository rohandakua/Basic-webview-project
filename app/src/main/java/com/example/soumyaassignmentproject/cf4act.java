package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cf4act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf4act);
        WebView wv4=findViewById(R.id.wv4);
        wv4.loadUrl("https://roadmap.sh/blockchain");
        wv4.getSettings().setJavaScriptEnabled(true);
        wv4.setWebViewClient(new WebViewClient());
    }
}