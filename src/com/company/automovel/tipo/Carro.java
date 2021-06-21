package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;

public class Carro extends Veiculo {

    public Carro(String _placa, Combustivel _combustivel){
        super(_placa, 50, _combustivel);
    }

    @Override
    public void calcularDespesaAtual() {

    }
}
