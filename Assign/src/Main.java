import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double baseTuition = 1536.00;

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        double discount = baseTuition * 0.10;

        double finalAmount = baseTuition - discount;

        System.out.println("\n========== Tuition Receipt ==========");
        System.out.println("Student Name   : " + studentName);
        System.out.println("Student ID     : " + studentID);
        System.out.println("Original Fee   : $" + baseTuition);
        System.out.println("Discount (10%) : $" + discount);
        System.out.println("Final Amount   : $" + finalAmount);
        System.out.println("=====================================");

        input.close();
    }
}