interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Paytm");
    }
}

class GooglePay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using GooglePay");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor p1 = new Paytm();
        PaymentProcessor p2 = new GooglePay();
        p1.pay(500);
        p1.refund(200);
        p2.pay(1000);
    }
}
