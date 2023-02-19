package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);

        Intent i=getIntent();
        String g=i.getStringExtra("name");
        String h=i.getStringExtra("theater");
        String j=i.getStringExtra("number");
        String k=i.getStringExtra("calc");

        textView.setText(g);
        textView2.setText(h);
        textView3.setText(j);
        textView4.setText(String.valueOf(k));
    }
}