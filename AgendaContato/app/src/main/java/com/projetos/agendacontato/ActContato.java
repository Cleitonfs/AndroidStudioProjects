package com.projetos.agendacontato;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ActContato extends Activity implements View.OnClickListener {

    private Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_contato);

        btnAdicionar = (Button) findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        Intent it = new Intent(this, ActCadContatos.class);
        startActivity(it);

    }
}
