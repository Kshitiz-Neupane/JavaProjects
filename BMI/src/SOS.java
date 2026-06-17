import java.util.Scanner;
public class SOS {
    static void main(String[] args) {

        Scanner kshtiiz= new Scanner(System.in);

        int i=1;
        int sum=0;
        while(i<=10){
            sum= sum+ i*i;
            i++;
        }

        System.out.println("The sum of square of first 10 integers is "+ sum);
    }
}
