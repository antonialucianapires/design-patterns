package com.alps.designpattern.abstract_factory.terrestres;

public class Moto implements IVeiculoTerrestre{
	
	@Override
	public void executarRota() {
		getCarga();
		System.out.println("Iniciando o trajeto!");
		
	}

	@Override
	public void getCarga() {
		System.out.println("O entregador pegou sua encomenda...");
		
	}

}
