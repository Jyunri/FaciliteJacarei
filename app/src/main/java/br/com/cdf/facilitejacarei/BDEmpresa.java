package br.com.cdf.facilitejacarei;

import java.util.HashMap;

/**
 * Created by Jimy on 6/7/16.
 */
public class BDEmpresa {
    HashMap<String,Empresa> bdEmpresa;
    Empresa ST = new Empresa("SushiTina","Restaurante","Delicias Orientais");

    public BDEmpresa()
    {
        bdEmpresa = new HashMap<>();
        bdEmpresa.put("SushiTina",ST);
        bdEmpresa.put("SushiTina",new Empresa("SushiTina","Restaurante","Delicias Orientais"));
        bdEmpresa.put("Pizzaria do Cheff",new Empresa("Pizzaria do Cheff","Restaurante","Queeezo"));
        bdEmpresa.put("Salto Forte",new Empresa("Salto Forte","Servicos","Lava Rapido"));
        bdEmpresa.put("Felipe AutoPecas",new Empresa("Felipe AutoPecas","Servicos","Vrumm"));
        bdEmpresa.put("HotWill",new Empresa("HotWill","Servicos","Tudunts"));
        bdEmpresa.put("ML Store",new Empresa("ML Store","Loja","Cantinho"));
    }

    public int register()
    {
        return 1;
    }

    public String getDescricao(String nome)
    {
        return bdEmpresa.get(nome).descricao;
    }
}
