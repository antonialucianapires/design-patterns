
public class Decorator {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCardPayment();

        PaymentMethod decoratedPayment = new LogDecorator(payment);
        decoratedPayment.pay(100);
    }
}


interface PaymentMethod {
    void pay(int amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with credit card");
    }
}

class BoletoPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with boleto");
    }
}

class PixPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with pix");
    }
}

abstract class PaymentDecorator implements PaymentMethod {
    protected PaymentMethod decoratedPayment;

    public PaymentDecorator(PaymentMethod paymentMethod) {
        this.decoratedPayment = paymentMethod;
    }

    @Override
    public void pay(int amount) {
        decoratedPayment.pay(amount);
    }
}

class LogDecorator extends PaymentDecorator {
    public LogDecorator(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Logging payment of " + amount);
        super.pay(amount);
    }
}
