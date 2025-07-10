public class BankAccount {
    private static int accountCounter = 1000; // static for unique ID
    private int accountNumber;
    private String name;
    private double balance;

    // Constructor
    public BankAccount(String name, double openingBalance) {
        this.name = name;
        this.balance = openingBalance;
        this.accountNumber = ++accountCounter;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Display account info
    public void displayInfo() {
        System.out.println("👤 Name: " + name);
        System.out.println("🔢 Account No: " + accountNumber);
        System.out.println("💰 Balance: ₹" + balance);
    }
}
/*| Concept             | Code Example / Explanation                                    |
| ------------------- | ------------------------------------------------------------- |
| **Static Variable** | `static int accountCounter` – shared across all objects       |
| **Encapsulation**   | `private` fields – hides data from direct access              |
| **Constructor**     | `public BankAccount(...)` – initializes new object            |
| **`this` Keyword**  | Refers to current object’s variable                           |
| **Methods**         | `deposit()`, `withdraw()`, `displayInfo()` – actions/behavior |
| **Validation**      | Checks for valid deposit/withdraw amounts                     |
/* */