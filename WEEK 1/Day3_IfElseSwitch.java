import java.util.Scanner;

public class Day3_IfElseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("✅ Eligible to vote");
        } else {
            System.out.println("❌ Not eligible to vote");
        }

        System.out.print("Enter grade (A/B/C): ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A': System.out.println("Excellent!"); break;
            case 'B': System.out.println("Good job!"); break;
            case 'C': System.out.println("Needs improvement."); break;
            default: System.out.println("Invalid grade.");
            sc.close();
        }
    }
}
