package com.alps.designpattern.factory.veiculos;

public class Car implements IVeiculo{
    @Override
    public void executarRota() {
        getCarga();
        System.out.println("Iniciamos o trajeto.");
    }

    @Override
    public void getCarga() {
        System.out.println("Pegamos os passageiros, estamos prontos.");
    }
}
