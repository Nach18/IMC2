package com.cice.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.cice.imc.adapters.RangoAdapter;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.fila, generarLista());
        //Android muestra información por Adapatadores (Adapter) de los cuales existen distiontos tipos, en estos casos usaremos uno de tipo lista (listaAdapter)
        ListView lv = findViewById(R.id.lista_rangos);
        //Creamos un objeto (lv) del recurso (r) (lista_rangos)
        //lv.setAdapter(listAdapter);
        //Al listView del activity (lv) le seteamos el adaptador (setAdapter)

        RangoAdapter rangoAdapter = new RangoAdapter(this);
        lv.setAdapter(rangoAdapter);
    }

    private String[] generarLista(){
        String[] array = new String[20];
        for(int i = 0; i<20; i++) {
            array[i] = "Posición " + i;
        }
        return array;
    }
}
