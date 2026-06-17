import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = k.nextDouble();

        System.out.println("1. Cash Payment");
        System.out.println("2. Credit Card Payment");
        System.out.print("Choose payment method: ");
        int choice = k.nextInt();

        if (choice == 1) {
            CashPayment kc = new CashPayment();
            kc.processPayment(amount);
        }
        else if (choice == 2) {
            CreditCardPayment kca = new CreditCardPayment();
            kca.processPayment(amount);
        }
        else {
            System.out.println("Invalid choice.");
        }

        k.close();
    }
}