package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;

public class Caminhao extends Veiculo {

    public Caminhao(String _placa, Combustivel _combustivel){
        super(_placa, 250, _combustivel);
    }

    @Override
    public void calcularDespesaAtual() {

    }

}
