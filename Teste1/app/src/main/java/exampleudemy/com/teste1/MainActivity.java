package exampleudemy.com.teste1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView objetoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaozinho = (Button) findViewById(R.id.meuBotao);
        botaozinho.setText("Label Botao");

        objetoTexto = (TextView) findViewById(R.id.campoTexto);

    }

    public void clicouBootao (View Botao){
        objetoTexto.setText("Voce clicou no botao!!!");
    }

}
