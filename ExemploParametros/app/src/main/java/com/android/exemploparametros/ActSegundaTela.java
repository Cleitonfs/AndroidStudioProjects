package com.android.exemploparametros;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActSegundaTela extends Activity implements View.OnClickListener {

    private EditText edtValor;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_segunda_tela);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnFechar = (Button) findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        if (bundle.containsKey("VALOR")){
            String valor = bundle.getString("VALOR");
            edtValor.setText(valor);
        }
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
