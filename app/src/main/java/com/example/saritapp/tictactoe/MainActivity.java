package com.example.saritapp.tictactoe;

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

    }

    public void startGame(View view){
        Intent startNewGame = new Intent(this, GameBoard.class);
        this.startActivity(startNewGame);
    }

    public void viewScores(View view){
        Intent viewScores = new Intent(this, Scores.class);
        this.startActivity(viewScores);
    }

}
