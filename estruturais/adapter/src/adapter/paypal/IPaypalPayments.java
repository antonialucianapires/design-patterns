package adapter.paypal;

import adapter.utils.Token;

public interface IPaypalPayments {
	
	Token authToken();
	void paypalPagar();
	void paypalReceber();

}
