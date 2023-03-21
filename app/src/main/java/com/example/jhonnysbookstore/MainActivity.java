package com.example.jhonnysbookstore;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textoInicial;
    private Button botonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoInicial = (TextView) findViewById(R.id.welcomeText);
        botonColor = (Button) findViewById(R.id.button2);
        botonColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                textoInicial.setTextColor(Color.parseColor("#FF8000"));
                break;
        }
    }
}