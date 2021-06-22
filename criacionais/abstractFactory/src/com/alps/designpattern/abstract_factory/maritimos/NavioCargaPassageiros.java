package com.alps.designpattern.abstract_factory.maritimos;

public class NavioCargaPassageiros implements IVeiculoMaritimo{
	
	@Override
	public void executarRota() {
		getCarga();
		System.out.println("Iniciamos a navegação...");
		
		
	}

	@Override
	public void getCarga() {
		System.out.println("Passageiros abordo no Navio!");
		
	}

}
