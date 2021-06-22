package com.alps.designpattern.abstract_factory.aereos;

public class Aviao implements IVeiculoAereo{

	@Override
	public void executarRota() {
		vento();
		getCarga();
		System.out.println("Iniciando decolagem...");
		
	}

	@Override
	public void getCarga() {
		System.out.println("Passageiros abordo. Voo autorizado.");
		
	}

	@Override
	public void vento() {
		
		System.out.println("Ventos a 25km, OK!");
		
	}

}
