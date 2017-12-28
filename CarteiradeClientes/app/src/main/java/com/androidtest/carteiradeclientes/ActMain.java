package com.androidtest.carteiradeclientes;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.androidtest.carteiradeclientes.database.DadosOpenHelper;
import com.androidtest.carteiradeclientes.dominio.entidades.Cliente;
import com.androidtest.carteiradeclientes.dominio.repositorio.ClienteRepositorio;

import java.util.List;

public class ActMain extends AppCompatActivity {

    private RecyclerView lstDados;
    private FloatingActionButton fab;
    private ConstraintLayout layoutContentMain;

    private SQLiteDatabase conexao;

    private DadosOpenHelper dadosOpenHelper;

    private ClienteAdapter clienteAdapter;

    private ClienteRepositorio clienteRepositorio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lstDados = (RecyclerView) findViewById(R.id.lstDados);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        layoutContentMain = (ConstraintLayout) findViewById(R.id.layoutContentMain);

        criarConexao();
        //Escolhendo o tipo de Layoutmanager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //vinculando o tipo de layoutmanager ao RecycleView
        lstDados.setLayoutManager(linearLayoutManager);

        //Instanciando clienteRepositorio para poder utilizar o metodo buscarTodos()
        clienteRepositorio = new ClienteRepositorio(conexao);

        //Buscando dados na base
        List<Cliente> dados = clienteRepositorio.buscarTodos();

        //Criando adaptador que recebe como parâmetro uma lista de dados
        clienteAdapter = new ClienteAdapter(dados);


        //Conecatando o Adaptet ao RecycleView
        lstDados.setAdapter(clienteAdapter);



    }
    private void criarConexao(){

            try {

                dadosOpenHelper = new DadosOpenHelper(this);
                conexao = dadosOpenHelper.getWritableDatabase();
                Snackbar.make(layoutContentMain, R.string.message_conexao_ok, Snackbar.LENGTH_LONG ).setAction(R.string.action_ok,null).show();

            } catch (SQLException ex){

                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle(R.string.title_erro);
                dlg.setMessage(ex.getMessage());
                dlg.setNeutralButton(R.string.ldl_ldg_ok, null);
                dlg.show();




            }
    }


    public void cadastrar(View view){

        Intent it = new Intent(ActMain.this, ActCadCliente.class);
        startActivity(it);
    }

}
