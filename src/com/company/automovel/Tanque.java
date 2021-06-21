package com.company.automovel;

public class Tanque {
    private double capacidade;
    private double quantidade;
    private Combustivel combustivel;

    public Tanque(){
        quantidade = 0;
    }

    public Tanque(double capacidade, Combustivel combustivel){
        this.capacidade = capacidade;
        this.combustivel = combustivel;
        quantidade = 0;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public  void consumir(int KmRodados){
            quantidade -= KmRodados/combustivel.getConsumo(); // adicionar execessão para valores negativos
    }

    public double reabastecer(int litros){
        if (getQuantidade()+litros <= getCapacidade()){ // quatidade abastecida não supera a capacidade
            setQuantidade(litros);
        } else { // quantidade abastecida supera a capacidade
            System.out.println("Quantidade abastecida supera a capacidade do tanque. O tanque sera abastecido ate que fique em sua capacidade maxima.");
            setQuantidade(getCapacidade());
        }
        return getQuantidade();
    }
}
