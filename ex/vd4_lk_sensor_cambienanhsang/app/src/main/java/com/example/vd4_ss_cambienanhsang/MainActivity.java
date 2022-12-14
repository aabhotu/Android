package com.example.vd4_ss_cambienanhsang;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener eventListener;
    EditText et1,et2;
    TextView tv1;
    double a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        this.et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        this.et2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        this.tv1 = (TextView) findViewById(R.id.tv2);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length()==0){
                    et1.setError("Không thể bỏ trống!");
                }else et1.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    a = Double.valueOf(et1.getText().toString());
                }catch (Exception e){
                    a = 0;
                }
            }
        });
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length()==0){
                    et2.setError("Không thể bỏ trống!");
                }else et2.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    b = Double.valueOf(et2.getText().toString());
                }catch (Exception e){
                    b = 0;
                }
            }
        });

        eventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(a<b){
                    tv1.setText("Lỗi");
                }else {
                    if(sensorEvent.values[0]>a){
                        tv1.setText("Quá sáng");
                    }else if(sensorEvent.values[0]<b){
                        tv1.setText("Ánh sáng yếu");
                    }else {
                        tv1.setText("Cường độ ánh sáng trung bình");
                    }
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(eventListener,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(eventListener);
    }
}