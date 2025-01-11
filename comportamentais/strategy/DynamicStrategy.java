import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class DynamicStrategy {
    private static final Map<String, Consumer<Double>> paymentStrategies = new HashMap<>();

    static {
        paymentStrategies.put("CREDIT_CARD", PaymentMethods::creditCard);
        paymentStrategies.put("BOLETO", PaymentMethods::boleto);
        paymentStrategies.put("PIX", PaymentMethods::pix);
    }

    public static void main(String[] args) {
        String paymentMethod = "PIX";
        double amount = 100;

        Consumer<Double> strategy = paymentStrategies.get(paymentMethod.toUpperCase());
        if (strategy != null) {
            strategy.accept(amount);
        } else {
            System.out.println("Invalid payment method: " + paymentMethod);
        }
    }
}

class PaymentMethods {
    public static void creditCard(double amount) {
        System.out.println("Paying " + amount + " with credit card");
    }

    public static void boleto(double amount) {
        System.out.println("Paying " + amount + " with boleto");
    }

    public static void pix(double amount) {
        System.out.println("Paying " + amount + " with pix");
    }
}
