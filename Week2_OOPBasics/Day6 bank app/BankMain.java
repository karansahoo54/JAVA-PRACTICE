public class BankMain {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Rahul", 5000);
        user1.displayInfo();
        
        user1.deposit(2000);
        user1.withdraw(3000);
        user1.displayInfo();

        BankAccount user2 = new BankAccount("Priya", 10000);
        user2.displayInfo();
    }
}
