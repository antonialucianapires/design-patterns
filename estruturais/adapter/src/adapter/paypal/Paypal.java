package adapter.paypal;

import adapter.utils.Token;

public class Paypal implements IPaypalPayments{
	
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPagar() {
		this.token = authToken();
		System.out.println("Enviado pagamento com paypal");
		
	}

	@Override
	public void paypalReceber() {
		this.token = authToken();
		System.out.println("Recebendo pagamento com paypal");
		
	}

}
