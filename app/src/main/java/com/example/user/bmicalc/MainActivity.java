package com.example.user.bmicalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    //deklarasi variabel
    EditText etTinggi,etBerat;
    Button btnCalculate,btnRegister;
    Context apaaja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi variabel
        apaaja = this;
        etTinggi = (EditText)findViewById(R.id.etHeight);
        etBerat = (EditText) findViewById(R.id.etWeight);
        btnCalculate = (Button) findViewById(R.id.btnCalc);
        btnCalculate.setOnClickListener(this);
        btnRegister = (Button) findViewById(R.id.btnRegis);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnCalc){

            Double tinggi,berat,bmi;
            berat = Double.parseDouble(etBerat.getText().toString());
            tinggi = Double.parseDouble(etTinggi.getText().toString())/100;

            bmi = berat / (tinggi*tinggi);
            String result;
            if(bmi<18.5){result="less than ideal";}
            else if(bmi>25){result="more than ideal";}
            else{ result="ideal";}
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();

        }else if(v.getId()==R.id.btnRegis){
            Toast.makeText(this, "Register ditekan", Toast.LENGTH_SHORT).show();
        };

    }
}
