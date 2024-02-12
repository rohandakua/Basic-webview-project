package com.example.soumyaassignmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    CardView cv1,cv2,cv3,cv4,cv5,cv6;
    Button btn2;
    private void findId(){
        cv1=findViewById(R.id.cv1);
        cv2=findViewById(R.id.cv2);
        cv3=findViewById(R.id.cv3);
        cv4=findViewById(R.id.cv4);
        cv5=findViewById(R.id.cv5);
        cv6=findViewById(R.id.cv6);
        btn2=findViewById(R.id.btn2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findId();
        Intent int1=new Intent(getApplicationContext(), MainActivity3.class);
        cv1.setOnClickListener(v->{
            startActivity(int1);
        });
        Intent int2=new Intent(getApplicationContext(), cf2act.class);
        cv2.setOnClickListener(v->{
            startActivity(int2);
        });
        Intent int3=new Intent(getApplicationContext(), cf3act.class);
        cv3.setOnClickListener(v->{
            startActivity(int3);
        });
        Intent int4=new Intent(getApplicationContext(), cf4act.class);
        cv4.setOnClickListener(v->{
            startActivity(int4);
        });
        Intent int5=new Intent(getApplicationContext(), cf5act.class);
        cv5.setOnClickListener(v->{
            startActivity(int5);
        });
        Intent int6=new Intent(getApplicationContext(), cf6act.class);
        cv6.setOnClickListener(v->{
            startActivity(int6);
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:info@roadmap.sh?subject=" + Uri.encode("Help") + "&body=" );
                intent.setData(data);
                startActivity(intent);

            }
        });


    }
}