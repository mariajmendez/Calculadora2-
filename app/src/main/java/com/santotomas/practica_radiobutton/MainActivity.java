package com.santotomas.practica_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_num1, et_num2;
    private TextView tv_resultado;
    private RadioButton rb_suma, rb_resta, rb_multiplicacion, rb_division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_num1 = (EditText)findViewById(R.id.txt_num1);
        et_num2 = (EditText)findViewById(R.id.txt_num2);
        rb_suma = (RadioButton) findViewById(R.id.rb_suma);
        rb_resta = (RadioButton)findViewById(R.id.rb_resta);
        rb_multiplicacion = (RadioButton) findViewById(R.id.rb_multiplicacion);
        rb_division = (RadioButton)findViewById(R.id.rb_division);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);

    }

    //Metodo para el boton

    public  void Calcular (View view){
        String num1_String = et_num1.getText().toString();
        String num2_String = et_num2.getText().toString();

        int num1_int = Integer.parseInt(num1_String);
        int num2_int = Integer.parseInt(num2_String);

        if(rb_suma.isChecked() == true){
            int suma = num1_int + num2_int;
            String resultado = String.valueOf(suma);
            tv_resultado.setText(resultado);
        } else if(rb_resta.isChecked() == true){
            int resta = num1_int - num2_int;
            String resultado = String.valueOf(resta);
            tv_resultado.setText(resultado);
        } else if(rb_multiplicacion.isChecked() == true){
            int multiplicacion = num1_int * num2_int;
            String resultado = String.valueOf(multiplicacion);
            tv_resultado.setText(resultado);
        } else if(rb_division.isChecked() == true){

            if (num2_int != 0){
                int division = num1_int / num2_int;
                String resultado = String.valueOf(division);
                tv_resultado.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            }
        }



    }
}
