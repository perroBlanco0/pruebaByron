package com.csto.pruebabyron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segunda extends AppCompatActivity {
    TextView conTotal,conHombres,conMujeres ;
    Button btnAgregar;
    String genero ;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        conTotal = (TextView) findViewById(R.id.conTotal);
        conHombres = (TextView) findViewById(R.id.conHombres);
        conMujeres = (TextView) findViewById(R.id.conMujeres);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        Bundle B = getIntent().getExtras();
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent llamar = new Intent(getApplicationContext(),tercera.class);

                startActivity(llamar);
            }
        });


    }
}