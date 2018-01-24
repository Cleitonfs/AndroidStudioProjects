package com.android.exlistviewspinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class ActMain extends Activity implements View.OnClickListener{

    private EditText    edtValor;
    private Spinner     spnOpcoes;
    private Button      btnAdicionar;
    private Button      btnExcluir;
    private ListView    lstDados;

    private ArrayAdapter<String> adpOpcoes;
    private ArrayAdapter<String> adpDados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);


        edtValor =      (EditText)  findViewById(R.id.edtValor);
        spnOpcoes =     (Spinner)   findViewById(R.id.spnOpcoes);
        btnAdicionar =  (Button)    findViewById(R.id.btnAdicionar);
        btnExcluir =    (Button)    findViewById(R.id.btnExcluir);
        lstDados =      (ListView)  findViewById(R.id.lstDados);

        btnExcluir.setOnClickListener(this);
        btnAdicionar.setOnClickListener(this);

        adpOpcoes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        adpOpcoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnOpcoes.setAdapter(adpOpcoes);
        adpOpcoes.add("Opção 1");
        adpOpcoes.add("Opção 2");
        adpOpcoes.add("Opção 3");
        adpOpcoes.add("Opção 4");


        adpDados = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lstDados.setAdapter(adpDados);


    }


    @Override
    public void onClick(View view) {

        if (view == btnAdicionar){

            String item = edtValor.getText().toString();
            item += " - " + spnOpcoes.getSelectedItem();
            adpDados.add(item);
        } else {
            if (view == btnExcluir){

                if (adpDados.getCount() > 0){

                    String item = adpDados.getItem(0);
                    adpDados.remove(item);

                }


            }


        }



    }
}
