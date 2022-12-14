package com.example.b2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button logIn;
Button exit;
EditText name, inputPassword;
TextView  note;
int pass;
int a=1;
String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn = (Button) findViewById(R.id.logIn);
        exit = (Button) findViewById(R.id.exit);
        name = (EditText) findViewById(R.id.name);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
        note = (TextView) findViewById(R.id.note);
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                onDestroy();
            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = name.getText().toString();
                pass = Integer.valueOf(inputPassword.getText().toString());
                if (user.equals("Admin") && pass == 12345){
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
                else {
                    note.setText("wrong pass or wrong username");
                    name.setText("");
                    inputPassword.setText("");
                    a++;
                    if(a>3)
                        onDestroy();
                }
            }
        });
    }
}