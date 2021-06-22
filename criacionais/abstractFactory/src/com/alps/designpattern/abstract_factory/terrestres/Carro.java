package com.alps.designpattern.abstract_factory.terrestres;

public class Carro implements IVeiculoTerrestre{

	@Override
	public void executarRota() {
		getCarga();
		System.out.println("Iniciando o trajeto!");
		
	}

	@Override
	public void getCarga() {
		System.out.println("Pegamos os passageiros, estamos prontos.");
		
	}

}
