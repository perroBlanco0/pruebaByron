package com.csto.pruebabyron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUsuario ,txtClave;
    Button btnConectar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsuario = (EditText) findViewById(R.id.txtNombre);
        txtClave = (EditText) findViewById(R.id.txtClave);
        btnConectar = (Button) findViewById(R.id.btnConectar);

        btnConectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUsuario.getText().toString().equals("adm123") && txtClave.getText().toString().equals("adm123") ){
                    Intent llamar = new Intent(getApplicationContext(),segunda.class);
                    startActivity(llamar);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o Clave incorrecta" ,Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}