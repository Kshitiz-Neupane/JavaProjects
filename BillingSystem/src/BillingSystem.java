import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {
        final double baseTuition = 1536.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        double discount = 0.10 * baseTuition;

        double finalAmount = baseTuition - discount;

        // Display receipt
        System.out.println("\n===== IAU Registrar Billing Receipt =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);
        System.out.println("Base Tuition : $" + baseTuition);
        System.out.println("Discount     : $" + discount);
        System.out.println("Final Amount : $" + finalAmount);

        input.close();
    }
}

