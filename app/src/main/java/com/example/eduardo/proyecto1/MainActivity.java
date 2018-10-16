package com.example.eduardo.proyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se realiza la coneccion
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

    }

    //metodo validacion de campos
    public void validacion(View view){
        String nombre = et1.getText().toString();
        String password = et2.getText().toString();

        if(nombre.length()==0){
            Toast.makeText(this, "el campo esta vacio, ingrese un nombre", Toast.LENGTH_SHORT).show();

        }else if(password.length()==0){
            Toast.makeText(this, "el campo esta vacio ingrese un password", Toast.LENGTH_SHORT).show();

        }else if(nombre.length() !=0 && password.length() != 0){
            Toast.makeText(this, "validado", Toast.LENGTH_SHORT).show();
        }



    }
    //metodo cambiar de actovity intent
    public void cambio(View view) {
        Intent ca = new Intent(this, Main2Activity.class);
        startActivity(ca);
    }




}
