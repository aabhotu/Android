package com.example.thuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class cuaso2 extends AppCompatActivity {

    EditText cet1,cet2;
    Button cb1,cb2,cb3;
    TextView tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuaso2);
        cet1 = (EditText)findViewById(R.id.cet1);
        cet2 = (EditText)findViewById(R.id.cet2);
        cb1 = (Button) findViewById(R.id.cb1);
        cb2 = (Button) findViewById(R.id.cb2);
        cb3 = (Button) findViewById(R.id.cb3);
        tt1 = (TextView) findViewById(R.id.text1) ;
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = cet1.getText().toString();
                int s = Integer.parseInt(a);
                String b = cet2.getText().toString();
                int x = Integer.parseInt(b);

                int temp1 = s;
                int temp2 = x;
                while ( temp1 != temp2){
                    if (temp1 > temp2){
                        temp1 -= temp2;

                    }else {
                        temp2 -=temp1;
                    }
                }
                int usln = temp1;
                tt1.setText(String.valueOf(usln));


            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cet1.setText("");
                cet2.setText("");

            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(cuaso2.this, MainActivity.class);
                startActivity(i1);
                onStop();
            }
        });
    }
}