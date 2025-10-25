interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done through UPI");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done through Credit Card");
    }
}

class Wallet implements Payment {
    public void pay() {
        System.out.println("Payment done through Wallet");
    }
}

public class DigitalPaymentInterface {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();
        p1.pay();
        p2.pay();
        p3.pay();
    }
}
