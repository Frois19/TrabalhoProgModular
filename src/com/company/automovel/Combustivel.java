package com.company.automovel;

public enum Combustivel {
    Diesel(4, 4.34), Gasolina(10, 5.79), Alcool(7, 4.49);

    private double consumo;
    private double precoMedio;

    Combustivel(double consumo, double precoMedio){
        this.consumo = consumo;
        this.precoMedio = precoMedio;
    }

    public double getConsumo(){
        return consumo;
    }

    public double getPrecoMedio(){
        return precoMedio;
    }
}


