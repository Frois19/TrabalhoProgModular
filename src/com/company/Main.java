package com.company;

import com.company.automovel.Combustivel;
import com.company.automovel.tipo.Carro;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro carro = new Carro("hjj4027", Combustivel.Gasolina);
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Tanque: " + carro.reabastecer());

        Date data = new Date();

        carro.addRota(data, 20);
        System.out.println("Tanque: " + carro.getTanque().getQuantidade());
    }
}
