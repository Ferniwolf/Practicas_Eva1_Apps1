package com.example.luisflores.eva1_practica1_cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnCheckedChangeListener {

    //---------------Componentes------------------------
    RadioGroup rdgRadioGroup;
    RadioButton rdbAmericano;
    RadioButton rdbExpresso;
    RadioButton rdbCapuchino;
    CheckBox cbxAzucar;
    CheckBox cbxCrema;
    TextView lblDescripcion;
    TextView txtCant;
    //---------------Componentes------------------------
    int iExtras;
    int iPrecioCafe;
    String sDescripcion;
    String sCafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdgRadioGroup = findViewById(R.id.rdgGrupo);
        rdbAmericano = findViewById(R.id.rdbAmericano);
        rdbCapuchino = findViewById(R.id.rdbCapuchino);
        rdbExpresso = findViewById(R.id.rdbExpresso);
        cbxAzucar = findViewById(R.id.cbxAzucar);
        cbxCrema = findViewById(R.id.cbxCrema);
        lblDescripcion = findViewById(R.id.lblDescripcion);
        txtCant = findViewById(R.id.txtCant);


        cbxAzucar.setEnabled(false);
        cbxCrema.setEnabled(false);

        rdgRadioGroup.setOnCheckedChangeListener(this);
        cbxAzucar.setOnCheckedChangeListener(this);
        cbxCrema.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        cbxAzucar.setEnabled(true);
        cbxCrema.setEnabled(true);
        if (R.id.rdbAmericano == i) {
            iPrecioCafe = 20;
            sCafe = "Americano";
        } else if (R.id.rdbCapuchino == i) {
            iPrecioCafe = 48;
            sCafe = "Capuchino";
        } else if (R.id.rdbExpresso == i) {
            iPrecioCafe = 30;
            sCafe = "Expresso";

        }
        cbxCrema.setChecked(false);
        cbxAzucar.setChecked(false);
        lblDescripcion.setText(sCafe);

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (cbxCrema.isChecked()) {
            iExtras = 1;
            sDescripcion = sCafe + ", Crema";
            if (cbxAzucar.isChecked()) {
                iExtras = 2;
                sDescripcion = sCafe + ", Crema , Azucar";
            }
        } else if (cbxAzucar.isChecked()) {
            iExtras = 1;
            sDescripcion = sCafe + ", Azucar";
            if (cbxCrema.isChecked()) {
                iExtras = 2;
                sDescripcion = sCafe + ", Crema , Azucar";
            }
        } else {
            sDescripcion = sCafe;
            iExtras = 0;
        }
        lblDescripcion.setText(sDescripcion);
    }

    public void MiClick(View v) {
        if (!txtCant.getText().toString().equals("")) {
            int iCant = Integer.parseInt(txtCant.getText().toString());
            int iTotal = (iExtras*iCant) + (iPrecioCafe*iCant);
            Toast.makeText(this, "$"+iTotal, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Debes escribir una cantidad", Toast.LENGTH_SHORT).show();
        }
    }

}
