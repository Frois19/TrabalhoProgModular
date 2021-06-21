package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Curta implements IManutencao {


    @Override
    public int proximaManutencao(int kmManutencao) {
        return kmManutencao;
    }

}
