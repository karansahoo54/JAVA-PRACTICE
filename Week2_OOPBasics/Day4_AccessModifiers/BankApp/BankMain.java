
public class BankMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("🏦 Initial Balance: ₹" + acc.getBalance());
        acc.deposit(5000);
        acc.withdraw(3000);
        System.out.println("🏦 Final Balance: ₹" + acc.getBalance());
    }
}
