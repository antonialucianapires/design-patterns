package com.alps.designpattern.factory;

import com.alps.designpattern.factory.veiculos.IVeiculo;

public abstract class Transporte {

    void executarTransporte() {
        IVeiculo veiculo = criarTransporte();
        veiculo.executarRota();
    }

    protected abstract IVeiculo criarTransporte();

}
