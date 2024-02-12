package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.btn1);
        Intent intToMa=new Intent(getApplicationContext(), MainActivity2.class);
        btn1.setOnClickListener(v->{
            startActivity(intToMa);

        });
    }
}