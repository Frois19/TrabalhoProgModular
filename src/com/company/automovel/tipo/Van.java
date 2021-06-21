package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;

public class Van extends Veiculo {

    public Van(String _placa, Combustivel _combustivel){
        super(_placa, 60, _combustivel);
    }

    @Override
    public void calcularDespesaAtual() {

    }
}
