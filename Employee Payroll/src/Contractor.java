public class Contractor extends Employee {

    private double hourlyRate;
    private int hours;

    public Contractor(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }
}