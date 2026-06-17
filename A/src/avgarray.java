import java.util.Scanner;
public class avgarray {
    static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);

        double[] number = new double[5];
        double sum=0;
        for(int i=0;i<number.length;++i){
            System.out.println("Enter number ");
            number[i]= kshitiz.nextInt();
        }
        for(int i=0;i<number.length;++i){
            sum = sum + number[i];
        }
        System.out.println("total sum of given numbers is " +sum);
        double avg;
        avg = sum/5;
        System.out.println("Average of given numbers is " +avg);
    }

}
