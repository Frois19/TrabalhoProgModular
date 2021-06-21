package com.company.automovel;

import com.company.manutencao.Manutencao;

import java.util.*;

public abstract class Veiculo {
    private String placa;
    private Tanque tanque = new Tanque();
    protected Set<Rota> rotas;
    protected double despesaAtual;
    protected int kmRodados;
    protected Queue<Manutencao> manutencaos;

    public Veiculo(String placa, int capacidade, Combustivel combustivel){
        setPlaca(placa);
        tanque.setCapacidade(capacidade);
        tanque.setCombustivel(combustivel);
        kmRodados = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public double getDespesaAtual() {
        return despesaAtual;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTanque(int capacidade, Combustivel combustivel) {
        tanque.setCapacidade(capacidade);
        tanque.setCombustivel(combustivel);
    }

    public void setDespesaAtual(double despesaAtual){
        this.despesaAtual = despesaAtual;
    }

    public void addRota(Date dateTime, int kmTotal){
        Rota rota = new Rota(dateTime, kmTotal);
        rotas.add(rota);
        kmRodados += kmTotal;
    }

    public double reabastecer(){
        int litros;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Litragem a ser abastecida: ");
        litros = leitor.nextInt();
        return tanque.reabastecer(litros);
    }

    public double fazerManutencao(){
        return 20;
    }

    public abstract void calcularDespesaAtual();

}
