class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Bank deposit done");
        System.out.println("Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    void deposit(double amount) {
        double interest = amount * 0.05;
        balance = balance + amount + interest;
        System.out.println("Saving account deposit");
        System.out.println("Interest added: " + interest);
        System.out.println("Balance: " + balance);
    }
}
class CheckingAccount extends BankAccount {
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Checking account deposit done");
        System.out.println("Balance: " + balance);
    }
}



