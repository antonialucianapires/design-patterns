package builder.carros;

import builder.componentes.Motor;
import builder.componentes.TiposDeCarro;
import builder.componentes.Transmissao;

public class Caminhao {
	
	private final TiposDeCarro tipoCarro;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;

	public Caminhao(TiposDeCarro tipoCarro, int assentos, Motor motor, Transmissao transmissao) {
		this.tipoCarro = tipoCarro;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		
	}
	
	public String resultado() {
		String caminhao = "Caminhão criado com o motor: " + motor.getPotencia() + "\n";
		caminhao += "Transmissao: " + transmissao;
		return caminhao;
	}

}
