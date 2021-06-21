package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;

public class Furgao extends Veiculo {

    public Furgao(String _placa, Combustivel _combustivel){
        super(_placa, 80, _combustivel);
    }

    @Override
    public void calcularDespesaAtual() {

    }
}
