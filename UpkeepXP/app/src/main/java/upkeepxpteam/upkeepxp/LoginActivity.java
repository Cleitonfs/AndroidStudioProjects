package upkeepxpteam.upkeepxp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import upkeepxpteam.serverlayer.Conexao;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;
    private TextView esqueceuSenha;
    private Button logar;

    //necessarios para conexão com a classe Conexao
    private String url = "";
    private String parametros = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.edt_email);
        senha = findViewById(R.id.edt_password);
        logar = findViewById(R.id.btn_logar);
        esqueceuSenha = findViewById(R.id.txt_forgotpass);

        //Para recuperar a senha
        esqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent chamaCadastro = new Intent(LoginActivity.this, TelaCadastroActivity.class);
                startActivity(chamaCadastro);
            }
        });

        //Para logar no sistema
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //snippet para verificar o status da conexão
                ConnectivityManager cm =
                        (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                //aqui pode gerar exception??
                NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
                boolean isConnected = activeNetwork != null &&
                        activeNetwork.isConnectedOrConnecting();
                if (isConnected){

                    String emailUser = email.getText().toString();
                    String senhaUser = senha.getText().toString();

                    if(emailUser.isEmpty() || senhaUser.isEmpty()){
                        Toast.makeText(LoginActivity.this, getString(R.string.campo_vazio), Toast.LENGTH_SHORT).show();
                    }
                    else {
                        url = "http://192.168.0.102:8090/upkeepxp/login/logar.php";
                        parametros = "email=" + emailUser +"&senha=" + senhaUser;
                        new SolicitaDados().execute(url);
                    }
                }
                else{
                    Toast.makeText(LoginActivity.this, getString(R.string.connection_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /*
    Usa asyncTasks!
    A classe interna a seguir conecta a internet e envia informações em segundo plano
     */
    private class SolicitaDados extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... url) {

            return Conexao.postDados(url[0], parametros);
        }

        //exibe os resultados
        @Override
        protected void onPostExecute(String results){

            //Criado para tratar a nova String vinda do Servidor;antes era assim:
            /*
            if(results.contains("login_ok")){
                //exibir toast apenas para verificar os dados q chegam do servidor
                //Toast.makeText(LoginActivity.this, results, Toast.LENGTH_LONG).show();
                Intent autentication = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(autentication);
             */
            //Agora ficou assim:
            String[] resultado = results.split(", ");

            if(resultado[0].contains("login_ok")){
                //exibir toast apenas para verificar os dados q chegam do servidor
                //Toast.makeText(LoginActivity.this, results, Toast.LENGTH_LONG).show();
                Intent autentication = new Intent(LoginActivity.this,MainActivity.class);
                autentication.putExtra("nome",resultado[1]);
                autentication.putExtra("snome",resultado[2]);
                autentication.putExtra("email",resultado[3]);
                autentication.putExtra("acesso",resultado[4]);
                startActivity(autentication);
            }
            else {
                Toast.makeText(LoginActivity.this, getString(R.string.userPass_failed), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
