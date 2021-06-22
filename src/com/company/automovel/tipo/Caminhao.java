package com.company.automovel.tipo;

import com.company.automovel.Combustivel;
import com.company.automovel.Tanque;
import com.company.automovel.Veiculo;
import com.company.manutencao.Manutencao;
import com.company.manutencao.tipo.Curta;
import com.company.manutencao.tipo.Longa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Caminhao extends Veiculo {

    public Caminhao(String _placa, Combustivel _combustivel){
        super(_placa, 250, _combustivel);
    }
    
    private void escreverNoArquivo(Path p,  Veiculo v) throws IOException {
    	Files.write(p, v.toString().getBytes(StandardCharsets.ISO_8859_1), StandardOpenOption.APPEND);
    }
    
    private void salvarHistoricoManutencao() throws IOException {
    	Path path = Path.of(".", "historicoManutencao.txt");
		if (Files.exists(path)) {
			escreverNoArquivo(path, this);
		} else {
			Path pathToCreate = Path.of(".");
			Files.createFile(pathToCreate.resolve("historicoManutencao.txt"));
			escreverNoArquivo(path, this);
		}
    }
    
    @Override
    public double fazerManutencao() throws IOException{
    	salvarHistoricoManutencao();
    	
        Date data = new Date();
        Manutencao manutencao = new Manutencao(data, getKmRodados(), new Longa());
        manutencao.registrarManutencao(kmRodados);
        
        double valor = manutencao.getPlano().getValorManutencao();
        despesaAtual+=valor;
        return valor;
    }

}
