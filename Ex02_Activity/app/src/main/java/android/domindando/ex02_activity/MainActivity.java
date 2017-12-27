package android.domindando.ex02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast (View view){
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this,"Toast Button 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Intent it = new Intent(this, Tela2Activity.class);
                startActivity(it);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        edtTexto = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button buttonTela2 = (Button) findViewById(R.id.button2);
        buttonTela2.setOnClickListener(this);
    }
}
