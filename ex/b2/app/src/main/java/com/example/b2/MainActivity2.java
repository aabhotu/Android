package com.example.b2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
Button run, again, exit;
TextView label, result;
EditText a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       a = (EditText) findViewById(R.id.a);
       b = (EditText) findViewById(R.id.b);
       run = (Button) findViewById(R.id.run);
       again = (Button) findViewById(R.id.again);
       exit = (Button) findViewById(R.id.exit);
       label = (TextView) findViewById(R.id.label);

       run.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String so1 = a.getText().toString();
               int x = Integer.parseInt(so1);
               String so2 = b.getText().toString();
               int y = Integer.parseInt(so2);
               int temp1 = x;
               int temp2 = y;
               while (temp1 != temp2){
                   if(temp1 > temp2){
                       temp1 -=temp2;
                   }
                   else{
                       temp2 -= temp1;
                   }
               }
               int ucln = temp1;
               result.setText(String.valueOf(ucln));
           }
       });
       again.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               a.setText("");
               b.setText("");
           }
       });
       exit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i1 = new Intent(MainActivity2.this,MainActivity.class);
               startActivity(i1);
               onStop();
           }
       });
    }
}
