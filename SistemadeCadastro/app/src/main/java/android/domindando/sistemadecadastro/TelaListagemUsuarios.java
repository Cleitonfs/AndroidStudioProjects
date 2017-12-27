package android.domindando.sistemadecadastro;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Cleiton on 12/12/2017.
 */

public class TelaListagemUsuarios {

    MainActivity act;
    TelaPrincipal tela_principal;
    Button btanterior, btproximo, btfechar;
    TextView txtnome, txttelefone, txtendereco, txtstatus;
    int index;

    public TelaListagemUsuarios(MainActivity act,TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
        index = 0;
    }
}
