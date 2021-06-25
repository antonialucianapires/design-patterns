package adapter.mercadopago;

import adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayment{
	
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void mercadoPagoPagar() {
		this.token = authToken();
		System.out.println("Enviado pagamento com Mercado Pago");
		
	}

	@Override
	public void mercadoPagoReceber() {
		this.token = authToken();
		System.out.println("Recebendo pagamento com Mercado Pago");
		
	}

}
