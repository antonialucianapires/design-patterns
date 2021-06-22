package com.alps.designpattern.abstract_factory.factories;

import com.alps.designpattern.abstract_factory.aereos.IVeiculoAereo;
import com.alps.designpattern.abstract_factory.maritimos.IVeiculoMaritimo;
import com.alps.designpattern.abstract_factory.terrestres.IVeiculoTerrestre;

public interface ITransporteFactory {
	
	IVeiculoAereo criarTransporteAereo();
	IVeiculoTerrestre criarTransporteTerrestre();
	IVeiculoMaritimo criarTransporteMaritimo();

}
