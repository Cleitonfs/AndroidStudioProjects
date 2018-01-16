package com.android.segundoexemplo;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText edtNome;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNome = (EditText) findViewById(R.id.edtNome);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(edtNome.getText().toString());
                dlg.setNeutralButton("OK",null);
                dlg.show();
            }
        });

    }
}
