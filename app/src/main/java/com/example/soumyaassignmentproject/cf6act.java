package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cf6act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf6act);
        WebView wv6=findViewById(R.id.wv6);
        wv6.loadUrl("https://roadmap.sh/game-developer");
        wv6.getSettings().setJavaScriptEnabled(true);
        wv6.setWebViewClient(new WebViewClient());
    }
}