import java.util.Scanner;
public class odd {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.print("Odd numbers up to " + n + " are:");

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

