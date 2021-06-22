package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Curta implements IManutencao {
    public double valorManutencao = 500.00;

    @Override
    public int proximaManutencao(int kmManutencao) {
            int i = 0;
            kmManutencao+=1;
            while(kmManutencao%10000!=0){
                kmManutencao+=1;
                i++;
            }
            return kmManutencao;

    }

    public double getValorManutencao() {
        return valorManutencao;
    }

}
