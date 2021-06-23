package builder.builders;

import builder.componentes.Motor;
import builder.componentes.TiposDeCarro;
import builder.componentes.Transmissao;

public interface IBuilder {

	void setTipoCarro(TiposDeCarro tipoCarro);
	void setAssentos(int seats);
	void setTransmissao(Transmissao transmissao);
	void setMotor(Motor motor);
	
}
