package com.cice.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cice.imc.listeners.MostrarListaListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText altura = findViewById(R.id.altura);
        final EditText peso = findViewById(R.id.peso);
        Button calcula = findViewById(R.id.calcula);
        Button mostrar = findViewById(R.id.mostrar);
        final TextView resultado = findViewById(R.id.resultado);


        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alturaDada = altura.getText().toString();
                String pesoDado = peso.getText().toString();

                if(!alturaDada.isEmpty() && !pesoDado.isEmpty()) {
                    try {
                        double alturaNum = Double.parseDouble(alturaDada);
                        double pesoNum = Double.parseDouble(pesoDado);

                        double resultadoIMC = pesoNum / (alturaNum * alturaNum);

                        resultado.setText(String.valueOf(resultadoIMC));

                    } catch (Throwable ex) {
                        Toast.makeText(MainActivity.this, "No has introducido números", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "No has introducido los dos campos", Toast.LENGTH_LONG).show();
                }
            }
        });

        MostrarListaListener mostrarListaListener = new MostrarListaListener(this);
        mostrar.setOnClickListener(mostrarListaListener);


        };

    }














