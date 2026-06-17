import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("1. SmartLight");
        System.out.println("2. SmartFan");
        System.out.print("Choose device: ");

        int choice = k.nextInt();

        if (choice == 1) {
            SmartLight sl = new SmartLight();
            sl.turnOn();
        }
        else if (choice == 2) {
            SmartFan sf = new SmartFan();
            sf.turnOn();
        }
        else {
            System.out.println("Invalid choice.");
        }

        k.close();
    }
}