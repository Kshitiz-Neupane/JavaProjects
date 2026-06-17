public class Person {
    String name;
    int age;

    public void display(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    class Employee extends Person {
        double salary;

        public void display(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}


