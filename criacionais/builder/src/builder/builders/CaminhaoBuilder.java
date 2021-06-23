package builder.builders;

import builder.carros.Caminhao;
import builder.carros.Carro;
import builder.componentes.Motor;
import builder.componentes.TiposDeCarro;
import builder.componentes.Transmissao;

public class CaminhaoBuilder implements IBuilder {

	private TiposDeCarro tipo;
	private int assentos;
	private Transmissao transmissao;
	private Motor motor;
	

	@Override
	public void setTipoCarro(TiposDeCarro tipoCarro) {
		this.tipo = tipoCarro;
		
	}

	@Override
	public void setAssentos(int assentos) {
		this.assentos = assentos;
		
	}

	@Override
	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
		
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
		
	}
	
	public Caminhao getResultado() {
		return new Caminhao(tipo,assentos, motor,transmissao);
	}

}
