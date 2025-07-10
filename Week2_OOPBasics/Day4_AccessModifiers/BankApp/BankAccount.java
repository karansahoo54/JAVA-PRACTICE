public class BankAccount {
    private double balance = 10000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawn ₹" + amount);
        } else {
            System.out.println("❌ Insufficient balance");
        }
    }

    public class BankMain {
        public static void main(String[] args) {
            BankAccount acc = new BankAccount();

            System.out.println("🏦 Initial Balance: ₹" + acc.getBalance());
            acc.deposit(5000);
            acc.withdraw(3000);
            System.out.println("🏦 Final Balance: ₹" + acc.getBalance());
        }
    }
}
