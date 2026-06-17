public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(2000); // should fail

        System.out.println("Final Balance: " + acc.getBalance());
    }
}