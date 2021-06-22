package com.company.automovel;

import com.company.manutencao.Manutencao;

import java.io.IOException;
import java.util.*;
import java.util.HashSet;

public abstract class Veiculo {
    private String placa;
    private Tanque tanque = new Tanque();
    protected Set<Rota> rotas = new HashSet<>();
    protected double despesaAtual;
    protected int kmRodados;
    protected Queue<Manutencao> manutencoes;

    public Veiculo(String placa, int capacidade, Combustivel combustivel){
        setPlaca(placa);
        tanque.setCapacidade(capacidade);
        tanque.setCombustivel(combustivel);
        kmRodados = 0;
        despesaAtual = 0;
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

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
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
        try{
            if(kmTotal <= tanque.getQuantidade()*tanque.getCombustivel().getConsumo()){
                Rota rota = new Rota(dateTime, kmTotal);
                rotas.add(rota);
                tanque.consumir(kmTotal);
                kmRodados += kmTotal;
            }
        }
        catch (Exception e){
            System.out.println("Não é possivel percorrer a rota. Combustivel insuficiente para o percusso.");
        }
    }

    public double reabastecer(){
        double litros;
        double valor;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Litragem a ser abastecida: ");
        litros = leitor.nextDouble();
        valor = tanque.reabastecer(litros);
        despesaAtual+= valor;
        return valor;
    }
    public String toString() {
    	StringBuilder sb = new StringBuilder(this.placa);
    	sb.append("\nKMRodados: "+ this.kmRodados+"\n");
    	sb.append("---------------------------------------------\n");
        return sb.toString();
    }

    public abstract double fazerManutencao() throws IOException;

}
