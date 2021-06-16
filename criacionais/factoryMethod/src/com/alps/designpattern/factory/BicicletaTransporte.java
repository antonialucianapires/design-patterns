package com.alps.designpattern.factory;

import com.alps.designpattern.factory.veiculos.Bicicleta;
import com.alps.designpattern.factory.veiculos.IVeiculo;

public class BicicletaTransporte extends Transporte {
    @Override
    protected IVeiculo criarTransporte() {
        return new Bicicleta();
    }
}
