package com.alps.designpattern.factory;

import com.alps.designpattern.factory.veiculos.Car;
import com.alps.designpattern.factory.veiculos.IVeiculo;

public class CarroTransporte extends Transporte{
    @Override
    protected IVeiculo criarTransporte() {
        return new Car();
    }
}
