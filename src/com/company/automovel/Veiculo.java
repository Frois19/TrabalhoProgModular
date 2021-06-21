package com.company.automovel;

import com.company.manutencao.Manutencao;

import java.util.*;

public abstract class Veiculo {
    private String placa;
    private Tanque tanque;
    protected Set<Rota> rotas;
    protected double despesaAtual;
    protected int kmRodados;
    protected Queue<Manutencao> manutencaos;

    public Veiculo(String placa, Tanque tanque){
        setPlaca(placa);
        setTanque(tanque);
    }

    public String getPlaca() {
        return placa;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public void addRota(Date dateTime, int kmTotal){
        Rota rota = new Rota(dateTime, kmTotal);
        rotas.add(rota);
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
}
