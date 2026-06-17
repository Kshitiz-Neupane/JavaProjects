import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = input.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = input.nextDouble();

        // Display entered data
        System.out.println("\n===== Student Record =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Total Marks  : " + totalMarks);

        input.close();
    }
}