public static void main(String[] args) {

    Person p = new Person();
    p.display("Kshitiz", 20);

    System.out.println("----------------");

    Person.Employee e = p.new Employee();
    e.display("Ram", 25, 50000);
}


