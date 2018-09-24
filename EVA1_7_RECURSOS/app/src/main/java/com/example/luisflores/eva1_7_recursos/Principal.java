package com.example.luisflores.eva1_7_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {
    ImageView imgMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        imgMostrar = findViewById(R.id.imgMostrar);
        imgMostrar.setImageResource(R.drawable.grafica);
    }
}
