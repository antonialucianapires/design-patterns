package com.alps.designpattern.abstract_factory.maritimos;

public class NavioCargaGeral implements IVeiculoMaritimo{

	@Override
	public void executarRota() {
		getCarga();
		System.out.println("Iniciamos a navegação...");
		
		
	}

	@Override
	public void getCarga() {
		System.out.println("Sua encomenda já está nos containeres abordo!");
		
	}

}
