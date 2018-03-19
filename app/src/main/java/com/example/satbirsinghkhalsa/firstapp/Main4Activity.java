package com.example.satbirsinghkhalsa.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button R1C1,R1C2,R1C3,R2C1,R2C2,R2C3,R3C1,R3C2,R3C3;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        R1C1=(Button)findViewById(R.id.r1c1);
        R1C2=(Button)findViewById(R.id.r1c2);
        R1C3=(Button)findViewById(R.id.r1c3);
        R2C1=(Button)findViewById(R.id.r2c1);
        R2C2=(Button)findViewById(R.id.r2c2);
        R2C3=(Button)findViewById(R.id.r2c3);
        R3C1=(Button)findViewById(R.id.r3c1);
        R3C2=(Button)findViewById(R.id.r3c2);
        R3C3=(Button)findViewById(R.id.r3c3);
        R1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R1C1.setText("0");
                }
                else
                    R1C1.setText("X");
                R1C1.setEnabled(false);

            }
        });
        R1C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R1C2.setText("0");
                }
                else
                    R1C2.setText("X");
                R1C2.setEnabled(false);

            }
        });
        R1C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R1C3.setText("0");
                }
                else
                    R1C3.setText("X");
                R1C3.setEnabled(false);
            }
        });
        R2C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R2C1.setText("0");
                }
                else
                    R2C1.setText("X");
                R2C1.setEnabled(false);

            }
        });
        R2C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R2C2.setText("0");
                }
                else
                    R2C2.setText("X");
                R2C2.setEnabled(false);

            }
        });
        R2C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R2C3.setText("0");
                }
                else
                    R2C3.setText("X");
                R2C3.setEnabled(false);

            }
        });
        R3C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R3C1.setText("0");
                }
                else
                    R3C1.setText("X");
                R3C1.setEnabled(false);

            }
        });
        R3C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R3C2.setText("0");
                }
                else
                    R3C2.setText("X");
                R3C2.setEnabled(false);

            }
        });
        R3C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count%2==0)
                {
                    R3C3.setText("0");
                }
                else
                    R3C3.setText("X");
                R3C3.setEnabled(false);

            }
        });
    }
}
