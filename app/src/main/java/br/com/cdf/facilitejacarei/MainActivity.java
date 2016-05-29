package br.com.cdf.facilitejacarei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btGuia, btPromocoes, btFacebook, btMais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGuia = (Button)findViewById(R.id.btGuia);
        btPromocoes = (Button)findViewById(R.id.btMais);
        btFacebook = (Button)findViewById(R.id.btFacebook);
        btMais = (Button)findViewById(R.id.btMais);

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
