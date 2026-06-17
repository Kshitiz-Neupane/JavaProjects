class Developer extends Employee{
    public void calculatebonus(double salary){
        double bonus = 0.1*salary;
        double total = salary +(0.1*salary);
        System.out.println("Bonus is: " + bonus);
        System.out.println("Salary After bonus is: " + total);
        System.out.println("========================");

    }
}