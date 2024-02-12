package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cf5act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf5act);
        WebView wv5=findViewById(R.id.wv5);
        wv5.loadUrl("https://roadmap.sh/flutter");
        wv5.getSettings().setJavaScriptEnabled(true);
        wv5.setWebViewClient(new WebViewClient());
    }
}