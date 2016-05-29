package br.com.cdf.facilitejacarei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btGuia, btPromocoes, btFacebook, btMais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGuia = (ImageButton)findViewById(R.id.btGuia);
        btPromocoes = (ImageButton)findViewById(R.id.btMais);
        btFacebook = (ImageButton)findViewById(R.id.btFacebook);
        btMais = (ImageButton)findViewById(R.id.btMais);

        btGuia.setOnClickListener(this);
        btPromocoes.setOnClickListener(this);
        btFacebook.setOnClickListener(this);
        btMais.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case(R.id.btGuia):
                startActivity(new Intent(this,GuiaActivity.class));
                Toast.makeText(getApplicationContext(),"Carregando guias",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
