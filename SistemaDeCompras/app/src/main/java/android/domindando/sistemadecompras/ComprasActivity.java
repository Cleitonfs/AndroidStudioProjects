package android.domindando.sistemadecompras;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ComprasActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkfeijao, chkcarne;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox)findViewById(R.id.chkleite);
        chkfeijao = (CheckBox)findViewById(R.id.chkfeijao);
        chkcarne = (CheckBox)findViewById(R.id.chkcarne);

        Button bttotal = (Button) findViewById(R.id.bttotal);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = true;

                    double total = 0;

                    if (chkarroz.isChecked())
                        total += 4.90;
                    if (chkleite.isChecked())
                        total += 4.60;
                    if (chkfeijao.isChecked())
                        total += 8;
                    if (chkcarne.isChecked())
                        total += 25;

                    AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
                    dialogo.setTitle("AVISO");
                    dialogo.setMessage("O Total das compras é: " + String.valueOf(total));
                    dialogo.show();
                    //total = 0;
            }
        });

    }
}
