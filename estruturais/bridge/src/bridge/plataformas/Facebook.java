package bridge.plataformas;

public class Facebook implements IPlataforma {
	
	public Facebook() {
		configurarRMTP();
		System.out.println("Facebook: transmissão iniciada.");
	}

	@Override
	public void configurarRMTP() {
		authToken();
		System.out.println("Facebook: conta autorizada.");

	}

	@Override
	public void authToken() {
		System.out.println("Facebook: autorizando aplicação.");

	}

}
