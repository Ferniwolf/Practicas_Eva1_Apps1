package com.example.luisflores.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView listDynamic;
    TextView lblTexto;
    final String[] sResta = {"Hamburgesas Yorch","El barco","El camaron",       //3
            "WillRoster","SmokeHouse","CharlesAndDaniels","Las bolas del chino",//7
            "China City","Bolas de arroz bento", "Las nix",                     //10
            "Los peques", "Tori burger","Rickys tacos","Bufalucas","little Caesar"};//15
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lblTexto = findViewById(R.id.lblTexto);
        listDynamic = findViewById(R.id.listDynamic);

        // Necesitamos asignar un adaptador
        //Es un intermediario para el origen de datos
        listDynamic.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sResta));
        listDynamic.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        lblTexto.setText(sResta[position]);
    }
}
