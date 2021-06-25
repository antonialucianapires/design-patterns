package adapter.adapters;

import adapter.payoneer.Payoneer;
import adapter.paypal.IPaypalPayments;
import adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayments{
	
	private Payoneer payoneer;
	
	public PayoneerAdapter(Payoneer payoneer) {
		this.payoneer = payoneer;
		System.out.println("Adaptando o payoneer utilizando os métodos do adapter");
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPagar() {
		this.payoneer.pagarPayoneer();
		
	}

	@Override
	public void paypalReceber() {
		this.payoneer.receberPayoneer();
		
	}
	
	

}
