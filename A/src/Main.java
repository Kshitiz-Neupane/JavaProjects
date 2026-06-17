import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        ScienceDept obj = new ScienceDept();

        System.out.print("Enter Department Name: ");
        obj.setDeptName(k.nextLine());

        System.out.print("Enter HOD Name: ");
        obj.setHodName(k.nextLine());

        System.out.print("Enter Total Budget: ");
        obj.setTotalBudget(k.nextDouble());

        System.out.println("\n--- Department Details ---");
        System.out.println("Dept Name: " + obj.getDeptName());
        System.out.println("HOD Name: " + obj.getHodName());
        System.out.println("Budget: " + obj.getTotalBudget());

        obj.checkBudgetStatus();

        System.out.println("\nScience Labs:");
        obj.listlabs();

        k.close();
    }
}