import java.util.Scanner;
public class leapy {
    static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);

        System.out.println("Enter a year");
        int y= kshitiz.nextInt();

        if(y%4==0) {
            System.out.println(y + " is a leap year");
        }
        else
            System.out.println(y+"is not a leap year");
    }
}
