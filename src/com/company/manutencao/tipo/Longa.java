package com.company.manutencao.tipo;

import com.company.manutencao.IManutencao;

public class Longa  implements IManutencao {

    @Override
    public int proximaManutencao(int kmManutencao) {
        return kmManutencao;
    }
}
