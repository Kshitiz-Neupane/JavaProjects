public class BankAccount {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance");
        }
    }
}

