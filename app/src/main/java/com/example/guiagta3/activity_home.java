package com.example.guiagta3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_home extends Activity {
    private Button personagens;
    private Button mapa;
    private Button codigos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        personagens = findViewById(R.id.button_personagens_home);
        personagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_personagens();

            }
        });

        mapa = findViewById(R.id.button_mapa_home);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_mapa();

            }
        });

        codigos = findViewById(R.id.button_codigos_home);
        codigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_codigos();

            }
        });
    }




    private void openActivity_personagens() {
        Intent intentPersonagens = new Intent(this, activity_personagens.class);
        startActivity(intentPersonagens);
    }

    private void openActivity_mapa() {
        Intent intentMapa = new Intent(this, activity_mapa.class);
        startActivity(intentMapa);
    }

    private void openActivity_codigos() {
        Intent intentCodigos = new Intent(this, activity_codigos.class);
        startActivity(intentCodigos);
    }
}