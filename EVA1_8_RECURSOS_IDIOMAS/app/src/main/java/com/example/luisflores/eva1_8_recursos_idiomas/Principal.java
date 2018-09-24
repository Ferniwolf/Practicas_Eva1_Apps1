package com.example.luisflores.eva1_8_recursos_idiomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdgIdioma;
    RadioButton rdbEspanol;
    RadioButton rdbIngles;
    TextView lblNombre, lblApellido, lblEdad;
    EditText txtNombre,txtApellido,txtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //RADIO
        rdgIdioma = findViewById(R.id.rdgIdioma);
        rdbEspanol = findViewById(R.id.rdbEspanol);
        rdbIngles = findViewById(R.id.rdbIngles);
        //NOMBRE
        lblNombre = findViewById(R.id.lblNombre);
        txtNombre = findViewById(R.id.txtNombre);
        //APELLIDO
        lblApellido = findViewById(R.id.lblApellido);
        txtApellido = findViewById(R.id.txtApellido);
        //EDAD
        lblEdad = findViewById(R.id.lblEdad);
        txtEdad = findViewById(R.id.txtEdad);

        rdgIdioma.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdbEspanol){
            rdbEspanol.setText(R.string.rd_espa_es);
            rdbIngles.setText(R.string.rd_ingles_es);
            lblNombre.setText(R.string.tv_nombre_es);
            txtNombre.setHint(R.string.et_nomre_es);
            lblApellido.setText(R.string.tv_apellido_es);
            txtApellido.setHint(R.string.et_apellido_es);
            lblEdad.setText(R.string.tv_edad_es);
            txtEdad.setHint(R.string.et_edad_es);
        }else{
            rdbEspanol.setText(R.string.rd_espa_en);
            rdbIngles.setText(R.string.rd_ingles_en);
            lblNombre.setText(R.string.tv_nombre_en);
            txtNombre.setHint(R.string.et_nomre_en);
            lblApellido.setText(R.string.tv_apellido_en);
            txtApellido.setHint(R.string.et_apellido_en);
            lblEdad.setText(R.string.tv_edad_en);
            txtEdad.setHint(R.string.et_edad_en);
        }
    }
}
