package com.cice.imc.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cice.imc.R;

/**
 * Created by cice on 10/5/18.
 */

public class RangoAdapter extends BaseAdapter {

    private Context context;
    private String[] rangos = {
            "IMC < 16", "IMC < 18.5",
            "IMC < 25", "IMC < 30",
            "IMC < 30"
    };

    private String[] definiciones = {
            "Bicho Palo", "Bajo Peso",
            "Modelo", "Sobrepeso",
            "Pluton"
    };

    public RangoAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return definiciones.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        if(convertView==null) {
            Activity actividad = (Activity) context;
            LayoutInflater layoutInflater = actividad.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.fila_completa, parent, false);
        }else {
            view = convertView;
        }

        TextView texto1 = (TextView) view.findViewById(R.id.texto1);
        TextView texto2 = (TextView) view.findViewById(R.id.texto2);

        texto1.setText(definiciones[position]);
        texto2.setText(rangos[position]);


        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
