package adapter.mercadopago;

import adapter.utils.Token;

public interface IMercadoPagoPayment {
	
	Token authToken();
	void mercadoPagoPagar();
	void mercadoPagoReceber();
}
