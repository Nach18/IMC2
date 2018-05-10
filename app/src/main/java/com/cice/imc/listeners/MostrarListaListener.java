package com.cice.imc.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.cice.imc.ListaActivity;
import com.cice.imc.MainActivity;

/**
 * Created by cice on 10/5/18.
 */

public class MostrarListaListener implements View.OnClickListener {

    private Context context;

    public MostrarListaListener(Context context) {
        this.context = context;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ListaActivity.class);
        //Vamos a intentar (intent) mostrar información
        context.startActivity(intent);
    }
}
