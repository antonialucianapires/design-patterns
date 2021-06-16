package com.alps.designpattern.factory;

import com.alps.designpattern.factory.veiculos.IVeiculo;
import com.alps.designpattern.factory.veiculos.Moto;

public class MotoTransporte extends Transporte{
    @Override
    protected IVeiculo criarTransporte() {
        return new Moto();
    }
}
