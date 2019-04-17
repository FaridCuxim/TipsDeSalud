package com.example.tipsdesalud;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toolbar;

public class ActividadListaArticulos extends AppCompatActivity implements FragmentoListaArticulos.EscuchaFragmento{

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_lista_articulos);

        ((Toolbar) findViewById(R.id.toolbar)).setTitle(getTitle());

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_lista, FragmentoListaArticulos.crear()).commit();
    }

    @Override
    public void alSeleccionarItem(String idArticulo){

    }
}
