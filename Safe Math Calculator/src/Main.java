import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        try {
            // Take input
            System.out.print("Enter first number: ");
            int a = k.nextInt();

            System.out.print("Enter second number: ");
            int b = k.nextInt();

            // Division
            int result = a / b;

            System.out.println("Result: " + result);
        }

        // Single catch block for all exceptions
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        k.close();
    }
}