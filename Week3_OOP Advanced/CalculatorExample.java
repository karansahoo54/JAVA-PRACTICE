import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Try dividing
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch divide by zero error
            System.out.println("❌ Error: Cannot divide by zero.");
        }

        System.out.println("✅ Program continues smoothly...");
    }
}
