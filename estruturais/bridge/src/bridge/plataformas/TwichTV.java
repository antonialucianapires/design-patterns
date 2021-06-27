package bridge.plataformas;

public class TwichTV implements IPlataforma {

	public TwichTV() {
		configurarRMTP();
		System.out.println("TwichTV: transmissão iniciada.");
	}

	@Override
	public void configurarRMTP() {
		authToken();
		System.out.println("TwichTV: conta autorizada.");

	}

	@Override
	public void authToken() {
		System.out.println("TwichTV: autorizando aplicação.");

	}

}
