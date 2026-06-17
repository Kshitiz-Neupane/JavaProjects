abstract class Employee {
    String name;
    double salary;
    public abstract void calculatebonus(double salary);

    public void details(String name,double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

    }
}





