public class Employee {

    String firstName;
    String lastName;
    Department dept;

    private static int employeeCount = 0;

    public Employee(String firstName,
                    String lastName,
                    Department dept) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;

        employeeCount++;
    }

    public static int getEmployeeCount() {

        return employeeCount;
    }
}


