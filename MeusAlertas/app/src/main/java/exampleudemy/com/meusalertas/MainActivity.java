package exampleudemy.com.meusalertas;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicaTela(View view){


//        Toast meuToast;
//        meuToast = Toast.makeText(MainActivity.this, "Eu sou um Toast", Toast.LENGTH_SHORT);
//        meuToast.show();

//        Toast.makeText(MainActivity.this, "Eu sou um Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Eu sou um Toast", Toast.LENGTH_SHORT).show();
        Snackbar meuSnack;
        meuSnack = Snackbar.make(view, "Eu sou um snack", Snackbar.LENGTH_LONG);
        meuSnack.show();

        meuSnack.setAction("AcaoSnack", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LogX","Clicou no Snack!!!");
            }
        });

        AlertDialog.Builder construtorAlerta;
        construtorAlerta = new AlertDialog.Builder(this);
        construtorAlerta.setTitle("Titulo do Alerta");
        construtorAlerta.setMessage("Qual é a sua opcao?");
        construtorAlerta.setIcon(R.drawable.caution);


        construtorAlerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.i("LogX","Clicou no Snack!!!");
            }
        });

        construtorAlerta.setNeutralButton("Neutro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.i("LogX","Clicou NEUTRO!!!");
            }
        });

        construtorAlerta.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.i("LogX","Clicou NAO!!!");
            }
        });

        AlertDialog meuAlerta = construtorAlerta.create();
        meuAlerta.show();


    }
}
