import java.util.Scanner;
public class Mainnnnn {
    static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter hot temperature");
        double hot= k.nextDouble();

        System.out.println("Enter cold temeprature");
        double cold= k.nextDouble();

        Temperature temp1 = new Temperature(hot,cold);

        temp1.checkIcyHot(hot,cold);
    }
}
