// Kshitiz Neupane
import java.util.Scanner;

public class Kshitizhandshakeprogram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        double n = input.nextDouble();

        double h = n*(n-1)/2;

        System.out.println("Maximum number of handshakes of  " +n+ " students is" +h);

        input.close();
    }
}

