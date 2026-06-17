import java.util.Scanner;

class Main{
    static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter length of rectangle");
        int length = k.nextInt();

        System.out.println("Enter breadth of rectangle");
        int breadth = k.nextInt();

        Rectangle r1 = new Rectangle();

        r1.getArea(length,breadth);
        r1.getArea(10,3);

    }
}