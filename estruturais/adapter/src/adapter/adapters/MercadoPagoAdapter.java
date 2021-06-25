package adapter.adapters;

import adapter.mercadopago.MercadoPago;
import adapter.paypal.IPaypalPayments;
import adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
	
	private MercadoPago mercadoPago;
	
	public MercadoPagoAdapter(MercadoPago mercadoPago) {
		this.mercadoPago = mercadoPago;
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPagar() {
		this.mercadoPago.mercadoPagoPagar();
		
	}

	@Override
	public void paypalReceber() {
		this.mercadoPago.mercadoPagoReceber();
		
	}

}
