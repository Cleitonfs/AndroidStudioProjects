package com.androidtest.jogoadvinhacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNumberGuessGame = (Button) findViewById(R.id.btnNumberGuessGame);
        btnNumberGuessGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, NumberGuessGame.class);
                startActivity(intent);
            }
        });
    }
}