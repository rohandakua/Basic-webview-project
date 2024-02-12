package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cf3act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf3act);
        WebView wv3=findViewById(R.id.wv3);
        wv3.loadUrl("https://roadmap.sh/devops");
        wv3.getSettings().setJavaScriptEnabled(true);
        wv3.setWebViewClient(new WebViewClient());
    }
}