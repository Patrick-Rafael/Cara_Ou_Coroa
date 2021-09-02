package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button botaoVoltar;
    private ImageView imagemResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        botaoVoltar = findViewById(R.id.buttonVoltar);
        imagemResultado = findViewById(R.id.imageResultado);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        //Recuperar dados

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0){
            imagemResultado.setImageResource(R.drawable.moeda_cara);

        }else{
            imagemResultado.setImageResource(R.drawable.moeda_coroa);

        }
    }
}