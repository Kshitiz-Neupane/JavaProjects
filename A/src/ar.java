import java.util.Scanner;
public class ar {
    static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i < number.length; ++i) {
            System.out.println("Enter numbers");
            number[i] = k.nextInt();
        }
        System.out.println("-----------------Printing Numbers------------");
        for (int i = 0; i < number.length; ++i) {
            System.out.println(number[i]);
        }

    }
}
