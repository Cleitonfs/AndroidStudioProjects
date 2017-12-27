package android.domindando.sistemadecadastro;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Registro> aRegistro;
    TelaPrincipal tela_principal;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aRegistro = new ArrayList<Registro>();

        tela_principal = new TelaPrincipal(this);
        tela_cadastro = new TelaCadastroUsuario(this, tela_principal);
        tela_listagem = new TelaListagemUsuarios(this, tela_principal);
        tela_cadastro.setTelaCadastro(tela_cadastro);
        tela_listagem.setTelaListagemUsuarios(tela_listagem);

        tela_principal.CarregarTela();
    }

    public ArrayList<Registro> getaRegistros(){
        return aRegistro;
    }

    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("ok", null);
        d.show();

    }
}
