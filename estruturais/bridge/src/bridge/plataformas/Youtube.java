package bridge.plataformas;

public class Youtube implements IPlataforma {

	public Youtube() {
		configurarRMTP();
		System.out.println("Youtube: transmissão iniciada.");
	}

	@Override
	public void configurarRMTP() {
		authToken();
		System.out.println("Youtube: conta autorizada.");

	}

	@Override
	public void authToken() {
		System.out.println("Youtube: autorizando aplicação.");

	}


}
