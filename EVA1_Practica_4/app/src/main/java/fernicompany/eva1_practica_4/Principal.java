package fernicompany.eva1_practica_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements  View.OnClickListener{
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Tipo de onclick con interfaz",Toast.LENGTH_LONG).show();
    }

    TextView txtVwMensaje; //Este objeto se vincula al winidget
    Button btnAccion2;
    Button btnAccion3;
    Button btnAccion4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwMensaje = findViewById(R.id.txtVwMensaje); // en caso de error castearlo
        txtVwMensaje.setText("Hola mundo :)!");
        // Una vez vinculado, se puede utilizar

        btnAccion2 = findViewById(R.id.btnAccion2);
        btnAccion2.setOnClickListener(this);// Le mandas de argumento la clase principal

        btnAccion3 = findViewById(R.id.btnAccion3);
        btnAccion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Click por clase anonima ", Toast.LENGTH_LONG).show();
            }
        });
    ClickListener cMiClick = new ClickListener();
        btnAccion4 = findViewById(R.id.btnAccion4);
        btnAccion4.setOnClickListener(cMiClick);
    }

    public void MiClick(View view){
        Toast.makeText(this,"Como que ya me esta gustando android",Toast.LENGTH_LONG).show();

    }
}
