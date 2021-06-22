package com.alps.designpattern.abstract_factory;

import com.alps.designpattern.abstract_factory.app.Application;
import com.alps.designpattern.abstract_factory.factories.ITransporteFactory;
import com.alps.designpattern.abstract_factory.factories.NineNineTransporte;
import com.alps.designpattern.abstract_factory.factories.UberTransporte;

public class Main {
	
	public static Application configureApplication() {
		Application app;
		ITransporteFactory factory;
		
		String companhia = "uber";
		
		if(companhia.equals("uber")) {
			factory = new UberTransporte();
		} else {
			factory = new NineNineTransporte();
		}
		
		app = new Application(factory);
		
		return app;
		
	}

	public static void main(String[] args) {
		
		Application app = configureApplication();
		app.executarRota();
		
	}

}
