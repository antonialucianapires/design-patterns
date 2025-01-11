public class CommonStrategy {
    public static void main(String[] args) {
        var paymentMethodCode = 2;
        var amount = 100;
        var paymentMethod = switch (paymentMethodCode) {
            case 1 -> new CreditCardPayment();
            case 2 -> new BoletoPayment();
            case 3 -> new PixPayment();
            default -> throw new IllegalArgumentException("Invalid payment method code");
        };
        var processor = new PaymentProcessor(paymentMethod);
        processor.pay(amount);
    }
}

class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(int amount) {
        paymentMethod.pay(amount);
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