import java.util.Scanner;
public class gs {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st numeber");
        int a = input.nextInt();

        System.out.println("enter 2nd number");
        int b = input.nextInt();

        if(a>b)
        {
            System.out.println("The greatest number is" +a);
        }
        else
            System.out.println("The greatest number is" +b);
    }

}
