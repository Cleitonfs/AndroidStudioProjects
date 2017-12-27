package android.domindando.sistemadecadastro;

import android.view.View;
import android.widget.Button;

/**
 * Created by Cleiton on 12/12/2017.
 */

public class TelaPrincipal {

    MainActivity act;

    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivity act){
        this.act;
    }

    public void CarregarTela(){

        act.setContentView(R.layout.tela_principal);
        btcadastrar_usuario = (Button) act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = (Button) act.findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela_cadastro.CarregarTela(){
                }
            }
        });

        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela_listagem.CarregarTela();
            }
        });
    }

    public void setTela_cadastro(TelaCastroUsuario tela_cadastro){
        this.tela_cadastro = tela_cadastro;
    }
    public void setTela_listagem(TelaListagemUsuarios tela_listagem){
        this.tela_listagem = tela_listagem;
    }


}
