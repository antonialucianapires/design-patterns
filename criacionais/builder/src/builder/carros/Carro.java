package builder.carros;

import builder.componentes.Motor;
import builder.componentes.TiposDeCarro;
import builder.componentes.Transmissao;

public class Carro {
	
	private final TiposDeCarro tipoCarro;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;

	public Carro(TiposDeCarro tipoCarro, int assentos, Motor motor, Transmissao transmissao) {
		this.tipoCarro = tipoCarro;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		
	}

	public TiposDeCarro getTipoCarro() {
		return tipoCarro;
	}

	public int getAssentos() {
		return assentos;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	
	
	
}
