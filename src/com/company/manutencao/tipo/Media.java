package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Media implements IManutencao {
    static protected double valorManutencao = 750.00;

    @Override
    public int proximaManutencao(int kmManutencao) {
        int i = 0;
        kmManutencao+=1;
        while(kmManutencao%100000!=0 || kmManutencao%120000!=0){
            kmManutencao+=1;
            i++;
        }
        return kmManutencao;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

}
