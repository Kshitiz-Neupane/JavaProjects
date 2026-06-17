import java.util.Scanner;
public class largestarray {
    static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);
        double temp=0;
        double[] number = new double[5];
        double sum = 0;
        for (int i = 0; i < number.length; ++i) {
            System.out.println("Enter number ");
            number[i] = kshitiz.nextInt();
        }
        for (int i = 0; i < number.length; ++i) {
            if(number[i]>temp){
                temp = number[i];
            }
        }
        System.out.println("Largest number is " +temp );


    }
}
