package com.company.automovel;

import com.company.manutencao.Manutencao;

import java.util.Date;
import java.util.Queue;
import java.util.Set;

public class Veiculo {
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

    }

    public double reabastecer(){
        return 20;
    }

    public double fazerManutencao(){
        return 20;
    }
}
