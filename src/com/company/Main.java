package com.company;

import com.company.automovel.Combustivel;
import com.company.automovel.tipo.Caminhao;
import com.company.automovel.tipo.Carro;
import com.company.automovel.tipo.Furgao;
import com.company.automovel.tipo.Van;

import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        //Testando aplicação

        Date data = new Date(); //Criando data para utilização nos metodos necessarios

        //Criando veiculos
        System.out.println("\nCriando veiculos:");

        //Criar novo carro
        Carro carro = new Carro("hjj4027", Combustivel.Gasolina);
        System.out.println("\nCarro:");
        System.out.println("\tPlaca: " + carro.getPlaca());
        System.out.println("\tCapacidade do tanque: " + carro.getTanque().getCapacidade());
        System.out.println("\tTipo de combustivel: " + carro.getTanque().getCombustivel());
/*
        //Criar nova van
        Van van = new Van("guh6753", Combustivel.Diesel);
        System.out.println("\nVan:");
        System.out.println("\tPlaca: " + van.getPlaca());
        System.out.println("\tCapacidade do tanque: " + van.getTanque().getCapacidade());
        System.out.println("\tTipo de combustivel: " + van.getTanque().getCombustivel());

        //Criar novo furgao
        Furgao furgao = new Furgao("ttg9865", Combustivel.Alcool);
        System.out.println("\nFurgao:");
        System.out.println("\tPlaca: " + furgao.getPlaca());
        System.out.println("\tCapacidade do tanque: " + furgao.getTanque().getCapacidade());
        System.out.println("\tTipo de combustivel: " + furgao.getTanque().getCombustivel());

        //Criar novo caminhao
        Caminhao caminhao = new Caminhao("xhy6932", Combustivel.Diesel);
        System.out.println("\nCaminhao:");
        System.out.println("\tPlaca: " + caminhao.getPlaca());
        System.out.println("\tCapacidade do tanque: " + caminhao.getTanque().getCapacidade());
        System.out.println("\tTipo de combustivel: " + caminhao.getTanque().getCombustivel());
*/
        //Abastecendo veiculos
        System.out.println("\nAbastecendo veiculos");

        //carro
        System.out.println("\nCarro:");
        System.out.println("Quantidade de combustivel antes do abastecimento: " + carro.getTanque().getQuantidade());
        System.out.println("Valor do reabastecimento: " + carro.reabastecer());
        System.out.println("Quantidade de combustivel depois do abastecimento: " + carro.getTanque().getQuantidade());
/*
        //van
        System.out.println("\nVan:");
        System.out.println("Quantidade de combustivel antes do abastecimento: " + van.getTanque().getQuantidade());
        System.out.println("Valor do reabastecimento: "+ van.reabastecer());
        System.out.println("Quantidade de combustivel Depois do abastecimento: " + van.getTanque().getQuantidade());

        //furgao
        System.out.println("\nFurgao:");
        System.out.println("Quantidade de combustivel antes do abastecimento: " + furgao.getTanque().getQuantidade());
        System.out.println("Valor do reabastecimento: "+ furgao.reabastecer());
        System.out.println("Quantidade de combustivel depois do abastecimento: "+ furgao.getTanque().getQuantidade());

        //caminhao
        System.out.println("\nCaminhao:");
        System.out.println("Quantidade de combustivel antes do abastecimento: " + caminhao.getTanque().getQuantidade());
        System.out.println("Valor do reabastecimento:  "+ caminhao.reabastecer());
        System.out.println("Quantidade de combustivel depois do abastecimento: "+ caminhao.getTanque().getQuantidade());
*/
        //adicinando rotas
        System.out.println("\nAdicionando rotas:");

        //carro
        System.out.println("\nCarro:");
        carro.addRota(data,20);
        System.out.println("Quilometros da rodados: " + carro.getKmRodados());
        System.out.println("Quantidade de combustivel restante: " + carro.getTanque().getQuantidade());
    /*
        //van
        System.out.println("\nVan:");
        van.addRota(data,40);
        System.out.println("Quilometros da rodados: " + van.getKmRodados());
        System.out.println("Quantidade de combustivel restante: " + van.getTanque().getQuantidade());

        //furgao
        System.out.println("\nFurgao:");
        furgao.addRota(data,14);
        System.out.println("Quilometros da rodados: " + furgao.getKmRodados());
        System.out.println("Quantidade de combustivel restante: " + furgao.getTanque().getQuantidade());

        //caminhao
        System.out.println("\nCaminhao:");
        caminhao.addRota(data,80);
        System.out.println("Quilometros da rodados: " + caminhao.getKmRodados());
        System.out.println("Quantidade de combustivel restante: " + caminhao.getTanque().getQuantidade());
        */

        System.out.println(carro.fazerManutencao());
    }
}
