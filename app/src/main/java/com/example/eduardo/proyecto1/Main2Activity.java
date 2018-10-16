package com.example.eduardo.proyecto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //conectamos la parte grafica con la logica
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

    }

    //metodo sumar
    public void sumar(View view){
        String num1_string = et1.getText().toString();
        String num2_string = et2.getText().toString();

        int num1 = Integer.parseInt(num1_string);
        int num2 = Integer.parseInt(num2_string);

        int suma = num1+num2;
        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }

}
