package adapter;

import adapter.adapters.MercadoPagoAdapter;
import adapter.mercadopago.MercadoPago;
import adapter.paypal.IPaypalPayments;

public class Main {

	public static void main(String[] args) {
		
		//utilizar adapters
		IPaypalPayments payment = new MercadoPagoAdapter(new MercadoPago());
		payment.paypalPagar();
		payment.paypalReceber();

	}

}
