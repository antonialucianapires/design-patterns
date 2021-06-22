package com.alps.designpattern.abstract_factory.factories;

import com.alps.designpattern.abstract_factory.aereos.Helicoptero;
import com.alps.designpattern.abstract_factory.aereos.IVeiculoAereo;
import com.alps.designpattern.abstract_factory.maritimos.IVeiculoMaritimo;
import com.alps.designpattern.abstract_factory.maritimos.NavioCargaGeral;
import com.alps.designpattern.abstract_factory.terrestres.IVeiculoTerrestre;
import com.alps.designpattern.abstract_factory.terrestres.Moto;

public class NineNineTransporte implements ITransporteFactory{

	@Override
	public IVeiculoAereo criarTransporteAereo() {
		return new Helicoptero();
	}

	@Override
	public IVeiculoTerrestre criarTransporteTerrestre() {
		return new Moto();
	}

	@Override
	public IVeiculoMaritimo criarTransporteMaritimo() {
		return new NavioCargaGeral();
	}

}
