package com.alps.designpattern.factory.veiculos;

public class Moto implements IVeiculo {
    @Override
    public void executarRota() {
        getCarga();
        System.out.println("Iniciamos o trajeto.");
    }

    @Override
    public void getCarga() {
        System.out.println("Pegamos a encomenda.");
    }
}
