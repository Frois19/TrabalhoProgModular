package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;
import com.company.manutencao.Manutencao;
import com.company.manutencao.tipo.Curta;
import com.company.manutencao.tipo.Longa;
import com.company.manutencao.tipo.Media;

import java.util.Date;

public class Furgao extends Veiculo {

    public Furgao(String _placa, Combustivel _combustivel){
        super(_placa, 80, _combustivel);
    }

    @Override
    public double fazerManutencao(){
        Date data = new Date();
        Manutencao manutencao = new Manutencao(data, getKmRodados(), new Media());
        double valor = manutencao.getPlano().getValorManutencao();
        despesaAtual+=valor;
        return valor;
    }
}
