package android.domindando.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;


public class CalculadoraActivity extends AppCompatActivity {

    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button)findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);



        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble((ednumero2.getText().toString()));
                double soma = num1 + num2;

                AlertDialog.Builder dialog = new AlertDialog.Builder(CalculadoraActivity.this);
                dialog.setTitle("Resultado da soma:");
                dialog.setMessage("A soma é igual a: " + soma);
                dialog.setNeutralButton("OK", null);
                dialog.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble((ednumero2.getText().toString()));
                double subtracao = num1 - num2;
                AlertDialog.Builder dialog = new AlertDialog.Builder(CalculadoraActivity.this);
                dialog.setTitle("Resultado da subtração:");
                dialog.setMessage("A subtração é igual a: " + subtracao);
                dialog.setNeutralButton("OK", null);
                dialog.show();

            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble((ednumero2.getText().toString()));
                double multiplicacao = num1 * num2;
                AlertDialog.Builder dialog = new AlertDialog.Builder(CalculadoraActivity.this);
                dialog.setTitle("Resultado da multiplicação:");
                dialog.setMessage("A multiplicação é igual a: " + multiplicacao);
                dialog.setNeutralButton("OK", null);
                dialog.show();

            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble((ednumero2.getText().toString()));
                double divisao = num1 / num2;
                AlertDialog.Builder dialog = new AlertDialog.Builder(CalculadoraActivity.this);
                dialog.setTitle("Resultado da divisão:");
                dialog.setMessage("A divisão é igual a: " + divisao);
                dialog.setNeutralButton("OK", null);
                dialog.show();

            }
        });



    }
}
