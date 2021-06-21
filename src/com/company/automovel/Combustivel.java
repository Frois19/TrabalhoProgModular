package com.company.automovel;

public enum Combustivel {
    Diesel(1), Gasolina(2), Alcool(3);

    private int valor;
    private double consumo;
    private double precoMedio;

    Combustivel(int valor){
        this.valor = valor;
        if(valor == 1){
            consumo = 4;
            precoMedio = 4.34;
        }else if (valor == 2){
            consumo = 10;
            precoMedio = 5.79;
        }else {
            consumo = 7;
            precoMedio = 4.49;
        }
    }

    public double getConsumo(){
        return consumo;
    }

    public double getPrecoMedio(){
        return precoMedio;
    }
}


