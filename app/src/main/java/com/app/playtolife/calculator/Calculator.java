package com.app.playtolife.calculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView resultado;
    EditText numberOne;
    EditText numberTwo;

    float result,valorUno,valorTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultado = (TextView) findViewById(R.id.textView4);

        numberOne = (EditText) findViewById(R.id.editText7);
        numberTwo = (EditText) findViewById(R.id.editText8);

        radioGroup = (RadioGroup)findViewById(R.id.radiogrupo);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                        if(i == R.id.suma){
                            valorUno = Integer.parseInt(numberOne.getText().toString());
                            valorTwo = Integer.parseInt(numberTwo.getText().toString());
                            result = valorUno+valorTwo;

                            resultado.setText(String.valueOf(result));
                        }else if(i == R.id.resta){
                            valorUno = Integer.parseInt(numberOne.getText().toString());
                            valorTwo = Integer.parseInt(numberTwo.getText().toString());
                            result = valorUno-valorTwo;

                            resultado.setText(String.valueOf(result));
                        }else if(i == R.id.multiplicacion){
                            valorUno = Integer.parseInt(numberOne.getText().toString());
                            valorTwo = Integer.parseInt(numberTwo.getText().toString());
                            result = valorUno*valorTwo;

                            resultado.setText(String.valueOf(result));
                        }else if (i == R.id.division){
                            valorUno = Integer.parseInt(numberOne.getText().toString());
                            valorTwo = Integer.parseInt(numberTwo.getText().toString());
                            result = valorUno/valorTwo;

                            resultado.setText(String.valueOf(result));
                        }
                    }
                });
            }
        });
    }
}
