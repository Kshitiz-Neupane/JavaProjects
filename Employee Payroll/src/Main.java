import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new FullTimeEmployee("Ram", 50000));
        staff.add(new Contractor("Sita", 500, 40));
        staff.add(new Contractor("Hari", 600, 30));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("payroll_report.txt"));

            for (Employee e : staff) {
                double pay = e.calculatePay();
                writer.write(e.getName() + " - Pay: " + pay);
                writer.newLine();
            }

            writer.close();
            System.out.println("Payroll report generated successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}