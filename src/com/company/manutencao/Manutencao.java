package com.company.manutencao;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Date;

import com.company.automovel.Veiculo;

public class Manutencao implements IManutencao {
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

    public void registrarManutencao(int KmRodados){
    	setKmRodados(KmRodados);
        System.out.println("Manutenção feita em " + kmRodados + "km.");
    }

	@Override
	public int proximaManutencao(int kmManutencao) {
		return kmManutencao - kmRodados;
	}

	@Override
	public double getValorManutencao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
