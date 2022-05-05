package com.example.parcial1_elianbeltran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button bts, btr, btm, btd;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.primer);
        num2 = findViewById(R.id.segundo);
        resultado= findViewById(R.id.resultado);

        bts=findViewById(R.id.btn1);
        btr=findViewById(R.id.btn2);
        btm=findViewById(R.id.btn3);
        btd=findViewById(R.id.btn4);

        bts.setOnClickListener(this);
        btr.setOnClickListener(this);
        btm.setOnClickListener(this);
        btd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1=num1.getText().toString();
        String n2=num2.getText().toString();
        double ent1=Integer.parseInt(n1);
        double ent2=Integer.parseInt(n2);

        double res=0;

        switch (v.getId()){
            case R.id.btn1:
                res=ent1+ent2;
                break;
            case R.id.btn2:
                res=ent1-ent2;
                break;
            case R.id.btn3:
                res=ent1*ent2;
                break;
            case R.id.btn4:
                if(ent2!=0) {
                    res = ent1 / ent2;
                }
                break;
        }
       resultado.setText(""+res);
    }
}