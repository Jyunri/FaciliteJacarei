package br.com.cdf.facilitejacarei;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Jimy on 5/29/16.
 */
public class GuiaListaFragment extends Fragment implements AdapterView.OnItemClickListener{

    ListView l;
    BDEmpresa bd = new BDEmpresa();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_guialista, container, false);
        l = (ListView)rootView.findViewById(R.id.lvEmpresas);

        //TODO Popular a partir de um BD
        String[] empresas = {"SushiTina", "Pizzaria do Cheff", "Salto Forte","Felipe AutoPecas","HotWill" ,"ML Store"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),R.layout.empresas_list,empresas);
        l.setOnItemClickListener(this);
        l.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String empresaSelecionada = ((TextView)view).getText().toString();
        Toast.makeText(getContext(),bd.getDescricao(empresaSelecionada),Toast.LENGTH_SHORT).show();
    }
}
