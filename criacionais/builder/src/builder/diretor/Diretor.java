package builder.diretor;

import builder.builders.IBuilder;
import builder.componentes.Motor;
import builder.componentes.TiposDeCarro;
import builder.componentes.Transmissao;

public class Diretor {
	
	public void construirCarroGol(IBuilder builder) {
		builder.setTipoCarro(TiposDeCarro.GOL);
		builder.setAssentos(5);
		builder.setTransmissao(Transmissao.AUTOMATICO);
		builder.setMotor(new Motor(1600));
	}
	
	public void construirCaminhao(IBuilder builder) {
		builder.setTipoCarro(TiposDeCarro.CAMINHÃO);
		builder.setAssentos(5);
		builder.setTransmissao(Transmissao.MANUAL);
		builder.setMotor(new Motor(13000));
	}

}
