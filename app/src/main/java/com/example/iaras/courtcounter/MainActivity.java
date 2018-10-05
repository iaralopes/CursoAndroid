package com.example.iaras.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int pointsTeamA, pointsTeamB;
    private TextView textPointsTeamA;
    private TextView textPointsTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPointsTeamA = (TextView) findViewById(R.id.team_A_point);
        textPointsTeamB = (TextView) findViewById(R.id.team_B_point);
    }

    public void addTeamAPoints(View view) {
        if (view.getId() == R.id.A_2_points)
            pointsTeamA = pointsTeamA + 2;
        else if (view.getId() == R.id.A_3_points)
            pointsTeamA = pointsTeamA + 3;
        else if (view.getId() == R.id.A_FREE)
            pointsTeamA = pointsTeamA + 1;
        updateScore();

    }

    public void addTeamBPoints(View view) {
        if (view.getId() == R.id.B_2_points)
            pointsTeamB = pointsTeamB + 2;
        else if (view.getId() == R.id.B_3_points)
            pointsTeamB = pointsTeamB + 3;
        else if (view.getId() == R.id.A_FREE)
            pointsTeamB = pointsTeamB + 1;
        updateScore();
    }

    private void updateScore() {
        textPointsTeamA.setText(String.valueOf(pointsTeamA));
        textPointsTeamB.setText(String.valueOf(pointsTeamB));
    }

    public void getResult(View view) {
        String result;
        if (pointsTeamA > pointsTeamB)
            result = "Time A ganhou";
        else if (pointsTeamB > pointsTeamA)
            result = "Time B ganhou";
        else
            result = "Empate";

        Intent intent = new Intent(this, ResultadoFinalActivity.class);
        intent.putExtra("RESULTADO", result);
        startActivity(intent);

    }
}
