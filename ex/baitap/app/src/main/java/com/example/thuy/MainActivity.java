package com.example.thuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        EditText edtC = findViewById(R.id.edtC);

        RadioButton ptb2 = findViewById(R.id.ptb2);
        RadioButton sapXep = findViewById(R.id.sapXep);
        RadioButton find = findViewById(R.id.find);
        RadioButton tinh = findViewById(R.id.tinh);

        Button run = findViewById(R.id.run);
        Button exit = findViewById(R.id.exit);

        TextView note = findViewById(R.id.note);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        int idCheck = radioGroup.getCheckedRadioButtonId();

        if (edtA.getText().equals(""))
            note.setText("Nhap a");
        else if (edtB.getText().equals(""))
            note.setText("Nhap b");
        else if (edtC.getText().equals(""))
            note.setText("Nhap c");
        else {
            switch(idCheck){
            case R.id.ptb2:
                run.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Giaiptb2 = new Intent(MainActivity.this,MainActivity2.class);
                        Bundle bundle = new Bundle();
                        int a = Integer.parseInt(edtA.getText().toString());
                        int b = Integer.parseInt(edtB.getText().toString());
                        int c = Integer.parseInt(edtC.getText().toString());
                        bundle.putInt("soa", a);
                        bundle.putInt("sob", b);
                        bundle.putInt("soc", c);
                        Giaiptb2.putExtras(bundle);
                        startActivity(Giaiptb2);
                    }
                });
        }
        }

    }
}