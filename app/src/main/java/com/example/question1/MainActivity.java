package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,theater,price,number;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        theater=findViewById(R.id.theater);
        price=findViewById(R.id.price);
        number=findViewById(R.id.number);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=name.getText().toString();
                String b=theater.getText().toString();
                Double c=Double.parseDouble(price.getText().toString());
                Double d=Double.parseDouble(number.getText().toString());
                Double e=c*d;
                String f=String.valueOf(e);
                String m=String.valueOf(d);




                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",a);
                i.putExtra("theater",b);
                i.putExtra("price",c);
                i.putExtra("number",m);
                i.putExtra("calc",f);
                startActivity(i);

            }
        });

    }
}