package com.example.luisflores.eva1_practica2_expectativa_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdgRegiones, rdgGenero;
    RadioButton rdbHombre, rdbMujer, rdbRegiones, rdbAmerica, rdbAsia, rdbAfrica;
    TextView txtAño, lblFecha, lblExpectativa;
    double dAño;
    double dEdad = 0;
    double dDiferenciaGenero = 0;
    String sTipoReg = "";
    String sGenero = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //---------------------------- VINCULACIÓN DE ELEMENTOS -------------------------
        rdgRegiones = findViewById(R.id.rdgRegiones);
        rdgGenero = findViewById(R.id.rdgGenero);
        rdbHombre = findViewById(R.id.rdbHombre);
        rdbMujer = findViewById(R.id.rdbMujer);
        rdbRegiones = findViewById(R.id.rdbRegiones);
        rdbAmerica = findViewById(R.id.rdbAmerica);
        rdbAfrica = findViewById(R.id.rdbAfrica);
        rdbAsia = findViewById(R.id.rdbAsia);
        txtAño = findViewById(R.id.txtAño);
        lblExpectativa = findViewById(R.id.lblExpectativa);
        lblFecha = findViewById(R.id.lblFecha);
        //---------------------------- LLAMADAS DE METODOS -------------------------
        rdgRegiones.setOnCheckedChangeListener(this);
        rdgGenero.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int i) {

        if (!txtAño.getText().toString().equals("")) {

            dAño = Integer.parseInt(txtAño.getText().toString());

            if (i == R.id.rdbRegiones) {
                sTipoReg = "Regiones";
            } else if (i == R.id.rdbAmerica) {
                sTipoReg = "America";
            } else if (i == R.id.rdbAfrica) {
                sTipoReg = "Africa";
            } else if (i == R.id.rdbAsia) {
                sTipoReg = "Asia";
            }

            if (i == R.id.rdbHombre) {
                sGenero = "Hombre";
            } else if (i == R.id.rdbMujer) {
                sGenero = "Mujer";
            }
            if (dAño >= 1950 && dAño < 1960) {
                dDiferenciaGenero = 10;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 75;
                        break;
                    case "America":
                        dEdad = 60;
                        break;
                    case "Asia":
                        dEdad = 45;
                        break;
                    case "Africa":
                        dEdad = 35;
                        break;
                }
            } else if (dAño >= 1960 && dAño < 1970) {
                dDiferenciaGenero = 9;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 75;
                        break;
                    case "America":
                        dEdad = 65;
                        break;
                    case "Asia":
                        dEdad = 50;
                        break;
                    case "Africa":
                        dEdad = 45;
                        break;
                }
            } else if (dAño >= 1970 && dAño < 1980) {
                dDiferenciaGenero = 8;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 80;
                        break;
                    case "America":
                        dEdad = 70;
                        break;
                    case "Asia":
                        dEdad = 65;
                        break;
                    case "Africa":
                        dEdad = 55;
                        break;
                }
            } else if (dAño >= 1980 && dAño < 1990) {
                dDiferenciaGenero = 7;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 80;
                        break;
                    case "America":
                        dEdad = 75;
                        break;
                    case "Asia":
                        dEdad = 65;
                        break;
                    case "Africa":
                        dEdad = 60;
                        break;
                }
            } else if (dAño >= 1990 && dAño < 2000) {
                dDiferenciaGenero = 6;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 85;
                        break;
                    case "America":
                        dEdad = 75;
                        break;
                    case "Asia":
                        dEdad = 60;
                        break;
                    case "Africa":
                        dEdad = 55;
                        break;
                }
            } else if (dAño >= 2000) {
                dDiferenciaGenero = 4;
                switch (sTipoReg) {
                    case "Regiones":
                        dEdad = 90;
                        break;
                    case "America":
                        dEdad = 70;
                        break;
                    case "Asia":
                        dEdad = 65;
                        break;
                    case "Africa":
                        dEdad = 60;
                        break;
                }

            } else {
                Toast.makeText(this, "Prueba con una edad mas grande", Toast.LENGTH_SHORT).show();
            }
            if ((dDiferenciaGenero % 2) != 0) {
                dEdad = dEdad + 0.5;
            }
            dDiferenciaGenero = dDiferenciaGenero / 2;

            if (sGenero == "Hombre") {
                dEdad = dEdad - dDiferenciaGenero;
            } else if (sGenero == "Mujer") {
                dEdad = dEdad + dDiferenciaGenero;
            }
            if (rdbMujer.isChecked() || rdbHombre.isChecked()) {
                lblExpectativa.setText(dEdad + " AÑOS");
                lblFecha.setText((dAño + dEdad) + "");
            }
        } else {
            Toast.makeText(this, "Debes escribir un año para comprobar", Toast.LENGTH_SHORT).show();
        }
    }
}
