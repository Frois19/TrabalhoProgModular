package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Longa  implements IManutencao {
    static protected double valorManutencao = 1000.00;

    @Override
    public int proximaManutencao(int kmManutencao) {
        int i = 0;
        kmManutencao+=1;
        while(kmManutencao%200000!=0){
            kmManutencao+=1;
            i++;
        }
        return kmManutencao;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

}
