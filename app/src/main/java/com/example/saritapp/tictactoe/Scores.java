package com.example.saritapp.tictactoe;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Scores extends AppCompatActivity {

    private TextView txtP1Won;
    private TextView txtP1Lost;
    private TextView txtP2Won;
    private TextView txtP2Lost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        txtP1Won = findViewById(R.id.text_p1_won);
        txtP1Lost = findViewById(R.id.text_p1_lost);
        txtP2Won = findViewById(R.id.text_p2_won);
        txtP2Lost = findViewById(R.id.text_p2_lost);

        // Obtener puntajes
        SharedPreferences settings = getApplicationContext().getSharedPreferences("Scores", 0);
        txtP1Won.setText("Jugador 1 - ganados: " + String.valueOf(settings.getInt("p1won", 0)));
        txtP1Lost.setText("Jugador 1 - perdidos: " + String.valueOf(settings.getInt("p1lost", 0)));
        txtP2Won.setText("Jugador 2 - ganados: " + String.valueOf(settings.getInt("p2won", 0)));
        txtP2Lost.setText("Jugador 2 - perdidos: " + String.valueOf(settings.getInt("p2lost", 0)));
    }
}
