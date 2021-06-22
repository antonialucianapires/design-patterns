package com.alps.designpattern.abstract_factory.factories;

import com.alps.designpattern.abstract_factory.aereos.Aviao;
import com.alps.designpattern.abstract_factory.aereos.IVeiculoAereo;
import com.alps.designpattern.abstract_factory.maritimos.IVeiculoMaritimo;
import com.alps.designpattern.abstract_factory.maritimos.NavioCargaPassageiros;
import com.alps.designpattern.abstract_factory.terrestres.Carro;
import com.alps.designpattern.abstract_factory.terrestres.IVeiculoTerrestre;

public class UberTransporte implements ITransporteFactory{

	@Override
	public IVeiculoAereo criarTransporteAereo() {
		return new Aviao();
	}

	@Override
	public IVeiculoTerrestre criarTransporteTerrestre() {
		return new Carro();
	}

	@Override
	public IVeiculoMaritimo criarTransporteMaritimo() {
		return new NavioCargaPassageiros();
	}

}
