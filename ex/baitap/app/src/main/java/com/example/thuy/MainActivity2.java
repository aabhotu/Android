package com.example.thuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button delta = findViewById(R.id.delta);
        Button nghiem = findViewById(R.id.nghiem);

        TextView result = findViewById(R.id.result);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
//        int a = bundle.getInt("soa");
//        int b = bundle.getInt("sob");
//        int c = bundle.getInt("soc");
//        float del = (b * b - 4 * a * c);
//
//        delta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText("Delta: " + del);
//
//
//            }
//        });
    }
}