package com.company.automovel;

public class Tanque {
    private double capacidade;
    private double quantidade;
    private Combustivel combustivel;

    public Tanque(double capacidade, double quantidade, Combustivel combustivel){
        setCapacidade(capacidade);
        setCombustivel(combustivel);
        setQuantidade(quantidade);
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
    }
    public double reabastecer(int litros){
        return 20;
    }
}
