package com.example.iaras.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoFinalActivity extends AppCompatActivity {

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final);

        textResult = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("RESULTADO");

        getResult(result);

    }

    private void getResult(String result) {
            textResult.setText("O resultado foi: " + result);
    }
}
