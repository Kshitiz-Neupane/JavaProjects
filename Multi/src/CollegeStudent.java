import java.util.Scanner;

class CollegeStudent implements Result {

    String name;
    int[] marks = new int[5];
    Scanner k = new Scanner(System.in);

    public void getName() {
        System.out.print("Enter Name: ");
        name = k.nextLine();
    }
    public void getMarks() {
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = k.nextInt();
        }
    }
    public void calculateResult() {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }

        double avg = sum / 5.0;

        System.out.println("Average: " + avg);

        if (avg >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
