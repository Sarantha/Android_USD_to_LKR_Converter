package com.industrialmaster.myconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View view){
        //get text form editText
        EditText etUsd = findViewById(R.id.etUsd);
        String text = etUsd.getText().toString();
        //convert string to double
        Double amt = Double.parseDouble(text);
        //multiply USD by 180 (rate)
        Double amt_lkr = amt * 180;
        //double -> string
        String val = String.valueOf(amt_lkr);
        //print value in text view
        TextView tvLKR = findViewById(R.id.tvLKR);
        tvLKR.setText(val);
    }
}
