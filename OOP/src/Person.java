import java.util.Scanner;
public class Person {
    String name;
    static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter 1st name");
        String name1 = k.nextLine();
        System.out.println("Enter 2nd name");
        String name2 = k.nextLine();


        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = name1;
        person2.name = name2;

        System.out.println("Name: " + person1.name);
        System.out.println("Name:" + person2.name);
    }
}
