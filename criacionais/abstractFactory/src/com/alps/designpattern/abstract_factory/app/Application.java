package com.alps.designpattern.abstract_factory.app;

import com.alps.designpattern.abstract_factory.aereos.IVeiculoAereo;
import com.alps.designpattern.abstract_factory.factories.ITransporteFactory;
import com.alps.designpattern.abstract_factory.maritimos.IVeiculoMaritimo;
import com.alps.designpattern.abstract_factory.terrestres.IVeiculoTerrestre;

public class Application {
	
	private IVeiculoTerrestre veiculoTerrestre;
	private IVeiculoAereo veiculoAereo;
	private IVeiculoMaritimo veiculoMaritimo;
	
	public Application(ITransporteFactory transporte) {
		veiculoTerrestre = transporte.criarTransporteTerrestre();
		veiculoAereo = transporte.criarTransporteAereo();
		veiculoMaritimo = transporte.criarTransporteMaritimo();
	}
	
	public void executarRota() {
		veiculoTerrestre.executarRota();
		veiculoAereo.executarRota();
		veiculoMaritimo.executarRota();
	}
	

}
