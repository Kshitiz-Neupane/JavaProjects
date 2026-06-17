import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Person p = new Person();

        System.out.print("Enter age of the person: ");
        int age = k.nextInt();

        p.setAge(age);
        p.getAge();

        k.close();
    }
}