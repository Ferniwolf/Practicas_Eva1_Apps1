package com.example.luisflores.eva1_11_otra_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
TextView lblText;
ListView lvLista;
   final String[] sObras = {"principito","El Alquimista", "Dracula","Cañitas", "La divina comedia", "Aura", "piense y hagase rico"};
   final String[] sInfo = {"El principito es un cuento poético que viene acompañado de ilustraciones hechas con acuarelas por el mismo Saint-Exupéry.11\u200B En él, un piloto se encuentra perdido en el desierto del Sahara después de que su avión sufriera una avería, pero para su sorpresa, es allí donde conoce a un pequeño príncipe proveniente de otro planeta. La historia tiene una temática filosófica, donde se incluyen críticas sociales dirigidas a la «extrañeza» con la que los adultos ven las cosas. Estas críticas a las cosas «importantes» y al mundo de los adultos van apareciendo en el libro a lo largo de la narración.",
  "Cuando una persona desea realmente algo, el Universo entero conspira para que pueda realizar su sueño. Basta con aprender a escuchar los dictados del corazón y a descifrar el lenguaje que está más allá de las palabras. El Alquimista relata la historia de Santiago, un joven pastor andaluz que viaja desde su tierra natal hacia el desierto egipcio en busca de un tesoro oculto en las pirámides. Nadie sabe lo que contiene el tesoro, ni si Santiago será capaz de superar los obstáculos del camino. Pero lo que comienza como un viaje en busca de riquezas se convierte en un descubrimiento del tesoro interior.",
  "En 1897, a finales del siglo XIX, Jonathan Harker (Keanu Reeves), recientemente recibido como abogado, debe viajar hasta Transilvania para que el Conde Drácula (Gary Oldman) firme unos papeles referentes a unas propiedades que acaba de adquirir en Londres. El problema es que el conde no es quien dice ser: en realidad, es el mítico príncipe rumano Vlad Tepes, ferviente caballero de la Orden del Dragón, que se transformó en \"vampiro humano\" una vez que reveló toda su ira contra Dios, luego que el ejército turco con la falsa noticia de su muerte en batalla empujara al suicidio a su esposa la princesa Elizabetha, el gran amor de su vida, y se tiñeran de sangre y lágrimas las aguas del río Arges, a las que se arrojó. Extrañamente, la novia de Harker, Mina Murray (Winona Ryder), pasaría a ser la viva reencarnación de la princesa rumana cuatrocientos años después. Por esa razón, Drácula decide viajar hasta la capital británica para conquistarla. Mina, luego de conocerlo, accede a tener un romance furtivo con el misterioso príncipe rumano, para lo cual tendrá que luchar entre las fuerzas del bien y del mal, antes que el amor inmortal que existía entre ambos logre triunfar finalmente.",
    "Cañitas es una casa en donde vive Carlos Trejo, autor del libro “Cañitas”, en donde se relatan diversos sucesos extraordinarios. La historia cuenta que Norma estaba desesperada por contactar a un exnovio, quien había fallecido en un accidente automovilístico.\n" +
            "Su hermano Carlos, le comentó que podrían intentar comunicarse con él, usando una Ouija, así que iniciaron el procedimiento junto con sus hermanos menores Jorge y Luis, además de Sofía Cacheux, la esposa de Carlos, y Emmanuel, el novio de Norma.",
   "En la Divina Comedia Dante pretende decir \"lo que nunca ha sido dicho de mujer alguna\": la exaltación del triunfo celestial de la amada, la expresión de un amor que transciende las dimensiones físicas de este mundo y se convierte en pura espiritualidad. El resultado final es un fantástico viaje hacia la redención que abarca todo el argumento existencial, desde la creación del hombre hasta su destino final, la divinidad." ,
    "Aura (1961) es una de las grandes obras de Carlos Fuentes en la cual el amor se transciende ambos el tiempo y la realidad. Contada de una voz fresca e intensa, la novela está llena de simbolismo por el cual confrontamos la unión entre la fantasía y lo tangible. Fuentes le lleva el lector a un mundo de telarañas y jardines, ratas y bonitas, juventud y vejez, el pasado y el presente, luz y sombras, vida y muerte. Con imágenes fuertes y expresivas, el lector puede entrar en este mundo, mezclándose entre los sueños y sombras de Felipe, el personaje principal. Él acepta un trabajo que consiste en leer las memorias inconclusas del esposo muerto de una mujer vieja para publicarlas. Habita la casa de ella, e inmediatamente él siente que algo extraño le está pasando allí.",
    "Un clásico para alcanzar la riqueza. Tras más de veinte años investigando científicamente a los hombres más ricos de su época, Napoleon Hill aprendió el secreto de la riqueza del famoso industrial y escritor Andrew Carnegie. Carnegie no sólo llegó a ser multimillonario sino que hizo millonarios a una multitud de personas a las que enseñó su sabiduría. Piense y hágase rico es una obra diseñada a partir de una experiencia para conseguir el triunfo económico y personal de la humanidad entera. Gracias a este libro, la riqueza y la realización personal están al alcance de todas aquellas personas que lo deseen. No dejes el éxito en manos de unos pocos y lucha por tu trozo de pastel."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // ENCONTRAR LOS COMPONENTES
        lblText = findViewById(R.id.lblText);
        lvLista = findViewById(R.id.lvLista);


        lvLista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sObras));
        lvLista.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

            lblText.setText(sInfo[i]);

    }
}
