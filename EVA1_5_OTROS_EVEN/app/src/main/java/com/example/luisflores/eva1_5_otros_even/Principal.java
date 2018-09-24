package com.example.luisflores.eva1_5_otros_even;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends Activity implements  RadioGroup.OnCheckedChangeListener{
    //Inicializacion de Componentes
RadioGroup rdGrpOpciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdGrpOpciones = findViewById(R.id.rdGrpOpciones);
    rdGrpOpciones.setOnCheckedChangeListener(this);
    }

    @Override                   //Radiogroup que genera el evento
                                //int checkedId radio button seleccionado
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String sMensa="";
        switch(checkedId){

           case R.id.rdbTacos:
        sMensa = "Tacos";
           case R.id.rdbHamb:
               sMensa = "Hamburgesas";
               break;
           case R.id.rdbMontado:
               sMensa = "Montados";
               break;
           case R.id.rdbTamales:
               sMensa = "Tamalitos";
               break;
           case R.id.rdbTortas:
               sMensa = "Torta nix";
               break;
               default:
                  sMensa = "Sin comer";
       }
        Toast.makeText(this,sMensa,Toast.LENGTH_LONG).show();
    }

}
