import java.util.Scanner;
public class Loop {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter a  number");
        n= input.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
