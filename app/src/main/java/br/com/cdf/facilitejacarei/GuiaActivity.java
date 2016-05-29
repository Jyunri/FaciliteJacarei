package br.com.cdf.facilitejacarei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GuiaActivity extends AppCompatActivity implements View.OnClickListener{

    Button btMapa, btLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        btMapa = (Button)findViewById(R.id.btMapa);
        btLista = (Button)findViewById(R.id.btLista);

        btMapa.setOnClickListener(this);
        btLista.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case(R.id.btMapa):
                Toast.makeText(getApplicationContext(),"Carregando mapa",Toast.LENGTH_SHORT).show();
                break;
            case(R.id.btLista):
                Toast.makeText(getApplicationContext(), "Carregando lista", Toast.LENGTH_SHORT).show();
                GuiaListaFragment guiaListaFragment = new GuiaListaFragment();

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.flFragmentLista, guiaListaFragment)
                        .commit();
                break;
        }
    }
}
