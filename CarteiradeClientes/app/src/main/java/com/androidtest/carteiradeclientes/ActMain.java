package com.androidtest.carteiradeclientes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActMain extends AppCompatActivity {

    private RecyclerView lstDados;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lstDados = (RecyclerView) findViewById(R.id.lstDados);
        fab = (FloatingActionButton) findViewById(R.id.fab);

    }

    public void cadastrar(View view){

        Intent it = new Intent(ActMain.this, ActCadCliente.class);
        startActivity(it);
    }

}
