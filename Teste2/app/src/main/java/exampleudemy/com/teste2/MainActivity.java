package exampleudemy.com.teste2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoX = (Button) findViewById(R.id.botaoNovo);
        botaoX.setText("Felpudinho");

        botaoX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicou no botao");
                Toast.makeText(getApplicationContext(), "Funcionou!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
