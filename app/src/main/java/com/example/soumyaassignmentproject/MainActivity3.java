package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView wv1=findViewById(R.id.wv1);
        wv1.loadUrl("https://roadmap.sh/android");
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
    }
}