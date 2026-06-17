import java.util.Scanner;
public class Ks {
    void addNumbers(float n1, float n2){
        float result= n1+n2;
        System.out.println("Addition is " +result);
    }

    static void main(String[] args) {
        Scanner Kshitiz = new Scanner(System.in);

        System.out.println("Enter first number");
        float number1= Kshitiz.nextFloat();

        System.out.println("Enter second number");
        float number2= Kshitiz.nextFloat();

        Ks k = new Ks();

        k.addNumbers(number1,number2);

    }
}

