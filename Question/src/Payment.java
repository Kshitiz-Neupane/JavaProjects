public class Payment {
    void processPayment(double amount) {
        System.out.println("Processing a generic payment of $" + amount);
    }
}

class CashPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Cash Payment. No service fee applied.");
        System.out.println("Total payment is: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        double total = amount + (0.02 * amount);
        System.out.println("Processing Credit Card Payment.");
        System.out.println("Total payment is: $" + total);
    }
}




