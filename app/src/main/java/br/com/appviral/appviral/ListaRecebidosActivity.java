package br.com.appviral.appviral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaRecebidosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_recebidos);

        ListView listView = (ListView) findViewById(R.id.listView);
        AdaptadorListView adaptador = new AdaptadorListView(this);
        listView.setAdapter(adaptador);
    }
}
