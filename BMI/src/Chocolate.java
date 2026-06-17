// Kshitiz Neupane
import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates::");
        int n = input.nextInt();

        System.out.print("Enter the number of children::");
        int c = input.nextInt();

        int div = n/c;

        System.out.print("Each of the " + c + " children will get " + div + " chocolates::");

        int R= n-(div*c);
        System.out.print(":::Remaining chocolates is " + R);
    }
}

