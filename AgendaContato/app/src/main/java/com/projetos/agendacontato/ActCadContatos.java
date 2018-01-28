package com.projetos.agendacontato;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.zip.Inflater;


public class ActCadContatos extends Activity {


    private EditText edtNome;
    private EditText edtTelefone;
    private EditText edtEmail;
    private EditText edtEndereco;
    private EditText edtDatasEspeciais;
    private EditText edtGrupos;
    private Spinner spnTipoEmail;
    private Spinner spnTipoEndereco;
    private Spinner spnTipoDatasEspeciais;
    private Spinner spnTipoTelefone;

    private ArrayAdapter<String> adpTipoEmail;
    private ArrayAdapter<String> adpTipoEndereco;
    private ArrayAdapter<String> adpTipoTelefone;
    private ArrayAdapter<String> adpTipoDatasEspeciais;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_contatos);

        //Recuperando os objetos dos respectivos atributos do layout
        edtNome             =   (EditText) findViewById(R.id.edtNome);
        edtTelefone         =   (EditText) findViewById(R.id.edtTelefone);
        edtEmail            =   (EditText) findViewById(R.id.edtEmail);
        edtEndereco         =   (EditText) findViewById(R.id.edtEndereço);
        edtDatasEspeciais   =   (EditText) findViewById(R.id.edtDatasEspeciais);
        edtGrupos           =   (EditText) findViewById(R.id.edtGrupos);

        spnTipoEmail        =   (Spinner)  findViewById(R.id.spnTipoEmail);
        spnTipoEndereco     =   (Spinner)  findViewById(R.id.spnTipoEndereco);
        spnTipoDatasEspeciais   =   (Spinner)  findViewById(R.id.spnTipoDatasEspeciais);
        spnTipoTelefone     =   (Spinner)  findViewById(R.id.spnTipoTelefone);

        //Criando um ArrayAdpter para cada Spinner
        adpTipoEmail = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoEndereco = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoEndereco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoDatasEspeciais = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoDatasEspeciais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoTelefone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Associando os objetos Spinner aos objetos ArrayAdapter

        spnTipoEmail.setAdapter(adpTipoEmail);
        spnTipoTelefone.setAdapter(adpTipoTelefone);
        spnTipoEndereco.setAdapter(adpTipoEndereco);
        spnTipoDatasEspeciais.setAdapter(adpTipoDatasEspeciais);

        //Adicionando as opções de cada Spinner em seus respectivos ArrayAdapters

        adpTipoEmail.add("Pessoal");
        adpTipoEmail.add("Trabalho");
        adpTipoEmail.add("Outros");

        adpTipoTelefone.add("Celular");
        adpTipoTelefone.add("Trabalho");
        adpTipoTelefone.add("Casa");
        adpTipoTelefone.add("Principal");
        adpTipoTelefone.add("Fax trabalho");
        adpTipoTelefone.add("Fax casa");
        adpTipoTelefone.add("Pager");
        adpTipoTelefone.add("Outros");

        adpTipoEndereco.add("Casa");
        adpTipoEndereco.add("Trabalho");
        adpTipoEndereco.add("Outros");

        adpTipoDatasEspeciais.add("Aniversário");
        adpTipoDatasEspeciais.add("Data comemorativa");
        adpTipoDatasEspeciais.add("Outros");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu_act_cad_contatos, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.min_acao1:
                break;
            case R.id.min_acao2:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
