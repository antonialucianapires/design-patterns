package adapter.payoneer;

import adapter.utils.Token;

public class Payoneer implements IPayoneerPayments{
	
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void pagarPayoneer() {
		this.token = authToken();
		System.out.println("Enviado pagamento com payoneer");
	}

	@Override
	public void receberPayoneer() {
		this.token = authToken();
		System.out.println("Recebendo pagamento com payoneer");
		
	}

}
