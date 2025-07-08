import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("❌ Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("❌ Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
