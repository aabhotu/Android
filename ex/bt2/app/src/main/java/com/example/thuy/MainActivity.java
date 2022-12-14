package com.example.thuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView t1;
    Button b1,b2;
    int mk;
    int a=1;
    String tk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tk = et1.getText().toString();
                mk = Integer.valueOf(et2.getText().toString());
                if (tk.equals("Admin") && mk == 12345)
                {
                    Intent i = new Intent(MainActivity.this,cuaso2.class);
                    startActivity(i);
                }
                else
                {
                    t1.setText(" Sai tài khoản hoặc mật khẩu ");
                    et1.setText("");
                    et2.setText("");
                    a++;
                    if(a>3)
                        onDestroy();
                }
            }
        });
    }
}