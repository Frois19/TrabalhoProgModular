package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Curta implements IManutencao {
    static protected int km;

    @Override
    public int proximaManutencao(int kmManutencao) {
        return kmManutencao;
    }

}
