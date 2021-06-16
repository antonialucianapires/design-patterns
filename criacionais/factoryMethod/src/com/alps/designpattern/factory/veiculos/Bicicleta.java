package com.alps.designpattern.factory.veiculos;

public class Bicicleta implements IVeiculo {
    @Override
    public void executarRota() {
        getCarga();
        System.out.println("O entregador está a caminho!");
    }

    @Override
    public void getCarga() {
        System.out.println("O entregador pegou a comida.");
    }
}
