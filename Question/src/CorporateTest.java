public class CorporateTest {

    public static void main(String[] args) {

        System.out.println(
                "Employee Count: "
                        + Employee.getEmployeeCount());

        Employee e1 =
                new Employee(
                        "John",
                        "Smith",
                        Department.HR);

        Employee e2 =
                new Employee(
                        "Emma",
                        "Wilson",
                        Department.IT);

        Employee e3 =
                new Employee(
                        "David",
                        "Brown",
                        Department.SALES);

        System.out.println(
                "Employee Count: "
                        + Employee.getEmployeeCount());
    }
}

