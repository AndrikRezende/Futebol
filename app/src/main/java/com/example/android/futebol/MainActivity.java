package com.example.android.futebol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int golsTimeA=0;
    int faltasTimeA=0;
    int cartoesTimeA=0;
    int golsTimeB=0;
    int faltasTimeB=0;
    int cartoesTimeB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void marcarGolTimeA (View v){
        golsTimeA=golsTimeA+1;
        mostrarGolTimeA(golsTimeA);
    }

    public void lançarFaltaSimplesTimeA (View v){
        faltasTimeA=faltasTimeA+1;
        mostrarFaltaTimeA(faltasTimeA);
    }

    public void lançarFaltaComCartaoTimeA (View v){
        faltasTimeA=faltasTimeA+1;
        cartoesTimeA=cartoesTimeA+1;
        mostrarFaltaTimeA(faltasTimeA);
        mostrarCartãoTimeA(cartoesTimeA);
    }

    public void marcarGolTimeB (View v){
        golsTimeB=golsTimeB+1;
        mostrarGolTimeB(golsTimeB);
    }

    public void lançarFaltaSimplesTimeB (View v){
        faltasTimeB=faltasTimeB+1;
        mostrarFaltaTimeB(faltasTimeB);
    }

    public void lançarFaltaComCartaoTimeB (View v){
        faltasTimeB=faltasTimeB+1;
        cartoesTimeB=cartoesTimeB+1;
        mostrarFaltaTimeB(faltasTimeB);
        mostrarCartãoTimeB(cartoesTimeB);
    }

    public void reiniciar(View v){
        golsTimeA=0;
        faltasTimeA=0;
        cartoesTimeA=0;
        golsTimeB=0;
        faltasTimeB=0;
        cartoesTimeB=0;
        mostrarGolTimeA(golsTimeA);
        mostrarFaltaTimeA(faltasTimeA);
        mostrarCartãoTimeA(cartoesTimeA);
        mostrarGolTimeB(golsTimeB);
        mostrarFaltaTimeB(faltasTimeB);
        mostrarCartãoTimeB(cartoesTimeB);
    }

    public void mostrarGolTimeA(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_gols_a);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }

    public void mostrarFaltaTimeA(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_faltas_a);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }

    public void mostrarCartãoTimeA(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_Cartoes_a);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }

    public void mostrarGolTimeB(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_gols_b);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }

    public void mostrarFaltaTimeB(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_faltas_b);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }

    public void mostrarCartãoTimeB(int pontuaçao){
        TextView pontuaçaoView = (TextView) findViewById(R.id.pontuacao_Cartoes_b);
        pontuaçaoView.setText(String.valueOf(pontuaçao));
    }
}