package com.company.manutencao;

import java.util.Date;

public class Manutencao {
    private Date data;
    private int kmRodados;
    private IManutencao plano;

    public Manutencao(Date data, int kmRodados, IManutencao plano) {
        this.data = data;
        this.kmRodados = kmRodados;
        this.plano = plano;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public IManutencao getPlano() {
        return plano;
    }

    public void setPlano(IManutencao plano) {
        this.plano = plano;
    }

    public int proximaManutencao(){
        return 20;
    }

    public void registrarManutencao(int KmRodaddos){

    }

}
