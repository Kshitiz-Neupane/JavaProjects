import java.util.Scanner;
public class ElectricityBill {
    public static void main (String[] args) {
        Scanner kshitiz = new Scanner(System.in);
        int units;
        double amount;
        double surcharge;
        double totalBill;
        System.out.print("Enter Total Units Consumed: ");
        units = kshitiz.nextInt();
        if (units <= 100) {
            amount = units * 1.00;
        } else {
            amount = units * 2.00;
        }
        surcharge = amount * 0.20;
        totalBill = amount + surcharge;
        System.out.println("\n===== Electricity Bill =====");
        System.out.println("Units Consumed : " + units);
        System.out.println("Base Amount    : Rs. " + amount);
        System.out.println("Surcharge      : Rs. " + surcharge);
        System.out.println("Total Bill     : Rs. "+ totalBill);
        kshitiz.close();
    }
}
