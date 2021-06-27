package bridge.transmissoes;

import bridge.plataformas.IPlataforma;

public class Live implements ITransmissao {
	
	protected IPlataforma plataforma;
	
	public Live() {
		
	}
	
	public Live(IPlataforma plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public void transmissao() {
		System.out.println("Iniciando a transmissão...");

	}

	@Override
	public void resultado() {
		System.out.println("NO AR!");

	}

}
